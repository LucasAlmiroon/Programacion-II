

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import filtros.CriterioGenero;
import filtros.CriterioIdioma;
import reality.Banda;
import reality.Coach;
import reality.CoachExigente;
import reality.Participante;

public class Concurso {
    public static void main(String[] args) {
        Participante Lucas = new Participante("Lucas", "Almiron", 10);
        Participante Guido = new Participante("Guido", "Zoppo", 12);
        Participante Carlos = new Participante("Carlos", "Zoppo", 40);
        Participante solo = new Participante("Solo", "Zoppo", 40);
        
        //ADD GENEROS
        Lucas.addGenero("Tango");
        Lucas.addGenero("Pop");
        
        Guido.addGenero("Tango");
        Guido.addGenero("Rumba");
        Guido.addGenero("Cumbia");
        Guido.addGenero("Pop");
        
        Carlos.addGenero("Tango");
        Carlos.addGenero("Cumbia");
        Carlos.addGenero("Pop");
      //ADD IDIOMAS
        Lucas.addIdioma("Ingles");
        Lucas.addIdioma("Español");
        
        Guido.addIdioma("Ingles");
        Guido.addIdioma("Franes");
        
        Carlos.addIdioma("Ingles");
        Carlos.addIdioma("Portugues");
        
        solo.addIdioma("Ingles");
        solo.addIdioma("Chino");
        
        Banda banda1 = new Banda("Banda 1");
        Banda banda2 = new Banda("Banda solista");
                
        Coach coach1 = new Coach("Coach 1");
        
        banda2.addMiembro(Carlos);
        
        banda1.addMiembro(Lucas);
        banda1.addMiembro(Guido);
        banda1.addMiembro(banda2);
        
        /*coach1.addMiembro(banda2);
        coach1.addMiembro(banda1);
        coach1.addMiembro(solo);*/
        
        System.out.println(banda1.getGeneros());
    
      
      
    }

    
  
}