package arrays_entities;

public class Person {

	private String name;
	  private int age;
	  private double heigth;
	  
	   
	  public Person(String name, int age, double heigth) {
	    this.name = name;
	    this.age = age;
	    this.heigth = heigth;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setHeigth(double heigth) {
	    this.heigth = heigth;
	  }

	  public double getHeigth() {
	    return heigth;
	  }
}
