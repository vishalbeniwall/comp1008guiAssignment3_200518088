package com.example.ben11;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Random;
public class HelloController
{
    @FXML
    private Button Button;
    @FXML
    private Label Colour;
    @FXML
    private Label Label;
    @FXML
    private Label Name;
    @FXML
    private Pane box1;
    @FXML
    private Pane box2;
    @FXML
    private Pane box3;
    @FXML
    private Pane box4;
    @FXML
    private Pane box5;
    @FXML
    private Pane box6;
    @FXML
    private Pane box7;
    @FXML
    private Pane box8;
    @FXML
    private Pane box9;
    @FXML
    private TextField boxx1;
    @FXML
    private TextField boxx2;
    @FXML
    private TextField boxx3;
    @FXML
    private TextField boxx4;
    @FXML
    private TextField boxx5;
    @FXML
    private TextField boxx6;
    @FXML
    private TextField boxx7;
    @FXML
    private TextField boxx8;
    @FXML
    private TextField boxx9;
    @FXML
    private ColorPicker colour;
    @FXML
    private TextField name;
    @FXML
    private Label err;
    @FXML
    void onButtonClick(ActionEvent event)
    {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("box1");
        lists.add("box2");
        lists.add("box3");
        lists.add("box4");
        lists.add("box5");
        lists.add("box6");
        lists.add("box7");
        lists.add("box8");
        lists.add("box9");



        err.setText("");

        System.out.println("ADD STUDENT");

        String receivedStudentName = name.getText();
        Color colorset = colour.getValue();
        if(receivedStudentName.equals("")){
            err.setText("ENTER STUDENT NAME");
        }
        else if(receivedStudentName.length() < 6){
            err.setText("NAME SHOULD NOT BE LESS THAN 6 CHARACTERS");
        }
        else{

            Random random = new Random();
            int rand = random.nextInt(0,9);
            System.out.println(rand);
            if(lists.get(rand).equals("box1") && boxx1.getText().isEmpty()){
                boxx1.setText(receivedStudentName);
                box1.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat Fixed");
                // lists.remove(rand);
            }
            else if(boxx1.getText() != ("")  && lists.get(rand).equals("box1")){
                err.setText("SEAT ALREADY CHOSEN");
            }



            else if(lists.get(rand).equals("box2") && boxx2.getText().isEmpty()){
                boxx2.setText(receivedStudentName);
                box2.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat Fixed");

            }
            else if(boxx2.getText() != ("")  && lists.get(rand).equals("box2")){
                err.setText("SEAT ALREADY CHOSEN");
}

            if(lists.get(rand).equals("box3") && boxx1.getText().isEmpty()){
                boxx3.setText(receivedStudentName);
                box3.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat Fixed");
                // lists.remove(rand);
            }
            else if(boxx3.getText() != ("")  && lists.get(rand).equals("box3")){
                err.setText("SEAT ALREADY CHOSEN");
            }



            else if(lists.get(rand).equals("box4") && boxx4.getText().isEmpty()){
                boxx4.setText(receivedStudentName);
                box4.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat Fixed");

            }
            else if(boxx4.getText() != ("")  && lists.get(rand).equals("box4")){
                err.setText("SEAT ALREADY CHOSEN");
            }

            if(lists.get(rand).equals("box5") && boxx1.getText().isEmpty()){
                boxx5.setText(receivedStudentName);
                box5.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat fixed");
                // lists.remove(rand);
            }
            else if(boxx5.getText() != ("")  && lists.get(rand).equals("box5")){
                err.setText("SEAT ALREADY CHOSEN");
            }



            else if(lists.get(rand).equals("box6") && boxx6.getText().isEmpty()){
                boxx6.setText(receivedStudentName);
                box6.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat Fixed");

            }
            else if(boxx6.getText() != ("")  && lists.get(rand).equals("box6")){
                err.setText("SEAT ALREADY CHOSEN");
            }

            if(lists.get(rand).equals("box7") && boxx7.getText().isEmpty()){
                boxx7.setText(receivedStudentName);
                box7.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat fixed");
                // lists.remove(rand);
            }
            else if(boxx7.getText() != ("")  && lists.get(rand).equals("box7")){
                err.setText("SEAT ALREADY CHOSEN");
            }



            else if(lists.get(rand).equals("box8") && boxx8.getText().isEmpty()){
                boxx8.setText(receivedStudentName);
                box8.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat fixed");

            }
            else if(boxx8.getText() != ("")  && lists.get(rand).equals("box8")){
                err.setText("SEAT ALREADY CHOSEN");
            }

            if(lists.get(rand).equals("box9") && boxx9.getText().isEmpty()){
                boxx9.setText(receivedStudentName);
                box9.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
                err.setText("Seat fixed");
                // lists.remove(rand);
            }
            else if(boxx9.getText() != ("")  && lists.get(rand).equals("box9")){
                err.setText("SEAT ALREADY CHOSEN");
            }
}}}



//
//     err.setText("SEAT ALREADY CHOSEN");
//             }
//
//             if(lists.get(rand).equals("box7") && boxx7.getText().isEmpty()){
//             boxx7.setText(receivedStudentName);
//             box7.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
//             err.setText("Seat fixed");
//             // lists.remove(rand);
//             }
//             else if(boxx7.getText() != ("")  && lists.get(rand).equals("box7")){
//             err.setText("SEAT ALREADY CHOSEN");
//             }
//
//
//
//             else if(lists.get(rand).equals("box8") && boxx8.getText().isEmpty()){
//             boxx8.setText(receivedStudentName);
//             box8.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
//             err.setText("Seat fixed");
//
//             }
//             else if(boxx8.getText() != ("")  && lists.get(rand).equals("box8")){
//             err.setText("SEAT ALREADY CHOSEN");
//             }
//
//             if(lists.get(rand).equals("box9") && boxx9.getText().isEmpty()){
//             boxx9.setText(receivedStudentName);
//             box9.setStyle("-fx-background-color: #" +colorset.toString().substring(2));
//             err.setText("Seat fixed");
//             // lists.remove(rand);
//             }
//             else if(boxx9.getText() != ("")  && lists.get(rand).equals("box9")){
//             err.setText("SEAT ALREADY CHOSEN");
//             }
