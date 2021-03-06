/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;


public abstract class Course {
    String courseName;
    protected String courseNumber;
    protected double credits;
    protected String prerequisites;

    public Course() {
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites)
    {
        if (prerequisites == null || prerequisites.length() == 0) {
            this.prerequisites = "None";
        }
        this.prerequisites = prerequisites;
    }

    public final void setCredits(double credits)
    {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber)
    {
        this.courseNumber = courseNumber;
    }
    public final double getCredits()
    {
        return this.credits;
    }

}
