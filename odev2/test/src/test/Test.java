/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import rastgele.Kisi;
import rastgele.TcUret;
import rastgele.ImeiUret;
/**
 *
 * @author Ali
 */
public class Test {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        while(true){
            Scanner s = new Scanner(System.in);
            int secim;
            int kisisayisi,par,par1,gecerli = 0,gecersiz = 0,imeigecerli = 0,imeigecersiz = 0;
            String kontroltc;
            String kontrolimei;
            System.out.println("1- Rastgele kisi uret");
            System.out.println("2- Uretilmis dosyayi kontrol et");
            System.out.println("3- Cikis");
            secim=s.nextInt();
            if(secim==1){
                System.out.println("Kac kisi uretilsin.");
                kisisayisi=s.nextInt();
                Kisi.KisiBilgileri(kisisayisi);
                System.out.println("Rastgele kisiler kisiler.txt'e yazıldı..");
                
            }
            else if(secim==2){
                String filePath = "..\\test\\Kisiler.txt";//
                Scanner scan = new Scanner(new File(filePath));
                 while(scan.hasNext()){
                    String line = scan.nextLine();
                    kontroltc=line.substring(0,11);
                    par=line.indexOf('(');
                    par1=line.indexOf(')');  
                    if(TcUret.isValidTckn(kontroltc)==true){
                        gecerli++;
                    }
                    else{
                        gecersiz++;
                    }
                    kontrolimei=line.substring(par+1,par1);
                    if(ImeiUret.Check(kontrolimei)==true){
                        imeigecerli++;
                    }
                    else{
                        imeigecersiz++;
                    }
                 }
                 System.out.println("T.C. Kimlik Kontrol");
                 System.out.println(gecerli+" "+"Gecerli");
                 System.out.println(gecersiz+" "+"Gecersiz");
                 System.out.println("IMEI kontrol");
                 System.out.println(imeigecerli+" "+"Gecerli");
                 System.out.println(imeigecersiz+" "+"Gecersiz");
            }
            else if(secim==3)
            {
                break;
            }
            else
            {
                    System.out.println("Gecerli bir islem giriniz.");
            }
        }
    }
    
}
