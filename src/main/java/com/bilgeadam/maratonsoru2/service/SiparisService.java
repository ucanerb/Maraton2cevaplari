package com.bilgeadam.maratonsoru2.service;

import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.entity.SiparisKalemi;
import com.bilgeadam.maratonsoru2.entity.Urun;
import com.bilgeadam.maratonsoru2.repository.SiparisDao;

import java.util.Arrays;

public class SiparisService {

   static SiparisDao siparisDao = new SiparisDao();
    Musteri m1 =new Musteri("Caner","Bayuk");
    Musteri m2 =new Musteri("Ahmet","Bilir");

    Urun u1 = new Urun("Iphone 13",15000);
    Urun u2 = new Urun("Samsung Galaxy Note5",17000);
    Urun u3 = new Urun("LG LED TV",6000);
    Urun u4 = new Urun("Dyson Süpürge",20000);

    SiparisKalemi sk1 = new SiparisKalemi(u1,2);
    SiparisKalemi sk2 = new SiparisKalemi(u1,2);
    Siparis s1 = new Siparis(m1, Arrays.asList(sk1,sk2));

    SiparisKalemi sk3 = new SiparisKalemi(u2,2);
    SiparisKalemi sk4 = new SiparisKalemi(u3,2);
    Siparis s2 = new Siparis(m2, Arrays.asList(sk3,sk4));


    SiparisKalemi sk5 = new SiparisKalemi(u4,2);
    Siparis s3 = new Siparis(m1, Arrays.asList(sk5));

    Siparis s4 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u1,1)));
    Siparis s5 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u2,1)));





}
