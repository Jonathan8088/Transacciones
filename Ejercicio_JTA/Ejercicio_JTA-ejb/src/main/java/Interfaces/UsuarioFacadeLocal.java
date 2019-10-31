/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sosa8
 */
@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
    public void crearUsuarioRequired(Usuario usuario1, Usuario usuario2);
    
    public void crearUsuarioRequiredNew(Usuario usuario1, Usuario usuario2);
    
    public void crearUsuarioMandatory(Usuario usuario1, Usuario usuario2);
    
    public void crearUsuarioSuported(Usuario usuario1);
    
    public void crearUsuarioNotSuported(Usuario usuario1);
    
    public void crearUsuarioNever(Usuario usuario1);
    
}
