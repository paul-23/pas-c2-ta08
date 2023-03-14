package e4;

public class Serie {

	private final static int TEMPORADAS_BASE = 3;
	private final static boolean ENTREGADO_BASE = false;

	private String titulo;
	private int numeroTemporadas;
	private boolean entergado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = TEMPORADAS_BASE;
		this.entergado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = TEMPORADAS_BASE;
		this.entergado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
}
