/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.ArrayList;
import java.util.List;


public class CourseDriver {

    
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
