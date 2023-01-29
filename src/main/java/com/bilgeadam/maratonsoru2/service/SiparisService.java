package com.bilgeadam.maratonsoru2.service;

import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.entity.SiparisKalemi;
import com.bilgeadam.maratonsoru2.entity.Urun;
import com.bilgeadam.maratonsoru2.repository.SiparisDao;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;
import jakarta.persistence.EntityManager;

import java.util.Arrays;
import java.util.List;

public class SiparisService {

    Musteri m1 = new Musteri("Caner", "Bayuk");
    Musteri m2 = new Musteri("Ahmet", "Bilir");

    Urun u1 = new Urun("Iphone 13", 15000);
    Urun u2 = new Urun("Samsung Galaxy Note5", 17000);
    Urun u3 = new Urun("LG LED TV", 6000);
    Urun u4 = new Urun("Dyson Süpürge", 20000);

    SiparisKalemi sk1 = new SiparisKalemi(u1, 2);
    SiparisKalemi sk2 = new SiparisKalemi(u1, 2);
    Siparis s1 = new Siparis(m1, Arrays.asList(sk1, sk2));

    SiparisKalemi sk3 = new SiparisKalemi(u2, 2);
    SiparisKalemi sk4 = new SiparisKalemi(u3, 2);
    Siparis s2 = new Siparis(m2, Arrays.asList(sk3, sk4));

    SiparisKalemi sk5 = new SiparisKalemi(u4, 2);
    Siparis s3 = new Siparis(m1, Arrays.asList(sk5));
    Siparis s4 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u1, 1)));
    Siparis s5 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u2, 1)));

    SiparisDao siparisDao = new SiparisDao();

    public void save() {

        siparisDao.save(s1);
        siparisDao.save(s2);
        siparisDao.save(s3);
        siparisDao.save(s4);
        siparisDao.save(s5);
    }

    public void delete() {
        Siparis siparis = new Siparis(1);
        siparisDao.delete(siparis);
    }

    public void update() {
        Urun urun = new Urun("Karaca Robot", 3500);
        Musteri musteri = new Musteri("Derya", "Cengiz");
        Siparis siparis = new Siparis(1, musteri, Arrays.asList(new SiparisKalemi(urun, 1)));
        siparisDao.update(siparis);

    }

    public void soru2ASiparisleriListele() {
        List<Siparis> siparisList = siparisDao.getAllSiparis();

        for (Siparis s : siparisList) {
            int toplam = 0;
            System.out.println("Siparis ID: " + s.getId() + ", Müşter Ad-Soyad: " + s.getMusteri().getIsim() + " " + s.getMusteri().getSoyisim() + " Müşteri ID: " + s.getMusteri().getId());
            for (SiparisKalemi sk : s.getLstsiparisKalemi()) {
                System.out.println("     Ürün Adı: " + sk.getUrun().getUrunAdi() + ", Fiyat: " + sk.getUrun().getFiyat() + ", Adet Sayısı: " + sk.getSiparisAdedi());
                toplam = toplam + sk.getSiparisAdedi() * sk.getUrun().getFiyat();

            }
            System.out.println("   Sipariş Toplam : " + toplam);
        }
    }



    }


