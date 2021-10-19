

import reality.Coach;
import reality.Participante;

public class Concurso {
    public static void main(String[] args) {
        Participante Lucas = new Participante("Lucas", "Almiron", 10);
        Participante Guido = new Participante("Guido", "Zoppo", 12);
        
        Lucas.addInstrumento("Guitarra");
        Lucas.addInstrumento("Violin");
        Lucas.addInstrumento("Piano");
        
        Guido.addInstrumento("Guitarra");
        Guido.addInstrumento("Bateria");
        Guido.addInstrumento("Bajo");
        
        Coach carlos = new Coach("Carlos");
        carlos.addParticipantes(Guido);
        carlos.addParticipantes(Lucas);
        //System.out.println(carlos.getInstrumentosEquipo());
        
        Lucas.addIdioma("Ingles");
        Lucas.addIdioma("español");
        
        Guido.addIdioma("Ingles");
        Guido.addIdioma("ingles");
        Guido.addIdioma("ruso");
        Guido.addIdioma("Español");
        System.out.println(carlos.getIdiomas());
        
        Lucas.addGenero("Pop");
        Lucas.addGenero("Cumbia");
        Guido.addGenero("Rock");
        Guido.addGenero("Reggae");
        Guido.addGenero("cumbia");
        System.out.println(carlos.getGenerosPreferencia());

   }
}