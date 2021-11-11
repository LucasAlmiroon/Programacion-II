package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public class ComparadorEdad extends Comparador{

	public ComparadorEdad(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		return (int) (o1.getEdad() - o2.getEdad());
	}

}
