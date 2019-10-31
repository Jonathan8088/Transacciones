/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import Entity.Usuario;
import Interfaces.UsuarioFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author sosa8
 */
@Stateless
@LocalBean
@TransactionManagement (TransactionManagementType.CONTAINER)
public class Transacciones {
    
    @EJB
    UsuarioFacadeLocal usuarioLocal;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void guardar(Usuario usuario1, Usuario usuario2){
        guardar1(usuario1);
        guardar2(usuario2);
    }
    
    public void guardar1(Usuario usuario){
        usuarioLocal.create(usuario);
    }
    
    public void guardar2(Usuario usuario2){
        usuarioLocal.create(usuario2);
    }
}
