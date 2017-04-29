package agenda_package;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;

public class CargarConfiguracion {
	
	
	static String año;
	static String mes;
	static String idiomaEntrada;
	static String idiomaSalida;
	
	static String linea;
	static String[] array;
	static ArrayList<String> configuracion = new ArrayList<>();
	
	public static void leerConfig() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/config.txt"))) 
		{
			while ( (linea = br.readLine()) != null ) {
				array = linea.split(" ");
				configuracion.add(array[0]);								
				configuracion.add(array[1]);				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static int getAño() {
		int x =Integer.parseInt(año);		
		return x;
	}

	static Month x;
	public static Month getMes() {
		
		
		//int y = Integer.parseInt(mes);
		switch(CargarConfiguracion.mes){
		case "01": x = Month.JANUARY;break;
		case "02": x = Month.FEBRUARY;break;
		case "03": x = Month.MARCH;break;
		case "04": x = Month.APRIL;break;
		case "05": x = Month.MAY;break;
		case "06": x = Month.JUNE;break;
		case "07": x = Month.JULY;break;
		case "08": x = Month.AUGUST;break;
		case "09": x = Month.SEPTEMBER;break;
		case "10": x = Month.OCTOBER;break;
		case "11": x = Month.NOVEMBER;break;
		case "12": x = Month.DECEMBER;break;	
		}
		
		return x;
	}







	public static String getIdiomaEntrada() {
		return idiomaEntrada;
	}







	public static String getIdiomaSalida() {
		return idiomaSalida;
	}









}