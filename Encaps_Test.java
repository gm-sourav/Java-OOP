
package Encapsulation;


public class Encaps_Test {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        
        p1.setName("Sourov");
        System.out.println(p1.getName());
       
        p1.setAge(20);
        System.out.println(p1.getAge());
    }
    
}
