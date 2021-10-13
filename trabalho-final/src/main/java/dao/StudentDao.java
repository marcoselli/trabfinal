/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.jpa.boot.spi.Bootstrap;
import trabalhofinal.Student;
import util.HibernateUtil;

/**
 *
 * @author Marco
 */
public class StudentDao extends GenericDao<Student>{
    
    private static StudentDao daoGen = null;
 
    private StudentDao() {
    }
    
    public static StudentDao getInstance(){
        if(daoGen == null){
            daoGen = new StudentDao();
        }
        return daoGen;
    }
    
    
    public void delete(int id){
        /*
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
*/
    }

    @Override
    public void insert(Student s) {
        getEntityManager().merge(s);
    }
}
