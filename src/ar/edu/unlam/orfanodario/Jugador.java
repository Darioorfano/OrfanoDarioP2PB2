package ar.edu.unlam.orfanodario;

public class Jugador extends Miembro {


private Integer nroCamiseta;
private String posicion;


public Jugador(Integer dni,Integer nroCamiseta,String posicion,String nombre, String apellido, String nombreEquipo) {
	super(dni, nombre, apellido, nombreEquipo);
	// TODO Auto-generated constructor stub
	this.nroCamiseta=nroCamiseta;
	this.posicion=posicion;
	
}

	
}
