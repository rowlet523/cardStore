package controller.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import model.Member;
import model.Porder;
import service.impl.PorderServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PorderAddUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ptextField;
	private JTextField mtextField;
	private JTextField rtextField;
	private JTextField gtextField;
	private JTextField ktextField;
	private static Member member=(Member)Tool.read("member.txt");
	private static PorderServiceImpl porderserviceimpl=new PorderServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderAddUI frame = new PorderAddUI();
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
	public PorderAddUI() {
		setTitle("新增訂單");
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(34, 65, 388, 452);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pNewLabel = new JLabel("皮卡丘 V");
		pNewLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		pNewLabel.setBounds(98, 10, 79, 33);
		panel.add(pNewLabel);
		
		JLabel mNewLabel = new JLabel("夢 幻EX");
		mNewLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		mNewLabel.setBounds(287, 10, 79, 33);
		panel.add(mNewLabel);
		
		JLabel rNewLabel = new JLabel("木木梟");
		rNewLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		rNewLabel.setBounds(98, 128, 79, 33);
		panel.add(rNewLabel);
		
		JLabel gNewLabel = new JLabel("耿 鬼 V");
		gNewLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		gNewLabel.setBounds(287, 128, 79, 33);
		panel.add(gNewLabel);
		
		JLabel kNewLabel = new JLabel("卡比獸");
		kNewLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		kNewLabel.setBounds(98, 247, 79, 33);
		panel.add(kNewLabel);
		
		ptextField = new JTextField();
		ptextField.setBounds(98, 53, 79, 21);
		panel.add(ptextField);
		ptextField.setColumns(10);
		
		mtextField = new JTextField();
		mtextField.setColumns(10);
		mtextField.setBounds(287, 50, 79, 21);
		panel.add(mtextField);
		
		rtextField = new JTextField();
		rtextField.setColumns(10);
		rtextField.setBounds(98, 171, 79, 21);
		panel.add(rtextField);
		
		gtextField = new JTextField();
		gtextField.setColumns(10);
		gtextField.setBounds(284, 171, 79, 21);
		panel.add(gtextField);
		
		ktextField = new JTextField();
		ktextField.setColumns(10);
		ktextField.setBounds(98, 290, 79, 21);
		panel.add(ktextField);
		
		JButton okButton = new JButton("送出");
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		okButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name=member.getMemberName();
				int pikachu=Integer.parseInt(ptextField.getText());
				int mew=Integer.parseInt(mtextField.getText());
				int rowlet=Integer.parseInt(rtextField.getText());
				int gengar=Integer.parseInt(gtextField.getText());
				int snorlax=Integer.parseInt(ktextField.getText());
				
				Porder porder=new Porder(name,pikachu,mew,rowlet,gengar,snorlax);
				porderserviceimpl.addPoder(porder);
			}
		});
		okButton.setFont(new Font("新宋体", Font.BOLD, 18));
		okButton.setBounds(151, 409, 96, 33);
		panel.add(okButton);

		ImageIcon pikachuIcon = new ImageIcon(PorderAddUI.class.getResource("/images/pikachu.PNG"));
		Image pikachuImg = pikachuIcon.getImage().getScaledInstance(60, 80, Image.SCALE_SMOOTH); 
		ImageIcon resizedIcon1 = new ImageIcon(pikachuImg);
		
		ImageIcon mewIcon = new ImageIcon(PorderAddUI.class.getResource("/images/mew.PNG"));
		Image mewImg = mewIcon.getImage().getScaledInstance(60, 80, Image.SCALE_SMOOTH); 
		ImageIcon resizedIcon2 = new ImageIcon(mewImg);
		
		ImageIcon rowletIcon = new ImageIcon(PorderAddUI.class.getResource("/images/rowlet.PNG"));
		Image rowletImg = rowletIcon.getImage().getScaledInstance(60, 80, Image.SCALE_SMOOTH); 
		ImageIcon resizedIcon3 = new ImageIcon(rowletImg);
		
		ImageIcon gengarIcon = new ImageIcon(PorderAddUI.class.getResource("/images/gengar.PNG"));
		Image gengarImg = gengarIcon.getImage().getScaledInstance(60, 80, Image.SCALE_SMOOTH); 
		ImageIcon resizedIcon4 = new ImageIcon(gengarImg);
		
		ImageIcon snorlaxIcon = new ImageIcon(PorderAddUI.class.getResource("/images/snorlax.PNG"));
		Image snorlaxImg = snorlaxIcon.getImage().getScaledInstance(60, 80, Image.SCALE_SMOOTH); 
		ImageIcon resizedIcon5 = new ImageIcon(snorlaxImg);

		JLabel pikachuImage = new JLabel();
		pikachuImage.setIcon(resizedIcon1);
		pikachuImage.setBounds(28, 10, 60, 80); // 
		panel.add(pikachuImage);
		
		JLabel mewImage = new JLabel();
		mewImage.setIcon(resizedIcon2);
		mewImage.setBounds(217, 10, 60, 80); // 
		panel.add(mewImage);
		
		JLabel rowletImage = new JLabel();
		rowletImage.setIcon(resizedIcon3);
		rowletImage.setBounds(28, 128, 60, 80); // 
		panel.add(rowletImage);
		
		JLabel gengarImage = new JLabel();
		gengarImage.setIcon(resizedIcon4);
		gengarImage.setBounds(217, 128, 60, 80); // 
		panel.add(gengarImage);
		
		JLabel snorlaxImage = new JLabel();
		snorlaxImage.setIcon(resizedIcon5);
		snorlaxImage.setBounds(28, 247, 60, 80); // 
		panel.add(snorlaxImage);
		
		pikachuImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		mewImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		rowletImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		gengarImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		snorlaxImage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 

		
	

		
		JLabel lblNewLabel_2 = new JLabel("<html><a href=''>回訂單主頁</a></html>");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tool.goToPorderMain();
				dispose();
			}
		});
		lblNewLabel_2.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_2.setBounds(188, 545, 103, 37);
		contentPane.add(lblNewLabel_2);
		timer.start();
		timer.start();
	}
}
