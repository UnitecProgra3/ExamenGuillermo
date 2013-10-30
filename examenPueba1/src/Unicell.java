
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
/**
 *
 * @author Guillermo Sandoval
 */
public class Unicell {

   
   public static ArrayList<PlanComercial> planes=new ArrayList<>();
  public static Scanner lea=new Scanner(System.in);
   public static void main(String args[]){
        int op;
        
        do{
            System.out.println("1- Agregar Plan");
            System.out.println("2- Cobrar Plan");
            System.out.println("3- Imprimir Detalle");
            System.out.println("4- Cliente Viejo");
            System.out.println("5- Salir");
            System.out.print("\nEscoja opcion: ");
            op = lea.nextInt();
            
           switch( op ){
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    System.out.println("Ingresar Codigo: ");
                    int cod = lea.nextInt();
                    pagoTotalMes( cod );
                    break;
                case 3:
                    imprimirDetalle();
                    break;
                case 4:
                    PlanComercial viejo = clienteViejo();
                    System.out.println("Viejo: " + viejo);
                    break;
            }
            
        }while( op != 5 );
        
    }
 private static void agregarCliente() {
       
        System.out.println("INGRESE EL NOMBRE DE CLIENTE");
        String nombre=lea.next();

        System.out.println("INGRESE EL CODIGO DE CLIENTE");
        int codigo=lea.nextInt();
     
        Date dia =new Date ();
     
        dia.getTime();
     
        System.out.println("QUE TIPO DE PLAN QUIERE PLAN 40 0 PLAN 80");
        String plan=lea.next().toUpperCase();
        switch (plan) {
            case "PLAN 40":
                planes.add(new Plan40(codigo,nombre,dia));
                break;
            case "Plan 80":
        
                System.out.println("DESEA INTERNET");
                String internet=lea.next();
                planes.add(new Plan80(codigo,nombre,dia,internet));
                break;
        }
     
    }

    private static void pagoTotalMes(int cod) {
        try{
        for(PlanComercial e : planes){
            if (e.codigo==cod){
                System.out.println("Ingrese el numero de minutos ");
                int mim=lea.nextInt();
                System.out.println("Ingrese el numero de mensaje");
                int mes=lea.nextInt();
                double m =e.getPagoMensual(mim, mes);
                System.out.print("el pado de mes es de "+m);
                
                
            }
        }
        }catch(Exception e){
            System.out.println("erro:" + e.getMessage());
        }
        
        System.out.println("no esta este codigo ");
    }

    private static void imprimirDetalle() {
        for(PlanComercial E :planes){
            System.out.println("los detalle son "+E);
        }
    }

    private static PlanComercial clienteViejo() {
       return planes.get(0);

        
    }

}
