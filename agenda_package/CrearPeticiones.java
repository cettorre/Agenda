package agenda_package;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CrearPeticiones {
 //ej. peticion: ReunionJava Sala1 01/01/2008 31/12/2008 LMCJVSG 00-07_21-24
	
	
	public static ArrayList<Peticion> listaPeticiones = new ArrayList<>();
	
	
	public static ArrayList<Peticion> getListaPeticiones() {
		return listaPeticiones;
	}

	
	public void crearPeticion() {	
		try(BufferedReader br = 
				new BufferedReader(new FileReader("src/peticiones.txt"))) 
		{
			
			
			String linea;
			String[] array;
			while ((linea = br.readLine()) != null ) {
				array = linea.split(" ");
				
				String[] fInicio =array[2].split("/");
				int intDiaFechaInicio = Integer.parseInt(fInicio[0]);
				int intMesFechaInicio = Integer.parseInt(fInicio[1]);
				int intAnoFechaInicio = Integer.parseInt(fInicio[2]);
				
				String[] fFin =array[3].split("/");
				int intDiaFechaFin = Integer.parseInt(fFin[0]);
				int intMesFechaFin = Integer.parseInt(fFin[1]);
				int intAnoFechaFin = Integer.parseInt(fFin[2]);
				
				String[] horario =array[5].split("_");
				
				//imprimir en consola la porcion de texto correspondiente a los horarios de ambas sesiones de la petiocion
				System.out.println(array[5]);
				
				String [] session1 = horario[0].split("-");
				int comienzoSession1 = Integer.parseInt(session1[0]);
				int finSession1 = Integer.parseInt(session1[1]);
				
				
				
				//testing imprimir en consola la longitud del array de los horarios para saber si tiene 1 o 2 sesiones
				System.out.println("longitud array horarios "+horario.length);
				
				int comienzoSession2=0;
				int finSession2=0;
				if (horario.length==2){
					String [] session2 = horario[1].split("-");
					comienzoSession2 = Integer.parseInt(session2[0]);
					finSession2 = Integer.parseInt(session2[1]);	
				
					
				//if (horario.length==2){
			//	System.out.println("longitud array horarios "+horario.length);
			//	String [] session2 = horario[1].split("-");
			//	String [] session2 = array[5].split("-");
//				comienzoSession2 = Integer.parseInt(session2[0]);
//				finSession2 = Integer.parseInt(session2[1]);
				
				
				


				
				}
				
				
				//aqui tuve que crear un array comprensivo de todos los horarios de fin y inicio
				//para que a la hora de procesar las peticiones para convertirlas en reservas pueda saber si 
				//la peticion tiene 1 o 2 horarios
				int[] horarios ={comienzoSession1,comienzoSession2,finSession1,finSession2};
				
				Peticion peticion = 
						new Peticion(
						array[0], array[1], 
						LocalDate.of(intAnoFechaInicio, intMesFechaInicio, intDiaFechaInicio),
						LocalDate.of(intAnoFechaFin, intMesFechaFin, intDiaFechaFin ), 
						array[4],
						comienzoSession1, finSession1,
						comienzoSession2, finSession2,
						horarios
								);
						
						

				
				
				listaPeticiones.add(peticion);
				
			}			
				
			
			//System.out.println(br.readLine());
			
			
	
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}