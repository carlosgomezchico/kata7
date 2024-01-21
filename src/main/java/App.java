
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle("Ejemplo de Aplicación");
        JButton button = new JButton("Haz clic aquí");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(App.this, "¡Hola, Mundo!");
            }
        });
        add(button);
    }
}
