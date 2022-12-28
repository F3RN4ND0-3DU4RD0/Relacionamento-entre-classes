//Aula7b Relacionamento entre classes
public class Main {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Cool Boy", "Estados Unidos", 38, 67.2f, 1.73f, 15, 6, 3);
		l[1] = new Lutador("PutScreen", "Angola", 27, 61.0f, 1.70f, 13, 2, 1);
		l[2] = new Lutador("SnaipeSombreira", "Mexico", 38, 78.5f, 1.63f, 15, 5, 3);
		l[3] = new Lutador("Death Coding", "Reino Unido", 37, 79.3f, 1.95f, 11, 2, 7);
		l[4] = new Lutador("Tiao da Oficina", "Brasil", 49, 110.0f, 1.80f, 17, 2, 0);
		l[5] = new Lutador("Nerd Qualquer", "Portugal", 30, 1.81f, 105.7f, 12, 2, 4);

	
		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[1], l[5]);
		UEC01.lutar();
		//l[0].status();
		//l[1].status();
		
		
		
		
		
	}
}
