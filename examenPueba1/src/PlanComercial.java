
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public abstract class PlanComercial {
    protected int codigo;
    protected String nombre;
    protected Date inicioPlan;

    public PlanComercial(int codigo, String nombre, Date inicioPlan) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inicioPlan = inicioPlan;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getInicioPlan() {
        return inicioPlan;
    }

    @Override
    public String toString() {
        return "PlanComercial{" + "codigo=" + codigo + ", nombre=" + nombre + ", inicioPlan=" + inicioPlan + '}';
    }
    
    
    public abstract String getTipo();
    
    public abstract double getPrecioPorMinuto();
    
    public abstract double getPrecioPorMesaje();
    
   public  double getPagoMensual(int canMinus,int cantMsmg)throws ConsumoNegativoExcepcion {
       double total;
       
       if (canMinus<=0&&cantMsmg<=0){
           
           throw new ConsumoNegativoExcepcion();
           
       }
       total=getPrecioPorMesaje()*cantMsmg+getPrecioPorMinuto()*canMinus;
       
        return total;
      
   }        


}
