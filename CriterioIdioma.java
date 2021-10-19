public class CriterioIdioma {

	private String idioma;
	
	public CriterioIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean cumple(Participante p) {
		return p.getIdiomas().contains(idioma);
	}
}
