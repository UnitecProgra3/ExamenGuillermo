
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public final class Plan80 extends PlanComercial {
   protected static final int pagoMensual=80;
   protected static final double Pagoxmsmg=0.2;
   protected static final double Pagoxmunito=1.0;
   protected String internet;

   public Plan80(int codigo, String nombre, Date inicioPlan,String internet){
        super(codigo, nombre,inicioPlan);
        this.internet=internet;
    }

    @Override
    public String getTipo() {
    return "Plan de 80$";
    }
    

    @Override
    public double getPrecioPorMinuto() {
       return Pagoxmunito;
    }

    @Override
    public double getPrecioPorMesaje() {
       return Pagoxmsmg;
    }

    @Override
    public double getPagoMensual(int canMinus, int cantMsmg) throws ConsumoNegativoExcepcion {
      
         if (canMinus>300){
          
            canMinus-=300;
           
        }else{
        canMinus=0;
        }
        
        if (cantMsmg>250){
            cantMsmg-=250;
        }else{
        cantMsmg=0;
        }
        
       
         if (internet.equals("si"))
            return super.getPagoMensual(canMinus, cantMsmg)+pagoMensual*15;
   
       return super.getPagoMensual(canMinus, cantMsmg)+pagoMensual;
    
    
    }
    
}
