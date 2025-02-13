package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginErrorUI frame = new LoginErrorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginErrorUI() {
		setTitle("登入失敗");
		setSize(1023,855);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toppanel = new JPanel();
		toppanel.setBounds(10, 10, 437, 45);
		toppanel.setBackground(new Color(70, 130, 180));
		toppanel.setForeground(new Color(255, 255, 255));
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TCG STORE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 0, 137, 45);
		toppanel.add(lblNewLabel);
		
		JPanel centerpanel = new JPanel();
		centerpanel.setBounds(20, 65, 427, 337);
		centerpanel.setBackground(new Color(173, 216, 230));
		contentPane.add(centerpanel);
		centerpanel.setLayout(null);
		
		JLabel errorLabel = new JLabel("登入失敗");
		errorLabel.setForeground(new Color(0, 0, 0));
		errorLabel.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel.setBounds(155, 52, 114, 52);
		centerpanel.add(errorLabel);
		
		JLabel errorLabel_1 = new JLabel("登入失敗");
		errorLabel_1.setForeground(Color.BLACK);
		errorLabel_1.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_1.setBounds(114, 155, 114, 52);
		centerpanel.add(errorLabel_1);
		
		JLabel errorLabel_2 = new JLabel("登入失敗");
		errorLabel_2.setForeground(Color.BLACK);
		errorLabel_2.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_2.setBounds(248, 135, 114, 52);
		centerpanel.add(errorLabel_2);
		
		JLabel errorLabel_3 = new JLabel("登入失敗");
		errorLabel_3.setForeground(Color.BLACK);
		errorLabel_3.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_3.setBounds(51, 96, 114, 52);
		centerpanel.add(errorLabel_3);
		
		JLabel errorLabel_4 = new JLabel("登入失敗");
		errorLabel_4.setForeground(Color.BLACK);
		errorLabel_4.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_4.setBounds(287, 10, 114, 52);
		centerpanel.add(errorLabel_4);
		
		JLabel errorLabel_5 = new JLabel("登入失敗");
		errorLabel_5.setForeground(Color.BLACK);
		errorLabel_5.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_5.setBounds(33, 34, 114, 52);
		centerpanel.add(errorLabel_5);
		
		JLabel errorLabel_6 = new JLabel("登入失敗");
		errorLabel_6.setForeground(Color.BLACK);
		errorLabel_6.setFont(new Font("新宋体", Font.BOLD, 21));
		errorLabel_6.setBounds(270, 74, 114, 52);
		centerpanel.add(errorLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("<html><a href=''>重新登入</a></html>");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI loginui=new LoginUI();
				loginui.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(268, 240, 76, 31);
		centerpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html><a href=''>註冊</a></html>");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUpUI signupui=new SignUpUI();
				signupui.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_2.setBounds(73, 240, 62, 31);
		centerpanel.add(lblNewLabel_2);
	}
}
