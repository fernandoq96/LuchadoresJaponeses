package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {
	private Luchador[] luchadores;
	private int[] resultados;

	public void crearTorneo(File arch) throws FileNotFoundException {
		Scanner scanner = new Scanner(arch);
		if (scanner.hasNextLine()) {
			luchadores = new Luchador[scanner.nextInt()];

			for (int i = 0; i < luchadores.length; i++) {
				luchadores[i] = new Luchador(scanner.nextInt(), scanner.nextInt());
			}

			scanner.close();
		}

	}
	
	public void mostrarTorneo()
	{
		for(int i = 0; i < luchadores.length; i++)
		{
			System.out.println(luchadores[i]);
		}
	}

	public void crearResultados() {
		resultados = new int [luchadores.length];

		for (int i = 0; i < luchadores.length; i++) {
			for (int j = i + 1; j < luchadores.length; j++) {
				if (luchadores[i].domina(luchadores[j]))
					resultados[i]++;
				else if (luchadores[j].domina(luchadores[i]))
					resultados[j]++;
			}
		}
	}
	
	public void imprimirResultados() throws IOException 
	{
		FileWriter archivo = new FileWriter("out.txt");
		PrintWriter fichero = new PrintWriter(archivo);
		
		for(int i = 0; i < resultados.length; i++)
		{
			fichero.println(resultados[i]);
		}
		
		fichero.close();
	}
}
