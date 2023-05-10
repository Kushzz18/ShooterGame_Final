package FirstGame;

import javax.swing.JFrame;

public class Game {
    public Game() {
    }
    public static void main() {
        JFrame window = new JFrame("Shooting Game");
        window.setDefaultCloseOperation(3);
        window.pack();
        window.setContentPane(new GamePanel());
        window.setResizable(false);
        window.setVisible(true);
        window.pack();
    }
}
