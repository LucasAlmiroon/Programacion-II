package reality;
import java.util.ArrayList;
import java.util.Collections;

public class Coach {

    private String nombre;
    private ArrayList <Participante> participantes;
    private ArrayList<String> listaInstrumentosEquipo;

    public Coach(String n){
        nombre = n;
        participantes = new ArrayList<>();
        listaInstrumentosEquipo = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getParticipantes() {
		ArrayList<Participante> copia = new ArrayList<>();
		for (int i = 0; i < participantes.size(); i++) {
			copia.add(participantes.get(i));
		}
		return copia;
	}

    public void addParticipantes(Participante p){
        if(!participantes.contains(p)){
            participantes.add(p);
            addInstrumentosEquipo();
        }else{
            System.out.println("Participante repetido");
        }
    }

    public double promedioEdad(){
        double promedio = 0;
        for (int i = 0; i < participantes.size(); i ++){
            promedio += participantes.get(i).getEdad();
        }

        return promedio/participantes.size();
    }

    public void addInstrumentosEquipo(){
		for (Participante p: participantes) {
			ArrayList<String> instrumentos = new ArrayList<>();
			instrumentos = p.getInstrumentos();
			for (String i: instrumentos) {
				if(!listaInstrumentosEquipo.contains(i)) {
					listaInstrumentosEquipo.add(i);
				}
			}
		}
    }

    public ArrayList<String> getInstrumentosEquipo(){
        ArrayList<String> copia = new ArrayList<>();
		for (int i = 0; i < listaInstrumentosEquipo.size(); i++) {
			copia.add(listaInstrumentosEquipo.get(i));
		}
		return copia;
    }

    public ArrayList<String> getIdiomas(){
    	ArrayList<String> idiomas = new ArrayList<>();
		for (Participante p: participantes) {
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

    public ArrayList<String> getGenerosPreferencia(){
    	ArrayList<String> generos = new ArrayList<>();
		for (Participante p: participantes) {
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

}
