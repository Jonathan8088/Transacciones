/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Objeto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sosa8
 */
@Local
public interface ObjetoFacadeLocal {

    void create(Objeto objeto);

    void edit(Objeto objeto);

    void remove(Objeto objeto);

    Objeto find(Object id);

    List<Objeto> findAll();

    List<Objeto> findRange(int[] range);

    int count();
    
    public void crearObjetoRequired(Objeto objeto1, Objeto objeto2);
    
    public void crearObjetoRequiredNew(Objeto objeto1, Objeto objeto2);
            
    public void crearObjetoMandatory(Objeto objeto1, Objeto objeto2);
    
    public void crearObjetoSupported(Objeto objeto1, Objeto objeto2);
    
    public void crearObjetoNotSuported(Objeto objeto1, Objeto objeto2);
    
    public void crearObjetoNever(Objeto objeto1, Objeto objeto2);
}
