package org.example;

import java.util.Iterator;
import java.util.LinkedList;

class Student1
{
    int stuId;
    String stuName;
    String stuAddress;

    Student1(int stuId, String stuName, String stuAddress)
    {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAddress = stuAddress;
    }
}
public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<Student1> st = new LinkedList<Student1>();
        Student1 s1= new Student1(101, "Rabin", "Lokanthali");
        Student1 s2= new Student1(102, "Krish", "Baneshwor");
        Student1 s3= new Student1(103, "Harry", "Shankhamul");

        st.add(s1);
        st.add(s2);
        st.add(s3);

        Iterator <Student1> itr = st.iterator();
        while (itr.hasNext()){
            Student1 student1 = itr.next();
            System.out.println("StudentId: "+student1.stuId+"   "+ "Student Name:" + student1.stuName+"   "+ "Student Address: "+student1.stuAddress);
        }

    }


}
