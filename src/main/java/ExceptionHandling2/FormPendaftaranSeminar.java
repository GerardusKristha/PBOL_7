package ExceptionHandling2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class FormPendaftaranSeminar extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X = 150;
    private static final int FRAME_Y = 250;
    private static final int MARGIN_LEFT = 20;
    private static final int MARGIN_TOP = 10;
    private JLabel labelNoInduk, labelNama, labelStatus;
    private JTextField textFieldNoInduk, textFieldNama;
    private JButton buttonSimpan;
    private JComboBox<String> comboBox;

    public static void main(String[] args) {
        new FormPendaftaranSeminar();
    }

    public FormPendaftaranSeminar() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Pendaftaran Seminar");
        setLocation(FRAME_X, FRAME_Y);

        labelNoInduk = new JLabel("No Induk : ");
        labelNoInduk.setBounds(MARGIN_LEFT, MARGIN_TOP, 100, 30);
        contentPane.add(labelNoInduk);

        textFieldNoInduk = new JTextField();
        textFieldNoInduk.setBounds(MARGIN_LEFT + 100, MARGIN_TOP, FRAME_WIDTH - 150, 30);
        contentPane.add(textFieldNoInduk);

        labelNama = new JLabel("Nama :");
        labelNama.setBounds(MARGIN_LEFT, MARGIN_TOP + 40, 100, 30);
        contentPane.add(labelNama);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(MARGIN_LEFT + 100, MARGIN_TOP + 40, FRAME_WIDTH - 150, 30);
        contentPane.add(textFieldNama);

        labelStatus = new JLabel("Status :");
        labelStatus.setBounds(MARGIN_LEFT, MARGIN_TOP + (2 * 40), 100, 30);
        contentPane.add(labelStatus);

        String[] choices = {"Mahasiswa", "Dosen"};
        comboBox = new JComboBox<String>(choices);
        comboBox.setBounds(MARGIN_LEFT + 100, MARGIN_TOP + (2 * 40), FRAME_WIDTH - 150, 30);
        contentPane.add(comboBox);

        buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(MARGIN_LEFT + 100, MARGIN_TOP + 120, 100, 30);
        contentPane.add(buttonSimpan);
        buttonSimpan.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (comboBox.getSelectedItem().equals("Mahasiswa")) {

                if (textFieldNoInduk.getText().length() != 9) {
                    throw new Exception("Maaf, format NIM anda salah");
                }
                int nim = Integer.parseInt(textFieldNoInduk.getText().substring(0, 2));
                if (nim > 13) {
                    throw new Exception("Hanya untuk mahasiswa angkatan 2013 dan sebelumnya");
                }
            }
            JOptionPane.showMessageDialog(null, "Terimakasih anda sudah mendaftar seminar","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
