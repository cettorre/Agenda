package clasesLogicas;

import java.time.LocalDate;
import java.util.Arrays;


public class DisponibilidadDiaria {

	LocalDate fecha;
	String[] slotsHorasActividad;

	public DisponibilidadDiaria(LocalDate fecha) {
	
		this.fecha = fecha;
		this.slotsHorasActividad  = new String[24];
		}
		//el array representa las horas del dia de 0 a 23 
		//cada slot es un intevalo 0-1, 0-2 etc....
		
		

	@Override
	public String toString() {
		return "DisponibilidadDiaria [fecha=" + fecha + ", slotsHorasActividad=" + Arrays.toString(slotsHorasActividad)
				+ "]";
	}


	public LocalDate getFecha() {
		return fecha;
	}




	public String[] getSlotsHorasActividad() {
		return slotsHorasActividad;
	}
}

