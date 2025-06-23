package com.mycompany.quizzapp;

import com.huy.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        App.setRoot("quetions");
    }
}
