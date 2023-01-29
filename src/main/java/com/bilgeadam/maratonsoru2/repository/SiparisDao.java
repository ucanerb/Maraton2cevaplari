package com.bilgeadam.maratonsoru2.repository;

import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class SiparisDao {
     Session session = null;

    public List<Siparis> getAllSiparis() {
        List<Siparis> list = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("select siparis from Siparis siparis").list(); //jpql--> java persistence   query language
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }


      public void save(Siparis siparis){

            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(siparis);
                session.getTransaction().commit();
                System.out.println("Siparişiniz kaydedildi");
                session.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public void update(Siparis siparis){
        try
        { session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.update(siparis);
            session.getTransaction().commit();
            System.out.println("Siparişiniz güncellendi");
            session.close();
        }catch (Exception e){
        if (session.getTransaction() != null){
            session.getTransaction().rollback();
        }
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
     }

    public void delete(Siparis siparis){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.delete(siparis);
            session.getTransaction().commit();
            System.out.println("Siparişiniz silindi");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.getCause();
        }
    }
}