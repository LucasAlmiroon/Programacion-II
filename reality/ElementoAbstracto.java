package reality;

import java.util.ArrayList;

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
	
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
