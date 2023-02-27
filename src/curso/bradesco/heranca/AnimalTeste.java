package curso.bradesco.heranca;

public class AnimalTeste {

	public static void main(String[] args) {

		Cachorro lulu = new Cachorro();
		lulu.comida = "Ração";
		lulu.dormir();
		
		Galinha cocorico = new Galinha();
		cocorico.fazerBarulho();
		
	}

}
