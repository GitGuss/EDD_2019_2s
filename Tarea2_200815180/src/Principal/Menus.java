/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Estructura_Circular.Celda;
import Estructura_Circular.Lista;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Guss 200815180
 */
public class Menus {
    
    Scanner scan = new Scanner(System.in);
    Lista lista = new Lista();
    
    
    public void menuPrincipal() throws IOException{
        
        boolean loop = true;
        do{
            // Mostrando las opciones disponibles
            System.out.println("\n::::::::::::::::::::::::::::::::::::");
            System.out.println("\n:::::::::::::200815180::::::::::::::");
            System.out.println("::          ¡Welcome!               ::");
            System.out.println("::   Please select an option:       ::");
            System.out.println("::..................................::");
            System.out.println("::   1. bag container               ::");
            System.out.println("::   2. Exit                        ::");
            System.out.println("::::::::::::::::::::::::::::::::::::::");
            while(!scan.hasNextInt()){
                System.out.println("enter an integer.");
                scan.next();
            }
            int opcion = scan.nextInt();
                switch(opcion){
                
                case 1:
                    menuLista();
                    break;
                
                case 2:
                    System.out.println("God bye");
                    loop = false;
                    System.exit(0);
                    break;
                              
                default:
                    System.out.println("Please select a option .");
                    break;
                }
        }while(loop == true);
    }
    
    
    
    
    public void menuLista() throws IOException{
        boolean loop = true;
        do{
            System.out.println("\n||||||||||||||||||||||||||||||||||||||");
            System.out.println("|                List                |");
            System.out.println("|    Select an option:               |");
            System.out.println("|____________________________________|");
            System.out.println("|   1. Insert                        |");
            System.out.println("|   2. show items                    |");
            System.out.println("|   3. quantity items                |");
            System.out.println("|   4. back                          |");
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            while(!scan.hasNextInt()){
                System.out.println("enter an integer");
                scan.next();
            }
            int opcionLista = scan.nextInt();
//            
                switch(opcionLista){
                
                case 1:
                    System.out.println("Insertion"
                            + "\nplease enter the following information "
                            + "\nand press the enter key when finished.");
                    System.out.println("x position:");
                    while(!scan.hasNextInt()){
                        System.out.println("please enter an integer.");
                        scan.next();
                    }
                    int x = scan.nextInt();
                    System.out.println("y position:");
                    while(!scan.hasNextInt()){
                        System.out.println("please enter an integer.");
                        scan.next();
                    }
                    int y = scan.nextInt();
                    
                    
                     lista.agregarCelda(new Celda(x,y));
                    break;
                
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    System.out.println("number of items:"+lista.Size());
                    
                    break;
                case 4:
                    
                    this.menuPrincipal();
                    loop = false;
             
                   break;
                default:
                    System.out.println("select an option correct.");
                }
//            
        }while(loop == true);
    }
    
    
}
