public class Lutador {

	// Atributos
	private String nome, categoria, nacionalidade;
	private int idade, vitorias, derrotas, empates;
	private float peso, altura;

	// Metodo Construtor
	public Lutador(String nome, String nacionalidade, int idade, float peso, float altura, int vitorias, int empates,
			int derrotas) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		setPeso(peso);
		this.altura = altura;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
	}

	// Metodos Acessores
	public String getNome() {
		return this.nome;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public int getIdade() {
		return this.idade;
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public int getEmpates() {
		return this.empates;
	}

	public int getDerrotas() {
		return this.derrotas;
	}

	public float getAltura() {
		return this.altura;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Medio";
		} else if(this.peso<= 120.2){
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}

	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	// Metodos do programa

	public void apresentar() {
		System.out.println("--------------------------------");
		System.out.println("Senhoras e senhores comeca agora o embate!"
				+ " O lutador " + this.getNome() + " com "+ this.getIdade() + " anos");
		System.out.println("Diretamente de : " + this.getNacionalidade());
		System.out.println("Pesando  " + this.getPeso() + "Kg e com altura de "+ this.getAltura());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		
		
	}

	public void status() {
		System.out.println("O lutador " + this.getNome() 
		+ " peso " + this.getCategoria());
		System.out.println("Ganhou "+this.getVitorias()+" vezes.");
		System.out.println("Perdeu "+this.getDerrotas()+" vezes.");
		System.out.println("Empatou "+this.getEmpates()+" vezes.");

	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	
	
	
	
	
	
	
}