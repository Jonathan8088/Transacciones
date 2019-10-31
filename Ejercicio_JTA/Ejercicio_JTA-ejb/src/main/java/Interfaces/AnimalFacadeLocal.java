/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Animal;
import Entity.Objeto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sosa8
 */
@Local
public interface AnimalFacadeLocal {

    void create(Animal animal);

    void edit(Animal animal);

    void remove(Animal animal);

    Animal find(Object id);

    List<Animal> findAll();

    List<Animal> findRange(int[] range);
    
    public void guardarAnimal(Objeto objeto, Objeto objeto2, Animal animal, int transaccion);

    int count();
    
}
