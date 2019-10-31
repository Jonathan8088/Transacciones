/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.AbstractFacade;
import Interfaces.ObjetoFacadeLocal;
import Entity.Objeto;
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
public class ObjetoFacade extends AbstractFacade<Objeto> implements ObjetoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_Ejercicio_JTA-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ObjetoFacade() {
        super(Objeto.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoRequired(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoRequiredNew(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoMandatory(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoSupported(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoNotSuported(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearObjetoNever(Objeto objeto1, Objeto objeto2) {
        try {
            em.persist(objeto1);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 1");
        }
        try {
            em.persist(objeto2);
        } catch (Exception e) {
            System.out.println("Error guardando objeto 2");
        }
    }
    
}
