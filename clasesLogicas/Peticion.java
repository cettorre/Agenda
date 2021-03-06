package clasesLogicas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import operaciones.CargarConfiguracion;



public class Peticion {
	
	private String actividad;
	private String sala;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;	
	private String diasSemana;
	private int horaInicioS1;
	private int horaFinS1;
	public int horaInicioS2;
	public int horaFinS2;
	public int[] horarios;
	public ArrayList<DayOfWeek> daysConverted;
	public boolean incident;

	

	public Peticion(String actividad, String sala, LocalDate fechaInicio, LocalDate fechaFin, String diasSemana,
			int horaInicioS1, int horaFinS1, int horaInicioS2, int horaFinS2,int[] horarios, boolean incident) {
		super();
		this.actividad = actividad;
		this.sala = sala;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.diasSemana = diasSemana;
		this.setHoraInicioS1(horaInicioS1);
		this.setHoraFinS1(horaFinS1);
		this.horaInicioS2 = horaInicioS2;
		this.horaFinS2 = horaFinS2;
		this.horarios= horarios;
		this.daysConverted= new ArrayList<>();
		this.incident=incident;
	}

 public void addDaysToArraylist(){
 }
	
	

	public boolean isIncident() {
	return incident;
}

	public String getActividad() {
		return actividad;
	}


	

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getSala() {
		return sala;
	}

	@Override
	public String toString() {
		return "Peticion [actividad=" + actividad + ", sala=" + sala + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", diasSemana=" + diasSemana + ", horaInicioS1=" + getHoraInicioS1() + ", horaFinS1="
				+ getHoraFinS1() + ", horaInicioS2=" + horaInicioS2 + ", horaFinS2=" + horaFinS2+ "Incident: " + incident +"]\n";
	}


	DayOfWeek dia;
	public DayOfWeek convertDay(String d){
		
			
		if(CargarConfiguracion.idiomaEntrada.equals("CAT"))
		switch(d){
		case "L": dia = DayOfWeek.MONDAY;break;
		case "M": dia = DayOfWeek.TUESDAY;break;
		case "C": dia = DayOfWeek.WEDNESDAY;break;
		case "J": dia = DayOfWeek.THURSDAY;break;
		case "V": dia = DayOfWeek.FRIDAY;break;
		case "S": dia = DayOfWeek.SATURDAY;break;
		case "G": dia = DayOfWeek.SUNDAY;break;
		
		}else{
		switch(d){
		case "M": dia = DayOfWeek.MONDAY;break;
		case "T": dia = DayOfWeek.TUESDAY;break;
		case "W": dia = DayOfWeek.WEDNESDAY;break;
		case "H": dia = DayOfWeek.THURSDAY;break;
		case "F": dia = DayOfWeek.FRIDAY;break;
		case "S": dia = DayOfWeek.SATURDAY;break;
		case "N": dia = DayOfWeek.SUNDAY;break;
		
		}
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

	public int getHoraInicioS1() {
		return horaInicioS1;
	}

	public void setHoraInicioS1(int horaInicioS1) {
		this.horaInicioS1 = horaInicioS1;
	}

	public int getHoraFinS1() {
		return horaFinS1;
	}

	public void setHoraFinS1(int horaFinS1) {
		this.horaFinS1 = horaFinS1;
	}
	
}
