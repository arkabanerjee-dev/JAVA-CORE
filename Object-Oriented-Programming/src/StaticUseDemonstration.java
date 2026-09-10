public class StaticUseDemonstration {
public static void main(String[] args) {
    students arka=new students("Arka Banerjee", 15, 19);
    System.out.println(arka.name+" studying at "+ students.clg);
    System.out.println("his age is "+arka.age+" and rollnumber "+arka.rollNo);
    
    // we can also change the value of static variable 
    students.clg="IIT-KGP";

    arka.display();
    System.out.print(arka.name+"'s branch : ");
    students.displayCollageAndBranch();
    // change done prior will reflect 
}
}
class students{
    // instance variables 
    String name;
    int rollNo;
    int age;
    /*  CLOSELY TIED TO THE OBJECT OF THE CLASS students */

    // static variable
    /*  COMMON DATA shared by objects of this class 
    *   closely tied to the class 
    *   object not necessary to access 
    *   accessed via class name  */
   static String clg,branch;
   
//    static block gets invoked as soon as the class is loaded 
static {
    clg="IITG";
    branch="CSE";
}
// hence here in the static block the value of static 
// variable is initialized for all the objects of the class

public students(String name, int rollNo, int age) {
    this.name = name;
    this.rollNo = rollNo;
    this.age = age;
}
void display(){
    System.out.println(name+" studying at "+ students.clg);
    System.out.println("his age is "+age+" and rollnumber "+rollNo);
}
/*  functions can also be static 
    but they can only work with / accept as parameter - static variable 
*/
static void displayCollageAndBranch (){
    String concat=clg+" "+branch;
    System.out.println(concat);
    // clg amd branch both are static 
}


}