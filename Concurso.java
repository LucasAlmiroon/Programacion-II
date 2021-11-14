

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import comparadores.ComparadorCantidadIdiomas;
import comparadores.ComparadorEdad;
import filtros.CriterioEdadMayor;
import filtros.CriterioGenero;
import filtros.CriterioIdioma;
import reality.Banda;
import reality.Coach;
import reality.CoachExigente;
import reality.Musica;
import reality.Participante;
import reality.Produccion;

public class Concurso {
    public static void main(String[] args) {
        Participante Lucas = new Participante("Lucas", "Almiron", 10);
        Participante Guido = new Participante("Guido", "Zoppo", 12);
        Participante Carlos = new Participante("Carlos", "Zoppo", 40);
        Participante solo = new Participante("Solo", "Zoppo", 40);
        
        Banda banda1 = new Banda("Banda 1");
        Banda banda2 = new Banda("Banda 2");
                
        Coach coach1 = new Coach("Coach 1");
        Coach coach2 = new Coach("Coach 2");
        
        CriterioEdadMayor criterioEdad = new CriterioEdadMayor(18);
        CoachExigente pachano = new CoachExigente("Anibal", criterioEdad);
        pachano.addMiembro(Lucas);
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
        Guido.addIdioma("Frances");
        
        Carlos.addIdioma("Ingles");
        Carlos.addIdioma("Portugues");
        
        solo.addIdioma("Ingles");
        solo.addIdioma("Chino");
        
        //ADD GENEROS
        Lucas.addInstrumento("Guitarra");
        Lucas.addInstrumento("Bajo");
        Guido.addInstrumento("Bajo");
        Carlos.addInstrumento("Bateria");
        

        
        banda2.addMiembro(Carlos);
        
        banda1.addMiembro(Lucas);
        banda1.addMiembro(Guido);
        banda1.addMiembro(banda2);
        
        coach1.addMiembro(banda2);
        coach1.addMiembro(banda1);
        coach1.addMiembro(solo);
        
        CriterioGenero Rumba = new CriterioGenero("Rumba");
        CriterioIdioma Ingles = new CriterioIdioma("Ingles");
        
        //System.out.println(Guido.leGustaGenero("Rumba"));
        //System.out.println(banda1.leGustaGenero("Rumba"));
        
        
        /*
         * BANDA 1:
         			-Lucas:		-Español	-Ingles
         						-Tango		-Pop
         					
         			-Guido: 	-Ingles		-Frances
         						-Tango		-Pop	-Cumbia  -Rumba
         					
         					
         	BANDA 2:
         			-Carlos: 	-Ingles		-Portugues
         						-Tango		-Pop	-Cumbia
         			
         			
         */
        
        //System.out.println(banda1.sabeIdioma("Ingles"));
        Musica m = new Musica("T", "I", "I2", null);
        m.addInstrumentos("Bajo");
        m.addInstrumentos("Bateria");
        //System.out.println(banda1.cantMiembrosTocanInstrumento(m));
      

        Participante Lucas1 = new Participante("Lucas1", "Almiron", 100);
        Participante Guido2 = new Participante("Guido1", "Zoppo", 80);
        Participante Carlos2 = new Participante("Carlos1", "Zoppo", 90);
        coach2.addMiembro(Carlos2);
        coach2.addMiembro(Guido2);
        coach2.addMiembro(Lucas1);
        ComparadorEdad ce = new ComparadorEdad("Comparador edad");
        
        Produccion prod = new Produccion(ce);
        
        prod.addCoach(coach2);
        prod.addCoach(coach1);
        prod.organizarBatalla();
        
        ComparadorCantidadIdiomas cci = new ComparadorCantidadIdiomas("Comparador Idiomas");
        prod.setMetodoJuego(cci);
        prod.organizarBatalla();
        //System.out.println(prod.getCoachBatallar());
        //System.out.println(coach2.getMejorParticipante(ce));
    }

    
  
}