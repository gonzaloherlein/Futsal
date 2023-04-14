package dominio;

public class Equipo {
	
	private String nombre;
	private final Integer CANTIDAD_MAXIMA_JUGADORES_POR_EQUIPO = 5;
	private Jugador[] jugadores = new Jugador[CANTIDAD_MAXIMA_JUGADORES_POR_EQUIPO];
	
	
	public Equipo() {
		
	}
	
	public Equipo(String nombre, Jugador[] jugadores) {
		this.nombre = nombre;
		this.jugadores = new Jugador[CANTIDAD_MAXIMA_JUGADORES_POR_EQUIPO];
		inicializarEquipo();
	}

	private void inicializarEquipo() {
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = null;
		}	
	}

	public boolean agregarJugadores(Jugador jugador) {
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i] == null) {
				jugadores[i] = jugador;
				return true;
			}
		}
		return false;
		
	}

	
	public Double calcularValorEquipo() {
		Double precioTotal = 0.0; 
		
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i] != null) {
				precioTotal += jugadores[i].getPrecio();
			}
		}
		return precioTotal;
	}
	
	
	public Double calcularEdadPromedio() {
		Double edadPromedio = 0.0;
		Double sumaEdades = 0.0;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i] != null) {
				sumaEdades += jugadores[i].getEdad();
				edadPromedio = sumaEdades / jugadores.length;
			}
		}
		return edadPromedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	
	
	
	
	
}
