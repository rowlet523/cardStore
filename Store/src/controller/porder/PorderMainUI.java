package controller.porder;

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

public class PorderMainUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderMainUI frame = new PorderMainUI();
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
	public PorderMainUI() {
		setTitle("購物頁");
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
		panel.setBounds(53, 146, 351, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel addLabel = new JLabel("<html><a href=''>新增訂單</a></html>");
		addLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PorderAddUI porderaddui=new PorderAddUI();
				porderaddui.setVisible(true);
				dispose();
			}
		});
		addLabel.setFont(new Font("新宋体", Font.BOLD, 18));
		addLabel.setBounds(48, 101, 81, 42);
		panel.add(addLabel);
		
		JLabel Label = new JLabel("<html><a href=''>訂單管理</a></html>");
		Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PorderManagerUI pordermanagerui=new PorderManagerUI();
				pordermanagerui.setVisible(true);
				dispose();
			}
		});
		Label.setFont(new Font("新宋体", Font.BOLD, 18));
		Label.setBounds(221, 101, 81, 42);
		panel.add(Label);
		timer.start();
		timer.start();
	}
}
