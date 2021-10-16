import java.util.ArrayList;

public class Produccion {
    private ArrayList <Musica> listaDeMusica;

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
			System.out.println("Esa cancion ya esta añadida a la lista.");
		}
	}
}
