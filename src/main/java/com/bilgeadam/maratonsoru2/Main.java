package com.bilgeadam.maratonsoru2;

import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.entity.SiparisKalemi;
import com.bilgeadam.maratonsoru2.entity.Urun;
import com.bilgeadam.maratonsoru2.repository.SiparisDao;
import com.bilgeadam.maratonsoru2.service.MusteriService;
import com.bilgeadam.maratonsoru2.service.SiparisService;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;

import java.util.Arrays;

public class Main {
   static SiparisService siparisService = new SiparisService();
   static SiparisDao siparisDao = new SiparisDao();
   static MusteriService musteriService =new MusteriService();
   public static void main(String[] args) {


      //HibernateUtil.getSessionFactory();

    //siparisService.save();
    //siparisService.update();
      //siparisService.delete();
       //siparisService.soru2ASiparisleriListele();
       // musteriService.soru2bMustListele();
       //musteriService.soru2C();
       musteriService.soru2D();
    }
}
