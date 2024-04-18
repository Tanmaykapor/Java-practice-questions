interface Animal{
    int eyes = 2;
     public void walk();

}
interface Herbivore {

}
class Horse implements Animal,Herbivore{//multiple inheritance not possible by classes but possible in interface
    
     public void walk(){
        System.out.println("walk on 4 legs");

    }
}


public class interfaces {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();

    }
    
}
