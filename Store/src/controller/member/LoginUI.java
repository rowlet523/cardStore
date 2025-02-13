package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import model.Member;
import service.impl.MemberServiceImpl;
import util.Tool;
public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFormattedTextField usernameTextField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setTitle("會員登入");
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
		
		JLabel toplabel = new JLabel("TCG STORE");
		toplabel.setForeground(new Color(0, 0, 0));
		toplabel.setFont(new Font("Engravers MT", Font.BOLD | Font.ITALIC, 15));
		toplabel.setBounds(10, 0, 137, 45);
		toppanel.add(toplabel);
		
		JLabel timeLabel = new JLabel("");
		timeLabel.setBounds(318, 18, 119, 27);
		toppanel.add(timeLabel);
		
		/*Timer timer=new Timer(1000,new ActionListener() {
				  public void actionPerformed(ActionEvent e) {
					timeLabel.setText(Tool.clock());
					}
			});*/
		Timer timer = new Timer(1000, e -> timeLabel.setText(Tool.clock()));
		timer.start();
		timer.start();
		
		
		JPanel centerpanel = new JPanel();
		centerpanel.setBackground(new Color(173, 216, 230));
		centerpanel.setBounds(10, 143, 437, 265);
		contentPane.add(centerpanel);
		centerpanel.setLayout(null);
		
		JPanel usernamepanel = new JPanel();
		usernamepanel.setBackground(new Color(173, 216, 230));
		usernamepanel.setBounds(47, 50, 345, 51);
		centerpanel.add(usernamepanel);
		usernamepanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("帳號:");
		usernameLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		usernameLabel.setBounds(10, 10, 56, 31);
		usernamepanel.add(usernameLabel);
		
		usernameTextField = new JFormattedTextField();
		usernameTextField.setBounds(71, 10, 244, 28);
		usernamepanel.add(usernameTextField);
		
		JPanel passwordpanel = new JPanel();
		passwordpanel.setBackground(new Color(173, 216, 230));
		passwordpanel.setBounds(47, 125, 345, 51);
		centerpanel.add(passwordpanel);
		passwordpanel.setLayout(null);
		
		JLabel passwordLabel = new JLabel("密碼:");
		passwordLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		passwordLabel.setBounds(10, 10, 56, 31);
		passwordpanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 10, 244, 28);
		passwordpanel.add(passwordField);
		
		JLabel loginLabel = new JLabel("<html><a href=''>登入</a></html>");
		loginLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userName=usernameTextField.getText();
				String passWord=passwordField.getText();
				Member member=new MemberServiceImpl().Login(userName, passWord);
				if(member!=null) {
					Tool.saveMember(member,"member.txt");
					LoginSuccessUI loginsuccessui=new LoginSuccessUI();
					loginsuccessui.setVisible(true);
					dispose();
				}
				else
				{
					LoginErrorUI loginerrorui=new LoginErrorUI();
					loginerrorui.setVisible(true);
					dispose();
				}
				
			}
		});
		loginLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		loginLabel.setBounds(318, 210, 47, 31);
		centerpanel.add(loginLabel);
		
		JLabel loginLabel_1 = new JLabel("<html><a href=''>註冊</a></html>");
		loginLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUpUI signupui=new SignUpUI();
				signupui.setVisible(true);
				dispose();
			}
		});
		loginLabel_1.setFont(new Font("新宋体", Font.BOLD, 18));
		loginLabel_1.setBounds(118, 210, 47, 31);
		centerpanel.add(loginLabel_1);
	}
}
