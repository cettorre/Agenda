package vistaHtml_pack;

import java.io.FileWriter;
import java.io.IOException;

import agenda_package.Sala;


public class EscribirTablaHTML {
	
	//static StringBuilder sb; 
	
		public static void escribirTablasHTML(Sala sala){
			//String anual;
			//sb = new StringBuilder(Constants.anual.toString());
			
			//anual = Constants.anual.toString();
			
			String tablasHtml = vistaTablas.buildSemanaHTML(sala).toString();
			
			try {
				FileWriter html 
					= new FileWriter("src/agenda.html", false);
			
				for (int i=0;i<tablasHtml.length(); i++){
				html.write(tablasHtml.charAt(i));
					}
					html.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			
			
		}
	
	
}
