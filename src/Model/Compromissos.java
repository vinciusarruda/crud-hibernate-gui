/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Vinicius
 */
@Entity
public class Compromissos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_compromisso;
    private String proprietario;
    private String dia;
    private String hora;
    private String assunto;
    
    
    
    public Compromissos(){  
        }
 
    public Compromissos(String dia, String hora, String assunto, String proprietario) {
        this.proprietario=proprietario;
        this.dia = dia;
        this.hora = hora;
        this.assunto = assunto;
    }

    public Compromissos(Integer id_compromisso, String dia, String hora, String assunto) {
        this.id_compromisso = id_compromisso;
        this.dia = dia;
        this.hora = hora;
        this.assunto = assunto;
    }

    public Integer getId_compromisso() {
        return id_compromisso;
    }

    public void setId_compromisso(Integer id_compromisso) {
        this.id_compromisso = id_compromisso;
    }
    
    
    public String getPropietario() {
        return proprietario;
    }

    public void setPropietario(String proprietario) {
        this.proprietario = proprietario;
    }


    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }



}

