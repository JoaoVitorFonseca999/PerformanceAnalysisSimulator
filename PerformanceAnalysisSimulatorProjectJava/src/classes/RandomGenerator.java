
package classes;
import java.util.Random;
import java.math.*;

/**
 *
 * @author 2020.1.08.003
 */
public class RandomGenerator {
    public double GenerateRandomTime(double avg){
        //Exponencial distribution
        Random rand = new Random();
        //random between 0 and 1
        double u = rand.nextDouble();
        return (-1.0/(1.0/avg))* Math.log(1.0-u);
    }
}
