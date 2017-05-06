package clasesLogicas;


import java.time.LocalDate;

import operaciones.CargarConfiguracion;
import operaciones.CrearPeticiones;
import operaciones.EscribirTablaHTML;


public class Sala {
	
	static int tamañoMes =	CargarConfiguracion.getMes().length(false);
	String nombreSala;
	DisponibilidadDiaria[] disponibilidades; 
	
	
	
public Sala(String nombreSala) {		
		this.nombreSala = nombreSala;
		this.disponibilidades =  new DisponibilidadDiaria[tamañoMes];		
		setDispo();
		ocuparHorarios();
		EscribirTablaHTML.escribirTablasHTML(this);
	}


public void setDispo(){ 
for(int i=0;i<tamañoMes;i++){	
	disponibilidades[i] = new DisponibilidadDiaria(
	LocalDate.of(CargarConfiguracion.getAño(), CargarConfiguracion.getMes(), i+1));	
	}
}	

public String getNombreSala() {
	return nombreSala;
}

public void imprimirDisp(){
	for(int i=0;i<disponibilidades.length;i++){
		System.out.println(disponibilidades[i]);
	}			
}

public DisponibilidadDiaria[] getDisponibilidades() {
	return disponibilidades;
	}


//********************
public void ocuparHorarios(){
	for (int i=0; i<CrearPeticiones.listaPeticiones.size();i++ ){
		
		
		//get actividad de las peticiones
//		String nombreAct = CrearPeticiones.getListaPeticiones().get(i).actividad;
//		//get fecha de inicio de las peticiones
//		LocalDate fIni=CrearPeticiones.getListaPeticiones().get(i).fechaInicio;
//		//get hora de inicio de las peticiones
//		int hIni=CrearPeticiones.getListaPeticiones().get(i).horaInicioS1;				
		
		
				
		//asignar a la casilla horaria correspondiente la actividad
		//          dia                    hora   actividad
   // disponibilidades[0].slotsHorasActividad[hIni] = nombreAct;
		
//		System.out.println(fIni);
		
	//filtras peticiones por mes. solo se procesaran las peticiones del mes a procesar
	//solo se procesaran las peticiones que indiquen la sal igual a la de la instancia	
		if(CrearPeticiones.getListaPeticiones().get(i).getFechaInicio().getMonth()==
			CargarConfiguracion.getMes()&&
				CrearPeticiones.getListaPeticiones().get(i).getSala().equals(this.nombreSala)
			){
	
		
		for(int q=0; q<this.disponibilidades.length;q++){
		
			
//fecha incicio fecha fin y periodo entre fechas			
	if(CrearPeticiones.getListaPeticiones().get(i).getFechaInicio().equals(this.disponibilidades[q].getFecha())||
	((disponibilidades[q].getFecha().isAfter(CrearPeticiones.getListaPeticiones().get(i).getFechaInicio())&&
	(disponibilidades[q].getFecha().isBefore(CrearPeticiones.getListaPeticiones().get(i).getFechaFin())||
	disponibilidades[q].getFecha().isEqual(CrearPeticiones.getListaPeticiones().get(i).getFechaFin())))))
				{
//*********************** filtro dias de la semana ***************			
		
		
	for(int h=0; h<disponibilidades.length;h++){
		for (int z=0; z<CrearPeticiones.getListaPeticiones().get(i).getDiasSemana().size();z++)
		if(disponibilidades[q].getFecha().getDayOfWeek().equals(CrearPeticiones.getListaPeticiones().get(i).getDiasSemana().get(z)))

		
		for(int s=0; s<24;s++){
		
			int hIn = CrearPeticiones.getListaPeticiones().get(i).getHoraInicioS1();
			int hFin = CrearPeticiones.getListaPeticiones().get(i).getHoraFinS1();
			int duracion = hFin-hIn;
			int hIn2 = CrearPeticiones.getListaPeticiones().get(i).horaInicioS2;
			int hFin2 = CrearPeticiones.getListaPeticiones().get(i).horaFinS2;
			int duracion2 = hFin2-hIn2;

			
			
			String act = CrearPeticiones.getListaPeticiones().get(i).getActividad();
			
			if(disponibilidades[q].getSlotsHorasActividad()[hIn]==null){
							

				
	//este for repite el proceso de guardar el nombre de la actividad 
	//en los slot siguientes tantas veces cuantas son las horas de duracion de la actividad
									
			for(int k=0;k<duracion;k++ ){
										
				disponibilidades[q].getSlotsHorasActividad()[hIn] = act;
				
//				if(disponibilidades[q].slotsHorasActividad[hIn]!=null)	
//					System.out.println("incident");	

				CrearPeticiones.getListaPeticiones().get(i).incident=true;
	
				hIn++;
					
				}				

			if(CrearPeticiones.listaPeticiones.get(i).horaInicioS2!=0){			
				for(int m=0;m<duracion2;m++ ){			
				 disponibilidades[q].getSlotsHorasActividad()[hIn2] = act;
	
					hIn2++;	}
				}		
			}						
		}
	}	
}
}	
}
}
}
}