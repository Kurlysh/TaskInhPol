
public class extendTask {

	public static void main(String[] args) {

	}

}
//Task starts here
class Person {
    int age;
    String healthInfo;
    String name;
    String getHealthStatus(){ return name +" " + healthInfo; }  
    
    public Person(int age, String healthInfo, String name){
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
    }
}

class Child extends Person {
    String childIDNumber; 
    
    public Child(int age, String healthInfo, String name, String childIDNumber){
    	super(age, healthInfo,name);
    	this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
        this.childIDNumber = childIDNumber;
    }
}

class Adult extends Person {
    String passportNumber;
    
    public Adult(int age, String healthInfo, String name, String passportNumber){
    	super(age, healthInfo,name);
    	this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
        this.passportNumber = passportNumber;
    }
}