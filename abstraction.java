 abstract class Animal{
    abstract void walk();
    Animal(){ /// constructor of animal
        System.out.println("you are making a new animal");

    }
public void eat(){
    System.out.println("Animal eats");
}
    
}
class Horse extends Animal {
    Horse(){
        System.out.println("creating horse i.e ghoda");

    }
    public void walk(){
        System.out.println("walks with 4 tangg");
    }

}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on hands WTF");
    }
}

public class abstraction {
    public static void main(String[] args){
        Horse horse = new Horse();
        //Chicken chicken  = new Chicken();
        //chicken.walk();
        //chicken.eat();

    }
    
}
