package com.example.keringo;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class HelloController {
    @FXML private Label lbSpeed;
    @FXML private Slider sdSpeed;
    @FXML private Label lbRadius;
    @FXML private Slider sdRadius;

    public void initialize() {
        lbSpeed.textProperty().bind(Bindings.format("Speed: %.0f", sdSpeed.valueProperty()));
        lbRadius.textProperty().bind(Bindings.format("Radius: %.0f", sdRadius.valueProperty()));
    }

}