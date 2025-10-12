/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import dao.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author isado
 */
public abstract class DAOAbstract {

    public Session session;

    public DAOAbstract() {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public abstract void insert(Object objeto);

    public abstract void update(Object objeto);

    public abstract void delete(Object objeto);

    public abstract Object list(int codigo);

    public abstract List listAll();
}