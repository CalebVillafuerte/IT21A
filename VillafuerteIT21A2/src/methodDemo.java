
import java.util.Arrays;
import java.util.Scanner;


public class methodDemo {
    
    //void
    static void message(String name , int age) {
        System.out.println("Hello Guys, this is " + name + ". I am " + age + " years old!");
    }
    
    // returning methods
    static int calculateAge(int currentYear, int birthyear){
        return currentYear - birthyear;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        

        if (age == 19){
        System.out.println("Honest");
    } else {
        System.out.println("Liar");
    }    
        
// call void method
    message(name, age);
      
    
            
//        int age = calculateAge(2026, 2007);
        
        System.out.println("My real age is: " + calculateAge(2026, 2007) + " hahaha");

        
        
        
        
    array[] Children = {"chen" , "march" , "hudson" , "carl" , "ryan"};
        System.out.println("Children of Marchilyn " + Children);
    
    
    }
}
