package model;

public class Personne {

	private String name;
	private int age;
	private float poids;
	private float taille;
	
	public boolean isOver70kg() {
	    return this.poids > 70;
	}

	public Personne(String name, int age, float poids, float taille) {
		super();
		this.name = name;
		this.age = age;
		this.poids = poids;
		this.taille = taille;
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

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Personne [name=" + name + ", age=" + age + ", poids=" + poids + ", taille=" + taille + "]";
	}
	
	
}
