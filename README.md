# Agenda
reservar horarios, streams serializacion


Enunciat

Es tracta de realitzar un programa (g_agenda) que generi la agenda diÃ ria dâ€™ocupaciÃ³ dâ€™uns espais (sales de conferÃ¨ncies, pistes esportives, etc.) a partir dâ€™unes peticions.

El procÃ©s a realitzar Ã©s el segÃ¼ent: Es llegeix en primer lloc el fitxer config.txt on es troben parÃ metres generals de funcionament. A continuaciÃ³, es llegiran les peticions a travÃ©s dâ€™un fitxer text (peticions.txt) i es guardaran les dades en estructures de memÃ²ria.

Posteriorment, es tractaran aquestes dades i com a resultat sâ€™ha de generar lâ€™agenda en fitxer Html (ver espacio.html). TambÃ© sâ€™ha de generar un segon fitxer text que reculli les incidÃ¨ncies produÃ¯des en el procÃ©s dâ€™assignaciÃ³ dâ€™espais (incidencies.log).

El programa ha de ser dissenyat per a la presa de dades dâ€™entrada exclusivament des de fitxers i escriure la sortida en fitxers, per la qual cosa cal evitar operacions dâ€™entrada / sortida per pantalla. Dâ€™aquesta forma, sâ€™agilitza el procÃ©s dâ€™execuciÃ³
de proves i la visualitzaciÃ³ dels seus resultats.

Lâ€™entrada de g_agenda serÃ :

1. â€œconfig.txtâ€�, fitxer text que contÃ©:
a. La primera lÃ­nia indica lâ€™any i el mes que es desitja processar.
b. La segona lÃ­nia indica lâ€™idioma utilitzat en el fitxer dâ€™entrada i de idioma desitjat pels fitxers de sortida. Els codis corresponen a les extensions del fitxer dâ€™internacionalitzaciÃ³ (veure punt 3)

Per exemple, el fitxer â€œconfig.txtâ€� podria incloure:
2008 11
ESP ENG
Indicaria que es desitja processar Novembre del 2008, que el fitxer de â€œpeticions.txtâ€� estÃ  en espanyol i que la sortida de lâ€™agenda (â€œsala1.htmlâ€� per exemple) estarÃ  en anglÃ¨s.
2. â€œpeticions.txtâ€�, fitxer text amb el segÃ¼ent format:
ReunioJava Sala1 07/10/2008 08/11/2008 LMCJVSG 08-10_19-21
i ii iii iv v vi
on:
i. Activitat: Nom de lâ€™activitat (sense espais interns)
ii. Espai: Nom de la sala (tambÃ© sense espais interns)
iii. Data inicial del perÃ­ode de reserva
iv. Data final del perÃ­ode de reserva
v. MÃ scara de dies a reservar durant el perÃ­ode
vi. MÃ scara de hores a reservar durant el perÃ­ode
La mÃ scara de dies (v) sâ€™ha dâ€™interpretar com la uniÃ³ (ordenada) de lletres (de 1 a 7) corresponents a dies de la setmana. En cas que lâ€™idioma dâ€™entrada sigui catalÃ , les inicials correspondrien a â€œLâ€� Dilluns, â€œMâ€� dimarts, â€œCâ€� dimecres, â€œJâ€� dijous, â€œVâ€� divendres, â€œSâ€� dissabte i â€œGâ€� diumenge. La presÃ¨ncia dâ€™una lletra determinada (per exemple, una â€œLâ€�) indica que sâ€™ha dâ€™assignar tots els dilluns que li corresponen dins el perÃ­ode de reserva.

Per exemple:
ReunioJava Sala1 01/10/2008 10/11/2008 LMJ 08-09
LMJ indica que la reserva Ã©s per Dilluns, Dimarts i Dijous.
Combinat amb el perÃ­ode 1/10/2008 a 10/10/2008, suposaria fer reserves pel dia 2, 6 i 7 dâ€™octubre a la franja horÃ ria 08-09.
La mÃ scara dâ€™hores (vi) sâ€™ha dâ€™interpretar com la uniÃ³ de diverses franges horÃ ries (mÃ xim 5) de la segÃ¼ent forma:
â€œ08-10â€� indica que la reserva Ã©s de la franja horÃ ria entre 08 i 10
â€œ08-09_15-20â€� indica reserva de dos franges horÃ ries: de 08h a 09h i, a mÃ©s, de 15 a 20h.
Les franges horÃ ries mÃ­nimes seran dâ€™1 hora i dins del mateix dia.

Exemples:
L 08-08 (Â¡Â¡Â¡NO VÃ�LIDO!!!!)
V 23-02 (Â¡Â¡Â¡NO VÃ�LIDO!!!!)
V 23-24 i S 00-02 (Â¡Â¡Â¡CORREGIDO!!! â€“en dos lÃ­nies)

Una mÃ scara horÃ ria pot incloure com a mÃ xim 5 franges horÃ ries.
Exemple de fitxer Peticions.txt:

Tancat Sala1 01/01/2008 31/12/2009 LMCJVSG 00-07_21-24
ReunioJava Sala1 01/11/2008 20/11/2008 LCV 08-10_19-21
ReunioC Sala1 19/11/2008 25/11/2008 LMCJVSG 10-12
ReunioJava Sala1 21/11/2008 30/11/2008 LCV 09-11_18-20

Observacions sobre el fitxer peticions.txt:

a) Les activitats sâ€™assignen per ordre dâ€™apariciÃ³.

