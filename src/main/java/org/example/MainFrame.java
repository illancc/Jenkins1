import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Mi Aplicación Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("¡Hola, mundo desde Swing!", SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
