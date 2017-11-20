package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtils
{
   private static SessionFactory factory;

   static {
       factory =  new Configuration().configure().buildSessionFactory();
   }

   public static SessionFactory getSessionFactory()
   {
       return factory;
   }

   public static Session getSession()
   {
       return factory.openSession();
   }

   public static void closeSession(Session session)
   {
       if(session.isOpen())
       {
           session.close();
       }
   }
}
