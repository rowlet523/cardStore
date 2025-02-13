package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.porder.PorderMainUI;
import model.Member;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private static Member member=(Member)Tool.read("member.txt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessUI frame = new LoginSuccessUI();
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
	public LoginSuccessUI() {
		setTitle("登入成功");
		setSize(1023,855);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toppanel = new JPanel();
		toppanel.setBackground(new Color(70, 130, 180));
		toppanel.setForeground(new Color(255, 255, 255));
		toppanel.setBounds(10, 10, 437, 45);
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TCG STORE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 0, 137, 45);
		toppanel.add(lblNewLabel);
		
		JLabel successLabel = new JLabel("登入成功");
		successLabel.setFont(new Font("新宋体", Font.BOLD, 24));
		successLabel.setBounds(118, 194, 108, 38);
		contentPane.add(successLabel);
		
		JLabel showLabel = new JLabel("");
		showLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		showLabel.setBounds(236, 201, 128, 29);
		contentPane.add(showLabel);
		
		showLabel.setText(member.getMemberName());
		
		JLabel lblNewLabel_1 = new JLabel("<html><a href=''>進入購物</a></html>");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PorderMainUI porderui=new PorderMainUI();
				porderui.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(188, 292, 86, 29);
		contentPane.add(lblNewLabel_1);
	}
}
