/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura_Circular;

/**
 *
 * @author Guss
 */
public class Nodo {
    
    Celda celda;
    Nodo siguiente;
    
    public Nodo(Celda celda){
        this.celda=celda;
        this.siguiente=null;
        
    
    }
    public Celda getDato(){
    
        return celda;
    }
    
}
