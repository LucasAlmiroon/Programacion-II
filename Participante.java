import java.util.ArrayList;

public class Participante {

    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList <String> generos;
    private ArrayList <String> idiomas;
    private ArrayList <String> instrumentos;

    public Participante (String n, String a, int e){
        nombre = n;
        apellido = a;
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public ArrayList<String> getGeneros() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < generos.size(); i++) {
			copia.add(generos.get(i));
		}
		return copia;
	}
    public ArrayList<String> getIdiomas() {
		ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < idiomas.size(); i++) {
			copia.add(idiomas.get(i));
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
    public boolean equals(Object o1){
        try {
            Participante aux = (Participante)o1;
            if(nombre.equals(aux.getNombre()) && apellido.equals(aux.getApellido())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
