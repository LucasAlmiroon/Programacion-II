package reality;
import java.util.ArrayList;
import java.util.Collections;

import filtros.Criterio;

public class Coach extends Banda{

    public Coach(String nombre) {
		super(nombre);
	}  
    
    public ArrayList<String> getGeneros(){
    	ArrayList<String> generos = new ArrayList<>();
		for (ElementoAbstracto p: super.getMiembros()) {
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

    
    /*public ArrayList<ElementoAbstracto> buscar(Criterio c){
    	ArrayList<ElementoAbstracto> aux = new ArrayList<>();
    	for (ElementoAbstracto p: participantes) {
			if(c.cumple(p)) {
				aux.add(p);
			}
		}
    	return aux;
    }*/
}
