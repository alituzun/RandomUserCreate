package rastgele;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import rastgele.TcUret;
import rastgele.RandomKisi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class Kisi {
    public static int YasUret(){
    int yas;
    Random generator=new Random();
    yas=generator.nextInt(100);
    if(yas==0){
    yas=generator.nextInt(100);
    }
    return yas;
    }
    public static String KisiBilgileri(int kisisayisi) throws IOException{
    File dosya = new File("..\\RASTGELEKISIURET\\kisiler.txt");
    FileWriter yazici = new FileWriter(dosya,true);
    BufferedWriter yaz = new BufferedWriter(yazici);             
    TcUret tc=new TcUret();
    ImeiUret imei=new ImeiUret();
    TelUret tel=new TelUret();
    String kisi = null;
    for(int i=0;i<kisisayisi;i++){
    kisi=tc.tcUret()+" "+RandomKisi.kisiUret()+" "+YasUret()+" "+tel.TelUret()+" "+"("+imei.generateIMEI()+")";
    yaz.write(kisi);
    yaz.newLine();
    }
    yaz.close();
    return kisi;
    }
}
