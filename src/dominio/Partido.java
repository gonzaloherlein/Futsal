package dominio;

public class Partido {
	
	private final Integer CANTIDAD_MAXIMA_DE_EXPULSIONES_POR_PARTIDO = 8;
	private final Integer CANTIDAD_MAXIMA_DE_AMONESTADOS_POR_PARTIDO = 22;
	private final Integer CANTIDAD_MAXIMA_DE_EQUIPOS_POR_PARTIDO = 2;
	private final Integer CANTIDAD_MAXIMA_DE_GOLES_POR_PARTIDO = 100;
	private final Integer CANTIDAD_MAXIMA_DE_JUGADORES_POR_PARTIDO = 10;
	private Equipo[] equipos = new Equipo[CANTIDAD_MAXIMA_DE_EQUIPOS_POR_PARTIDO];
	private Gol[] goles = new Gol[CANTIDAD_MAXIMA_DE_GOLES_POR_PARTIDO];
	private Jugador[] jugadores = new Jugador[CANTIDAD_MAXIMA_DE_JUGADORES_POR_PARTIDO];
	private Amonestado[] amonestados = new Amonestado[CANTIDAD_MAXIMA_DE_AMONESTADOS_POR_PARTIDO];
	private Jugador[] expulsados = new Jugador[CANTIDAD_MAXIMA_DE_EXPULSIONES_POR_PARTIDO];
	private Integer cantAmonestados;
	private int[] minutos;
	
	
	public Partido() {
		
	}
	
	public Partido(Equipo[] equipos, Gol[] goles, Jugador[] jugadores, Amonestado[] amonestados,
			Jugador[] expulsados) {
		this.equipos = new Equipo[CANTIDAD_MAXIMA_DE_EQUIPOS_POR_PARTIDO];
		this.goles = new Gol[CANTIDAD_MAXIMA_DE_GOLES_POR_PARTIDO];
		this.jugadores = new Jugador[CANTIDAD_MAXIMA_DE_JUGADORES_POR_PARTIDO];
		this.amonestados = new Amonestado[22];
		this.expulsados = new Jugador[CANTIDAD_MAXIMA_DE_EXPULSIONES_POR_PARTIDO];
		this.cantAmonestados = 0;
		this.minutos = new int[11];
	}

	public boolean agregarEquipo(Equipo equipo) {
		for (int i = 0; i < equipos.length; i++) {
			if(equipos[i] == null) {
				equipos[i] = equipo;
				return true;
			}
		}
		return false;
	}
	
	public boolean registrarGol(Gol gol) {
		for (int i = 0; i < goles.length; i++) {
			if(goles[i] == null) {
				goles[i] = gol;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean registrarAmonestacion(Amonestado amonestado, Jugador jugador){
		Integer cantidadAmonestaciones = 0;
		for (int i = 0; i < amonestados.length; i++) {
			if(amonestados[i] == null) {
				amonestados[i] = amonestado;
				cantidadAmonestaciones++;
				if(cantidadAmonestaciones == 2) {
					expulsarJugador(jugador);
					return true;
				}
				
			}
		}
		return false;
	}
	
	public boolean registrarExpulsionDirecta(Jugador jugador, Integer minuto) {
		if(expulsarJugador(jugador)) {
			return true;
		}
		return false;
		
	}
	
	public boolean expulsarJugador(Jugador jugador) {
		for (int i = 0; i < expulsados.length; i++) {
			if(expulsados[i] == null) {
				expulsados[i] = jugador;
				return true;
			}
		}
		return false;
	}



	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}

	
	

	
	
	
	
}
