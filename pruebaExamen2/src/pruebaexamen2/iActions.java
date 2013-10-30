/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2;

/**
 *
 * @author Guillermo Sandoval
 */
public interface iActions {
 
    void agregarElementos(Object val)throws InvalidObjectException;
    boolean incluyeA(Object val)throws InvalidObjectException;
    String [] misOpciones();
    void ejecutarOpciones(String opcion);
}
