package week21.week21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample {

    public static void main(String[] args) {

        // Create main frame
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create CardLayout object
        CardLayout cardLayout = new CardLayout();

        // Main panel that uses CardLayout
        JPanel mainPanel = new JPanel(cardLayout);

        // ------------------- CARD 1 -------------------
        JPanel card1 = new JPanel();
        card1.setBackground(Color.CYAN);
        card1.add(new JLabel("This is Card 1"));

        JButton btn1 = new JButton("Go to Card 2");
        card1.add(btn1);

        // ------------------- CARD 2 -------------------
        JPanel card2 = new JPanel();
        card2.setBackground(Color.PINK);
        card2.add(new JLabel("This is Card 2"));

        JButton btn2 = new JButton("Go to Card 3");
        card2.add(btn2);

        // ------------------- CARD 3 -------------------
        JPanel card3 = new JPanel();
        card3.setBackground(Color.LIGHT_GRAY);
        card3.add(new JLabel("This is Card 3"));

        JButton btn3 = new JButton("Back to Card 1");
        card3.add(btn3);

        // Add cards to main panel with names
        mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");
        mainPanel.add(card3, "card3");

        // ------------------- BUTTON ACTIONS -------------------

        // Switch to Card 2
        btn1.addActionListener(e -> {
            cardLayout.show(mainPanel, "card2");
        });

        // Switch to Card 3
        btn2.addActionListener(e -> {
            cardLayout.show(mainPanel, "card3");
        });

        // Go back to Card 1
        btn3.addActionListener(e -> {
            cardLayout.show(mainPanel, "card1");
        });

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
