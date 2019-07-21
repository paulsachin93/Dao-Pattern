/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daopattern;

/**
 *
 * @author MRuser
 */
public class StudentImp implements StudentInterface{
    
    
    StudentImp()
    {
        Student s1=new Student("xyz",1,"noida");
        Student s2=new Student("abc",2,"delhi");
        
    }

    @Override
    public void addstudent() {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getallStudent() {
       //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
