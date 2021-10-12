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
}
