package agenda_package;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import agenda_package.Actividad;

public class DisponibilidadDiaria {

	LocalDate fecha;
	String[] slotsHorasActividad;

	public DisponibilidadDiaria(LocalDate fecha) {
	
		this.fecha = fecha;
		this.slotsHorasActividad  = new String[23]  ;
		//el array representa las horas del dia de 0 a 23 
		//cada slot es un intevalo 0-1, 0-2 etc....
		
//******************************************		
//rellenar array dentro de contructor		
		//int tamañoMes2=	CargarConfiguracion.getMes().length(false);
		//System.out.println(tamañoMes);			
//	LocalDate primerDiaDelMes
//	  = LocalDate.of(
//			  CargarConfiguracion.getAño(), 
//			  CargarConfiguracion.getMes(), 
//			  1);	
//		
//	for(int i=0;i<tamañoMes2;i++){	
//		
//		String x="..";
//		this.slotsHorasActividad[i]= x;	
//	}
//********************************************		
	}
//	static public void rellenarFechas(){		
//	int tamañoMes=	CargarConfiguracion.getMes().length(false);
//	//System.out.println(tamañoMes);
//	//for(int i=0;i<tamañoMes;i++){	}
//	}
	
	
	

	//este metodo ocuparHorarios fue creado aqui para probar
	//en realidad no tiene sentido que este aqui
	//tampoco tiene sentido que reciba como parametro ell arrayList de las entradas
	
//	public void ocuparHorarios(ArrayList<Peticion> listaPeticiones){
//	for (int i=0; i<CrearPeticiones.listaPeticiones.size();i++ ){
//		
//		
//		//get actividad de la segunda peticion
//		String z = CrearPeticiones.getListaPeticiones().get(1).actividad;
//		
//		//asignar a la casilla horaria correspondiente la actividad
//		//     sala                dia                    hora   actividad
//		//s1.disponibilidades[0].slotsHorasActividad[hi1] = z;
//		
//		
//	}		
//}
//	
	
	
	
	
	
	@Override
	public String toString() {
		return "DisponibilidadDiaria [fecha=" + fecha + ", slotsHorasActividad=" + Arrays.toString(slotsHorasActividad)
				+ "]";
	}
}

