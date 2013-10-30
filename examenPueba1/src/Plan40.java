
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public final class  Plan40 extends PlanComercial {
protected static final double Precioxminuto=1.16;
protected static final double Precioxmsmg=0.8;
protected  static final double PagoFinal=40;
protected boolean descuento;
    
    public Plan40(int codigo, String nombre, Date inicioPlan) {
    super(codigo, nombre,inicioPlan);
   
    }

    @Override
    public String getTipo() {
       return "Plan de 40$"; 
    }

    @Override
    public double getPrecioPorMinuto(){
        
       return Precioxminuto;
    }

    @Override
    public double getPrecioPorMesaje() {
    return Precioxmsmg;    
    }

    @Override
    public double getPagoMensual(int canMinus, int cantMsmg) throws ConsumoNegativoExcepcion {
        
        if (canMinus<30){
            descuento=true;
        }else if(canMinus>160){
            canMinus-=160;
        }else{
            canMinus=0;
        }
                
        if (cantMsmg>200){
            cantMsmg-=200;
        }else{
            cantMsmg=0;
        }
        if (descuento)
        return super.getPagoMensual(canMinus, cantMsmg)+PagoFinal-getPagoMensual(canMinus, cantMsmg)+PagoFinal*0.5; 
        return super.getPagoMensual(canMinus, cantMsmg)+PagoFinal;
    }

}
