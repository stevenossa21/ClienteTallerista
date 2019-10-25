package view;

public class ObjetoPregunta {
	
	private String pregunta;
	private String correcta;
	private String opcionA;
	private String opcionB;
	private String opcionC;
	private String opcionD;
	private int valor;
	
	public ObjetoPregunta(String p, String a, String b, String c, String d, String v, int vr) {
		this.pregunta = p;
		this.opcionA = a;
		this.opcionB = b;
		this.opcionC = c;
		this.opcionD = d;
		this.correcta = v;
		this.valor = vr;
		
	}
	
	public int getValor() {
		return valor;
	}
	
	
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getOpcionA() {
		return opcionA;
	}
	public void setOpcionA(String opcionA) {
		this.opcionA = opcionA;
	}
	public String getOpcionB() {
		return opcionB;
	}
	public void setOpcionB(String opcionB) {
		this.opcionB = opcionB;
	}
	public String getOpcionC() {
		return opcionC;
	}
	public void setOpcionC(String opcionC) {
		this.opcionC = opcionC;
	}
	public String getCorrecta() {
		return correcta;
	}
	public void setCorrecta(String correcta) {
		this.correcta = correcta;
	}
	
	public String getOpcionD() {
		return opcionD;
	}
	public void setOpcionD(String opcionD) {
		this.opcionD = opcionD;
	}

	
	
	
	

}
