class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";
    }
}

public class abho {
    public static void main(String[] args){
        Student.school = "cms";
        Student student1 = new Student();
        student1.name = "tanmay";

System.out.println(student1.school);
    }
}