En cas de conflicte, sâ€™afegeix la informaciÃ³ de les peticions no assignades en un fitxer incidencies.log.
En cas que lâ€™Activitat es repeteixi, sâ€™acumula la peticiÃ³ a lâ€™assignada anteriorment, independentment de lâ€™ordre en que es trobi.

ReunioJava Sala1 01/11/2008 20/11/2008 LCV 08-10_19-21
ReunioC Sala1 19/11/2008 25/11/2008 LMCJVSG 10-12
ReunioJava Sala1 21/11/2008 30/11/2008 LCV 09-11_18-20

Les peticions de ReunioJava, encara que estiguin separades en el fitxer, rebran prioritat abans que las de ReunioC a pesar que el conflicte es produeixi

b) Activitat especial â€œTancatâ€�:

Aquesta activitat tindrÃ  un comportament especial.
En concret, lâ€™acciÃ³ corresponent serÃ  mostrar el quadre ombrejat de color gris seguint el patrÃ³ marcat per dies i hores.

Aquesta peticiÃ³ ha de ser la primera en executar-se independentment del seu ordre dâ€™apariciÃ³ al fitxer.

3. â€œinternacional.EXTâ€� (on EXT correspondrÃ  a lâ€™extensiÃ³ del fitxer segons el idioma), fitxers text amb el segÃ¼ent format:
<codi paraula> ; <paraula a lâ€™idioma del fitxer >

Aquest fitxer contÃ© les diferents paraules clau utilitzades als fitxers dâ€™entrada i de sortida. (Veure fitxer internacional.CAT proporcionat amb lâ€™enunciat).

El fitxer internacional.CAT inclou:

001;Agenda
002;Dilluns,Dimarts,Dimecres,Dijous,Divendres,Dissabte,Diumenge
003;LMCJVSG
004;Gener,Febrer,MarÃ§,Abril,...

Mentre que el fitxer internacional.ENG contindrÃ 
001; Schedule
002; MTWHFSN
003; January,...
004; ...

La sortida de g_agenda serÃ :

1. Els fitxers html dâ€™ocupaciÃ³ de cada sala <nom_espai>.html (per exemple, si el
nom delâ€™espai Ã©s sala1 el fitxer es denominarÃ  Sala1.html).
Cada fitxer contindrÃ  la planificaciÃ³ de les 4 - 6 setmanes del mes.
El cas mÃ­nim de 4 setmanes se dona quan el mes a tractar es febrer de un any no bixest i la setmana comenÃ§a en dilluns, mentre que el cas mÃ xim de 6 setmanes es produeix, entre altres casos, sempre que el dia 1 coincideix en diumenge i el mes tÃ© 30 o mÃ©s dies) .
Com exemple, lâ€™estructura de Sala1.html para Novembre de 2008.

 

 

2. El fitxer incidencies.log

ContindrÃ  el resum de lâ€™assignaciÃ³ dâ€™activitats:
Exemple de fitxer incidencies.log
#Resum Activitats 11/2008
#Activitat ReunioC
Espai: Sala1 Dia: X 19/11/2008 Hora: 10-11 Conflicte con: ReunioJava
Espai: Sala1 Dia: V 21/11/2008 Hora: 10-11 Conflicte con: ReunioJava
--------> Total: 10 / 12 h assignades. (No Assignades: 2 h)

Nota sobre el HTML
La informaciÃ³ de sortida del programa es troba en taules de format HTML. 
A continuaciÃ³, es mostra el funcionament dels tÃ­tols i de les taules en html:

TÃ­tols: h1 i h2 sÃ³n etiquetes per a diferents nivells de tÃ­tols.
<h1> titulo1 </h1>
<h2> titulo2 </h2>
on
<h1> correspon a lâ€™etiqueta dâ€™inici de tÃ­tol1
</h1> a lâ€™etiqueta de final de tÃ­tol.
El text contingut entre les dues etiquetes Ã©s el text corresponent al tÃ­tol.

Taules:
<table> // inici de taula
<tr> // inici de fila
<td> Contingut de la fila 1 celÂ·la1 </td>
<td> Contingut de la fila 1 celÂ·la2 </td>
<td> Contingut de la fila 1 celÂ·la3 </td>
</tr> // fi de fila
<tr> // inici de segona fila
<td> Contingut de la fila 2 celÂ·la1 </td>
<td> Contingut de la fila 2 celÂ·la2 </td>
<td> Contingut de la fila 2 celÂ·la3 </td>
</tr> // fi de segona fila
</table> // fi de taula

 
Suggeriment pel disseny de lâ€™algorisme g_agenda

En primer lloc, dissenyar les estructures de dades.
Llegir les dades que provenen de peticions.txt i emmagatzemar-los en una estructura de dades dinÃ mica on es va realitzant una inserciÃ³ ordenada de las diverses peticions, acumulant-los segons espai i activitat.

Posteriorment, recÃ³rrer aquesta estructura dinÃ mica per a tractar les dades y emmagatzemar-los en estructures de dades estÃ tica (matriu) corresponent a les diferents
setmanes del mes en curs. Durant aquest procÃ©s, les peticions rebutjades generen el fitxer text incidencies.log.

Un cop la informaciÃ³ ha estat recopilada, es fa un recorregut de lâ€™estructura estÃ tica per a generar els diferents fitxer html corresponents a les diferents sales (sala1.html, sala2.html, ... )

TambÃ© Ã©s molt interessant agrupeu les funcions similars en fitxers de codi font separats (per exemple, el conjunt de rutines destinats a generar codi html podrien recollir-se a  html_funcions.java ).

En aquest programa Ã©s necessari comptar amb algun mÃ¨tode que, donada una determinada data, indiqui quin dia de la setmana Ã©s i a quina setmana de lâ€™any pertany.


