package controller.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import service.impl.PorderServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PorderManagerUI extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextField;
	private JTextField pikachutextField;
	private JTextField mewtextField;
	private JTextField rowlettextField;
	private JTextField gengartextField;
	private JTextField snorlaxtextField;
	private JTextField deleteidtextField;
	private static PorderServiceImpl porderserviceimpl=new PorderServiceImpl();
	private void printOutput(JTextArea output) {
	    try {
	        output.print();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderManagerUI frame = new PorderManagerUI();
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
	public PorderManagerUI() {
		setTitle("訂單管理");
		setSize(528,629);
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
		panel.setBounds(10, 96, 437, 227);
		panel.setBackground(new Color(173, 216, 230));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 417, 163);
		panel.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 333, 437, 147);
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(158, 10, 36, 25);
		panel_1.add(lblNewLabel_1);
		
		idtextField = new JTextField();
		idtextField.setBounds(189, 10, 79, 21);
		panel_1.add(idtextField);
		idtextField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("皮卡丘:");
		lblNewLabel_1_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 38, 67, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("夢  幻:");
		lblNewLabel_1_2.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 70, 67, 25);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("木木梟:");
		lblNewLabel_1_3.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 104, 67, 25);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("耿  鬼:");
		lblNewLabel_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(211, 38, 67, 25);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("卡比獸:");
		lblNewLabel_1_1_2.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(211, 70, 67, 25);
		panel_1.add(lblNewLabel_1_1_2);
		
		pikachutextField = new JTextField();
		pikachutextField.setColumns(10);
		pikachutextField.setBounds(83, 38, 79, 21);
		panel_1.add(pikachutextField);
		
		mewtextField = new JTextField();
		mewtextField.setColumns(10);
		mewtextField.setBounds(83, 70, 79, 21);
		panel_1.add(mewtextField);
		
		rowlettextField = new JTextField();
		rowlettextField.setColumns(10);
		rowlettextField.setBounds(83, 105, 79, 21);
		panel_1.add(rowlettextField);
		
		gengartextField = new JTextField();
		gengartextField.setColumns(10);
		gengartextField.setBounds(284, 38, 79, 21);
		panel_1.add(gengartextField);
		
		snorlaxtextField = new JTextField();
		snorlaxtextField.setColumns(10);
		snorlaxtextField.setBounds(284, 70, 79, 21);
		panel_1.add(snorlaxtextField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 490, 437, 45);
		panel_2.setBackground(new Color(173, 216, 230));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("ID:");
		lblNewLabel_1_4.setFont(new Font("新宋体", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(10, 10, 36, 25);
		panel_2.add(lblNewLabel_1_4);
		
		deleteidtextField = new JTextField();
		deleteidtextField.setColumns(10);
		deleteidtextField.setBounds(41, 10, 79, 21);
		panel_2.add(deleteidtextField);
		
		JButton outputButton = new JButton("查詢");
		outputButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				output.setText(porderserviceimpl.AllPorder());
			}
		});
		outputButton.setFont(new Font("新宋体", Font.BOLD, 18));
		outputButton.setBounds(31, 183, 153, 23);
		panel.add(outputButton);
		
		JButton printButton = new JButton("列印");
		printButton.addMouseListener(new MouseAdapter() {
			 @Override
			    public void mouseClicked(MouseEvent e) {
			        printOutput(output);
			    }
			});
		printButton.setFont(new Font("新宋体", Font.BOLD, 18));
		printButton.setBounds(251, 183, 153, 23);
		panel.add(printButton);
		
		JButton updateButton = new JButton("修改");
		updateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id=Integer.parseInt(idtextField.getText());
				int pikachu=Integer.parseInt(pikachutextField.getText());
				int mew=Integer.parseInt(mewtextField.getText());
				int rowlet=Integer.parseInt(rowlettextField.getText());
				int gengar=Integer.parseInt(gengartextField.getText());
				int snorlax=Integer.parseInt(snorlaxtextField.getText());
				
				porderserviceimpl.updatePorder(pikachu, mew, rowlet, gengar, snorlax, id);
			}
		});
		updateButton.setFont(new Font("新宋体", Font.BOLD, 18));
		updateButton.setBounds(211, 107, 153, 23);
		panel_1.add(updateButton);
		
		JButton btnNewButton_1_1 = new JButton("刪除");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id=Integer.parseInt(deleteidtextField.getText());
				
				porderserviceimpl.deletePorderById(id);
			}
		});
		btnNewButton_1_1.setFont(new Font("新宋体", Font.BOLD, 18));
		btnNewButton_1_1.setBounds(211, 13, 153, 23);
		panel_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html><a href=''>回訂單主頁</a></html>");
		lblNewLabel_2.setBounds(168, 545, 103, 37);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.goToPorderMain();
				dispose();
			}
		});
		lblNewLabel_2.setFont(new Font("新宋体", Font.BOLD, 18));
		contentPane.add(lblNewLabel_2);
		timer.start();
		
	}
}
