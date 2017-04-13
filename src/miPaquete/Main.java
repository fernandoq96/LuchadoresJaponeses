package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	// MODIFICO UNA LINEA OLOLO 
	

	// COMENTO LINEA MASTER y COMENTO UNA LINEA SALTO 1

	public static void main(String[] args) {
		Torneo championLeague = new Torneo();
		File archivo = new File("in.txt");
		try {
			championLeague.crearTorneo(archivo);
			championLeague.mostrarTorneo();
			championLeague.crearResultados();
			
			championLeague.imprimirResultados();
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
