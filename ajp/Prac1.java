// Write a program to demonstrate the use 
// of AWT components like Label,
// Textfield, TextArea, Button, Checkbox, 
// RadioButton etc

import java.awt.*;
import java.applet.*;
public class Prac1 {
    /* <applet code = "Prac1.class" Height = 500 Width = 500></applet> */
    
    static Frame f = new Frame("Frame title");

    public static void main(String args[]) {
        f.setVisible(true);
        f.setSize(1000, 500);
        f.setLayout(new FlowLayout());
        Label l1 = new Label("Label1");
        f.add(l1);
        Button b1 = new Button("Button name");
        f.add(b1);
        TextField tf1 = new TextField(20);
        f.add(tf1);
        TextArea ta1 = new TextArea(2, 10);
        f.add(ta1);

        //This is a single Checkbox
        Checkbox cb4 = new Checkbox("Hello");
        f.add(cb4);


        //radio buttons are made using Checkbox and CheckboxGroup
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("CPP", cbg, true);
        Checkbox cb2 = new Checkbox("java", cbg, false);
        Checkbox cb3 = new Checkbox("CSS", cbg, false);
        
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        
    }
}