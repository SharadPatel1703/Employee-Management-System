package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame implements ActionListener {
    JButton add, view, rem;
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading  = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        img.add(add);

        view = new JButton("View Employee");
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.setBounds(565,270,150,40);
        view.addActionListener(this);
        img.add(view);

        rem = new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setBackground(Color.BLACK);
        rem.setForeground(Color.WHITE);
        rem.addActionListener(this);
        img.add(rem);

        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
          if (e.getSource() == add){
              new AddEmployee();
              setVisible(false);
          } else if (e.getSource() == rem) {
              new RemoveEmployee();
              setVisible(false);
          } else if (e.getSource() == view) {
              new View_Employee();
              setVisible(false);
          }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
