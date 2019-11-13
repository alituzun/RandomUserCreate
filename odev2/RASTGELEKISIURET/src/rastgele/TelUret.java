package rastgele;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class TelUret {
    public static String TelUret(){
    int num1, num2, num3; //3 numbers in area code
        int set2, set3; //sequence 2 and 3 of the phone number
        String num;
        Random generator = new Random();
        
        //Area code number; Will not print 8 or 9
        num1 = 5;  
        num2 = 3; //randomize to 8 becuase 0 counts as a number in the generator
        num3 = generator.nextInt(8);
        
        // Sequence two of phone number
        // the plus 100 is so there will always be a 3 digit number
        // randomize to 643 because 0 starts the first placement so if i randomized up to 642 it would only go up yo 641 plus 100
        // and i used 643 so when it adds 100 it will not succeed 742 
        set2 = generator.nextInt(643) + 100;
        
        //Sequence 3 of numebr
        // add 1000 so there will always be 4 numbers
        //8999 so it wont succed 9999 when the 1000 is added
        set3 = generator.nextInt(8999) + 1000;
        num=Integer.toString(0)+Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3)+Integer.toString(set2)+Integer.toString(set3);
        return num;
    }
}
