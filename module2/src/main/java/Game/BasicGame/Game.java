package Game.BasicGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener {

    private int characterX = 250;
    private int characterY = 480;
    private int obstacleX = 100;
    private int obstacleY = 0;
    private boolean gameover = false;
    private int score = 0;

    public Game() {
        JFrame frame = new JFrame("Game");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.add(this);
        frame.setVisible(true);

        while (!gameover) {
            update();
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!gameover) {
            g.setColor(Color.BLUE);
            g.fillRect(characterX, characterY, 20, 20);

            g.setColor(Color.RED);
            g.fillRect(obstacleX, obstacleY, 20, 20);

            g.setColor(Color.BLACK);
            g.drawString("Score: " + score, 10, 20);
        } else {
            g.setColor(Color.BLACK);
            g.drawString("Game Over!", 250, 250);
        }
    }

    public void update() {
        obstacleY += 5;
        if (obstacleY > 600) {
            obstacleY = 0;
            obstacleX = (int) (Math.random() * 560);
            score++;
        }

        if (characterX < obstacleX + 20 && characterX + 20 > obstacleX &&
                characterY < obstacleY + 20 && characterY + 20 > obstacleY) {
            gameover = true;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            characterX -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            characterX += 5;
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
