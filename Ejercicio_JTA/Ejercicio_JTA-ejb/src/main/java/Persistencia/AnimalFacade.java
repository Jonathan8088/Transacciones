/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entity.Animal;
import Entity.Objeto;
import Interfaces.AbstractFacade;
import Interfaces.AnimalFacadeLocal;
import Interfaces.ObjetoFacadeLocal;
import javax.ejb.EJB;
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
public class AnimalFacade extends AbstractFacade<Animal> implements AnimalFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Ejercicio_JTA-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @EJB
    ObjetoFacadeLocal objetoLocal;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AnimalFacade() {
        super(Animal.class);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void guardarAnimal(Objeto objeto, Objeto objeto2, Animal animal, int transaccion) {
        try {

            em.persist(animal);
            if (transaccion == 1) {
                objetoLocal.crearObjetoRequired(objeto, objeto2);
            } else if (transaccion == 2) {
                objetoLocal.crearObjetoRequiredNew(objeto, objeto2);
            } else if (transaccion == 3) {
                objetoLocal.crearObjetoMandatory(objeto, objeto2);
            } else if (transaccion == 4) {
                objetoLocal.crearObjetoSupported(objeto, objeto2);
            } else if (transaccion == 5) {
                objetoLocal.crearObjetoNotSuported(objeto, objeto2);
            } else if (transaccion == 6) {
                objetoLocal.crearObjetoNever(objeto, objeto2);
            }
        } catch (Exception e) {
            
        }
    }

}
