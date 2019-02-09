import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Level1 extends JPanel {

//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(new Color(255, 0, 0));
//        g.fillRect(0,0, Main.mainFrame.getWidth(), Main.mainFrame.getHeight());
//    } Для заднего фона

    Level1() {
        super();
        Main.mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(null);
        Main.mainFrame.setFocusable(true);

        Enemy enemy[] = new Enemy[10];
        for(int i = 0; i < 10; i++) {
            enemy[i] = new Enemy(1, 50, 50);
            enemy[i].setBounds(i * 70, 20, 50, 50);
            this.add(enemy[i]);
        }

        enemy[0].moveEnemy(enemy, 10);

        Player player = new Player(3, 100, 200);
        this.add(player);

        Main.mainFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.setLocation(player.getX() + 10, player.getY());
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.setLocation(player.getX() - 10, player.getY());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }
}