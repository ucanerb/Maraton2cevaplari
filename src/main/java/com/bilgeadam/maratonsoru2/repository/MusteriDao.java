package com.bilgeadam.maratonsoru2.repository;

import com.bilgeadam.maratonsoru1.Service.ICrud;
import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class MusteriDao {

        public List<Musteri> getAll() {
            List<Musteri> list = null;
            try(Session session = HibernateUtil.getSessionFactory().openSession()) {
                session.beginTransaction();
                list = session.createQuery("select musteri from Musteri musteri").list();
                session.getTransaction().commit();
             session.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return list;
        }
    }

