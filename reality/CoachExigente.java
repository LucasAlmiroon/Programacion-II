package reality;

import java.util.ArrayList;

public class CoachExigente extends Coach{
    
	private ArrayList<String> instrumentosExigente;
	private ArrayList<String> generosExigente;
	private ArrayList<String> idiomasExigente;
	
    public CoachExigente (String n){
        super(n);
        this.idiomasExigente = new ArrayList<>();
        this.instrumentosExigente = new ArrayList<>();
        this.generosExigente = new ArrayList<>();
    }

    public boolean participanteCumpleInstrumento(ElementoAbstracto p) {
    	boolean cumple = false;
    	for (String i: instrumentosExigente) {
			if(p.tocaInstrumento(i)) {
				cumple = true;
			}
		}
    	return cumple;
    }
    
    public boolean participanteCumpleIdioma(ElementoAbstracto p) {
    	boolean cumple = false;
    	for (String i: idiomasExigente) {
			if(p.sabeIdioma(i)) {
				cumple = true;
			}
		}
    	return cumple;
    }
    
    public boolean participanteCumpleGenero(ElementoAbstracto p) {
    	boolean cumple = false;
    	for (String g: generosExigente) {
			if(p.leGustaGenero(g)) {
				cumple = true;
			}
		}
    	return cumple;
    }
    
	@Override
	public void addParticipantes(ElementoAbstracto p) {
		if(participanteCumpleGenero(p) && participanteCumpleIdioma(p) && participanteCumpleInstrumento(p)){
            super.addParticipantes(p);
        }else{
            System.out.println("El participante no cumple con los requisitos.");
        }
	}
    
    
}