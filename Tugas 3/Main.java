import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Cerdas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Tambahkan glue untuk mendorong panel ke tengah
        mainPanel.add(Box.createVerticalGlue());

        // Panel untuk Label LOGIN
        JPanel panelLogin = new JPanel();
        panelLogin.setOpaque(false);
        JLabel labelLogin = new JLabel("LOGIN");
        labelLogin.setFont(new Font("Arial", Font.BOLD, 32));
        labelLogin.setForeground(Color.BLUE);
        labelLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelLogin.add(labelLogin);

        // Panel isi untuk Formulir
        JPanel panelIsi = new JPanel();
        panelIsi.setLayout(new GridLayout(5, 1, 5, 8)); // Mengurangi jarak antar komponen dalam GridLayout
        panelIsi.setBorder(new EmptyBorder(5, 20, 5, 20));
        panelIsi.setMaximumSize(new Dimension(300, 150)); // Menyesuaikan ukuran panel

        // Input untuk Nama
        JLabel labelEmail = new JLabel("Email:");
        JTextField email = new JTextField();

        // Input untuk Password
        JLabel labelPassword = new JLabel("Password:");
        JPasswordField password = new JPasswordField();

        // Button Login
        JButton buttonLogin = new JButton("Login");

        // Panel untuk Register
        JPanel panelRegister = new JPanel();
        panelRegister.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));
        JLabel labelRegister = new JLabel("I don't have an account");
        JButton buttonRegister = new JButton("Register");

        // Hasil Register
        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame register = new JFrame("Register");
                register.setSize(400, 500);
                register.setLayout(new BorderLayout());

                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

                // Tambahkan glue untuk mendorong panel ke tengah
                mainPanel.add(Box.createVerticalGlue());

                // Panel untuk Label REGISTER
                JPanel panelRegister = new JPanel();
                panelRegister.setOpaque(false);
                JLabel labelRegister = new JLabel("REGISTER");
                labelRegister.setFont(new Font("Arial", Font.BOLD, 32));
                labelRegister.setForeground(Color.BLUE);
                labelRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
                panelRegister.add(labelRegister);

                // Panel isi untuk Formulir
                JPanel panelIsiRegister = new JPanel();
                panelIsiRegister.setLayout(new GridLayout(5, 1, 5, 8));
                panelIsiRegister.setBorder(new EmptyBorder(5, 20, 5, 20));
                panelIsiRegister.setMaximumSize(new Dimension(300, 150));

                // Input untuk Nama
                JLabel labelNama = new JLabel("Nama Lengkap:");
                JTextField nama = new JTextField();

                // Input untuk Email
                JLabel labelEmail = new JLabel("Email:");
                JTextField email = new JTextField();

                // Input untuk Password
                JLabel labelPassword = new JLabel("Password:");
                JPasswordField password = new JPasswordField();

                // Button Register
                JButton buttonRegister = new JButton("Register");

                // Panel untuk kembali ke Login
                JPanel panelBack = new JPanel();
                panelBack.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));
                
                JLabel labelBack = new JLabel("I have an account");
                JButton buttonBack = new JButton("Login");

                // Menambahkan action untuk kembali ke halaman login
                buttonBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        register.dispose(); // Menutup jendela register
                    }
                });

                // Menambahkan komponen ke panel isi register
                panelIsiRegister.add(labelNama);
                panelIsiRegister.add(nama);
                panelIsiRegister.add(labelEmail);
                panelIsiRegister.add(email);
                panelIsiRegister.add(labelPassword);
                panelIsiRegister.add(password);
                panelIsiRegister.add(buttonRegister);

                panelBack.add(labelBack);
                panelBack.add(buttonBack);

                // Menambahkan komponen ke mainPanel
                mainPanel.add(panelRegister);
                mainPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Mengurangi jarak vertikal antara panelRegister dan panelIsiRegister
                mainPanel.add(panelIsiRegister);
                mainPanel.add(panelBack); // Menghapus jarak tambahan antara panelIsiRegister dan panelBack

                // Tambahkan glue lagi untuk menempatkan mainPanel di tengah vertikal
                mainPanel.add(Box.createVerticalGlue());

                register.add(mainPanel, BorderLayout.CENTER);
                register.setVisible(true);
            }
        });

        // Menambahkan komponen ke panelIsi
        panelIsi.add(labelEmail);
        panelIsi.add(email);
        panelIsi.add(labelPassword);
        panelIsi.add(password);
        panelIsi.add(buttonLogin);

        // Menambahkan komponen ke panelRegister
        panelRegister.add(labelRegister);
        panelRegister.add(buttonRegister);

        // Menambahkan komponen ke mainPanel
        mainPanel.add(panelLogin);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPanel.add(panelIsi);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPanel.add(panelRegister);

        // Tambahkan glue lagi untuk menempatkan mainPanel di tengah vertikal
        mainPanel.add(Box.createVerticalGlue());

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
