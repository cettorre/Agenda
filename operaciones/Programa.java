package operaciones;
import java.io.IOException;
import clasesLogicas.Sala;

public class Programa {

	public static void main(String[] args) throws IOException {
	/*	* -metodos para implementar:
		 * -cargar configuracion
		 * -leer peticiones
		 * -generar diponibilidad
		 * -comprobar disponibilidad
		 * -confirmar reserva
		 * -gestionar incidencias
		 * -ecribir fichero incidencias.log
		 * -actualizar disponibilidad		 * 
		 */
		//cargar configuracion de config.txt
		CargarConfiguracion.leerConfig();			
		CargarConfiguracion.a�o= CargarConfiguracion.configuracion.get(0);
		CargarConfiguracion.mes= CargarConfiguracion.configuracion.get(1);
		CargarConfiguracion.idiomaEntrada= CargarConfiguracion.configuracion.get(2);
		CargarConfiguracion.idiomaSalida= CargarConfiguracion.configuracion.get(3);
		//Imprimir lod datos del fichero de configuracion
//		System.out.println("En el ficher de configuracion se han introducido los siguientes datos: "+
//		"\nA�o:\t\t\t "+CargarConfiguracion.getA�o()+
//		"\nMes:\t\t\t "+CargarConfiguracion.getMes() +
//		"\nidioma de entrada:\t " + CargarConfiguracion.getIdiomaEntrada()+
//		"\nIdioma de salida:\t " + CargarConfiguracion.getIdiomaSalida());

			
		//crear referencia a clase CrearPeticione para acceder a metodos no static
		//CrearPeticiones accesoApeticiones = new CrearPeticiones();
		CrearPeticiones.crearPeticion();
			//imprimir lista de peticiones contenida en arrayLIst de la clase CrearPrticiones
			//System.out.println(accesoApeticiones.getListaPeticiones());

//			->get actividad de la segunda peticion
//			String z = accesoApeticiones.getListaPeticiones().get(1).actividad
//			->asignar a la casilla horaria correspondiente la actividad
//  	    sala                dia-1                    hora   actividad
//			s1.disponibilidades[0].slotsHorasActividad[hi1] = a;
//			->get horario inicio de la peticion numero 5
//			int hi5 = accesoApeticiones.getListaPeticiones().get(4).horaInicioS1;			
			//*****************************************************



			Sala s1 = new Sala("Sala1");

			
			
			
			
			//imprimir en consola tablas s1
			//System.out.println(VistaTablas.buildTablasHTML(s1).toString());
			
			//	EscribirLogIncidencias.escribirLogIncidencias(s1);
			EscibirIncidencias.escribeIncidencias();
	
			
			
	}
	
}
