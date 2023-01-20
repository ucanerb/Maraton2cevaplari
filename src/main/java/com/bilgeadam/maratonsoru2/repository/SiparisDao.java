package com.bilgeadam.maratonsoru2.repository;

import com.bilgeadam.maratonsoru1.Service.ICrud;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;

public class SiparisDao {



    public List<Siparis> getAllSiparis() {
        List<Siparis> list = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("select siparis from Siparis siparis").list();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        public void save(Siparis siparis){

            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(siparis);
                session.getTransaction().commit();
                System.out.println("Sipariş kaydedildi");
                session.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
