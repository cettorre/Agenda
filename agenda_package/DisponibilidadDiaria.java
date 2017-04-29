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
		this.slotsHorasActividad  = new String[24]  ;
		
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
	
	
	public void ocuparHorarios(ArrayList<Peticion> listaPeticiones){
		
	}

	@Override
	public String toString() {
		return "DisponibilidadDiaria [fecha=" + fecha + ", slotsHorasActividad=" + Arrays.toString(slotsHorasActividad)
				+ "]";
	}
}

