class pen{
    String color;
    String type; //ball ben ; gelpen

    public void write(){
        System.out.println("writing something");

    }

    public void printColor(){
        System.out.println(this.color);
    }
}
class  Student {
    String name;
    int age;

    public class polymorphism {
        public void printInfo(String name){
            System.out.println(name);
    
        }
        public void printInfo(int age){
            System.out.println(age);
     
        }
        public void printInfo(String name, int age){
            System.out.println(name+" "+age);// this implimentation in java is called polymorphism;
        }
    }
    
    
    
    //public void printInfo(){
      //  System.out.println(this.name);
        //System.out.println(this.age);
   // }

    //Student(){//non paramaterised constructor
      //  System.out.println("constructor called");
    //}

    //parameterized constructor exampple
   // Student( Student s2){
     //   this.name = s2.name;
       // this.age = s2.age;
    //}

    //Student(){

    }

//}

public class oops {
    //classes ki objects
    public static void main(String[] args){
       Student s1 = new Student( );//this is a constructor
       //s1.name = "Tanmay";
       //s1.age = 21;
       s1.name = "Tanmay";
       s1.age = 21;

      // Student s2 = new Student(s1);

       s1.printInfo(s1.name,s1.age);


    }


    
}
