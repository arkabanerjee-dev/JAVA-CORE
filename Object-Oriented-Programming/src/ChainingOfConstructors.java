public class ChainingOfConstructors {
public static void main(String[] args) {
    StudentInfo obj=new StudentInfo("Arka Banerjee",15,19,"CSE Cloud Computing");
    obj.print();
}

}
class StudentInfo{
    String name;
    int rollNo;
    int age;
    String branch;
/** for the string fields over here we will be using "" insted of null as default 
    as its a good practice to avoid null pointer exception */
    StudentInfo(){
        // takes nothing as argument 
        // non parameterized constructor 
        // calles just the next constructor by passing only the name as ""
        this("");
    }
    StudentInfo(String name){
        // takes name argument only
        this(name,0);
    }
     StudentInfo(String name,int rollNo){
        // takes name and rollNo argument only
        this(name,rollNo,0);
    }
     StudentInfo(String name,int rollNo,int age){
        // takes name rollNo and age argument only
        this(name,rollNo,age,"");
    }
     StudentInfo(String name,int rollNo,int age,String branch){
        /** main constructor that initialises all the fields 
         by taking them as arguments 
         any other constructor invoked sends the value utlimately to this constructor via the other 
         constructors in the hierarchy */
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.branch=branch;
    }

    public void print()
    {
        System.out.println("the student's info provided to the system are");
        System.out.println("name: "+name+" Roll number: "+rollNo);
        System.out.println("Age: "+age+ " Branch: "+branch);
    }
}