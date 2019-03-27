package com.curso.java.oo;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.model.CargoDePolicia;
import com.curso.java.oo.model.Persona;
import com.curso.java.oo.model.Policia;
import com.curso.java.oo.model.PoliciaDeLosDeLasPorras;
import com.curso.java.oo.model.PoliciaPistolero;

public class Ejemplo01HelloWorld {
	//java com.curso.java.oo.Ejemplo01HelloWord arg1 arg2 arg3 ...
 public static void main(String[] args) {
	String micadena = "hola";
	System.out.println(micadena);
	Persona persona = new Persona();
	Persona persona2 = new Persona();
	persona.setNombre("Alguien");
	persona.Algoexplicito = "Es de alguien";
	persona2.setApellido1("apellido");
	Persona persona3 = new PoliciaDeLosDeLasPorras();
	PoliciaDeLosDeLasPorras poliPorrero =(PoliciaDeLosDeLasPorras) persona3;
	Policia policia = new Policia();
	policia.setCargo(CargoDePolicia.RASO);
	//PoliciaDeLosDeLasPorras otroPorrero = (PoliciaDeLosDeLasPorras) policia;
	
	
	Set<Policia> setDePolicias = new HashSet<Policia>(); // Solo un objeto de cada
	setDePolicias.add(poliPorrero);
	setDePolicias.add((Policia) persona3);
	setDePolicias.add(new PoliciaPistolero());
	System.out.println(setDePolicias.size());
	
	
	
	List<Policia> lista = new ArrayList(); // Solo una variable de cada
	lista.add(poliPorrero);
	lista.add((Policia) persona3);
	lista.add(new PoliciaPistolero());
	System.out.println(lista.size());
	
	
	//Cada objeto puede ser apuntado por una o varias variables
	
	
	Map<String, Persona> mapa = new HashMap<String, Persona>(); // En un mapa las claves se comportan como sets y los valores como listas
	
	mapa.put("ROJO", policia);
	mapa.put("VERDE",poliPorrero);
	mapa.put("ROJO",poliPorrero);
	
	System.out.println(mapa.get("ROJO"));
}
}
