
/**
 *
 * @author eric
 * @Date 20141117
 */

package projecte_beta;

/**
 *
 * @author eric
 */
public class Matricula {
    
    String lletras_matri;
    int num_matri;

    public Matricula(String lletras_matri, int num_matri) {
        this.lletras_matri = lletras_matri;
        this.num_matri = num_matri;
    }

    @Override
    public String toString() {
        return "Matricula{" + "lletras_matri=" + lletras_matri + ", num_matri=" + num_matri + '}';
    }

   

    public String getLletras_matri() {
        return lletras_matri;
    }

    public void setLletras_matri(String lletras_matri) {
        this.lletras_matri = lletras_matri;
    }

    public int getNum_matri() {
        return num_matri;
    }

    public void setNum_matri(int num_matri) {
        this.num_matri = num_matri;
    }


        
    
    
}
