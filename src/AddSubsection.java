import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class AddSubsection extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//public static boolean nestedSection =  false;
	private JTextField txtName;
	private JTextField txtDescription;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtAddHyperText;
	private JButton btnDone;
	private JButton btnCancel;
	public  static ArrayList<Element> subSectionElements = new ArrayList<Element>();
	private JTextField txtRightArrow;
	private JTextField txtLeftArrow;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubsection frame = new AddSubsection();
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
	public AddSubsection() 
	{
		
		initcomponents();
		createevents();

	}

	private void initcomponents()
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Sub-Section");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(10, 65, 112, 14);
		contentPane.add(lblDescription);
		
		JLabel lblSubsectionName = new JLabel("Sub-Section Name:*");
		lblSubsectionName.setBounds(10, 14, 112, 14);
		contentPane.add(lblSubsectionName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(132, 11, 292, 20);
		contentPane.add(txtName);
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		txtDescription.setBounds(132, 62, 292, 20);
		contentPane.add(txtDescription);
		
		textField_2 = new JTextField();

		textField_2.setText("Add List");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setBackground(SystemColor.activeCaption);
		textField_2.setBounds(10, 133, 101, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();

		textField_3.setText("Add Java Code");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_3.setBackground(SystemColor.activeCaption);
		textField_3.setBounds(146, 133, 101, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();

		textField_4.setText("Add Path");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_4.setBackground(SystemColor.activeCaption);
		textField_4.setBounds(10, 190, 101, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
	
		textField_5.setText("Add Space");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_5.setBackground(SystemColor.activeCaption);
		textField_5.setBounds(146, 190, 101, 33);
		contentPane.add(textField_5);
		
		txtAddHyperText = new JTextField();

		txtAddHyperText.setText("Add Hyper Text");
		txtAddHyperText.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddHyperText.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddHyperText.setEditable(false);
		txtAddHyperText.setColumns(10);
		txtAddHyperText.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddHyperText.setBackground(SystemColor.activeCaption);
		txtAddHyperText.setBounds(292, 133, 101, 33);
		contentPane.add(txtAddHyperText);
		
		btnCancel = new JButton("Cancel");

		btnCancel.setBounds(10, 307, 89, 23);
		contentPane.add(btnCancel);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(335, 307, 89, 23);
		contentPane.add(btnDone);
		
		txtRightArrow = new JTextField();

		txtRightArrow.setText("Right Arrow");
		txtRightArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtRightArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRightArrow.setEditable(false);
		txtRightArrow.setColumns(10);
		txtRightArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtRightArrow.setBackground(SystemColor.activeCaption);
		txtRightArrow.setBounds(292, 190, 101, 33);
		contentPane.add(txtRightArrow);
		
		txtLeftArrow = new JTextField();
		txtLeftArrow.setText("Left Arrow");
		txtLeftArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeftArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtLeftArrow.setEditable(false);
		txtLeftArrow.setColumns(10);
		txtLeftArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLeftArrow.setBackground(SystemColor.activeCaption);
		txtLeftArrow.setBounds(10, 246, 101, 33);
		contentPane.add(txtLeftArrow);
		
	}

	private void createevents()
	{
		
		txtRightArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtDescription.setText(txtDescription.getText()+" $\\Rightarrow$ ");
			}
		});
		
		txtLeftArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtDescription.setText(txtDescription.getText()+" $\\Leftarrow$ ");
			}
		});
		
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddSpace as = new AddSpace();
				AddSpace.nestedSubSection = true;
				as.setVisible(true);	
			}
		});
		
		
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddPath ap = new AddPath();
				AddPath.nestedSubSection = true;
				ap.setVisible(true);
			}
		});
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					//nestedSection = false;
					subSectionElements.clear();
					dispose();
				}
			}
		});
		
		txtAddHyperText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddHyperText ajc = new AddHyperText();
				AddHyperText.nestedSubSection = true;
				ajc.setVisible(true);
			}
		});
		
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddJavaCode ajc = new AddJavaCode();
				AddJavaCode.nestedSubSection = true;
				ajc.setVisible(true);
			}
		});
		
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddList al = new AddList();
				AddList.nestedSubSection = true;
				al.setVisible(true);
			}
		});
		
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtName.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Sub-Section Name is required");
				}
				else
				{
					//if(nestedSection)
					//{
						AddSection.sectionElements.add(ElementFactory.createSection(txtName.getText(),txtDescription.getText(),true));
						AddSection.sectionElements.addAll(subSectionElements);
						//nestedSection = false;
						subSectionElements.clear();
						JOptionPane.showMessageDialog(null,"Sub-Section added");
						dispose();
					//}
//					else
//					{
//						Home.document.addItem(ElementFactory.createSection(txtName.getText(),txtDescription.getText(),true));
//						Home.document.addAll(subSectionElements);
//						subSectionElements.clear();
//						dispose();
//					}

				}
				
			}
		});
		
	}

}
