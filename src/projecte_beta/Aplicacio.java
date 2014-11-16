
package projecte_beta;

/**
 *
 * @author eric
 */
//import java.io.BufferedReader;
import java.io.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author eric
 */
 
public class Aplicacio {

    
    
    public static void main(String[] args) {
        
        Console cnsl = System.console();
         
         Scanner sc = new Scanner (System.in);
         
        
                
                Cotxe c[] = new Cotxe[2];
                
                for(int i = 0; i< c.length ; i++) {
                    
                    
                    
                    System.out.println("Marca\n");
                    String marca = sc.nextLine();
                    
                    System.out.println("Model\n");
                    String model = sc.nextLine();
                    
                    System.out.println("Matricula\n");
                    String matricula = sc.nextLine();
                    
                    
                    System.out.println("Any compra\n");
                    int data = sc.nextInt();
                                                                         
                    System.out.println("Plaçes \n");
                    int places = sc.nextInt();
                    
                    
                    sc.nextLine();
                    
                    c[i] = new Cotxe (marca, model, matricula, data, places);
                    
                    
                   // System.out.println(c[i].getMarca()+" "+c[i].getModel()+" "+c[i].getNumPlaçes());
                    
                                }
                
                System.out.println("\nLlistat de Cotxes creats: \n");
                
               System.out.println( "Marca: "+c[0].getMarca()+"\nModel: "+c[0].getModel()+
                       "\nAny: "+c[0].getData()+"\nMatricula: "+c[0].getMatricula()+
                       "\nNumero plaçes:  "+c[0].getNumPlaçes());
               
               System.out.println( "Marca: "+c[1].getMarca()+"\nModel: "+c[1].getModel()+
                       "\nAny: "+c[1].getData()+"\nMatricula: "+c[1].getMatricula()+
                       "\nNumero plaçes:  "+c[1].getNumPlaçes());
               
               System.out.println("\nNumero Cotxes creats a la BBDD :\n" + Cotxe.getNombreCotxes());
    }
            
    }
