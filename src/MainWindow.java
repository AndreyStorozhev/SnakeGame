import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setResizable(false);
        setLocation(400, 400);
        setLocationRelativeTo(null);
        add(new GameFild());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
