

import reality.Banda;
import reality.Coach;
import reality.Participante;

public class Concurso {
    public static void main(String[] args) {
        Participante Lucas = new Participante("Lucas", "Almiron", 10);
        Participante Guido = new Participante("Guido", "Zoppo", 12);
        Participante Carlos = new Participante("Carlos", "Zoppo", 40);
        
        Banda banda1 = new Banda("Banda 1");
        Banda banda2 = new Banda("Banda solista");
        
        banda2.addMiembro(Carlos);
        
        banda1.addMiembro(Guido);
        banda1.addMiembro(Lucas);
        banda1.addMiembro(banda2);
        System.out.println(banda1.getEdad());
   }
}