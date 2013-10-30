/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public class factorial {
  private int numeros;

 public factorial(int numero){
 numeros=numero;
 }

    public int multi(int numero){

        if (numero>=1)
        return multi(numero-1)*numero;
        
        return 0;

}
public void imprimir (){
        System.out.print(numeros);
}     
}

