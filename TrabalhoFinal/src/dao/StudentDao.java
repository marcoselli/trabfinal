/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import trabalhofinal.Student;
import util.HibernateUtil;

/**
 *
 * @author Marco
 */
public class StudentDao implements GenericDao{
     public static StudentDao daoGen = null;
    
    private SessionFactory factory;
    private Transaction transaction;

    private StudentDao() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    public static StudentDao getInstance(){
        if(daoGen == null){
            daoGen = new StudentDao();
        }
        return daoGen;
    }
    
    
    public void insert(Object o){
        
        Student st = (Student) o;
        Session session = factory.openSession();
        
        try{
            transaction = session.beginTransaction();
            session.merge(st);
            transaction.commit();
        }
        catch(Exception e){
             transaction.rollback();
        }
        finally{
            session.flush();
            session.close();
        }
    }
    
    public void delete(int id){
       Student st = null;
        Session session = factory.openSession();
        try{
            transaction = session.beginTransaction();
            st =  (Student) session.get(Student.class, id);
            session.delete(st);
            transaction.commit();
        }
        catch(Exception e){
             transaction.rollback();
        }
        finally{
            session.flush();
            session.close();
        }
    }
}
