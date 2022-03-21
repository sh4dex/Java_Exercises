import javax.swing.*;

public class Formulario1 extends JFrame{

 public Formulario1(){
   setLayout(null);
 }

 public static void main(String args[]){
   Formulario1 form1 = new Formulario1();
   form1.setBounds(0,0,400,550);
   form1.setVisible(true);
   form1.setLocationRelativeTo(null);
   form1.setResizable(false);
 }
}
