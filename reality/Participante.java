package reality;
import java.util.ArrayList;

import filtros.Criterio;

public class Participante extends ElementoAbstracto{

    private String apellido;
    private int edad;
    private ArrayList <String> generos;
    private ArrayList <String> idiomas;
    private ArrayList <String> instrumentos;

    public Participante (String n, String a, int e){
    	super(n);
        apellido = a;
        edad = e;
        generos = new ArrayList<>();
        idiomas = new ArrayList<>();
        instrumentos = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
       
    public void addInstrumento(String i) {
    	if(!instrumentos.contains(i)) {
        	instrumentos.add(i);    		
    	} else {
    		System.out.println("El instrumento " + i + " ya está agregado en " + this.getNombre());
    	}
    }
    
    public void addIdioma(String i) {
    	if(!idiomas.contains(i)) {
        	idiomas.add(i);    		
    	} else {
    		System.out.println("El idioma " + i + " ya está agregado en " + this.getNombre());
    	}
    }
    
    public void addGenero(String g) {
    	if(!generos.contains(g)) {
    		generos.add(g);
    	} else {
    		System.out.println("El genero " + g + " ya está agregado en " + this.getNombre());
    	}
    }
        
	@Override
	public double getEdad() {
		return edad;
	}
	

	@Override
    public ArrayList<String> getGeneros() {
		return new ArrayList<>(generos);
	}
	
	@Override
    public ArrayList<String> getIdiomas() {
		return new ArrayList<>(idiomas);
	}
	
	@Override
    public ArrayList<String> getInstrumentos() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < instrumentos.size(); i++) {
			copia.add(instrumentos.get(i));
		}
		return copia;
	}
    
	@Override
	public int cantMiembros() {
		return 1;
	}
    public boolean equals(Object o1){
        try {
            Participante aux = (Participante)o1;
            if(super.getNombre().equals(aux.getNombre()) && apellido.equals(aux.getApellido())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

	
    @Override
	public boolean leGustaGenero(String g) {
		return this.getGeneros().contains(g);
	}

    @Override
	public boolean sabeIdioma(String i) {
		return this.getIdiomas().contains(i);
	}

	
    @Override
	public ArrayList<ElementoAbstracto> buscar(Criterio c) {
		ArrayList<ElementoAbstracto> aux = new ArrayList<>();
		if(c.cumple(this)) {
			aux.add(this.copia(c));
		}
		return aux;
	}

	@Override
	public ElementoAbstracto copia(Criterio c) {
		if(c.cumple(this)) {
			Participante copia = new Participante(this.getNombre(), this.getApellido(), (int)this.getEdad());
			for (String g: generos) {
				copia.addGenero(g);
			}
			for (String i: idiomas) {
				copia.addGenero(i);
			}
			for (String i: instrumentos) {
				copia.addGenero(i);
			}
			return copia;
		}
		return null;
	}

}
