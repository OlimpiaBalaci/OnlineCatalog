package com.olba;
import com.olba.controller.Controller;
import com.olba.model.Student;
import com.olba.repository.StudentRepository;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/main.fxml"));

        primaryStage.setTitle("Demo Java FX"); // title of window
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);

        controller = fxmlLoader.getController();

        //without lambda
//        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//                                           @Override
//                                           public void handle(WindowEvent event) {
//
//                                           }
//                                       });
        primaryStage.setOnCloseRequest(event -> {
        });

        primaryStage.show(); // show the actual window
    }
    private static void stageLoader(){

    }
}
