/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author isado
 */
public abstract class UsuariosDAO extends DAOAbstract {


    @Override
    public void update(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(objeto);
        session.getTransaction().commit();
 }

    @Override
    public void delete(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(objeto);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("iaaIdUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;

    }
}
