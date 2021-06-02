package gui;

import javax.swing.*;

public class RunFormMahasiswa {
    public static void main(String[] args) {
        JFrame jframe = new JFrame ("Form Mahasiswa") ;
        jframe.setContentPane(new FormMahasiswa().getRootPanel());
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
