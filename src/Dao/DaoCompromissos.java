/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Factory.Conexao;
import Model.Compromissos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
    
/**
 *
 * @author Vinicius
 */
public class DaoCompromissos {
    EntityManager em=new Conexao().conectar();
    
    public void inserir(Compromissos artista){
    em.getTransaction().begin();
    em.persist(artista);
    em.getTransaction().commit();
    em.close();
    }
    
    public List<Compromissos> listar(String nome){

    List <Compromissos> compromisso=null;
   
    try{
      
    em.getTransaction().begin();
        Query consultar = em.createQuery("from Compromissos  where proprietario = ?1");
        consultar.setParameter(1, nome);
        compromisso=consultar.getResultList();
   
    

    }finally{    
    em.close();
    }
    return compromisso;
    }
    
    public void deletar(int id){
    em.getTransaction().begin();
    Compromissos artista=em.find(Compromissos.class, id);
    em.remove(artista);
    em.getTransaction().commit();
    em.close();
    }
    
    public void atualizar(Integer codigo,String dia,String hora, String assunto){
    em.getTransaction().begin();
    Compromissos artista=em.find(Compromissos.class,codigo);
    artista.setHora(hora);
    artista.setDia(dia);
    artista.setHora(hora);
    artista.setAssunto(assunto);
    em.getTransaction().commit();
    em.close();
    }
    public List<Compromissos> buscar(String parametro){
        List<Compromissos> dados=null;
        em.getTransaction().begin();
        Query query=em.createQuery("from Compromissos where dia like :parametro");
        query.setParameter("parametro",'%'+parametro+'%');
        dados=query.getResultList();
        em.getTransaction().commit();
    

        em.close();
        return dados;
    }
}
