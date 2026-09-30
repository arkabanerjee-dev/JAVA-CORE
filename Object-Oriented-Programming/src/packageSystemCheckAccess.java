// import collage.student;
// import collage.teacher; 
import collage.*;
// import School.*;
// when we import both the packages with same class names 
// we get error for ambiguity because the compiler does not know which package class to use.
// so for one we use the <packageName>.<classsName> format.
public class packageSystemCheckAccess {
public static void main(String[] args) {
    student s1 = new student();
    // lets keep student of collage package and teachher of School package.
    School.teacher t1 = new School.teacher();
    // s1.role(); 
    // the above statement will be giving error 
    // beacuse the method role() is not private 
    // default access modifier only allow access in  same package .
s1.role();
t1.role();
// conclusion : default access modifier only allow access in  same package .
}
}
