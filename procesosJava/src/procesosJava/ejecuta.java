package procesosJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ejecuta {

	public static void main(String[] args) {
		try {
			if (args.length <= 0) {
				System.err.println("Sin parametros");
				System.exit(-1);
			}
			Process p = Runtime.getRuntime().exec(args);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String linea = br.readLine();
			if (linea != null) {
				System.out.printf("Error del comando %s: ",
				Arrays.toString(args));
				while (linea != null) {
					System.out.println(linea);
					linea = br.readLine();
				}
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
