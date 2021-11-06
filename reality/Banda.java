package reality;

import java.util.ArrayList;

public class Banda extends ElementoAbstracto{

	private ArrayList<ElementoAbstracto> miembros;
	
	public Banda(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}
	
	public void addMiembro(ElementoAbstracto m) {
		miembros.add(m);
	}
	
	public ArrayList<ElementoAbstracto> getMiembros(){
		return new ArrayList<>(miembros);
	}

	@Override
	public int cantMiembros() {
		int total = 0;
		for (ElementoAbstracto m: miembros) {
			total += m.cantMiembros();
		}
		return total;
	}
	
	@Override
	public double getEdad() {
		double edad = 0;
		for (ElementoAbstracto m: miembros) {
			edad += m.getEdad();
		}
		return edad / this.cantMiembros();
	}

	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		return generos;
	}

	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (ElementoAbstracto m: miembros) {
			ArrayList<String> idiomas2 = m.getIdiomas();
			for (String i: idiomas2) {
				if(!idiomas.contains(i)) {
					idiomas.add(i);
				}
			}
		}
		return idiomas;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (ElementoAbstracto m: miembros) {
			ArrayList<String> instrumentos2 = m.getInstrumentos();
			for (String i: instrumentos2) {
				if(!instrumentos.contains(i)) {
					instrumentos.add(i);
				}
			}
		}
		return instrumentos;
	}

	@Override
	public boolean leGustaGenero(String g) {
		boolean leGusta = false;
		for (ElementoAbstracto m: miembros) {
			leGusta = m.leGustaGenero(g);
			System.out.println(leGusta);
		}
		return leGusta;
	}
	
	@Override
	public boolean sabeIdioma(String g) {
		boolean sabe = false;
		for (ElementoAbstracto m: miembros) {
			sabe = m.sabeIdioma(g);
		}
		return sabe;
	}
	
}
