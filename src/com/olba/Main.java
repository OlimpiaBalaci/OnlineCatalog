package com.olba;

import com.olba.constants.Constants;
import com.olba.model.Student;
import com.olba.db.DatabaseWrapper;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //for student
        Student student = new Student(1, "Olimpia", "Balaci", "olimpia.balaci@gmail.com", "11/06/1982",
                "0728478802", "9B", "2019"
        );
        //String str = student.showStudent();
        //System.out.println(str);

        DatabaseWrapper databaseWrapper = new DatabaseWrapper();
        try {
            databaseWrapper.createConnection("jdbc:mysql://localhost:3306/onlinecatalog","root","maxim11forever"
                    /*Constants.DB_DRIVER_IMPLEMENTATION + "://" + Constants.DB_CONN_STRING,
                    Constants.DB_USERNAME,
                    Constants.DB_PASSWORD*/

            );
            System.out.println("Connected succesfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
