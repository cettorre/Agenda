package agenda_package;


import java.time.LocalDate;
import java.time.LocalTime;


public class Peticion {
	
	String actividad;
	String sala;
	LocalDate fechaInicio;
	LocalDate fechaFin;	
	String diasSemana;
	int horaInicioS1;
	int horaFinS1;
	int horaInicioS2;
	int horaFinS2;
	int[] horarios;


	public Peticion(String actividad, String sala, LocalDate fechaInicio, LocalDate fechaFin, String diasSemana,
			int horaInicioS1, int horaFinS1, int horaInicioS2, int horaFinS2,int[] horarios) {
		super();
		this.actividad = actividad;
		this.sala = sala;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.diasSemana = diasSemana;
		this.horaInicioS1 = horaInicioS1;
		this.horaFinS1 = horaFinS1;
		this.horaInicioS2 = horaInicioS2;
		this.horaFinS2 = horaFinS2;
		this.horarios= horarios;
	}



	public String getActividad() {
		return actividad;
	}



	@Override
	public String toString() {
		return "Peticion [actividad=" + actividad + ", sala=" + sala + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", diasSemana=" + diasSemana + ", horaInicioS1=" + horaInicioS1 + ", horaFinS1="
				+ horaFinS1 + ", horaInicioS2=" + horaInicioS2 + ", horaFinS2=" + horaFinS2 + "]\n";
	}



	
	
	
	
	

}
