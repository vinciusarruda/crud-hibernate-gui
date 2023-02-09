/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoCompromissos;
import Model.Compromissos;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class ControllerCompromisso {
    public void salvar(Integer codigo,String data,String hora, String assunto)throws Exception
    {   
      JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
      new DaoCompromissos().atualizar(codigo, data, hora, assunto);
    }
    
    public void salvar(String data,String hora, String assunto,String proprietario) throws Exception
    {
      Compromissos compromissos=new Compromissos(data,hora,assunto,proprietario);
      new DaoCompromissos().inserir(compromissos);
      JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso");
    }
    
    
    public List<Compromissos> listarCompromisso(String nome){
         DaoCompromissos lista=new DaoCompromissos();
         return lista.listar(nome);
    }
    
    public void deletar(int id){
        new DaoCompromissos().deletar(id);
    }
    
    public List<Compromissos> buscar(String busca){
        DaoCompromissos encontrado=new DaoCompromissos();
        return encontrado.buscar(busca);
    }
}


