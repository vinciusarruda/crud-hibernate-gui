/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import Factory.Conexao;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Vinicius
 */
public class DaoUsuario {
    
    
    EntityManager em = new Conexao().conectar();
    
    public void inserir(Usuario cadastro){
       
        em.getTransaction().begin();
        em.persist(cadastro);
        em.getTransaction().commit();
        em.close();
    }
    public boolean login(String usuario,String senha) throws SQLException{
      List<Usuario> user = null;
      
       try{ 
        em.getTransaction().begin();
        Query consultar = em.createQuery("from Usuario  where nome = ?1 and senha = ?2");
        consultar.setParameter(1, usuario);
        consultar.setParameter(2, senha);
        consultar.setMaxResults(1);
        user = consultar.getResultList();
        em.getTransaction().commit();
       }
       finally{
       em.close();
       } 
       return !user.isEmpty(); 
    
    }
        
    
}
 