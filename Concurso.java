

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import filtros.CriterioGenero;
import filtros.CriterioIdioma;
import reality.Banda;
import reality.Coach;
import reality.Participante;

public class Concurso {
    public static void main(String[] args) {
        Participante Lucas = new Participante("Lucas", "Almiron", 10);
        Participante Guido = new Participante("Guido", "Zoppo", 12);
        Participante Carlos = new Participante("Carlos", "Zoppo", 40);
        Participante solo = new Participante("Solo", "Zoppo", 40);
        
        /*
        Lucas.addGenero("Tango");
        Lucas.addGenero("Cumbia");
        
        Guido.addGenero("Tango");
        Guido.addGenero("Rumba");
        
        Carlos.addGenero("Tango");
        Carlos.addGenero("Reggae");
        */
        
        Lucas.addIdioma("Tango");
        Lucas.addIdioma("Cumbia");
        
        Guido.addIdioma("Tango");
        Guido.addIdioma("Rumba");
        
        Carlos.addIdioma("Tango");
        Carlos.addIdioma("Reggae");
        
        solo.addIdioma("Tango");
        solo.addIdioma("Guitarra");
        
        Banda banda1 = new Banda("Banda 1");
        Banda banda2 = new Banda("Banda solista");
        
        banda2.addMiembro(Carlos);
        
        banda1.addMiembro(Lucas);
        banda1.addMiembro(Guido);
        banda1.addMiembro(banda2);
        
        Coach coach1 = new Coach("Coach 1");
        
        coach1.addParticipantes(banda2);
        coach1.addParticipantes(banda1);
        coach1.addParticipantes(solo);
        
        
        CriterioIdioma Tango = new CriterioIdioma("tango");
        System.out.println(coach1.buscar(Tango));
       
    }

    
  
}