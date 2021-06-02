package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa {
    private JTextField textNama;
    private JTextField textNim;
    private JButton bottonSave;
    private JPanel rootPanel;
    private JLabel hasil;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;
    private JLabel hasil8;
    private JLabel labelHasil;

    public FormMahasiswa() {
        bottonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
               hasil.setText("Nama: " + mhs.getNama());
               hasil2.setText("NIM: " + mhs.getNim());
               hasil3.setText("Jenjang Pendidikan: " + mhs.getJenjangPendidikan());
               hasil4.setText("Tahun Masuk: " + mhs.getTahunMasuk());
               hasil5.setText("Fakultas: " + mhs.getFakultas());
               hasil6.setText("Jurusan: " + mhs.getJurusan());
               hasil7.setText("Jenis Kelamin: " + mhs.getJenisKelamin());
               hasil7.setText("Nomor Urut: " + mhs.getNomorUrut());

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
