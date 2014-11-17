
/**
 *
 * @author eric
 * @Date 20141117
 */

package projecte_beta;



public abstract class Vehicle {
    
   int data;
   private String marca;
   private String model;
   private static int numeroVehicles;
   private float consum;

     
    public Vehicle(){
    
    numeroVehicles++;
    }
 
    
    public Vehicle(String fabricant, String mod,int data, float consum) {
        this.marca = fabricant;
	this.model = mod;
        this.data = data;        
        this.consum = consum;
               
        numeroVehicles++;
        
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

     
     
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }
    

    
    public static int getNumeroVehicles() {

            return numeroVehicles;
        }
    
    @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    
   }