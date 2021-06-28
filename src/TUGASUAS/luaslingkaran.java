package TUGASUAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class luaslingkaran {
    private JPanel lingkaranpanel;
    private JTextField tfJariJari;
    private JTextField tfLuas;
    private JButton keluarButton;
    private JButton hitungButton;
    private JButton batalButton;

    public luaslingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat variabel
                double jariJari, Luas;
                double phi = 3.14;
                //mengambil inputan dari user
                jariJari = Double.parseDouble(tfJariJari.getText());
                //melakukan operasi aritmatika pada data yang telah diterima
                Luas = phi * (jariJari * jariJari);
                //menampilkan hasil
                tfLuas.setText(String.valueOf(Luas));

            }

        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            tfJariJari.setText("");
            tfLuas.setText("");
            //membuat cursor kembali pada tfjarijari
            tfJariJari.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("luaslingkaran");
        frame.setContentPane(new luaslingkaran().lingkaranpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
