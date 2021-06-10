package gui.table;
import javax.swing.*;

public class runtablepertama {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored){
        }
        JFrame jFrame = new JFrame("URUTKAN");
        jFrame.setContentPane(new tablepertama().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(350, 300);
        jFrame.setVisible(true);
    }
}