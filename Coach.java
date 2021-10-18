import java.util.ArrayList;

public abstract class  Coach {

    private String nombre;
    private ArrayList <Participante> participantes;
    private ArrayList<String> listaInstrumentosEquipo;

    public Coach (String n){
        nombre = n;
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
		for (int i = 0; i < participantes.size(); i++) {
            if(!participantes.get(i).getInstrumentos().containsAll(listaInstrumentosEquipo)){
                for(int j = 0; j < participantes.get(i).getInstrumentos().size(); j++){
                    if(!listaInstrumentosEquipo.contains(participantes.get(i).getInstrumentos().get(j))){
                        listaInstrumentosEquipo.add(participantes.get(i).getInstrumentos().get(j));
                    }
                }
		    }else{
                System.out.println("Ya estan todos los instrumentos en la lista.");
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
}
