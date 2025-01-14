package Parking.models;

import Parking.enums.Marcas;

public class Coche {

	// Atributos del coche
	private String matricula;
	private String nombre;
	private Marcas marca;
	
	// Constructor, sirve para inicializar Coche
	public Coche(String matricula, String nombre, Marcas marca) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.marca = marca;
		
	}
	
	public Coche() {
	
		
		
		
		
	}
	
	
	//Get: Para entrar a matricula
	//Set: Para guardar lo que escribio el usuario
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Marcas getMarca() {
		return marca;
	}
	public void setMarca(Marcas marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombre=" + nombre + ", marca=" + marca + "]";
	}
	
	
	
	
	
	
}
