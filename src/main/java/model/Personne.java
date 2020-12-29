package model;

public class Personne {

	private String name;
	private int age;
	private float poids;
	private int taille;
	private GenreEnum genre;
	
	public boolean isOver70kg() {
	    return this.poids > 70;
	}

	public Personne(String name, int age, float poids, int taille, GenreEnum genre) {
		this.name = name;
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public GenreEnum getGenre() {
		return genre;
	}

	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Personne{" +
				"name='" + name + '\'' +
				", age=" + age +
				", poids=" + poids +
				", taille=" + taille +
				", genre=" + genre +
				'}';
	}
}
