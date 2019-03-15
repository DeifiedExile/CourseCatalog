/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.ArrayList;
import java.util.List;


public class CourseDriver {

    /*
    Using an abstract class to build upon is useful as it allows me to create methods that are common to 
    all subclasses and enforce their contents. This is useful as it prevents 
    modification of those methods that may break other parts of the code.
    
    Using the Liskov Substitution Principle is useful as it allows me to store
    objects in one place, be it a list or otherwise, based on their
    parent class.
    
    */
    
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>();
        
        courses.add(new IntroToProgrammingCourse("Intro", "101"));
        courses.add(new IntroJavaCourse("IntroJava1", "102"));
        courses.add(new AdvancedJavaCourse("AdvJava", "201"));
        System.out.println("Course Name         Course Number");
        for(Course c : courses)
        {
            System.out.printf("%-20s%10s\n", c.getCourseName(), c.getCourseNumber());
        }
    }
}
