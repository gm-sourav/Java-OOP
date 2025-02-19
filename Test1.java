
package Encapsulation;


public class Test1 {
    public static void main(String[] args) {
        Person1 per = new Person1();
        
        per.setName("Sourov");
        System.out.println("Name is "+per.getName());
        
        per.setAge(21);
        System.out.println("Age is "+per.getAge());
        
        per.setCountry("Bangladesh");
        System.out.println("Country is "+per.getCountry());
        
    }
    
}
