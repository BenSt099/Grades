package org.grades.controlcenter;

import org.grades.GradesApplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControlCenter implements ActionListener{

    private final JFrame mainframe;
    private final JButton b_close;

    private final JLabel l_msg;

    public ControlCenter() {

        mainframe = new JFrame("Control Center for MCTG");
        b_close = new JButton("Exit");
        l_msg = new JLabel(" Please Open Your Browser And Type: http://localhost:9000", JLabel.CENTER);

        b_close.setBounds(10,90,400,40);
        b_close.addActionListener(this);
        b_close.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b_close.setFocusable(false);
        b_close.setBackground(new Color(169, 67, 67));
        b_close.setBorderPainted(false);

        l_msg.setFocusable(false);
        l_msg.setOpaque(true);
        l_msg.setBounds(10,30,400,40);
        l_msg.setBackground(new Color(85, 184, 226));

        mainframe.setLayout(null);
        mainframe.getContentPane().setBackground(new Color(52, 102, 126));
        mainframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mainframe.setSize(450,200);
        mainframe.setResizable(false);
        mainframe.add(b_close);
        mainframe.add(l_msg);
        mainframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b_close){
            mainframe.dispose();
            GradesApplication.shutdownApplication();
        }
    }
}