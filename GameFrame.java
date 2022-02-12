import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){
        GamePanel panel = new GamePanel();

        this.add(panel);
        this.setTitle("Snake Game");
        ImageIcon image = new ImageIcon("snake.png");
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    
}
