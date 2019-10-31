/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sosa8
 */
@Entity
@Table
public class Objeto implements Serializable{
    
    @Id
    @Column
    private int id;
    
    @Column
    private String objeto;

    public Objeto() {
    }

    public Objeto(int id, String objeto) {
        this.id = id;
        this.objeto = objeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setOnjeto(String objeto) {
        this.objeto = objeto;
    }
    
    
    
}
