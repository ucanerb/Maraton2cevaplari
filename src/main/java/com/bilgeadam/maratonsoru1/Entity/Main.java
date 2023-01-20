package com.bilgeadam.maratonsoru1.Entity;

import com.bilgeadam.maratonsoru1.Service.CalisanService;
import com.bilgeadam.maratonsoru1.Service.SirketService;

public class Main {
    public static void main(String[] args) {
        SirketService sirketService = new SirketService();
        Sirket sirket1 =new Sirket("Limak","Nihat Özdemir","Limak İnşaat A.Ş.","İnşaat",1976);
        Sirket sirket2 =new Sirket("Türkerler","Kazım Türker","Türkerler İnşaat A.Ş.","İnşaat",1980);
        Sirket sirket3 =new Sirket("Lucid","Umut Caner bayuk","Lucid İnşaat Ldt. Şti.","İnşaat",2023);
        Sirket sirket4 =new Sirket("Amazon","Jeff Bezos","Amazon Corp","Teknoloji",1994);
        Sirket sirket5 =new Sirket("Apple","Steve Jobs","Apple Corp","Teknoloji",1976);
        //sirketService.save(sirket1);
        //sirketService.save(sirket2);
        //sirketService.save(sirket3);
        //sirketService.save(sirket4);
        //sirketService.save(sirket5);

        CalisanService calisanService = new CalisanService();
        Calisan calisan1 =new Calisan("Ahmet Bilir",24,12000,"Planlama",new Sirket(1));
        //Calisan calisan2 =new Calisan("Mehmet Yılmaz",22,13000,"Muhasebe",new Sirket(1));
        Calisan calisan3 =new Calisan("Arda Turan",37,36000,"Satış",new Sirket(2));
        Calisan calisan4 =new Calisan("Burak Yılmaz",38,22000,"İnsan Kaynakları",new Sirket(2));
        Calisan calisan5 =new Calisan("Caner Erkin",34,42000,"Planlama",new Sirket(4));
        Calisan calisan6 =new Calisan("Selçuk İnan",54,26000,"AWS",new Sirket(4));
        Calisan calisan7 =new Calisan("Necip Uysal",25,10000,"İş Geliştirme",new Sirket(5));
        Calisan calisan8 =new Calisan("Umut Caner Bayuk",29,10000,"Yönetim",new Sirket(3));
        Calisan calisan9 =new Calisan("Burak Konkan",30,10000,"Yönetim",new Sirket(3));
        Calisan calisan10 =new Calisan("Yağız Özdemir",32,45000,"AR-GE",new Sirket(5));
        /*calisanService.save(calisan1);
        calisanService.save(calisan2);
        calisanService.save(calisan3);
        calisanService.save(calisan4);
        calisanService.save(calisan5);
        calisanService.save(calisan6);
        calisanService.save(calisan7);
        calisanService.save(calisan8);
        calisanService.save(calisan9);
        calisanService.save(calisan10);
         */

        //calisanService.read();

        //calisanService.delete(1);
        Calisan calisan2 =new Calisan(new Sirket(1),"Ahmet Bilir",24,12000,"Planlama",2);

        calisanService.update(calisan2);


    }
}
