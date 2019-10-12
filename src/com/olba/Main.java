package com.olba;

import com.olba.model.Student;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //for student
        Student student = new Student("Olimpia", "Balaci", "olimpia.balaci@gmail.com", "11/06/1982",
                "0728478802", "9B", "2019"
        );
        String str = student.showStudent();
        System.out.println(str);
    }
}
