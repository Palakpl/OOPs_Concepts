package Inheritance_P;

public class Main_Class {
    public static void main(String[] args) {
        //Employer_Class emp1 = new Employer_Class();
       // emp1.Display_role();

        // for Developer
        Developer_Class dev1 = new Developer_Class();
        dev1.Display_role();
        dev1.Display_Salary();
        // For Tester Overriding Method
        Tester_Class tc1 = new Tester_Class();
        tc1.Display_role();



    }
}
