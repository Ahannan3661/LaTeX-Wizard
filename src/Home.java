import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStart;
	public static Document document = Document.getInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() 
	{
		setResizable(false);
		setTitle("Home");
		initcomponents();
		createevents();
	
	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Click the \"start\" button to start creating your own PDF =>\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(17, 254, 309, 20);
		contentPane.add(lblNewLabel_1);
		
		txtStart = new JTextField();
		txtStart.setEditable(false);

		txtStart.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtStart.setHorizontalAlignment(SwingConstants.CENTER);
		txtStart.setText("Start");
		txtStart.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtStart.setBackground(SystemColor.activeCaption);
		txtStart.setBounds(338, 253, 86, 20);
		contentPane.add(txtStart);
		txtStart.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Finish");
		rdbtnNewRadioButton_2_1.setEnabled(false);
		rdbtnNewRadioButton_2_1.setBounds(17, 168, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("|");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(27, 147, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Add Components");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(17, 120, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("|");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(27, 99, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Title");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(17, 69, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("|");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 48, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Home");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(17, 18, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(132, 11, 292, 232);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\"Pro Tips\"");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(74, 40, 131, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("- !!! All the fields with a *  are required !!!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 62, 279, 14);
		panel.add(lblNewLabel_3);
		
		JTextPane txtpnYouCanGo = new JTextPane();
		txtpnYouCanGo.setText("- You can go back and forth between pages (your changes will not be lost)");
		txtpnYouCanGo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnYouCanGo.setEditable(false);
		txtpnYouCanGo.setBackground(SystemColor.window);
		txtpnYouCanGo.setBounds(23, 87, 262, 41);
		panel.add(txtpnYouCanGo);
		
		JTextPane txtpnAfterCompletion = new JTextPane();
		txtpnAfterCompletion.setText("- After completion, your code will be displayed on screen and it will also be saved in LatexCode.tex file in project folder");
		txtpnAfterCompletion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnAfterCompletion.setEditable(false);
		txtpnAfterCompletion.setBackground(SystemColor.window);
		txtpnAfterCompletion.setBounds(23, 139, 262, 57);
		panel.add(txtpnAfterCompletion);
		
		JLabel lblNewLabel = new JLabel("\"Welcome To PDF Wizard\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(37, 1, 212, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("xx ------- xxx ------- xx");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 207, 272, 14);
		panel.add(lblNewLabel_5);
		
	}

	private void createevents() 
	{
		txtStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				TitlePage tp = new TitlePage();
				tp.setVisible(true);
				dispose();
			}
		});
		
	}
}
