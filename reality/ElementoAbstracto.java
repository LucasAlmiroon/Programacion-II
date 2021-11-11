package reality;

import java.util.ArrayList;

import filtros.Criterio;

public abstract class ElementoAbstracto {

	private String nombre;
	
	public ElementoAbstracto(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getEdad();
	public abstract ArrayList<String> getGeneros();
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	public abstract int cantMiembros();
	public abstract ArrayList<ElementoAbstracto> buscar(Criterio c);
	public abstract ElementoAbstracto copia(Criterio c);
	public abstract int cantMiembrosTocanInstrumento(Musica m);
    
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	@Override
	public String toString() {
		return nombre;
	}
    
	public boolean equals(Object o1){
        try {
        	ElementoAbstracto aux = (ElementoAbstracto)o1;
            if(this.getNombre().equals(aux.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
	}

	
	public boolean tocaInstrumento(String i) {
    	return this.getInstrumentos().contains(i);
    }
	    
	public abstract boolean sabeIdioma(String i);
	    
    public abstract boolean leGustaGenero(String g);
}
