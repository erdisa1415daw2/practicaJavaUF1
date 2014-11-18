/**
 * @author eric
 * @version 1.0 17.11.2014
 */
package projecte_beta;

public abstract class Vehicle {

    int data;
    private String marca;
    private String model;
    private static int numeroVehicles;
    private float consum;

    /**
     * constructor amb 4 arguments
     *
     * @param fabricant, nom del fabricant/marca
     * @param mod, model de cotxe
     * @param data, data del vehicle
     * @param consum, consum vehicle als 100 km  
    *
     */
    public Vehicle(String fabricant, String mod, int data, float consum) {
        this.marca = fabricant;
        this.model = mod;
        this.data = data;
        this.consum = consum;

        numeroVehicles++;

    }

    /**
     * Constructor per defecte. Augmenta l'atribut de classe numeroVehicles
     */
    public Vehicle() {

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

    /**
     * mètode de classe que retorna el num de vehicles
     *
     * @return , el numero de vehicles
     */
    public static int getNumeroVehicles() {

        return numeroVehicles;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
