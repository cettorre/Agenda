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
	

}


