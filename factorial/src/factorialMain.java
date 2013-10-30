
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo Sandoval
 */
public class factorialMain {
   

 public static void main(String[] args){

    factorial facto1 = new factorial;
     
     Scanner sc=new Scanner(System.in) ;
     
     
     System.out.print("ingrese un numero :");
   int numeros=sc.nextInt();
     facto1.multi(numeros);
      
     facto1.imprimir();
     
 }
}


