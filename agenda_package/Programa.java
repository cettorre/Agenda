package agenda_package;


import java.time.Month;
import java.util.ArrayList;



public class Programa {

	public static void main(String[] args) {
		
		/*
		 * metodos para implementar:
		 * -cargar configuracion
		 * -leer peticiones
		 * -generar diponibilidad
		 * -comprobar disponibilidad
		 * -confirmar reserva
		 * -gestionar incidencias
		 * -ecribir fichero incidencias.log
		 * -actualizar disponibilidad
		 * 
		 * 
		 */
		
		
	
			//cargar configuracion de config.txt

			CargarConfiguracion.leerConfig();			
			CargarConfiguracion.a�o= CargarConfiguracion.configuracion.get(0);
			CargarConfiguracion.mes= CargarConfiguracion.configuracion.get(1);
			CargarConfiguracion.idiomaEntrada= CargarConfiguracion.configuracion.get(2);
			CargarConfiguracion.idiomaSalida= CargarConfiguracion.configuracion.get(3);
			
			//crear referencia a clase CrearPeticione
			CrearPeticiones accesoApeticiones = new CrearPeticiones();
			accesoApeticiones.crearPeticion();
			
			
			//imprimir lista de peticiones contenida en arrayLIst de la clase CrearPrticiones
			System.out.println(accesoApeticiones.listaPeticiones);
			System.out.println(accesoApeticiones.getListaPeticiones());
		
			//Disponibilidad.rellenar(Disponibilidad.getDisponibilidad());
			
						
			//Imprimir lod datos del fichero de configuracion a�o(0) mes(1) idioma entrada(2) idioma salida(3)
			System.out.println(CargarConfiguracion.configuracion);
			//System.out.println(CargarConfiguracion.configuracion.get(1));
			System.out.println(CargarConfiguracion.a�o);
			System.out.println(CargarConfiguracion.mes);
			System.out.println(CargarConfiguracion.idiomaEntrada);
			System.out.println(CargarConfiguracion.idiomaSalida);
			
			System.out.println(CargarConfiguracion.getA�o());
			System.out.println(CargarConfiguracion.getMes());
			System.out.println(CargarConfiguracion.getIdiomaEntrada());
			System.out.println(CargarConfiguracion.getIdiomaSalida());
			
			
			
//			System.out.println(Month.APRIL);
//			System.out.println(CargarConfiguracion.getIdiomaEntrada());
			
		
		//	DisponibilidadDiaria x = new DisponibilidadDiaria(null);
		//	DisponibilidadDiaria.rellenarFechas();
			
			
			
			//instanciada una sala
			Sala s1 = new Sala("sala1");
			
			//get actividad de la segunda peticion
			String a = accesoApeticiones.getListaPeticiones().get(1).actividad;
			
			//horario de inicio de la peticion numero 5
			int hi1 = accesoApeticiones.getListaPeticiones().get(4).horaInicioS1;
			
			//horario de inicio de la peticion numero 2
			int hi2 = accesoApeticiones.getListaPeticiones().get(1).horaInicioS1;
			
			
			
			//asignar a la casilla horaria correspondiente la actividad
	//     sala                dia                    hora   actividad
			s1.disponibilidades[0].slotsHorasActividad[hi1] = a;
			
			//imprimir peticion numero 5
			System.out.println(accesoApeticiones.getListaPeticiones().get(4));
			
			//imprimir disponibilidad de la sala para un dia especifico
			System.out.println(s1.disponibilidades[0]);
		
			//imprimir contenido de casilla horario 
			System.out.println(s1.disponibilidades[0].slotsHorasActividad[hi1]);
			
			System.out.println(a);
			
			
			//***********************************************************
			
			//get actividad de la segunda peticion
			String z = accesoApeticiones.getListaPeticiones().get(1).actividad;
			
			//asignar a la casilla horaria correspondiente la actividad
			//     sala                dia                    hora   actividad
			s1.disponibilidades[0].slotsHorasActividad[hi1] = z;
					
			s1.disponibilidades[0].slotsHorasActividad[hi1] = z;
			
			
			
			
	}
	
}