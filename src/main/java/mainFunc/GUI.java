package main.java.mainFunc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.BorderFactory;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.GridLayout;

public class GUI
{
    private JFrame frame;
    private JButton homeButton;
    private JButton preSelectPlaceButton;
    private JButton configButton;
    private JButton exitButton;
    private Checkbox preselectedCheckbox; 


    public GUI()
        {
        frame = new JFrame();


        homeButton = new JButton("Home");
        homeButton.setBounds(0, 0, 80, 30);
        frame.add(homeButton);
            
        preSelectPlaceButton = new JButton("Plan");
        preSelectPlaceButton.setBounds(80, 0, 80, 30);
        frame.add(preSelectPlaceButton);

        configButton = new JButton("Config");
        configButton.setBounds(160, 0, 80, 30);
        frame.add(configButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(240, 0, 80, 30);
        frame.add(exitButton);

       
        
        
        preselectedCheckbox = new Checkbox("pre-selected");
        preselectedCheckbox.setBounds(120, 130, 80, 30);
        frame.add(preselectedCheckbox);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(140, 160, 80, 160));
        panel.setLayout(new GridLayout());

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MOMacro!!");
        frame.pack();
        frame.setVisible(true);
        }
}
