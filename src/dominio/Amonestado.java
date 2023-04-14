package dominio;

public class Amonestado {

	private Jugador jugador;
	private String	nombreJugador;
	private Integer minuto;
	
	public Amonestado(){
		
	}
	
	public Amonestado(Jugador jugador, Integer minuto){
		this.jugador = jugador;
		this.minuto = minuto;
	}
	
	public Amonestado(Integer minuto){
		this.minuto = minuto;
	}
	
	public Amonestado(String nombreJugador, Integer minuto) {
		this.nombreJugador = nombreJugador;
		this.minuto = minuto;
	}

	

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

}
