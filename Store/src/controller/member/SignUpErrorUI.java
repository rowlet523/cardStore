package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpErrorUI frame = new SignUpErrorUI();
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
	public SignUpErrorUI() {
		setTitle("註冊失敗");
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
		
		JLabel timeLabel = new JLabel("");
		timeLabel.setBounds(318, 18, 119, 27);
		toppanel.add(timeLabel);
		
		/*Timer timer=new Timer(1000,new ActionListener() {
				  public void actionPerformed(ActionEvent e) {
					timeLabel.setText(Tool.clock());
					}
			});*/
		Timer timer = new Timer(1000, e -> timeLabel.setText(Tool.clock()));
		
		JLabel signLabel = new JLabel("註冊失敗");
		signLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		signLabel.setForeground(new Color(0, 0, 0));
		signLabel.setBounds(187, 190, 84, 31);
		contentPane.add(signLabel);
		
		JLabel backSignLabel = new JLabel("<html><a href=''>重新註冊</a></html>");
		backSignLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUpUI signui=new SignUpUI();
				signui.setVisible(true);
				dispose();
			}
		});
		backSignLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		backSignLabel.setBounds(187, 296, 84, 31);
		contentPane.add(backSignLabel);
		timer.start();
		timer.start();
	}
}
