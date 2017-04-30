package agenda_package;


import java.time.LocalDate;


public class Sala {
	
	
	static int tamañoMes =	CargarConfiguracion.getMes().length(false);
	//String [] stringArray; 
	String nombreSala;
	DisponibilidadDiaria[] disponibilidades; 
	
public Sala(String nombreSala) {		
		//this.stringArray = new String [24];
		this.nombreSala = nombreSala;
		this.disponibilidades =  new DisponibilidadDiaria[tamañoMes];		
		setDispo();
	}

//public Sala(String nombreSala, DisponibilidadDiaria[] disponibilidades) {
//		
//		this.nombreSala = nombreSala;
//		this.disponibilidades = disponibilidades;
//******************************************		
//rellenar array dentro de contructor	
	//int tamañoMes2=	CargarConfiguracion.getMes().length(false);
	//System.out.println(tamañoMes);
//LocalDate primerDiaDelMes
//  = LocalDate.of(
//		  CargarConfiguracion.getAño(), 
//		  CargarConfiguracion.getMes(), 
//		  1);	
//}
//********************************************		
	
	
public void modificaEnSerie(int q, int hIn, String act){
	disponibilidades[q].slotsHorasActividad[hIn] = act;
	hIn++;
}

public void setDispo(){ 

for(int i=0;i<tamañoMes;i++){	
	disponibilidades[i] = new DisponibilidadDiaria(
	LocalDate.of(CargarConfiguracion.getAño(), CargarConfiguracion.getMes(), i+1));	
	}
}	

public void imprimirDisp(){
	for(int i=0;i<disponibilidades.length;i++){
		System.out.println(disponibilidades[i]);
	}			
}



//este mes consigue modificar la tabla de horario peo no le hace caso al mes

public void ocuparHorariosOld(Sala sala){
	for (int i=0; i<CrearPeticiones.listaPeticiones.size();i++ ){
		//get fecha de inicio de las peticiones
		LocalDate fIni=CrearPeticiones.getListaPeticiones().get(i).fechaInicio;
		//get hora de inicio de las peticiones
		int hIni=CrearPeticiones.getListaPeticiones().get(i).horaInicioS1;				
		//get actividad de las peticiones
		String nombreAct = CrearPeticiones.getListaPeticiones().get(i).actividad;
		
				
		//asignar a la casilla horaria correspondiente la actividad
		//          dia                    hora   actividad
   // disponibilidades[0].slotsHorasActividad[hIni] = nombreAct;
		
		if(CrearPeticiones.getListaPeticiones().get(i).fechaInicio.getMonth()==
				CargarConfiguracion.getMes()&&
				CrearPeticiones.getListaPeticiones().get(i).sala==sala.nombreSala
				//this.nombreSala testear si es alternativa valida para evitar redundancia s1.modificarReservas(s1) y ahorrarme el paso de parametros;
						){
		
	disponibilidades[fIni.getDayOfMonth()].slotsHorasActividad[hIni] = nombreAct;
		
		
		}
		
		
	}		
}




//actualmente este metodo no consigue modificar los slots
public void modificarReservasOld(Sala sala){
	
	//recorrer peticiones
	for(int i=0;i<CrearPeticiones.getListaPeticiones().size();i++){
	
	//procesar solo las peticiones correspondientes al mes seleccionado en fichero config	
	if(CrearPeticiones.getListaPeticiones().get(i).fechaInicio.getMonth()==
	CargarConfiguracion.getMes()&&
	CrearPeticiones.getListaPeticiones().get(i).sala==sala.nombreSala
	//this.nombreSala testear si es alternativa valida para evitar redundancia s1.modificarReservas(s1) y ahorrarme el paso de parametros;
			){
	
	
	//cuando encuentra el dia correspondiente recorrer array de slots horario
	//modificar todos los slots que correspondan	

		
		for(int j=0; j<disponibilidades.length;j++){
			String s  =	disponibilidades[i].slotsHorasActividad[j];			
			}
			
		
		
		
			for(int j=0; 
			j>=CrearPeticiones.getListaPeticiones().get(j).horaInicioS1&&
			j<=CrearPeticiones.getListaPeticiones().get(j).horaFinS1;
			j++)
	{
		String s="x" ;  			
		disponibilidades[i].slotsHorasActividad[j]=s;
	}
	}	
}	
}















//********************
public void ocuparHorarios(){
	for (int i=0; i<CrearPeticiones.listaPeticiones.size();i++ ){
		
		
		//get actividad de las peticiones
		String nombreAct = CrearPeticiones.getListaPeticiones().get(i).actividad;
		//get fecha de inicio de las peticiones
		LocalDate fIni=CrearPeticiones.getListaPeticiones().get(i).fechaInicio;
		//get hora de inicio de las peticiones
		int hIni=CrearPeticiones.getListaPeticiones().get(i).horaInicioS1;				
		
		
				
		//asignar a la casilla horaria correspondiente la actividad
		//          dia                    hora   actividad
   // disponibilidades[0].slotsHorasActividad[hIni] = nombreAct;
		
//		System.out.println(fIni);
		
	//filtras peticiones por mes. solo se procesaran las peticiones del mes a procesar
	//solo se procesaran las peticiones que indiquen la sal igual a la de la instancia	
		if(CrearPeticiones.getListaPeticiones().get(i).fechaInicio.getMonth()==
				CargarConfiguracion.getMes()
				&&
				CrearPeticiones.getListaPeticiones().get(i).sala.equals(this.nombreSala)

//resuelto error abia == en lugar de equals->				
//				CrearPeticiones.getListaPeticiones().get(i).sala==this.nombreSala
				//this.nombreSala testear si es alternativa valida para evitar redundancia s1.modificarReservas(s1) y ahorrarme el paso de parametros;
						){
	
	//Ahora tenemos todas las peticiones del mes en cuestion
	//cuando la fecha de la peticion coincida con la fecha de del array disponibilidades (dia)
	//en este caso hay que recorrer el array slotHorasActividad y modificar el string 
			
		//System.out.println(CrearPeticiones.getListaPeticiones().get(i).fechaInicio);	
		//System.out.println(fIni);	
		//System.out.println(this.nombreSala);
		//System.out.println(CrearPeticiones.getListaPeticiones().get(i).sala);
		//System.out.println(this.disponibilidades[i]);

		
		
		System.out.println("fecha inicio peticion "+fIni);
		//System.out.println("fecha inicio peticion "+CrearPeticiones.getListaPeticiones().get(i).fechaInicio);		
		
		System.out.println(this.disponibilidades[i].fecha);
		
		//DisponibilidadDiaria dispo=new DisponibilidadDiaria(LocalDate.of(2008,11,1));
		//WARNONG this.disponibilidades[0].fecha esta en pocion statica 0
		//mientras que hay que recorrer disponibilidad y encontrar las fechas del array que coinciden con las peticiones
		
		//CONCLUSION este IF tiene que ir dentro de un for
		
		for(int q=0; q<this.disponibilidades.length;q++)
		{
		
		if(CrearPeticiones.getListaPeticiones().get(i).fechaInicio.equals(this.disponibilidades[q].fecha)){

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		
		//ahora hay que recorrer el array slotHorario y cambiar los string
		
		for(int s=0; s<24;s++){
		
	//	if(this.disponibilidades[q].slotsHorasActividad[s].)	
		//if(s==hIni){
//			System.out.println("ssssssss");
//			System.out.println(nombreAct);
//			System.out.println(hIni);
			//this.disponibilidades[q].slotsHorasActividad[hIni]=nombreAct;
		//}
			
			
			//get horario inicio de la peticion numero 5       hIn5
			int hIn = CrearPeticiones.getListaPeticiones().get(i).horaInicioS1;
			int hFin = CrearPeticiones.getListaPeticiones().get(i).horaFinS1;
			int duracion = hFin-hIn;
			
			//get actividad de la segunda peticion
			String act = CrearPeticiones.getListaPeticiones().get(i).actividad;
			System.out.println(act+hIn);
			//asignar a la casilla horaria correspondiente la actividad
			//              dia                     hora  actividad
			
			//for(int k=0;k>=hIn&&k<=Hfin;k++ )
			
			
			
			
		//este metodo repite el proceso de guardar el nombre de la actividad 
		//en los slot siguientes tantas veces cuantas son las horas de duracion de la actividad
			for(int k=0;k<duracion;k++ ){			
				disponibilidades[q].slotsHorasActividad[hIn] = act;
				hIn++;	
			}
			
					
		//TODO aqui toca añadir el cogigo que ocupa las casillas sucesiva
		//en caso que la actividad se divida en dos sesiones
			int hIn2 = CrearPeticiones.getListaPeticiones().get(i).horaInicioS2;
			int hFin2 = CrearPeticiones.getListaPeticiones().get(i).horaFinS2;
			int duracion2 = hFin-hIn;
		//>>>>>>	
			
		
			
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^	
		//**************************************************	
			
			
			
			//disponibilidades[0].slotsHorasActividad[0] = act;
			
			System.out.println(hIn+" - "+hFin);
			
			
			
		}
		
		
		
		
		
		}
		
		}
		
		
	//si el valor del string ya no es null porque fue modificado antes hay que generar una incidencia
			
			
			
			
			
	//disponibilidades[fIni.getDayOfMonth()].slotsHorasActividad[hIni] = nombreAct;
		
		
		}
		
		
	}
	
	//imprimirDisp();
}





















}


