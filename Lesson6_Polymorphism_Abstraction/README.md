1\. Briefly explain what each Java program does.



The first program demonstrates polymorphism, where different child classes use the same method but produce different outputs. The second program demonstrates abstraction by using an abstract class that provides a structure for child classes to follow and implement.



2\. Explain how polymorphism works in your code. Identify the parent class, child classes, and overridden method.



Polymorphism works by allowing child classes to have their own versions of a method inherited from the parent class. The parent class contains the original method, the child classes inherit it, and the overridden method is the one that each child class changes to perform its own action.



3\. Explain how abstraction works in your code. Identify the abstract class, abstract method, and its implementation.



Abstraction works by using an abstract class as a guide for child classes. The abstract class contains an abstract method without a body, while the child class provides the actual code to make that method work.



4\. Explain the difference between polymorphism and abstraction.



Polymorphism allows different classes to perform different actions using the same method, while abstraction hides unnecessary details and provides a common structure for classes to follow.



Answer the following questions:



1\. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?



Method overriding allows each child class to have its own behavior. If a child class does not override the parent's method, it will simply use the original method inherited from the parent class.



2\. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?



We cannot create an object directly from an abstract class because it may contain methods without complete code. This restriction makes sure that child classes provide the required implementations.



3\. If you need to add another child class to your polymorphism program, how would your existing code handle it?



I can create another child class that extends the parent class and overrides its method. The program can still work without rewriting the entire code, making it easier to add new features.



4\. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.



Yes, they can work together. For example, an abstract class called Animal can have a make Sound() method, while Dog and Cat provide their own implementations. This shows abstraction through the abstract class and polymorphism through their different outputs.



5\. As a future programmer, when would you use polymorphism, and when would you use abstraction?



I would use polymorphism when different classes need to perform different actions using the same method. I would use abstraction when I want to create a common structure and hide unnecessary details to make my code more organized and easier to maintain.

