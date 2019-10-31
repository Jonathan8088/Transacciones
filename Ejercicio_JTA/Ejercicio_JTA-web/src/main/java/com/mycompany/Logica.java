/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import Entity.Animal;
import Entity.Objeto;
import Entity.Usuario;
import Interfaces.AnimalFacadeLocal;
import Interfaces.ObjetoFacadeLocal;
import Interfaces.UsuarioFacadeLocal;
import Modelo.Bestias;
import Modelo.Elemento;
import Modelo.Elemento2;
import Modelo.Persona;
import Modelo.Persona2;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author sosa8
 */
@Named(value = "logica")
@SessionScoped
public class Logica implements Serializable{

    @EJB
    UsuarioFacadeLocal usuarioLocal;
    
    @EJB
    ObjetoFacadeLocal objetoLocal;
    
    @EJB
    AnimalFacadeLocal animalLocal;
    
    Persona persona;
    
    Persona2 persona2;
    
    Usuario usuario;
    
    Usuario usuario2;
    
    Objeto objeto;
    
    Objeto objeto2;
    
    Animal animal;
    
    Elemento elemento;
    
    Elemento2 elemento2;
    
    Bestias bestias;
    
    int id;
    
    @EJB
    Transacciones transaccion;
    
    public Logica() {
         persona = new Persona();
         persona2 = new Persona2();
         usuario = new Usuario();
         usuario2 = new Usuario();
         objeto = new Objeto();
         objeto2 = new Objeto();
         bestias = new Bestias();
         elemento = new Elemento();
         elemento2 = new Elemento2();
         
    }
    
    public void guardarPersona(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioRequired(usuario, usuario2);
    }
    
    public void guardarPersonaRequiredNew(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioRequiredNew(usuario, usuario2);
    }
    public void guardarPersonaMandatory(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioMandatory(usuario, usuario2);
    }
    public void guardarPersonaSuported(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioSuported(usuario);
    }
    public void guardarPersonaNotSuported(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioNotSuported(usuario);
    }
    public void guardarPersonaNever(Persona persona1, Persona2 persona2){
        usuario = new Usuario(persona1.getId(), persona1.getNombre());
        usuario2 = new Usuario(persona2.getId(), persona2.getNombre());
        usuarioLocal.crearUsuarioNever(usuario);
    }
    
    public void guardarTransaccionRequired(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 1);
    }
    
    public void guardarTransaccionRequiredNew(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 2);
    }
    
    public void guardarTransaccionMandatory(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 3);
    }
    
    public void guardarTransaccionSuported(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 4);
    }
    
    public void guardarTransaccionNotSupports(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 5);
    }
    
    public void guardarTransaccionNever(Elemento elemento, Elemento2 elemento2, Bestias best){
        objeto = new Objeto(elemento.getId(), elemento.getObjeto());
        objeto2 = new Objeto(elemento2.getId(), elemento2.getObjeto());
        animal = new Animal(best.getBestia());
        animalLocal.guardarAnimal(objeto, objeto2, animal, 6);
    }

    public UsuarioFacadeLocal getUsuarioLocal() {
        return usuarioLocal;
    }

    public void setUsuarioLocal(UsuarioFacadeLocal usuarioLocal) {
        this.usuarioLocal = usuarioLocal;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona2 getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona2 persona2) {
        this.persona2 = persona2;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public Transacciones getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transacciones transaccion) {
        this.transaccion = transaccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ObjetoFacadeLocal getObjetoLocal() {
        return objetoLocal;
    }

    public void setObjetoLocal(ObjetoFacadeLocal objetoLocal) {
        this.objetoLocal = objetoLocal;
    }

    public AnimalFacadeLocal getAnimalLocal() {
        return animalLocal;
    }

    public void setAnimalLocal(AnimalFacadeLocal animalLocal) {
        this.animalLocal = animalLocal;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Elemento2 getElemento2() {
        return elemento2;
    }

    public void setElemento2(Elemento2 elemento2) {
        this.elemento2 = elemento2;
    }

    public Bestias getBestia() {
        return bestias;
    }

    public void setBestia(Bestias bestias) {
        this.bestias = bestias;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public Objeto getObjeto2() {
        return objeto2;
    }

    public void setObjeto2(Objeto objeto2) {
        this.objeto2 = objeto2;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Bestias getBestias() {
        return bestias;
    }

    public void setBestias(Bestias bestias) {
        this.bestias = bestias;
    }

   
    
    
    
    
}
