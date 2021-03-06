package InnerClasses;

/* Gizlenmiş bir inner classı başka bir yerde kullanamazsın sadece buradaki mainde kullanabilirsin.
 * Buradaki main method herhangi başka bir classa taşınamaz yani burada kullanılmalı.
 * 
 * */

public class Person {
private String name;

public Person(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@SuppressWarnings("unused") 
private class Employee{
	private int salary;
	public Employee(int sal) {
		this.salary=sal;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return name+" "+salary;
		
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Employee []staff=new Employee[3];
	Person kisi;
	kisi=new Person("Osman Pamukoğlu");
	staff[0]=kisi.new Employee(10000);
	kisi=new Person("Oktay Sinanoğlu");
	staff[1]=kisi.new Employee(5000);
	kisi=new Person("Asaf Adamoğlu");
	staff[2]=kisi.new Employee(50000);
	
	for(Employee e:staff) {
		System.out.println(e);
	}
}
}
