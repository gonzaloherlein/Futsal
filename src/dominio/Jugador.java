package dominio;

public class Jugador {

	private String nombre;
	private Double precio;
	private Integer edad;
	private Amonestado[] amonestaciones = new Amonestado[2];
	private Boolean expulsado;
	
	public Jugador() {
		
	}
	
	public Jugador(String nombre, Double precio, Integer edad) {
		this.nombre = nombre;
		this.precio = precio;
		this.edad = edad;	
	}
		
	public Jugador(String nombre,Double precio, Integer edad, Amonestado[] amonestaciones, Boolean expulsado){
		this.nombre = nombre;
		this.precio = precio;
		this.edad = edad;
		this.amonestaciones = new Amonestado[2];
		this.setExpulsado(false);
	}

	public void recibirAmonestacion(Integer minuto) {
		Amonestado amonestado = null;
		for (int i = 0; i < amonestaciones.length; i++) {
			if(amonestaciones[i] == null) {
				amonestado = new Amonestado(minuto);
				if(this.amonestaciones.length == 2) {
					this.expulsado = true;
				}
			}
		}
	}
	

	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getExpulsado() {
		return expulsado;
	}

	public void setExpulsado(Boolean expulsado) {
		this.expulsado = expulsado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
