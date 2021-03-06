package reality;
import java.util.ArrayList;

import filtros.Criterio;

public class Musica {
    private String titulo;
    private String idioma;
    private String interprete;
    private ArrayList <String> generos;
    private ArrayList <String> instrumentos;
    private Criterio criterioInterpretacion;

    public Musica (String t, String i, String interprete, Criterio c){
        titulo = t;
        idioma = i;
        this.interprete = interprete;
        generos = new ArrayList<>();
        instrumentos = new ArrayList<>();
        criterioInterpretacion = c;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void addGenero(String g){
        if(!generos.contains(g)){
            generos.add(g);
        }
    }

    public void addInstrumentos(String i){
        if(!instrumentos.contains(i)){
         instrumentos.add(i);   
        }
    }

    public ArrayList<String> getGeneros() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < generos.size(); i++) {
			copia.add(generos.get(i));
		}
		return copia;
	}

    public ArrayList<String> getInstrumentos() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < instrumentos.size(); i++) {
			copia.add(instrumentos.get(i));
		}
		return copia;
	}

    public boolean requiereInstrumento(String i) {
	   return this.getInstrumentos().contains(i);
    }
    
    public boolean puedeInterpretarlo(ElementoAbstracto e) {
    	return criterioInterpretacion.cumple(e);
    }
    
    public boolean equals(Object o1){
        try {
            Musica aux = (Musica) o1;
                if(titulo.equals(aux.getTitulo()) && interprete.equals(aux.getInterprete())){
                    return true;
                }else{
                    return false;
                }
        } catch (Exception e) {
            return false;
        }
    }

	public void setCriterioInterpretacion(Criterio criterioInterpretacion) {
		this.criterioInterpretacion = criterioInterpretacion;
	}
    
    
}
