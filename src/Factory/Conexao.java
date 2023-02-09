/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Conexao {
    public static EntityManager conectar(){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
    return factory.createEntityManager();
    }
}
