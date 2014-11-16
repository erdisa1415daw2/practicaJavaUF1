
package projecte_beta;


import java.util.Calendar;
import java.util.Date;

 
public class Cotxe extends Vehicle {
 
	  int numPlaçes;
          
	
        private static int nombreCotxes;
        
        
	public Cotxe(String fabricant, String mod,String matricula,int data,int places) {
            
        super(fabricant,mod,matricula,data);
    		
      		this.numPlaçes = places;
                
                nombreCotxes++;
	}
        
        
     public Cotxe(){
        nombreCotxes++;
    }

   
      
    public int getNumPlaçes() {
        return numPlaçes;
    }

    public void setNumPlaçes(int numPlaçes) {
        this.numPlaçes = numPlaçes;
    }

  public static int getNombreCotxes() {
             
             return nombreCotxes;
        }
           
            
	
}