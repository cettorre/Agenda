package agenda_package;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscibirIncidencias {

	
	
	
	public static void escribeIncidencias() throws IOException{
		
		BufferedWriter fWincidencias = new BufferedWriter(new FileWriter("src/incidencias.txt"));

		for(int i=0; i<CrearPeticiones.getListaPeticiones().size(); i++){
			
			System.out.println();
		
			
			fWincidencias.write(CrearPeticiones.getListaPeticiones().get(i).toString());
			fWincidencias.newLine();
			

			
			
		}
		fWincidencias.close();
		
		

		
		
	}
	
}
