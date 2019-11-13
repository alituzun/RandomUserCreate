package rastgele;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class RandomKisi {
     public static String kisiUret() throws FileNotFoundException, IOException{
    FileInputStream fs= new FileInputStream("..\\tcuret\\random_isimler.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
    ArrayList<String> array = new ArrayList<>();
    String line;
    String ara = null;
    while((line = br.readLine()) != null)
      array.add(line);
    // variable so that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is exclusive. Should be good with output for array.
    int randomIndex = rand.nextInt(array.size());

    // Print your random quote... 
//    System.out.println(array.get(randomIndex));
    ara=array.get(randomIndex);
      return ara;
    }

}

