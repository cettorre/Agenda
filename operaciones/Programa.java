package operaciones;
import java.io.IOException;
import clasesLogicas.Sala;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		CargarConfiguracion.leerConfig();
		CargarConfiguracion.inicializeConfig();
		CrearPeticiones.crearPeticiones();

			Sala s1 = new Sala("Sala1");
				
		EscibirIncidencias.escribeIncidencias();
	
		
			
			
	
		
		
		
		
		/*	* -metodos para implementar:
		 * -cargar configuracion
		 * -leer peticiones
		 * -generar diponibilidad
		 * -comprobar disponibilidad
		 * -gestionar incidencias
		 * -ecribir fichero incidencias.log
		 * -actualizar disponibilidad
		 * -insert values in html table
		 * -escribirhtml		  
		 */
				
			//Imprimir lod datos del fichero de configuracion
//			System.out.println("En el ficher de configuracion se han introducido los siguientes datos: "+
//			"\nAño:\t\t\t "+CargarConfiguracion.getAño()+
//			"\nMes:\t\t\t "+CargarConfiguracion.getMes() +
//			"\nidioma de entrada:\t " + CargarConfiguracion.getIdiomaEntrada()+
//			"\nIdioma de salida:\t " + CargarConfiguracion.getIdiomaSalida());

			//imprimir en consola tablas s1
			//System.out.println(VistaTablas.buildTablasHTML(s1).toString());			
	}
	
}
