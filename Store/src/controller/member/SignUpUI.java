package controller.member;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane; 

import java.util.regex.Pattern;

import model.Member;
import service.impl.MemberServiceImpl;
import util.Tool;

public class SignUpUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nametextField;
	private JTextField passwordtextField;
	private JTextField usernametextField;
	private JTextField phonetextField;
	private JTextField addresstextField;
	private JTextField emailtextField;
	
	private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "輸入錯誤", JOptionPane.ERROR_MESSAGE);
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI frame = new SignUpUI();
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
	public SignUpUI() {
		setTitle("註冊");
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
		
		JPanel namepanel = new JPanel();
		namepanel.setBackground(new Color(173, 216, 230));
		namepanel.setBounds(78, 168, 285, 32);
		contentPane.add(namepanel);
		namepanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("姓名:");
		nameLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		nameLabel.setBounds(10, 0, 53, 32);
		namepanel.add(nameLabel);
		
		nametextField = new JTextField();
		nametextField.setBounds(73, 0, 202, 32);
		namepanel.add(nametextField);
		nametextField.setColumns(10);
		
		JPanel usernamepanel = new JPanel();
		usernamepanel.setBackground(new Color(173, 216, 230));
		usernamepanel.setBounds(78, 216, 285, 32);
		contentPane.add(usernamepanel);
		usernamepanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("帳號:");
		usernameLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		usernameLabel.setBounds(10, 0, 53, 32);
		usernamepanel.add(usernameLabel);
		
		usernametextField = new JTextField();
		usernametextField.setColumns(10);
		usernametextField.setBounds(73, 0, 202, 32);
		usernamepanel.add(usernametextField);
		
		JPanel passwordpanel = new JPanel();
		passwordpanel.setBackground(new Color(173, 216, 230));
		passwordpanel.setBounds(78, 265, 285, 32);
		contentPane.add(passwordpanel);
		passwordpanel.setLayout(null);
		
		JLabel passwordLabel = new JLabel("密碼:");
		passwordLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		passwordLabel.setBounds(10, 0, 53, 32);
		passwordpanel.add(passwordLabel);
		
		passwordtextField = new JTextField();
		passwordtextField.setColumns(10);
		passwordtextField.setBounds(73, 0, 202, 32);
		passwordpanel.add(passwordtextField);
		
		JPanel phonepanel = new JPanel();
		phonepanel.setBackground(new Color(173, 216, 230));
		phonepanel.setBounds(78, 313, 285, 32);
		contentPane.add(phonepanel);
		phonepanel.setLayout(null);
		
		JLabel phoneLabel = new JLabel("電話:");
		phoneLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		phoneLabel.setBounds(10, 0, 53, 32);
		phonepanel.add(phoneLabel);
		
		phonetextField = new JTextField();
		phonetextField.setColumns(10);
		phonetextField.setBounds(73, 0, 202, 32);
		phonepanel.add(phonetextField);
		
		JPanel addresspanel = new JPanel();
		addresspanel.setBackground(new Color(173, 216, 230));
		addresspanel.setBounds(78, 361, 285, 32);
		contentPane.add(addresspanel);
		addresspanel.setLayout(null);
		
		JLabel addressLabel = new JLabel("地址:");
		addressLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		addressLabel.setBounds(10, 0, 53, 32);
		addresspanel.add(addressLabel);
		
		addresstextField = new JTextField();
		addresstextField.setColumns(10);
		addresstextField.setBounds(73, 0, 202, 32);
		addresspanel.add(addresstextField);
		
		JPanel emailpanel = new JPanel();
		emailpanel.setBackground(new Color(173, 216, 230));
		emailpanel.setBounds(78, 409, 285, 32);
		contentPane.add(emailpanel);
		emailpanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("EMAIL:");
		emailLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		emailLabel.setBounds(10, 0, 61, 32);
		emailpanel.add(emailLabel);
		
		emailtextField = new JTextField();
		emailtextField.setColumns(10);
		emailtextField.setBounds(73, 0, 202, 32);
		emailpanel.add(emailtextField);
		
		
		JLabel lblNewLabel_1 = new JLabel("<html><a href=''>送出</a></html>");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					String name=nametextField.getText().strip();
					String username=usernametextField.getText().strip();
					String password=passwordtextField.getText().strip();
					String phone=phonetextField.getText().strip();
					String address=addresstextField.getText().strip();
					String email=emailtextField.getText().strip();
					
					if(name.isEmpty()||username.isEmpty()||password.isEmpty()||phone.isEmpty()||address.isEmpty()||email.isEmpty()) {
						 showErrorDialog("所有欄位皆不可空白！");
						 return;
					}
					if(!Pattern.matches("^[a-zA-Z0-9]+$", username)) {
						showErrorDialog("密碼需包含大小寫字母且至少 6 位！");
						return;
					}
					if (!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z]).{6,}$", password)) {
			            showErrorDialog("密碼需包含大小寫字母且至少 6 位！");
			            return;
			        }

			        if (!Pattern.matches("^09[0-9]{8}$", phone)) {
			            showErrorDialog("電話格式錯誤，必須為 09 開頭的 10 碼數字！");
			            return;
			        }

			        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", email)) {
			            showErrorDialog("Email 格式錯誤！");
			            return;
			        }   
			        if(new MemberServiceImpl().isUsernameBeenUse(username)) {
			        	showErrorDialog("帳號已被使用！");
			        	return;
					}
					
					Member member=new Member(name,username,password,phone,address,email);
					new MemberServiceImpl().addMember(member);
					
					SignUpSuccessUI signupsuccessui=new SignUpSuccessUI();
					signupsuccessui.setVisible(true);
					dispose();
				
				
				
			}
		});
		
		lblNewLabel_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(206, 494, 48, 32);
		contentPane.add(lblNewLabel_1);
		timer.start();
		timer.start();
	}
	
}
