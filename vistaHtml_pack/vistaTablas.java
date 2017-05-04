package vistaHtml_pack;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import agenda_package.Sala;

public class vistaTablas {


public static StringBuilder buildSemanaHTML(Sala sala){

	
	
//	String[] array1={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array2={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array3={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array4={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array5={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array6={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//	String[] array7={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
//
//	
//	List<String> list1 = new ArrayList<String>(Arrays.asList(array1));
//	List<String> list2 = new ArrayList<String>(Arrays.asList(array2));
//	List<String> list3 = new ArrayList<String>(Arrays.asList(array3));
//	List<String> list4 = new ArrayList<String>(Arrays.asList(array4));
//	List<String> list5 = new ArrayList<String>(Arrays.asList(array5));
//	List<String> list6 = new ArrayList<String>(Arrays.asList(array6));
//	List<String> list7 = new ArrayList<String>(Arrays.asList(array7));
//	
//	
	
	
	
	StringBuilder tablaHorariosSemanales = new StringBuilder();
	
	
	
	
	
	
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>" + sala.getDisponibilidades()[1].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[2].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[3].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[4].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[5].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[6].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[7].getFecha() + "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");

	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>" + sala.getDisponibilidades()[8].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[9].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[10].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[11].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[12].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[13].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[14].getFecha() + "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");

	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>" + sala.getDisponibilidades()[15].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[16].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[17].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[18].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[19].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[20].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[21].getFecha() + "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>" + sala.getDisponibilidades()[22].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[23].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[24].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[25].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[26].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[27].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[28].getFecha() + "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
	
	
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>" + sala.getDisponibilidades()[20].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[29].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[29].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha() + "</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha() + "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
	
	
	
	
	
	
	
	
	
	
	
	

	return tablaHorariosSemanales;

	
	
	
}
	
static public String buildMonthTable(Sala sala){
	System.out.println(sala.getDisponibilidades()[0].getFecha().lengthOfMonth());
	DayOfWeek primerDiaSemana = sala.getDisponibilidades()[0].getFecha().getDayOfWeek();
	
	int l = sala.getDisponibilidades()[0].getFecha().lengthOfMonth();
	
	for(int i=0;i<l;i++){
		
		if (i<=7){
		String dia1 =sala.getDisponibilidades()[i].getFecha().toString();	
			
			
		}
	}
	
	
	
	
	
	return null;
	
}





	
}
