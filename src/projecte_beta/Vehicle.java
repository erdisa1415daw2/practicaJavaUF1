
package projecte_beta;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eric
 */
public abstract class Vehicle {
    
   int data;
   private String marca;
   private String model;
   private String matricula;
   private static int numeroVehicles;
   

     
    public Vehicle(){
    
    numeroVehicles++;
    }
 
    
    public Vehicle(String fabricant, String mod,String matricula,int data) {
        this.marca = fabricant;
	this.model = mod;
        this.data = data;
        this.matricula = matricula;
               
        numeroVehicles++;
        
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    
    public static int getNumeroVehicles() {

            return numeroVehicles;
        }
    
    @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    
   
}