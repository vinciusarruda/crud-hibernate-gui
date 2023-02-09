/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoUsuario;
import Gui.ConsultaCompromissos;
import Model.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Vinicius
 */
public class ControllerUsuario {
    public void salvar(String nome,String senha) throws Exception 
    {
        Usuario usuario= new Usuario(nome,senha);
        new DaoUsuario().inserir(usuario);
    }
    
    public String logar(String nome, String senha) throws SQLException
    {

       DaoUsuario user=new DaoUsuario();
       
        if(user.login(nome, senha))
        {         

            new ConsultaCompromissos(nome).setVisible(true);
          
            
            return nome;
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar o login");
            return "n";
        }
    }
}
