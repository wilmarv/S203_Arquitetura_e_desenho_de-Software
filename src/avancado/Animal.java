package avancado;

public class Animal implements Comparable<Animal> {

	private Long id;

	private String nome;

	public Animal(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int compareTo(Animal animal) {
		return this.nome.compareTo(animal.nome);
	}
}
