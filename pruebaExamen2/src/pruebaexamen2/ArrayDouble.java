/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Sandoval
 */
public class ArrayDouble implements IEstaditica,iActions {
    ArrayList<Double> lista =new ArrayList<>();

    @Override
    public double minimo() {
     double min = Double.MAX_VALUE;
     for(double e :lista){
         
         if(min>e){
            min=e; 
         }
     }   
     return min;
    }
    @Override
    public double maximo() {
        double max = Double.MAX_VALUE;
     for(double e :lista){
         
         if(max<e){
            max=e; 
         }
     }   
     return max;
    }
    

    @Override
    public double suma() {
         double total=0;
        for(double e :lista){
         total+=e;
          
         
     }   
     return total;
    
      
    }

    @Override
    public double promedio() {
    double pro;
    double total=0;   
    int cont=0;
    for(double e :lista){
         total+=e;
          
        cont++; 
      
     }   
    
    pro=total/cont;
    
    return pro;
    
    
    }

    public void imprimir(){
        System.out.println("Hay " + lista.size() + " numeros: ");
        for(double v : lista){
            System.out.println(v);
        }
        System.out.println("Maximo: " + maximo());
        System.out.println("Minimo: " + minimo());
        System.out.println("Suma  : " + suma());
        System.out.println("Promedio: " + promedio());
    }

    
    @Override
    public void agregarElementos(Object val)throws InvalidObjectException  {
        if (val instanceof Object){
            lista.add((double)val);
        }
        throw new InvalidObjectException();
    }

    public void desviacionStd(){
        double suma = 0;
       double prom = promedio();
        double longi = lista.size() - 1;
        
        for(double valor :lista ){
            suma += Math.pow(valor - prom, 2);
        }
        
        double std = Math.sqrt( suma / longi );
        
        System.out.println("Desviacion Std: " + std);
    }
    public void rango(){
        double ran = maximo() - minimo();
        System.out.println("Rango: " + ran);
    }


    @Override
    public boolean incluyeA(Object val)throws InvalidObjectException {
        if (val instanceof Object){
            return lista.contains(val);
        }
        throw new InvalidObjectException();
    }

    @Override
    public String[] misOpciones() {
        String[]opciones={"imprimir","deviacion estandar","rango" };
       return opciones; 
    }

    @Override
    public void ejecutarOpciones(String opcion) {
      if(opcion.equalsIgnoreCase("Imprimir"))
            imprimir();
        else if( opcion.equalsIgnoreCase("Desviacion"))
            desviacionStd();
        else if( opcion.equalsIgnoreCase("Rango"))
            rango();
        else
            System.out.println("Opcion no existe");
    

    }
    
    
}
