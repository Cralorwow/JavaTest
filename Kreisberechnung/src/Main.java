import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		double radius, umfang;
		String einheit;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Willkommen zu ihrem Kreisberechnungstool");
		System.out.println("Bitte nennen sie mir den Radius des Kreises.");
		String buffer = br.readLine();
		System.out.println("Vielen Dank. Der Radius beträgt: " + buffer);
		radius = Double.parseDouble(buffer);
		System.out.println("Bitte geben sie eine Einheit an. (mm/cm/dm/m");
		einheit = br.readLine();
		
		umfang = 2 * Math.PI * radius;
		
		System.out.println("Der von ihnen angegebene Kreis hat einen Umfang von: " + umfang + " " + einheit);
	}

}
