import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.time.LocalDate;


public class TitlePage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTitle;
	private JTextField txtsubTitle;
	private JTextField txtDate;
	private JTextField txtAuthor;
	private JButton btnNext;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitlePage frame = new TitlePage();
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
	public TitlePage() 
	{
		setResizable(false);
		
		initcomponents();
		createevents();
		checkDocument();

	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setTitle("Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnBack = new JButton("Back");

		btnBack.setBounds(149, 227, 89, 23);
		contentPane.add(btnBack);
		
		btnNext = new JButton("Next");


		btnNext.setBounds(335, 227, 89, 23);
		contentPane.add(btnNext);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(237, 11, 187, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Title: *");
		lblNewLabel_2.setBounds(149, 14, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sub Title: *");
		lblNewLabel_2_1.setBounds(149, 45, 78, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtsubTitle = new JTextField();
		txtsubTitle.setColumns(10);
		txtsubTitle.setBounds(237, 42, 187, 20);
		contentPane.add(txtsubTitle);
		
		JLabel lblNewLabel_2_2 = new JLabel("Date: *");
		lblNewLabel_2_2.setBounds(149, 73, 78, 14);
		contentPane.add(lblNewLabel_2_2);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(237, 70, 187, 20);
		contentPane.add(txtDate);
		
		JLabel lblNewLabel_2_3 = new JLabel("Author Name :*");
		lblNewLabel_2_3.setBounds(149, 138, 78, 14);
		contentPane.add(lblNewLabel_2_3);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(237, 135, 187, 20);
		contentPane.add(txtAuthor);
		
		JLabel lblNewLabel_3 = new JLabel("(yyyy-MM-dd  - format)");
		lblNewLabel_3.setBounds(237, 98, 187, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Finish");
		rdbtnNewRadioButton_2_1.setEnabled(false);
		rdbtnNewRadioButton_2_1.setBounds(18, 175, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("|");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(28, 154, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Add Components");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(18, 127, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(28, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Title");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(18, 76, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("|");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Home");
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(18, 25, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
	}

	private void createevents() 
	{
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(txtTitle.getText().equals("") || txtAuthor.getText().equals("") || txtDate.getText().equals("") || txtsubTitle.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill all the required fields first");
				}
				else
				{
					try
					{
						LocalDate  date = LocalDate.parse(txtDate.getText());
						Title title = (Title) ElementFactory.createTitle(txtTitle.getText(),txtsubTitle.getText(),txtAuthor.getText(),date); 
						Home.document.setTitle(title);
						ComponentsPage cp = new ComponentsPage();
						cp.setVisible(true);
						dispose();
					}catch(Exception E)
					{
						JOptionPane.showMessageDialog(null,"Date format not matched");
					}

				}
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		
	}
	public void checkDocument()
	{
		if(!(Home.document.titleIsNull()))
		{
			Title title = Home.document.getTitle();
			txtTitle.setText(title.getTitle());
			txtsubTitle.setText(title.getSubTitle());
			txtDate.setText(title.getdate()+"");
			txtAuthor.setText(title.getAuthor());
		}
	}
}
