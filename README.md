# Questions:  
**What will be the output when running the above code?**  
![Output](/Output.png)

  

**What is meant by polymorphism ?**  

    Polymorphism is an object-oriented concept that allows us to create versatile software designs that deals with multiple objects.  


**How does polymorphism work in the above program?**

    Dynamic Polymorphism which is Overriding is used in the above program.    
    Method (introduceYourself) defined in the subclass(Cat,Dog) using the same name as in its superclass(Animal).  
    Then, method introduceYourself in subclass override the method with same name in superclass when it is called in main.  


**The method introduceYourself of Animal appears to be never called? Why not?**  

    Because the method introduceYourself of Animal is override by the method introduceYourself of Cat and Dog.    


**Comment out the method introduceYourself in Dog. What happens now when you run the program?**  

    The output will change.  
    The second line of output will change from "Woof. I am a dog. My name is Vilma." to "Morr. I am an animal.".  
    This is because there is no method introduceYourself in Dog to override the method introduceYourself of Animal.  
    So, the method introduceYourself of Animal is called.  


**Where is the name stored for the instances of Cat and Dog? (In what / which classes did you put the instance variable that refers to the name of the animal? Both Cat and Dog, or just in Animal?)**  

    In the class Animal, then class Cat and Dog inherits from Animal.


**How does the code in the test program work?**  

    The superclass is Animal and subclass is Cat, Dog.  
    The subclass inherit from the superclass. 
    The method introduceYourself of subclass override the method introduceYourself in superclass.  
    Constructors in created in subclass to initialize object Cat and Dog.  
    Animals(Cat/Dog) with name initialized are stored in array.  
    The data stored in array printed out using loop by calling the method introduceYourself.  


**How does an array work?**  

    Array used to stored elements with the data type declared same as the array.  
    Maximum number of elements to stored in array depends on the size of array.  


**In the above programs we have used a while loop to step through the array and to get information about the animals. But there is a more appropriate loop statement here. What is it?**  

    For loop. 
```java
for (int i=0;i<allAnimals.length;i++){
  allAnimals[i].introduceYourself();
}
```
