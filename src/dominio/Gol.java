package dominio;

public class Gol {
	
	private String nombreAutor;
	private Integer minuto;
	
	public Gol() {
		
	}
	
	public Gol(String nombreAutor, Integer minuto) {
		this.nombreAutor = nombreAutor;
		this.minuto = minuto;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	
	
	
}
