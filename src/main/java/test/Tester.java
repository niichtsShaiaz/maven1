/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entity.Book;
import Entity.Customer;
import Enums.CustomerType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Shxnna
 */
public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory efm = Persistence.createEntityManagerFactory("EZL_DATABASE");
        EntityManager em = efm.createEntityManager();

        Book book1 = new Book();
        Customer c1 = new Customer("homie", "guy", CustomerType.GOLD);
        
        book1.setTitle("Moby dick");
        
        
           em.getTransaction().begin();
            em.persist(book1);
            em.persist(c1);
            em.getTransaction().commit();
       

    }

}
