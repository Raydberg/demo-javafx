package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label nameLabel;

    @FXML
    void displayName(String name) {
        nameLabel.setText("Hello: " + name);
    }
}
