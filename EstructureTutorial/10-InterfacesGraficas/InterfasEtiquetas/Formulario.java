import javax.swing.*;

public class Formulario extends JFrame{
    private JLabel label1;

    public Formulario(){
    setLayout(null);
    label1 = new JLabel("ThomShadEx Pro Formulario");
    label1.setBounds(10,20,200,300);
    add(label1);
    }
    public static void main(String args[]){
	Formulario formulario1 = new Formulario();
	formulario1.setBounds(0,0,400,300);
	// el sigiente método es para determinar si la interfaz se vea o no.
	formulario1.setVisible(true);
	//Esto es para que la interfaz aparezca en el centro de la pantalla.
	formulario1.setLocationRelativeTo(null);
    }
}
