package Methods;

public class TestStudent {
    public static void main(String[] args) {
        TechtorialStudent student1 = new TechtorialStudent();
        TechtorialStudent student2 = new TechtorialStudent();
        // static variables are the same for every object

        student1.setStudentName("David");
        student2.setStudentName("John");

        System.out.println(student1.studentName); // David
        System.out.println(student2.studentName); // John
        // I am going to call a setSchool name method
        // since it is a static method I can call by using an object or class name
        // school name variable is a static variable
        // when was the last time u changed the variable?

        student1.setSchoolName("Techtorial");
        System.out.println(student2.schoolName); //Techtorial
        student2.setSchoolName("Tech School");
        System.out.println(student2.schoolName); // Tech School
        System.out.println(student2.schoolName); // Tech School
        TechtorialStudent.setSchoolAddress("2200 E Devon Avenue");
        System.out.println(student1.schoolAddress);
        System.out.println(student2.schoolAddress);
        // it doesn't matter how we initialize the static variables
        // when we initialize it, the variable is going to be the same for every object
        setStaticVariables("Techtorial", "2200 E Devon Avenue");
        // if method return type is void we cannot use in the print-out statement
        // it doesn't matter how many student object we create, our
        // address and schoolName is going to be common for every object
        TechtorialStudent student3 = new TechtorialStudent();
        System.out.println(student3.schoolAddress);//
    }

    public static void setStaticVariables(String schoolName, String address) {
        TechtorialStudent.setSchoolAddress(address);
        TechtorialStudent.setSchoolAddress(schoolName);
    }

}
