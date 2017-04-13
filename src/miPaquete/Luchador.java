package miPaquete;

public class Luchador {
	private int peso, altura;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean domina(Luchador luch2) {
		if (this.peso > luch2.peso && this.altura > luch2.altura)
			return true;
		else if ((this.peso > luch2.peso && this.altura == luch2.altura)
				|| (this.peso == luch2.peso && this.altura > luch2.altura))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return (this.peso + " " + this.altura);
	}

}
