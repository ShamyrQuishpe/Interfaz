import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener{
    private JTextField campo_usuario;
    private JPasswordField campo_contrasena;
    private JButton boton1;

    public Login(){
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));

        JLabel etiqueta_usuario = new JLabel("Usuario:");
        campo_usuario = new JTextField();

        JLabel etiqueta_constrasena = new JLabel("Contraseña:");
        campo_contrasena = new JPasswordField();

        boton1 = new JButton("Iniciar sesión");
        boton1.addActionListener(this);

        add(etiqueta_usuario);
        add(campo_usuario);
        add(etiqueta_constrasena);
        add(campo_contrasena);
        add(new JLabel());
        add(boton1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String usuario = campo_usuario.getText();
        char[] contrasena = campo_contrasena.getPassword();

        if(usuario.equals("shamyr") && String.valueOf(contrasena).equals("shamyr123")){
          JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso");
        }else{
            JOptionPane.showMessageDialog(this, "Inicio de sesion fallido");
        }

    }
    public static void main (String[] args){
        SwingUtilities.invokeLater(() -> new Login());
    }
}
