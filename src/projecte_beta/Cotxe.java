
/**
 *
 * @author eric
 * @Date 20141117
 */

package projecte_beta;


 public class Cotxe extends Vehicle {
 
	  int numPlaçes;
          String Extres;
          
	
        private static int nombreCotxes;
        
        
	public Cotxe(String fabricant, String mod, String extres,int data,int places,float consum) {
            
        super(fabricant,mod,data,consum);
    		
      		this.numPlaçes = places;
                this.Extres = extres;
                nombreCotxes++;
	}
        
        
     public Cotxe(){
        nombreCotxes++;
    }

    public String getExtres() {
        return Extres;
    }

    public void setExtres(String Extres) {
        this.Extres = Extres;
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