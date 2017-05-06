package operaciones;

import java.io.FileWriter;
import java.io.IOException;

import clasesLogicas.Sala;
import vistaHtml_pack.VistaTablas;


public class EscribirTablaHTML {
	
	
		public static void escribirTablasHTML(Sala sala){
			
			
			String tablasHtml = VistaTablas.buildTablasHTML(sala).toString();
			
			try {
				FileWriter html 
					= new FileWriter("src/"+ sala.getNombreSala() +".html", false);
			
				for (int i=0;i<tablasHtml.length(); i++){
				html.write(tablasHtml.charAt(i));
					}
					html.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			
			
		}
	
	
}
