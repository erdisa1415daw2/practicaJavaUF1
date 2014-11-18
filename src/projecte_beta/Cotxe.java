/**
 * @author eric
 * @version 1.0 17.11.2014
 */
package projecte_beta;

public class Cotxe extends Vehicle {

    int numPlaçes;
    String Extres;

    private static int nombreCotxes;

    
     /**
      * Constructor amb 6 paràmetres 
      * @param fabricant, nom del fabricant/marca
      * @param mod, model de cotxe
      * @param extres, Cuantitat de extres del vehicle
      * @param data, any de la compra del vehicle
      * @param places, número de places del vehicle
      * @param consum, del cotxe als 100km
      */
   
    public Cotxe(String fabricant, String mod, String extres, int data, int places, float consum) {

        super(fabricant, mod, data, consum);

        this.numPlaçes = places;
        this.Extres = extres;
        nombreCotxes++;
    }

    /**
     * Constructor per defecte. Augmenta l'atribut de classe nombreCotxes
     */
    public Cotxe() {
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

    /**
     * mètode de classe que retorna el num de cotxes
     *
     * @return , el numero de cotxes
     */
    public static int getNombreCotxes() {
        return nombreCotxes;
    }

}
