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
	
	
public void setDispo(){ 

for(int i=0;i<tamañoMes;i++){	
	disponibilidades[i] = new DisponibilidadDiaria(
	LocalDate.of(CargarConfiguracion.getAño(), CargarConfiguracion.getMes(), i+1));
	
	}
}	
	
public void ocuparHorarios(){
	for (int i=0; i<CrearPeticiones.listaPeticiones.size();i++ ){

		LocalDate fIni=CrearPeticiones.getListaPeticiones().get(i).fechaInicio;
		
		int hIni=CrearPeticiones.getListaPeticiones().get(i).horaInicioS1;
				
		//get actividad de la segunda peticion
		String nombreAct = CrearPeticiones.getListaPeticiones().get(i).actividad;
		
		
		
		
		
		//asignar a la casilla horaria correspondiente la actividad
		//          dia                    hora   actividad
   // disponibilidades[0].slotsHorasActividad[hIni] = nombreAct;
		
	disponibilidades[fIni.getDayOfMonth()].slotsHorasActividad[hIni] = nombreAct;
		
		
		
		
		
	}		
}


public void imprimirDisp(){
	for(int i=0;i<disponibilidades.length;i++){
		System.out.println(disponibilidades[i]);
	}		
	
	
}


public void modificarReservas(Sala sala){

	
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
}


