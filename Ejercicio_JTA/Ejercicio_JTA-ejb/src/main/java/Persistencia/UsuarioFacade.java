/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.UsuarioFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.Usuario;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sosa8
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_Ejercicio_JTA-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    @Override
    public void crearUsuarioRequired(Usuario usuario1, Usuario usuario2){
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 1");
        }
        try {
            em.persist(usuario2);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 2");
        }
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    @Override
    public void crearUsuarioRequiredNew(Usuario usuario1, Usuario usuario2){
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 1");
        }
        try {
            em.persist(usuario2);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 2");
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void crearUsuarioSuported(Usuario usuario1){
        procesoLogico();
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario");
        }

    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void crearUsuarioMandatory(Usuario usuario1, Usuario usuario2){
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 1");
        }
        try {
            em.persist(usuario2);
        } catch (Exception e) {
            System.out.println("Error guardando usuario 2");
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void crearUsuarioNotSuported(Usuario usuario1){
        procesoLogico();
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario ");
        }

    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearUsuarioNever(Usuario usuario1){
        procesoLogico();
        try {
            em.persist(usuario1);
        } catch (Exception e) {
            System.out.println("Error guardando usuario ");
        }

    }
    
    public void procesoLogico(){
        System.out.println("Tabla del 5");
        for (int i = 1; i < 10; i++) {
            System.out.println("5 x "+i+" = "+(5*i));
            
        }
    }
}
