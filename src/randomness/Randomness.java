/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomness;
import java.util.Random;

/**
 *
 * @author Mike
 */
public class Randomness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        runAlot(10);
        runAlot(100);
        runAlot(200);
        runAlot(1000);
        runAlot(40000);
        
    }
    
    private static int randomThis() {
        //add randomizer
        Random rand = new Random();
        int randomReturn = rand.nextInt(10) + 1;
        return randomReturn;
    }
    
    private static void runAlot(int times) {
        int average = 0;
        for (int i=0; i<times; i++) {
            average += randomThis();
        }
        //System.out.println("the total number was " + average);
        average = average / times;
        System.out.println("After " + times + " iterations, the average was " + average);
    }
    
    
    
}
