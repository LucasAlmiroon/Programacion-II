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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getIdiomas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
