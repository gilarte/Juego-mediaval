package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static void print(String f) {
		System.out.println(f);
	}
	
	public static String leeString() {
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		String x="";
		do {
			try {
				x=s.next();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				s.next();
				print("Incorrecto");
			}
		}while(valid);
		return x;
	}
	
	public static int leeEntero() {
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		int x=-1;
		do {
			try {
				x=s.nextInt();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				s.next();
				print("Incorrecto");
			}
		}while(valid);
		return x;
	}

	public static boolean validaUser(String userName) {

		boolean estado = false;
		
		Pattern pat = Pattern.compile("/^[a-z0-9_-]{6,16}$/");
		Matcher mat = pat.matcher(userName);

		if (mat.matches()) {

			System.out.println("Usuario Valido");
			estado = true;
		} else {
			System.out.println("Usuario Invalido");
			estado = false;
		}
		return estado;
	}

}
