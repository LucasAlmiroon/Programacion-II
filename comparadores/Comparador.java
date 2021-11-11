package comparadores;

import java.util.Comparator;

import reality.ElementoAbstracto;

public abstract class Comparador implements Comparator<ElementoAbstracto>{

	private String nombre;
	
	public Comparador(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compare(ElementoAbstracto o1, ElementoAbstracto o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	

}
