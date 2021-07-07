package ar.edu.unlam.orfanodario;

import java.util.ArrayList;

public class Partido {
	private Integer id;
private Equipo local;
private Equipo visitante;
private ArrayList<Jugador> nomina=new ArrayList<>();

public Partido(Equipo local, Equipo visitante) {
		// TODO Auto-generated constructor stub
	}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Partido other = (Partido) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}




}
