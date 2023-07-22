package HomeworkDay6;
import java.util.Scanner;
class Person{
	protected String name;
	protected int age;
	Person(){
		
	}
	Person(String n, int a){
		this.name=n;
		this.age=a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
         return age;
	}
	public void setName(String name) {
	     this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
class Employee extends Person{
	protected int id;
	protected int salary;
	Employee(){
		
	}
	Employee(String n,int a,int i,int sal){
		this.name=n;
		this.age=a;
		this.id=i;
		this.salary=sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String toString() {
		return name+""+age+""  ;
	}
}
class Teacher extends Employee{
	protected String subject;
	Teacher(){
		
	}
	Teacher(String n,int a,int i,int sal,String sub){
		this.name=n;
		this.age=a;
		this.id=i;
		this.salary=sal;
		this.subject=sub;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String toString() {
		return ""+age;
	}
}
class Principal extends Teacher{
	protected int experience;
	Principal(){
		
	}
	Principal(String n,int a,int i,int sal,String sub,int exp){
		this.name=n;
		this.age=a;
		this.id=i;
		this.salary=sal;
		this.subject=sub;
		this.experience=exp;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience=experience;
	}
	public String toString() {
		return ""+age;
	}
}
class Officer extends Employee{
	protected String department;
	Officer(){
		
	}
	Officer(String n,int a,int i,int sal,String dep){
		this.name=n;
		this.age=a;
		this.id=i;
		this.salary=sal;
		this.department=dep;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String toString() {
		return ""+age;
	}
}

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         Teacher t1=new Teacher("X",34,98,50000,"Mathematics");
         Teacher t2=new Teacher("Y",44,99,60000,"Geography");
         Teacher t3=new Teacher("Z",54,97,80000,"Science");
         Principal p1=new Principal("A",62,96,100000,"History",24);
         Officer o1=new Officer("B",41,96,20000,"Criminal");
         Employee X[]=new Employee[5];
         X[0]=t1;
         X[1]=t2;
         X[2]=t3;
         X[3]=p1;
         X[4]=o1;
         for(int i=0;i<X.length;i++) {
        	 for(int j=i+1;j<X.length;j++) {
        		 if(X[i].getAge() > X[j].getAge()) {
        			 Employee t=X[i];
        			 X[i]=X[j];
        			 X[j]=t;
        		 }
        	 }
         }
         System.out.println("Arrays in sorted order: ");
         System.out.println("Upper bound");
         int up=sc.nextInt();
         System.out.println("Lower Bound");
         int low=sc.nextInt();
         for(int i=1;i<X.length;i++) {
        	 if(X[i].getAge()>=low && X[i].getAge()<=up) {
        		 System.out.println(X[i]);
        	 }
         }
         int s=0;
         int l=0;
 		 int max = 0;
 		 int min=0;
 		 for (int i=0;i<X.length;i++) {
 			if(X[i].getSalary()>max) {
 				max=X[i].getSalary();
 				l=i;
 			}
 			if(X[i].getSalary()<min) {
 				min=X[i].getSalary();
 				s=i;
 			}
         
	}
 		 System.out.println("Employee with lowest salary is "+X[i].getName());

}
}
