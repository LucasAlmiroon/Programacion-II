package reality;
import java.util.ArrayList;
import java.util.Collections;

import filtros.Criterio;

public class Coach {

    private String nombre;
    private ArrayList <ElementoAbstracto> participantes;

    public Coach(String n){
        nombre = n;
        participantes = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ElementoAbstracto> getParticipantes() {
		return new ArrayList<>(participantes);
	}

    public void addParticipantes(ElementoAbstracto p){
        if(!participantes.contains(p)){
            participantes.add(p);
        }else{
            System.out.println("Participante repetido");
        }
    }

    
	public int cantMiembros() {
		int total = 0;
		for (ElementoAbstracto p: participantes) {
			total += p.cantMiembros();
		}
		return total;
	}
	
	
	public double getEdad() {
		double edad = 0;
		for (ElementoAbstracto p: participantes) {
			edad += p.getEdad();
		}
		return edad / this.cantMiembros();
	}

    public ArrayList<String> getInstrumentos(){
        ArrayList<String> instrumentos = new ArrayList<>();
		for (ElementoAbstracto p: participantes) {
			ArrayList<String> instrumentosParciales = new ArrayList<>();
			instrumentosParciales = p.getInstrumentos();
			for(String i: instrumentosParciales) {
				if(!instrumentos.contains(i)) {
					instrumentos.add(i);
				}
			}
		}
		return instrumentos;
    }

    public ArrayList<String> getIdiomas(){
    	ArrayList<String> idiomas = new ArrayList<>();
		for (ElementoAbstracto p: participantes) {
			ArrayList<String> idiomasParciales = new ArrayList<>();
			idiomasParciales = p.getIdiomas();
			for (String i: idiomasParciales) {
				if(!idiomas.contains(i)) {
					idiomas.add(i);
				}
			}
		}
		return idiomas;
    }

    public ArrayList<String> getGeneros(){
    	ArrayList<String> generos = new ArrayList<>();
		for (ElementoAbstracto p: participantes) {
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

    
    public ArrayList<ElementoAbstracto> buscar(Criterio c){
    	ArrayList<ElementoAbstracto> aux = new ArrayList<>();
    	for (ElementoAbstracto p: participantes) {
			if(c.cumple(p)) {
				aux.add(p);
			}
		}
    	return aux;
    }
}
