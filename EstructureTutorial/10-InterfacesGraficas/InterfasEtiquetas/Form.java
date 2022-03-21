import javax.swing.*;

public class Form extends JFrame{

  private JLabel label1;
  private JLabel label2;

  public Form(){
    setLayout(null);
    label1 = new JLabel("Interfaz Gráfica.");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2 = new JLabel("Versión 1.0");
    label2.setBounds(20,100,100,20);
    add(label2);
  }

  public static void main(String args[]){
    Form formulario1 = new Form();
    formulario1.setBounds(0,0,300,200);
    formulario1.setResizable(false);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}
