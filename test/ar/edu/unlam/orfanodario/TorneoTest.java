package ar.edu.unlam.orfanodario;

import static org.junit.Assert.*;

import org.junit.Test;

public class TorneoTest {

	@Test
	public void testQueVerificaQueLosMiembrosSeAgregaronCorrectamenteAlTorneo() {
		Torneo torneo=new Torneo("Copa America");
		Equipo argentina=new Equipo("Argentina");
		Miembro jugador1=new Jugador(41582343,1,"Def","Dario","Orfano","Argentina");
		Miembro jugador2=new Jugador(41582344,2,"Del","Roberto","Acuña","Argentina");
		Miembro jugador3=new Jugador(41582345,3,"Arq","Rodolfo"," Isla","Argentina");
		Miembro jugador4=new Jugador(41582346,4,"DEL","Facundo","Tagliafico","Argentina");
		Miembro jugador5=new Jugador(41582347,5,"DEL","Gabriel","Orfano","Argentina");
		Miembro jugador6=new Jugador(41582348,6,"DEF","Franco","Meneses ","Argentina");
		Miembro jugador7=new Jugador(41582349,7,"MCO","Andres"," Maripán","Argentina");
		Miembro jugador8=new Jugador(41582323,8,"ARQ","Alan","Ocampo","Argentina");
		Miembro jugador9=new Jugador(41582333,9,"Del","Romeo","Messi","Argentina");
		Miembro jugador10=new Jugador(41582384,10,"Del","Lucas","Scaloni","Argentina");
		Miembro jugador11=new Jugador(41582399,11,"Del","Lautaro","Roba","Argentina");
		Miembro director=new DirectorTecnico(41582342, "Lionel", "Scaloni","Argentina", 22);
		
		argentina.agregarMiembrosAlEquipo(jugador1);
		argentina.agregarMiembrosAlEquipo(jugador2);
		argentina.agregarMiembrosAlEquipo(jugador3);
		argentina.agregarMiembrosAlEquipo(jugador4);
		argentina.agregarMiembrosAlEquipo(jugador5);
		argentina.agregarMiembrosAlEquipo(jugador6);
		argentina.agregarMiembrosAlEquipo(jugador7);
		argentina.agregarMiembrosAlEquipo(jugador8);
		argentina.agregarMiembrosAlEquipo(jugador9);
		argentina.agregarMiembrosAlEquipo(jugador10);
		argentina.agregarMiembrosAlEquipo(jugador11);
		argentina.agregarMiembrosAlEquipo(director);
	
	assertEquals(12, argentina.obtenerCantidadDeJugadoresEnElEquipo(),0.01);
	
	}
	
	
	@Test
	public void testQueVerificaQueElLosPartidosSeRegistraronCorrectamente() {
		Torneo torneo=new Torneo("Copa America");
		Equipo argentina=new Equipo("Argentina");
		Equipo chile=new Equipo("Chile");
		Jugador jugador1=new Jugador(41582343,1,"Def","Dario","Orfano","Argentina");
		Partido partido=new Partido(argentina,chile);
		
		
		assertTrue(torneo.registrarPartidos(partido));
	}


}
	
	
	

