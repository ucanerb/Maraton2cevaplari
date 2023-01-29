package com.bilgeadam.maratonsoru2.service;

import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.entity.SiparisKalemi;
import com.bilgeadam.maratonsoru2.repository.MusteriDao;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MusteriService {
    MusteriDao musteriDao = new MusteriDao();

    public void soru2bMustListele() {
        List<Musteri> musteriList = musteriDao.getAll();

        for (Musteri m : musteriList) {
            int toplam = 0;
            System.out.println("Müşteri id: " + m.getId() + "  Müşteri ad: " + m.getIsim() + " Müşteri soyad:  " + m.getSoyisim());
            for (Siparis s : m.getSiparislst()) {
                System.out.println("  Sipariş id: " + s.getId());
                for (SiparisKalemi sk : s.getLstsiparisKalemi()) {
                    System.out.println("    Ürün: " + sk.getUrun().getUrunAdi() + " Fiyat: " + sk.getUrun().getFiyat() + " Adet:" + sk.getSiparisAdedi());
                    toplam = toplam + sk.getSiparisAdedi() * sk.getUrun().getFiyat();
                }
                System.out.println(" Harcama Toplamı : " + toplam);
            }

        }
    }
    public void soru2C(){
        List<Object[]> siparisList = null;
        try{
            EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();
            siparisList =entityManager.createNativeQuery(
                    "SELECT m.id, count(musteri_id) FROM siparis as s\n" +
                            " inner join musteri as m on s.musteri_id=m.id\n" +
                            " GROUP BY m.id").getResultList();
            for(Object[] item : siparisList){
                System.out.println("Müşteri ID: "+item[0] + " Sipariş Sayısı : "+ item[1]);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void soru2D() {
        List<Object[]> siparisList = null;
        try {
            EntityManager entityManager = HibernateUtil.getSessionFactory().createEntityManager();
            siparisList = entityManager.createNativeQuery(" SELECT m.isim, m.soyisim, s.id FROM musteri as m\n" +
                    "inner join siparis as s ON m.id = s.musteri_id;").getResultList();
            for (Object[] item : siparisList) {
                System.out.println(" Müşteri Ad: " + item[0] + " Müşteri Soyad: " + item[1] + " Sipariş ID: " + item[2]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}