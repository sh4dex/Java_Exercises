import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  JButton button1;
  public Formulario(){
    setLayout(null);
    button1 = new JButton("Close");
    button1.setBounds(300,250,100,30);
    add(button1);
    button1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Formulario form1 = new Formulario();
    form1.setBounds(0,0,450,350);
    form1.setVisible(true);
    form1.setResizable(false);
    form1.setLocationRelativeTo(null);
  }
}
