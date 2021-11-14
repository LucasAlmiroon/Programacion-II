package reality;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Produccion {
    private ArrayList <Musica> listaDeMusica;
    private ArrayList<Coach> coaches;
    private Comparator<ElementoAbstracto> metodoJuego;

    public Produccion(Comparator<ElementoAbstracto> metodo) {
    	listaDeMusica = new ArrayList<>();
    	coaches = new ArrayList<>();
    	metodoJuego = metodo;
    }
    
    public ArrayList<Musica> getListaDeMusica() {
		ArrayList<Musica> copia = new ArrayList<>();
		for (int i = 0; i < listaDeMusica.size(); i++) {
			copia.add(listaDeMusica.get(i));
		}
		return copia;
	}
	
    public void addMusica(Musica c){
		if(!listaDeMusica.contains(c)){
			listaDeMusica.add(c);
		}else{
			System.out.println("Esa cancion ya esta agregada a la lista.");
		}
	}

	
    public void addCoach(Coach c){
		if(!coaches.contains(c)){
			coaches.add(c);
		}else{
			System.out.println("El coach ya esta agregado a la lista.");
		}
	}

    
	public Comparator<ElementoAbstracto> getMetodoJuego() {
		return metodoJuego;
	}

	
	public void setMetodoJuego(Comparator<ElementoAbstracto> metodoJuego) {
		this.metodoJuego = metodoJuego;
	}

	public void organizarBatalla() {
		ArrayList<Coach> elegidos = this.getCoachBatallar();
		Coach coach1 = elegidos.get(0);
		Coach coach2 = elegidos.get(1);
		ElementoAbstracto p1 = coach1.getMejorParticipante(metodoJuego);
		ElementoAbstracto p2 = coach2.getMejorParticipante(metodoJuego);
		ElementoAbstracto ganador = getGanador(p1, p2);
		System.out.println("------------BATALLA CON METODO " + metodoJuego + "------------");
		System.out.println("Compiten los participantes " + p1 + " (del equipo de " + coach1 + ") y " + p2 
				+ " (del equipo de " + coach2 + ") y el ganador es " + ganador);
		System.out.println("------------FIN DE LA BATALLA------------");
	}

	public ArrayList<Coach> getCoaches(){
		return new ArrayList<>(coaches);
	}
	
	public ArrayList<Coach> getCoachBatallar(){
		ArrayList<Coach> copiaCoaches = this.getCoaches();
		ArrayList<Coach> elegidos = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			int indice = (int) (Math.random()*copiaCoaches.size());
			elegidos.add(copiaCoaches.get(indice));
			copiaCoaches.remove(indice);
		}
		return elegidos;
	}
	
	public ElementoAbstracto getGanador(ElementoAbstracto p1, ElementoAbstracto p2) {
		int resultado = this.metodoJuego.compare(p1, p2);
		if(resultado > 0) {
			return p1;
		} else if(resultado < 0) {
			return p2;
		} 
		return null;
	}
}
