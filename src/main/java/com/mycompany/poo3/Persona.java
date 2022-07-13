/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo3;

/**
 *
 * @author Miguel
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC()
    {
        double IMC = this.peso / Math.pow(this.altura,2) ;
        return IMC;
    }
    
    public boolean esMayorDeEdad()
    {
        if(edad >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
    @Override
    public String toString()
    {        
       String obj = "La persona: " + nombre + " Tiene un IMC de" + calcularIMC() ;
       return obj;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
