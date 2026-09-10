public class StaticUseDemonstration {
public static void main(String[] args) {
    Students arka=new Students("Arka Banerjee", 15, 19);

    // System.out.println(arka.name+" studying at "+ Students.clg);
    // System.out.println("his age is "+arka.age+" and rollnumber "+arka.rollNo);
    arka.display();
    // we can also change the value of static variable 
    Students.clg="IIT-KGP";
    System.out.println("after collage change");
    arka.display();

    System.out.print(arka.name+"'s branch : ");
    Students.displayCollegeAndBranch();

    // change done prior will reflect since now on for all objects 

    // we can see that for another object also the static fields will have same data 
     Students oishee=new Students("Oishee Banerjee", 05, 20);
      oishee.display();
      System.out.print(oishee.name+"'s branch : ");
      Students.displayCollegeAndBranch();}
}
class Students{
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

public Students(String name, int rollNo, int age) {
    this.name = name;
    this.rollNo = rollNo;
    this.age = age;
}
void display(){
    //non-static methods can access static variable via class name 
    System.out.println(name+" studying at "+ Students.clg);
    System.out.println("his/her age is "+age+" and rollnumber "+rollNo);
}
/*  functions can also be static 
    but they can only work with / accept as parameter - static variable not non-static varibale  
*/
static String concatClgAndBranch(){
    // static method that concats two strings and return a single string
     // clg amd branch both are static 
        return clg+" "+branch;
    //  return clg+" "+name;----------------error as name is not static

}
/* A static method can only call another static method Directly ---shown  */ 
static void displayCollegeAndBranch (){
    System.out.println(concatClgAndBranch()+'\n');
 /*   internally calls static method concatClgAndBranch 
if we try to call a non static method display
display();
we will encounter error */
}

}