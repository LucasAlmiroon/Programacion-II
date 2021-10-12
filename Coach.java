import java.util.ArrayList;

public class Coach {

    private String nombre;
    private ArrayList <Participante> participantes;

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
}
