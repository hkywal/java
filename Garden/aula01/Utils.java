package aula01;

class Utils {

	public static String testPlural(String text, int numberOf) {
		String strAux = text;
		if (numberOf > 1) {
 			strAux += "s";
		}
		return numberOf + " " + strAux + ".";
	}
  
	public static boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}	

}

