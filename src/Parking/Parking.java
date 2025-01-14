package Parking;

import java.util.ArrayList;

import Parking.enums.Marcas;
import Parking.models.Coche;

public class Parking {
	public static void main(String[] args) {
		ArrayList<Coche> cochesGuardados=new ArrayList<Coche>();
	
		Coche coche1= new Coche();
		coche1.setMatricula("123456");
		
		coche1.setMarca(Marcas.BMW);
		
		
		Coche coche2= new Coche("matricula", "nombre", Marcas.BMW);
		
		cochesGuardados.add(coche1);
		cochesGuardados.add(coche2);
		
		
		
		// Crear coche 
		Coche coche3=new Coche("matricula", "nombre", Marcas.AUDI);
		
		if(coche3.getMarca().equals(Marcas.AUDI)) {
			
			//Añadir el coche al ArrayList
		cochesGuardados.add(coche3);
		
		for(Coche c : cochesGuardados) 
		{
			System.out.println(c);
		}
		
		
		}
		
		
		
		
		
	}

}
