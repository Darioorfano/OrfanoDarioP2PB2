package ar.edu.unlam.orfanodario;

import java.util.HashSet;

public class Equipo {
private String nombre;
private HashSet<Miembro> miembros=new HashSet<>();


public Equipo (String nombre) {
	
	this.nombre=nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void agregarMiembrosAlEquipo(Miembro miembro){
	this.miembros.add(miembro);
	
}

public Integer obtenerCantidadDeJugadoresEnElEquipo() {
	// TODO Auto-generated method stub
	return this.miembros.size();
}

}
