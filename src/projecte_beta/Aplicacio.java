
/**
 *
 * @author eric
 * @Date 20141117
 */


package projecte_beta;


import java.io.Console;
import java.util.Scanner;


 
public class Aplicacio {

    
    
    public static void main(String[] args) {
        
         Console cnsl = null;         
         Scanner sc = new Scanner (System.in);
         Cotxe c[] = new Cotxe[5];
         Matricula m[] = new Matricula[5];
         
         menu();
                
        try {
            
             cnsl = System.console();
             Scanner in = new Scanner(System.in);
             
             
             if (cnsl != null) {
                 
              int opcio = in.nextInt(); 
              
              while ( opcio != 0){
                
                   if ( opcio == 1 ){
                       
               for(int i = 0; i< c.length ; i++) {
                                         
                     
                    System.out.println("Marca\n");
                    String marca = sc.nextLine();
                    
                    System.out.println("Model\n");
                    String model = sc.nextLine();
                    
                    System.out.println("Lletres Matricula\n");
                    String lletras_matri = sc.nextLine();
                                                            
                    System.out.println("Numero Matricula\n");
                    int num_matri = sc.nextInt();
                    
                    System.out.println("Any compra\n");
                    int data = sc.nextInt();
                                                                         
                    System.out.println("Plaçes \n");
                    int places = sc.nextInt();
                    
                    System.out.println("Consum als 100\n");
                    float consum = sc.nextInt();
                    
                    System.out.println("Extres\n");
                    String extres = cnsl.readLine();
                                        
                    sc.nextLine();
                    
                    c[i] = new Cotxe (marca, model,extres, data, places,consum);
                    
                    m[i] = new Matricula (lletras_matri,num_matri);
                    
                    System.out.println("Vehicle enregistrat correctament\n");
                    
                                }
                     
                   menu2();
                   opcio = in.nextInt();
                   
                   }
                   
                if (opcio == 2){
                System.out.println("\nLlistat de Cotxes creats: \n");
                
                System.out.println( "Marca: "+c[0].getMarca()+"\nModel: "+c[0].getModel()+
                        "\nMatricula "+m[0].getLletras_matri()+m[0].getNum_matri()
                        +"\nAny: "+c[0].getData()+"\nNumero plaçes:  "+c[0].getNumPlaçes()+
                        "\nConsum: "+c[0].getConsum()+"\nExtres:"+c[0].getExtres()+"\n\n");
                
                System.out.println( "Marca: "+c[1].getMarca()+"\nModel: "+c[1].getModel()+
                        "\nMatricula "+m[1].getLletras_matri()+m[1].getNum_matri()
                        +"\nAny: "+c[1].getData()+"\nNumero plaçes:  "+c[1].getNumPlaçes()+
                        "\nConsum: "+c[1].getConsum()+"\nExtres:"+c[1].getExtres()+"\n\n");
               
                System.out.println( "Marca: "+c[2].getMarca()+"\nModel: "+c[2].getModel()+
                        "\nMatricula "+m[2].getLletras_matri()+m[2].getNum_matri()
                        +"\nAny: "+c[2].getData()+"\nNumero plaçes:  "+c[2].getNumPlaçes()+
                        "\nConsum: "+c[2].getConsum()+"\nExtres:"+c[2].getExtres()+"\n\n");
                
                System.out.println( "Marca: "+c[3].getMarca()+"\nModel: "+c[3].getModel()+
                        "\nMatricula "+m[3].getLletras_matri()+m[3].getNum_matri()
                        +"\nAny: "+c[3].getData()+"\nNumero plaçes:  "+c[3].getNumPlaçes()+
                        "\nConsum: "+c[3].getConsum()+"\nExtres:"+c[3].getExtres()+"\n\n");
                
               System.out.println( "Marca: "+c[4].getMarca()+"\nModel: "+c[4].getModel()+
                        "\nMatricula "+m[4].getLletras_matri()+m[4].getNum_matri()
                        +"\nAny: "+c[4].getData()+"\nNumero plaçes:  "+c[4].getNumPlaçes()+
                        "\nConsum: "+c[4].getConsum()+"\nExtres:"+c[4].getExtres()+"\n\n");
                
                System.out.println("\nNumero Cotxes creats a la BBDD :\n" + Cotxe.getNombreCotxes());
                }
                
                break;
                                    
                }
             }
        }
        
    catch(Exception e){
                  
        System.out.println("Cal introduir un valor correcte a la llista");
        
      }
    }
            /**
             * Mètode que ens mostra un menú personalitzat amb 3 opcions
             * diferents. 
             */
            public static void menu(){
           
           System.out.println("[1] Nou Ingres de vehicles");
           System.out.println("[2] Llistat de Cotxes");
           System.out.println("[0] Sortir");
           
     }
            /**
             * Mètode que presenta un menú personalitzat després de 
             * l'entrada dels 5 vehicles
             */
            
            public static void menu2(){
           
           System.out.println("[2] Llistat de Cotxes");
           System.out.println("[0] Sortir");
           
     }
    }
