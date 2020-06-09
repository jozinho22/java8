package streams;

public class Personne {

	private String name;
	private int age;
	private float poids;
	
	public boolean isOver70kg() {
	    return this.poids > 70;
	}

	public Personne(String name, int age, float poids) {
		super();
		this.name = name;
		this.age = age;
		this.poids = poids;
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

	@Override
	public String toString() {
		return "Personne [name=" + name + ", age=" + age + ", poids=" + poids + "]";
	}

}
