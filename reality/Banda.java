package reality;

import java.util.ArrayList;

import filtros.Criterio;

public class Banda extends ElementoAbstracto{

	private ArrayList<ElementoAbstracto> miembros;
	
	public Banda(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}
	
	public void addMiembro(ElementoAbstracto m) {
	    if(!miembros.contains(m)){
	    	miembros.add(m);
        }else{
            System.out.println("Miembro repetido");
        }
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
		ArrayList<String> aRetornar = new ArrayList<>();
		ArrayList<String> generosUno = new ArrayList<>(miembros.get(0).getGeneros());
		int cantMiembros = this.cantMiembros();
		for(String g: generosUno) {
			int cant = 0;
			for(int i = 0; i < cantMiembros; i++) {
				ArrayList<String> generosProxMiembro = new ArrayList<>(miembros.get(i).getGeneros());
				if(generosProxMiembro.contains(g)) {
					cant++;
				}
			}
			if(cant == cantMiembros-1) {
				aRetornar.add(g);
			}
		}
		return aRetornar;
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
	public boolean sabeIdioma(String i) {
		boolean sabe = false;
		for (ElementoAbstracto m: miembros) {
			sabe = m.sabeIdioma(i);
		}
		return sabe;
	}

	
	@Override
	public ArrayList<ElementoAbstracto> buscar(Criterio c) {
		ArrayList<ElementoAbstracto> aux = new ArrayList<>();
		if(c.cumple(this)) {
			aux.add(this);
			return aux;
		}
		for (ElementoAbstracto m: miembros) {
			aux.addAll(m.buscar(c));
		}
		return aux;
	}
	
}
