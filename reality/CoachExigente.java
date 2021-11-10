package reality;

import java.util.ArrayList;

import filtros.Criterio;

public class CoachExigente extends Coach{
    
	private Criterio criterioAceptacion;
	
    public CoachExigente (String n, Criterio c){
        super(n);
        criterioAceptacion = c;
    }
    
	@Override
	public void addMiembro(ElementoAbstracto p) {
		if(criterioAceptacion != null) {
			if(criterioAceptacion.cumple(p)){
				if(!this.getMiembros().contains(p)) {
					super.addMiembro(p);
				} else { 
					System.out.println(p + " Ya es miembro del equipo");
				}
	            
	        }else{
	            System.out.println(p + " no cumple con los requisitos del coach exigente.");
	        }
		} else {
			if(!this.getMiembros().contains(p)) {
				super.addMiembro(p);
			} else { 
				System.out.println(p + " Ya es miembro del equipo");
			}
		}
	}
	
	public void setCriterio(Criterio crit) {
		this.criterioAceptacion = crit;
	}
	
	
}