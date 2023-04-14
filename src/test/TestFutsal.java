package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dominio.Amonestado;
import dominio.Equipo;
import dominio.Gol;
import dominio.Jugador;
import dominio.Partido;

public class TestFutsal {

	@Test
	public void queSePuedaAgregarJugadoresALosEquipos() {
		Jugador j1 = new Jugador("g",13.00,11);

		
		Equipo equipo = new Equipo();
		
		
		assertTrue(equipo.agregarJugadores(j1));
	}

	
	@Test
	public void queSePuedaCalcularElValorDelEquipo() {
		Equipo equipo = new Equipo();
		Jugador j1 = new Jugador("h",13.00,11);
		Jugador j2 = new Jugador("p",13.00,11);

		
		equipo.agregarJugadores(j1);
		equipo.agregarJugadores(j2);
		
		
		Double valorEsperado = 26.00;
		Double valorObtenido = equipo.calcularValorEquipo();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDelEquipo() {
		Equipo equipo = new Equipo();
		
		
		Jugador j1 = new Jugador("a",13.00,15);
		Jugador j2 = new Jugador("b",13.00,11);
		Jugador j3 = new Jugador("c",13.00,11);
		Jugador j4 = new Jugador("d",13.00,11);
		Jugador j5 = new Jugador("e",13.00,11);
		

		equipo.agregarJugadores(j1);
		equipo.agregarJugadores(j2);
		equipo.agregarJugadores(j3);
		equipo.agregarJugadores(j4);
		equipo.agregarJugadores(j5);
		
		
		Double valorEsperado = 11.8;
		Double valorObtenido = equipo.calcularEdadPromedio();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaRegistrarUnNuevoPartido() {
		Partido nuevoPartido = new Partido();
		assertNotNull(nuevoPartido);
	}
	
	@Test
	public void queSePuedaIncorporarEquipos() {
		
		Partido partido = new Partido();
		Equipo local = new Equipo();
		Equipo visitante = new Equipo();
		
		assertTrue(partido.agregarEquipo(local));
		assertTrue(partido.agregarEquipo(visitante));
	}
	
	@Test
	public void queSePuedaRegistrarGol() {
		Partido partido = new Partido();
		
		Gol primerGol = new Gol(" ", 20);
	
		boolean valorObtenido = partido.registrarGol(primerGol);
		
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaRegistrarAmonestados() {
		Partido partido = new Partido();
		Equipo equipo = new Equipo();
		
		Jugador j1 = new Jugador("Messi",100.0,30);
		Jugador j2 = new Jugador("Ronaldo",100.0,35);
		Amonestado amonestado = new Amonestado(j1,10);
		equipo.agregarJugadores(j1);
		

		assertTrue(partido.registrarAmonestacion(amonestado, j1));

		
	}
	
	@Test
	public void queSePuedaRegistrarExpulsados() {
		Partido partido = new Partido();
		Equipo equipo = new Equipo();
		
		Jugador j1 = new Jugador("Messi",100.0,30);

		Amonestado amonestado = new Amonestado(j1,10);
		equipo.agregarJugadores(j1);
		
		partido.registrarAmonestacion(amonestado, j1);
		partido.registrarAmonestacion(amonestado, j1);
		
		assertTrue(partido.expulsarJugador(j1));
	}
}
