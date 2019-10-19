package com.olba;
import com.olba.controller.Controller;
import com.olba.model.Student;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    Controller controller;

    public static void main(String[] args) {


        Student student = new Student("Olimpia", "Balaci", "olimpia.balaci@gmail.com", null,/*"11/06/1982,"*/
                "0728478802", "9B", 2019
        );
        //String str = student.showStudent();
        //System.out.println(str);

       /* EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Connected succesfully!");

        StudentRepository studentRepository = new StudentRepository(entityManager);
        studentRepository.save(student);*/
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
            AtomicReference<FXMLLoader> fxmlLoader = new AtomicReference<>(new FXMLLoader());
            Parent root = fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/main.fxml"));

            primaryStage.setTitle("Demo Java FX"); // title of window
            primaryStage.setScene(new Scene(root, 400, 400));
            primaryStage.setMinHeight(600);
            primaryStage.setMinWidth(600);




        controller = fxmlLoader.get().getController();
        controller.mnuItemAddStudent.setOnAction(event -> {


            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_student.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window


        controller.mnuItemAddTeacher.setOnAction(event -> {


            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_teacher.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window

        controller.mnuItemAddSchedule.setOnAction(event -> {


            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_schedule.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window
        controller.mnuItemAddTeacher.setOnAction(event -> {


            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_teacher.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window
        controller.mnuItemAddParent.setOnAction(event -> {


            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/add_parent.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window

        controller.mnuItemDeleteStudent.setOnAction(event -> {
         //controller.deleteStudent(null);

            try {
                fxmlLoader.set(new FXMLLoader());
                Parent home_page_parent =   fxmlLoader.get().load(getClass().getClassLoader().getResourceAsStream("view/delete_student.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                primaryStage.hide(); //optional
                primaryStage.setScene(home_page_scene);
                primaryStage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window



    }



    private static void stageLoader(){

    }
}
