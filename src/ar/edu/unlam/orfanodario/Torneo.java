package ar.edu.unlam.orfanodario;

import java.util.HashSet;

public class Torneo {
private String nombre;
private Double minuto;
private HashSet<Partido>partidos;



public Torneo(String nombre){
	this.nombre=nombre;
	this.partidos=new HashSet<>();

}
public Boolean registrarPartidos(Partido partido){
	
	return this.partidos.add(partido);
	
	
}


}
