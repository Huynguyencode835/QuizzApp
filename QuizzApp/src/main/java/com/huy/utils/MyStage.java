/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huy.utils;

import com.mycompany.quizzapp.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage instance;
    private final Stage stage;
    private static Scene scene;
    
    private MyStage(){
        stage = new Stage();
        stage.setTitle("QuizzApp");
    } 
    
    public static MyStage getInstance(){
        if(instance == null)
            instance= new MyStage();
        return instance;
    }
    
    public void showStage(String s){
        if(scene ==null)
            scene = new Scene(new FXMLLoader(App.class.getResource(s)).load());
        else
            scene.setRoot(new FXMLLoader(App.class.getResource(s)).load());
        this.stage.setScene(scene);
        this.stage.show();
    }         
}
