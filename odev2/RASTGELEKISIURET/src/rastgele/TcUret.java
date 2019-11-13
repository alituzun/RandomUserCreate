package rastgele;


import java.util.Random;
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
public class TcUret {
    public static String tcUret(){
//    System.out.println("Tc Kimlik no olusturuluyor…");
    Vector<Integer> array = new Vector<Integer>();
    Random randomGenerator = new Random();

    array.add(new Integer(1 + randomGenerator.nextInt(9)));

    for (int i=1;i<9;i++) array.add(randomGenerator.nextInt(10));

    int t1 = 0;
    for (int i=0;i<9;i+=2) t1 += array.elementAt(i);

    int t2 = 0;
    for (int i=1;i<8;i+=2) t2 += array.elementAt(i);

    int x = ((t1 * 7) - t2) % 10;


    array.add(new Integer(x));

    x=0;
    for(int i=0;i<10;i++) x+= array.elementAt(i);

    x= x % 10;
    array.add(new Integer(x));

    String res = "";
    for(int i=0;i<11;i++) res = res + Integer.toString(array.elementAt(i));
    return res;
    }
   public static boolean isValidTckn(String tckn) {
	try {
		String tmp = tckn.toString();
 
		if (tmp.length() == 11) {
			int totalOdd = 0;
 
			int totalEven = 0;
 
			for (int i = 0; i < 9; i++) {
				int val = Integer.valueOf(tmp.substring(i, i + 1));
 
				if (i % 2 == 0) {
					totalOdd += val;
				} else {
					totalEven += val;
				}
			}
 
			int total = totalOdd + totalEven + Integer.valueOf(tmp.substring(9, 10));
 
			int lastDigit = total % 10;
 
			if (tmp.substring(10).equals(String.valueOf(lastDigit))) {
				int check = (totalOdd * 7 - totalEven) % 10;
 
				if (tmp.substring(9, 10).equals(String.valueOf(check))) {
					return true;
				}
			}
		}
	} catch (Exception e) {
//		LOGGER.catching(e);
	}
 
	return false;
}
}
