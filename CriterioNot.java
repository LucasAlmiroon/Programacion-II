public class CriterioNot {

	private Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}

	public boolean cumple(Participante p) {
		return !c1.cumple(p);
	}
}
