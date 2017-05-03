package vistaHtml_pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vistaTablas {


public static StringBuilder buildHTML(){

	
	
	String[] array1={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array2={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array3={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array4={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array5={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array6={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};
	String[] array7={"a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d","e","a","b","c","d"};

	
	List<String> list1 = new ArrayList<String>(Arrays.asList(array1));
	List<String> list2 = new ArrayList<String>(Arrays.asList(array2));
	List<String> list3 = new ArrayList<String>(Arrays.asList(array3));
	List<String> list4 = new ArrayList<String>(Arrays.asList(array4));
	List<String> list5 = new ArrayList<String>(Arrays.asList(array5));
	List<String> list6 = new ArrayList<String>(Arrays.asList(array6));
	List<String> list7 = new ArrayList<String>(Arrays.asList(array7));
	
	
	
	
	
	StringBuilder tablaHorariosSemanales = new StringBuilder();
	
	
	
	
	
	
	
	
	tablaHorariosSemanales.append("<html>" +
	           "<body>" +
	           "<table>" +
	           "<tr>" +
	           "<th>Lunes</th>" +
	           "<th>Martes</th>" +
	           "<th>Miercoles</th>" +
	           "<th>Jueves</th>" +
	           "<th>Viernes</th>" +
	           "<th>Sabado</th>" +
	           "<th>Domingo</th>" +
	           "</tr>");
	
	
	
	for (int i = 0; i < 24; i++) {
	    tablaHorariosSemanales.append("<tr><td>")
	       .append(list1.get(i))
	       .append("</td><td>")
	       .append(list2.get(i))
	       .append("</td><td>")
	       .append(list3.get(i))
	       .append("</td><td>")
	       .append(list4.get(i))
	       .append("</td><td>")
	       .append(list5.get(i))
	       .append("</td><td>")
	       .append(list6.get(i))
	       .append("</td><td>")
	       .append(list7.get(i))
	       .append("</td></tr>");
	}
	tablaHorariosSemanales.append("</table>" +
	           "</body>" +
	           "</html>");
//	String html = buf.toString();
	
	

	return tablaHorariosSemanales;

	
	
	
}
	
	
}
