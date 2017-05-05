package vistaHtml_pack;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import clasesLogicas.Sala;

public class vistaTablas {


public static StringBuilder buildTablasHTML(Sala sala){

	
	
	StringBuilder tablaHorariosSemanales = new StringBuilder();
	
	
	
	
	
	
	String[] horariosHtml ={"0-1","1-2","2-3","3-4","4-5","5-6","6-7","7-8","8-9","9-10","10-11","11-12","12-13","13-14","14-15","15-16","16-17","17-18","18-19","18-19","19-20","20-21","21-22","22-23","22-23","22-23","22-23","22-23"};	
		
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>HORA</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha()+"</br>" +sala.getDisponibilidades()[0].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[1].getFecha()+"</br>" +sala.getDisponibilidades()[1].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[2].getFecha()+"</br>" +sala.getDisponibilidades()[2].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[3].getFecha()+"</br>" +sala.getDisponibilidades()[3].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[4].getFecha()+"</br>" +sala.getDisponibilidades()[4].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[5].getFecha()+"</br>" +sala.getDisponibilidades()[5].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[6].getFecha()+"</br>" +sala.getDisponibilidades()[6].getFecha().getDayOfWeek()+ "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	    .append(horariosHtml[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[1].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[2].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[3].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[4].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[5].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[6].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	    
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");

	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>HORA</th>" +
	           "<th>" + sala.getDisponibilidades()[7].getFecha()+"</br>" +sala.getDisponibilidades()[7].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[8].getFecha() +"</br>" +sala.getDisponibilidades()[8].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[9].getFecha() +"</br>" +sala.getDisponibilidades()[9].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[10].getFecha() +"</br>" +sala.getDisponibilidades()[10].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[11].getFecha() +"</br>" +sala.getDisponibilidades()[11].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[12].getFecha() +"</br>" +sala.getDisponibilidades()[12].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[13].getFecha() +"</br>" +sala.getDisponibilidades()[13].getFecha().getDayOfWeek()+ "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	    .append(horariosHtml[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[7].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[8].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[9].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[10].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[11].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[12].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[13].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");

	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>HORA</th>" +
	           "<th>" + sala.getDisponibilidades()[14].getFecha() +"</br>" +sala.getDisponibilidades()[14].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[15].getFecha() +"</br>" +sala.getDisponibilidades()[15].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[16].getFecha() +"</br>" +sala.getDisponibilidades()[16].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[17].getFecha() +"</br>" +sala.getDisponibilidades()[17].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[18].getFecha() +"</br>" +sala.getDisponibilidades()[18].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[19].getFecha() +"</br>" +sala.getDisponibilidades()[19].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[20].getFecha() +"</br>" +sala.getDisponibilidades()[20].getFecha().getDayOfWeek()+ "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	    .append(horariosHtml[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[14].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[15].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[16].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[17].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[18].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[19].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[20].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>HORA</th>" +
	           "<th>" + sala.getDisponibilidades()[21].getFecha() +"</br>" +sala.getDisponibilidades()[21].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[22].getFecha() +"</br>" +sala.getDisponibilidades()[22].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[23].getFecha() +"</br>" +sala.getDisponibilidades()[23].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[24].getFecha() +"</br>" +sala.getDisponibilidades()[24].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[25].getFecha() +"</br>" +sala.getDisponibilidades()[25].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[26].getFecha() +"</br>" +sala.getDisponibilidades()[26].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[27].getFecha() +"</br>" +sala.getDisponibilidades()[27].getFecha().getDayOfWeek()+ "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	    .append(horariosHtml[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[21].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[22].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[23].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[24].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[24].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[26].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[27].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
	
	
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>HORA</th>" +
	           "<th>" + sala.getDisponibilidades()[28].getFecha() +"</br>" +sala.getDisponibilidades()[28].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[29].getFecha() +"</br>" +sala.getDisponibilidades()[29].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[0].getFecha() +"</br>" +sala.getDisponibilidades()[27].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[1].getFecha() +"</br>" +sala.getDisponibilidades()[0].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[2].getFecha() +"</br>" +sala.getDisponibilidades()[0].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[3].getFecha() +"</br>" +sala.getDisponibilidades()[0].getFecha().getDayOfWeek()+ "</th>" +
	           "<th>" + sala.getDisponibilidades()[4].getFecha() +"</br>" +sala.getDisponibilidades()[0].getFecha().getDayOfWeek()+ "</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 23; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	    .append(horariosHtml[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[28].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[29].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[0].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[1].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[2].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[3].getSlotsHorasActividad()[i])
	       .append("</td><td>")
	       .append(sala.getDisponibilidades()[4].getSlotsHorasActividad()[i])
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");

	return tablaHorariosSemanales;

	
	}
	
}
