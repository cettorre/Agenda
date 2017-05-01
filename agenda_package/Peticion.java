package agenda_package;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;



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
	ArrayList<DayOfWeek> daysConverted;

	

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
		this.daysConverted= new ArrayList<>();
	}

 public void addDaysToArraylist(){
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


	DayOfWeek dia;
	public DayOfWeek convertDay(String d){
		
		switch(d){
		case "L": dia = DayOfWeek.MONDAY;break;
		case "M": dia = DayOfWeek.TUESDAY;break;
		case "C": dia = DayOfWeek.WEDNESDAY;break;
		case "J": dia = DayOfWeek.THURSDAY;break;
		case "V": dia = DayOfWeek.FRIDAY;break;
		case "S": dia = DayOfWeek.SATURDAY;break;
		case "G": dia = DayOfWeek.SUNDAY;break;
		
		}
		return dia;
	}

	
	
	//devuelve los dias de la semana de la peticion correspondiente
	public ArrayList<DayOfWeek> getDiasSemana() {
		ArrayList<DayOfWeek> diasArrayList= new ArrayList<>();
		for(int i=0; i<diasSemana.length();i++){
			diasArrayList.add(convertDay(String.valueOf(diasSemana.charAt(i))));
		}
		return diasArrayList;
	}
	
}
