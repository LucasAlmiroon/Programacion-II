import java.util.ArrayList;

public abstract class  Coach {

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

    public void addParticipantes(Participante p){

        if(!participantes.contains(p)){
            participantes.add(p);
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
}
