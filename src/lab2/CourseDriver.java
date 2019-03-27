

package lab2;

import java.util.ArrayList;
import java.util.List;


public class CourseDriver {
    
    /*
    Interfaces are a good way to ensure that each child class has similar methods
    whilst also avoiding inheriting awkward code that may not be what you want
    The downside is that you must define every method that is in the interface in 
    each child class, which may lead to repetition of code. Interfaces also support
    multiple inheritance which allows differentiation while also greatly expanding
    our options.
    
    They are also useful because you can use the Liskov Substitution Principle
    to add different objects to a collection based on the interface.
    You cannot implement an interface, however. 
    */

    public static void main(String[] args) {
        List<ICourse> courses = new ArrayList<ICourse>();
        
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("advJava", "101a");
        advJava.setPrerequisites("Java, IntroProg");
        IntroJavaCourse introJ = new IntroJavaCourse("IntroJava", "101b");
        introJ.setPrerequisites("IntroProg");
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("introProg", "001a");
        
        
        courses.add(advJava);
        courses.add(introJ);
        courses.add(introProg);
        

        
        System.out.printf("%15s %15s %15s", "Course Name", "Course Number", "Prerequisites\n");
        for(ICourse c : courses)
        {
            String preq = "";
            if( c instanceof IPrerequisite)
            {
                IPrerequisite p = (IPrerequisite)c;
                preq = p.getPrerequisites();
               
            }
            
            
            System.out.printf("%15s %15s %15s\n", c.getCourseName(), c.getCourseNumber(), preq);
            
        }
        
    }
}
