package com.bilgeadam.maratonsoru2.util;

import com.bilgeadam.maratonsoru2.entity.Musteri;
import com.bilgeadam.maratonsoru2.entity.Siparis;
import com.bilgeadam.maratonsoru2.entity.SiparisKalemi;
import com.bilgeadam.maratonsoru2.entity.Urun;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


    public class HibernateUtil {
        private static SessionFactory sessionFactory;

        public static SessionFactory getSessionFactory() {

            if (sessionFactory == null){
                try{   Configuration configuration = new Configuration();
                    configuration.addAnnotatedClass(Musteri.class);
                    configuration.addAnnotatedClass(Siparis.class);
                    configuration.addAnnotatedClass(SiparisKalemi.class);
                    configuration.addAnnotatedClass(Urun.class);
                    sessionFactory = configuration
                            .configure("hibernate.cfg.xml").buildSessionFactory();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            return sessionFactory;
        }
    }


