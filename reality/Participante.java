package reality;
import java.util.ArrayList;

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
    	if(!instrumentos.contains(i.toLowerCase())) {
        	instrumentos.add(i.toLowerCase());    		
    	} else {
    		System.out.println("El instrumento " + i + " ya está agregado en " + this.getNombre());
    	}
    }
    
    public void addGenero(String g) {
    	if(!generos.contains(g.toLowerCase())) {
    		generos.add(g.toLowerCase());
    	} else {
    		System.out.println("El genero " + g + " ya está agregado en " + this.getNombre());
    	}
    }
    
    public void addIdioma(String i) {
    	if(!idiomas.contains(i.toLowerCase())) {
    		idiomas.add(i.toLowerCase());
    	} else {
    		System.out.println("El idioma " + i + " ya está agregado en " + this.getNombre());
    	}
    }
    
    public boolean tocaInstrumento(String i) {
    	return instrumentos.contains(i);
    }
    
    public boolean sabeIdioma(String i) {
    	return idiomas.contains(i);
    }
    
    public boolean leGustaGenero(String g) {
    	return generos.contains(g);
    }
    

	@Override
	public double getEdad() {
		return edad;
	}
	

	@Override
    public ArrayList<String> getGeneros() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < generos.size(); i++) {
			copia.add(generos.get(i));
		}
		return copia;
	}
	
	@Override
    public ArrayList<String> getIdiomas() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < idiomas.size(); i++) {
			copia.add(idiomas.get(i));
		}
		return copia;
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


}
