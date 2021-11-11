package reality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import comparadores.ComparadorInverso;
import filtros.Criterio;

public class Coach /*extends Banda*/{

	private String nombre;
	private ArrayList<ElementoAbstracto> miembros;
	
    public Coach(String nombre) {
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}  
    
    public ArrayList<ElementoAbstracto> getMiembros(){
    	return new ArrayList<>(miembros);
    }
    
    public void addMiembro(ElementoAbstracto m) {
	    if(!miembros.contains(m)){
	    	miembros.add(m);
        }else{
            System.out.println("Miembro repetido");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<String> getGeneros(){
    	ArrayList<String> generos = new ArrayList<>();
		for (ElementoAbstracto p: getMiembros()) {
			ArrayList<String> generosParciales = new ArrayList<>();
			generosParciales = p.getGeneros();
			for (String g: generosParciales) {
				if(!generos.contains(g)) {
					generos.add(g);
				}
			}
		}
		Collections.sort(generos);
		return generos;
    }

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
    
    public ArrayList<ElementoAbstracto> buscar(Criterio c){
    	ArrayList<ElementoAbstracto> aux = new ArrayList<>();
    	for (ElementoAbstracto p: getMiembros()) {
				aux.addAll(p.buscar(c));
		}
    	return aux;
    }

    public double getEdad() {
		double edad = 0;
		for (ElementoAbstracto m: miembros) {
			edad += m.getEdad();
		}
		return edad / this.cantMiembros();
	}

    public int cantMiembros() {
		int total = 0;
		for (ElementoAbstracto m: miembros) {
			total += m.cantMiembros();
		}
		return total;
	}
    
    public ElementoAbstracto getMejorParticipante(Comparator<ElementoAbstracto> c){
    	ArrayList<ElementoAbstracto> participantesOrdenados = new ArrayList<>(getMiembros());
    	ComparadorInverso inverso = new ComparadorInverso(c);
    	Collections.sort(participantesOrdenados, inverso);
    	return participantesOrdenados.get(0);
    }

	@Override
	public boolean equals(Object o1){
        try {
            Coach aux = (Coach)o1;
            if(this.getNombre().equals(aux.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
	}



}
