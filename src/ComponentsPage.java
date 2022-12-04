import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComponentsPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAddSection;
	private JTextField txtAddList;
	private JTextField txtAddJavaCode;
	private JTextField txtAddPath;
	private JTextField txtAddLink;
	private JButton btnback;
	private JButton btnNext;
	private JTextArea textArea;
	private JButton btnRefresh;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnNewRadioButton;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_3;
	private JRadioButton rdbtnNewRadioButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsPage frame = new ComponentsPage();
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
	public ComponentsPage() 
	{
		setResizable(false);
		
		initcomponents();
		createevents();
		try {
			Finish.writeCode(textArea);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setTitle("Add Components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Finish");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(18, 197, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		lblNewLabel_1 = new JLabel("|");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(28, 179, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("Add Components");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(18, 149, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		lblNewLabel = new JLabel("|");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 128, 46, 14);
		contentPane.add(lblNewLabel);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Title");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(18, 98, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_3 = new JLabel("|");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(28, 77, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Home");
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_3.setBounds(18, 47, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		txtAddSection = new JTextField();
		txtAddSection.setEditable(false);

		txtAddSection.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddSection.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddSection.setText("Add Section");
		txtAddSection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddSection.setBackground(SystemColor.activeCaption);
		txtAddSection.setBounds(170, 11, 101, 33);
		contentPane.add(txtAddSection);
		txtAddSection.setColumns(10);
		
		txtAddList = new JTextField();

		txtAddList.setEditable(false);
		txtAddList.setText("Add List");
		txtAddList.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddList.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddList.setColumns(10);
		txtAddList.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddList.setBackground(SystemColor.activeCaption);
		txtAddList.setBounds(170, 55, 101, 33);
		contentPane.add(txtAddList);
		
		txtAddJavaCode = new JTextField();
	
		txtAddJavaCode.setEditable(false);
		txtAddJavaCode.setText("Add Java Code");
		txtAddJavaCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddJavaCode.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddJavaCode.setColumns(10);
		txtAddJavaCode.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddJavaCode.setBackground(SystemColor.activeCaption);
		txtAddJavaCode.setBounds(170, 99, 101, 33);
		contentPane.add(txtAddJavaCode);
		
		txtAddPath = new JTextField();
	
		txtAddPath.setEditable(false);
		txtAddPath.setText("Add Path");
		txtAddPath.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddPath.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddPath.setColumns(10);
		txtAddPath.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddPath.setBackground(SystemColor.activeCaption);
		txtAddPath.setBounds(170, 143, 101, 33);
		contentPane.add(txtAddPath);
		
		txtAddLink = new JTextField();

		txtAddLink.setEditable(false);
		txtAddLink.setText("Add Hyper Text");
		txtAddLink.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddLink.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddLink.setColumns(10);
		txtAddLink.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddLink.setBackground(SystemColor.activeCaption);
		txtAddLink.setBounds(170, 191, 101, 33);
		contentPane.add(txtAddLink);
		
		btnback = new JButton("Back");


		btnback.setBounds(299, 301, 89, 23);
		contentPane.add(btnback);
		
		btnNext = new JButton("Next");

		btnNext.setBounds(631, 301, 89, 23);
		contentPane.add(btnNext);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(299, 35, 421, 255);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Your Code so far:- (click \"Refresh\" to see recent changes)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(299, 11, 421, 14);
		contentPane.add(lblNewLabel_2);
		
		btnRefresh = new JButton("Refresh");

		btnRefresh.setBounds(463, 301, 89, 23);
		contentPane.add(btnRefresh);
		
	}

	private void createevents() 
	{
		
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textArea.setEditable(true);
				try {
					Finish.writeCode(textArea);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textArea.setEditable(false);
			}
		});
		
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Complete PDF making?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					Finish f;
					try {
						f = new Finish();
						f.setVisible(true);
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		txtAddLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddHyperText aht = new AddHyperText();
				aht.setVisible(true);
			}
		});
		
		txtAddPath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddPath ap = new AddPath();
				ap.setVisible(true);
			}
		});
		
		
		txtAddJavaCode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddJavaCode ajc = new AddJavaCode();
				ajc.setVisible(true);
			}
		});
		
		txtAddList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				AddList al = new AddList();
				al.setVisible(true);
			}
		});
		
		txtAddSection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddSection as = new AddSection();
				as.setVisible(true);
			}
		});
		
		
		
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				TitlePage tp = new TitlePage();
				tp.setVisible(true);
				dispose();
			}
		});
		
	}
}
