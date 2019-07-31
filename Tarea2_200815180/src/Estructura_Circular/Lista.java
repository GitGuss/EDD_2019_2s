/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura_Circular;

/**
 * CLASE QUE REPRESENTARA LA LISTA DE NODOS QUE EXISTE
 * @author Guss
 */
public class Lista {

    Nodo encabezado;
    int indice; 

    public Lista() {
        encabezado = null;
        this.indice = 0; 
    }
    
    
    

    public void agregarCelda(Celda ingresada) {
        Nodo nuevo = new Nodo(ingresada);
        if (encabezado == null) {
            encabezado = nuevo;
            encabezado.siguiente = encabezado;
        } else {
            Nodo auxiliar = encabezado;
            while (true) {
                if (auxiliar.siguiente == encabezado) {
                    auxiliar.siguiente = nuevo;
                    nuevo.siguiente = encabezado;
                    break;

                }
                auxiliar = auxiliar.siguiente;

            }
        }
            indice++;
    }
    public int Size()
    {
        return indice;
    }
    
    public Celda get(int index)
    {
    Celda respuesta = null;
    
    if(index<=indice&&index>=0)
    {
        Nodo auxiliar=encabezado;
    for(int i=0;i<=index;i++){
       auxiliar=auxiliar.siguiente;
    
    }
     respuesta=auxiliar.getDato();
    }
    return respuesta;
    }
    
    public void mostrar(){
    Nodo auxiliar = encabezado;
    if(auxiliar==null){
    System.out.println("*** The bag is empty ***");
    }else{
    if(auxiliar==encabezado){
        System.out.println("Cell x :"+auxiliar.celda.x+"Cell y :"+auxiliar.celda.y);
    }
    auxiliar=auxiliar.siguiente;
    while(auxiliar!=encabezado){
        System.out.println("Cell x :"+auxiliar.celda.x+"Cell y :"+auxiliar.celda.y);
        auxiliar=auxiliar.siguiente;
    
    }}
    }
    
    

}
