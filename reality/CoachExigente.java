package reality;

import java.util.ArrayList;

public class CoachExigente extends Coach{
    
	private ArrayList<String> instrumentosExigente;
	private ArrayList<String> generosExigente;
	//private String genero;
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
    	if(cumple == false) {
    		System.out.println("FALSE INSTR");
    	} else {
    		System.out.println("TRUE INSTR");
    	}
    	return cumple;
    }
    
    public boolean participanteCumpleIdioma(ElementoAbstracto p) {
    	boolean cumple = false;
    	for (String i: idiomasExigente) {
			cumple = p.sabeIdioma(i);
		}
    	if(cumple == false) {
    		System.out.println("NO CUMPLE IDIOMA");
    	} else {
    		System.out.println("CUMPLE IDIOMA");
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
    	if(cumple == false) {
    		System.out.println("FALSE gen");
    	} else {
    		System.out.println("TRUE gen");
    	}
    	return cumple;
    }
    
	@Override
	public void addMiembro(ElementoAbstracto p) {
		if(participanteCumpleGenero(p) && participanteCumpleIdioma(p) && participanteCumpleInstrumento(p)){
            super.addMiembro(p);
        }else{
            System.out.println("El participante no cumple con los requisitos.");
        }
	}
	
	public ArrayList<String> getIdiomasExigentes(){
		return new ArrayList<>(idiomasExigente);
	}
	
	public ArrayList<String> getInstrumentosExigentes(){
		return new ArrayList<>(instrumentosExigente);
	}
	
	public ArrayList<String> getGenerosExigentes(){
		return new ArrayList<>(generosExigente);
	}
	
	public void addIdiomaExigente(String i) {
		if(!this.getIdiomasExigentes().contains(i)) {
			idiomasExigente.add(i);
		}
	}
    
	public void addInstrumentoExigente(String i) {
		if(!this.getInstrumentosExigentes().contains(i)) {
			instrumentosExigente.add(i);
		}
	}
	
	public void addGeneroExigente(String g) {
		if(!this.getGenerosExigentes().contains(g)) {
			generosExigente.add(g);
		}
	}
    
	public void eliminarIdiomaExigente(String i) {
		idiomasExigente.remove(idiomasExigente.lastIndexOf(i));
	}
	
	public void eliminarInstrumentoExigente(String i) {
		instrumentosExigente.remove(instrumentosExigente.lastIndexOf(i));
	}
	
	public void eliminarGeneroExigente(String i) {
		generosExigente.remove(generosExigente.lastIndexOf(i));
	}
	
	
	
}