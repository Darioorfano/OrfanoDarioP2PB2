package ar.edu.unlam.orfanodario;

public class Miembro {
private String nombre;
private String apellido;
private Integer dni;
private String nombreEquipo;


public Miembro(Integer dni,String nombre,String apellido,String nombreEquipo) {
this.nombre=nombre;
this.apellido=apellido;
this.dni=dni;
this.nombreEquipo=nombreEquipo;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
	Miembro other = (Miembro) obj;
	if (dni == null) {
		if (other.dni != null)
			return false;
	} else if (!dni.equals(other.dni))
		return false;
	return true;
}


}
