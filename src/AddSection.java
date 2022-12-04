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

public class AddSection extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtAddHyperText;
	private JTextField txtAddSubsection;
	private JButton btnDone;
	private JButton btnCancel;
	public static ArrayList<Element> sectionElements = new ArrayList<Element>();
	private JLabel lblDescription;
	private JTextField txtDescription;
	private JTextField txtAddTextAfter;
	private JTextField txtRightArrow;
	private JTextField txtLeftArrow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSection frame = new AddSection();
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
	public AddSection() 
	{

		initcomponents();
		createevents();

	}

	private void initcomponents()
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Section");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(113, 24, 311, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Section Name:*");
		lblNewLabel.setBounds(10, 27, 93, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();

		textField_1.setEditable(false);
		textField_1.setText("Add List");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_1.setBackground(SystemColor.activeCaption);
		textField_1.setBounds(10, 146, 101, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();

		textField_2.setEditable(false);
		textField_2.setText("Add Java Code");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setBackground(SystemColor.activeCaption);
		textField_2.setBounds(146, 146, 101, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		
		textField_3.setEditable(false);
		textField_3.setText("Add Path");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_3.setBackground(SystemColor.activeCaption);
		textField_3.setBounds(10, 203, 101, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();

		textField_4.setEditable(false);
		textField_4.setText("Add Space");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_4.setBackground(SystemColor.activeCaption);
		textField_4.setBounds(146, 203, 101, 33);
		contentPane.add(textField_4);
		
		txtAddHyperText = new JTextField();

		txtAddHyperText.setEditable(false);
		txtAddHyperText.setText("Add Hyper Text");
		txtAddHyperText.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddHyperText.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddHyperText.setColumns(10);
		txtAddHyperText.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddHyperText.setBackground(SystemColor.activeCaption);
		txtAddHyperText.setBounds(296, 203, 101, 33);
		contentPane.add(txtAddHyperText);
		
		txtAddSubsection = new JTextField();

		txtAddSubsection.setEditable(false);
		txtAddSubsection.setText("Add SubSection");
		txtAddSubsection.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddSubsection.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddSubsection.setColumns(10);
		txtAddSubsection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddSubsection.setBackground(SystemColor.activeCaption);
		txtAddSubsection.setBounds(296, 146, 101, 33);
		contentPane.add(txtAddSubsection);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(335, 320, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");
	
		btnCancel.setBounds(10, 320, 89, 23);
		contentPane.add(btnCancel);
		
		lblDescription = new JLabel("Description:");
		lblDescription.setBounds(10, 78, 93, 14);
		contentPane.add(lblDescription);
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		txtDescription.setBounds(113, 75, 311, 20);
		contentPane.add(txtDescription);
		
		txtAddTextAfter = new JTextField();

		txtAddTextAfter.setText("Add Text After");
		txtAddTextAfter.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddTextAfter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtAddTextAfter.setEditable(false);
		txtAddTextAfter.setColumns(10);
		txtAddTextAfter.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddTextAfter.setBackground(SystemColor.activeCaption);
		txtAddTextAfter.setBounds(10, 250, 101, 33);
		contentPane.add(txtAddTextAfter);
		
		txtRightArrow = new JTextField();

		txtRightArrow.setText("Right Arrow");
		txtRightArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtRightArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRightArrow.setEditable(false);
		txtRightArrow.setColumns(10);
		txtRightArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtRightArrow.setBackground(SystemColor.activeCaption);
		txtRightArrow.setBounds(146, 250, 101, 33);
		contentPane.add(txtRightArrow);
		
		txtLeftArrow = new JTextField();

		txtLeftArrow.setText("Left Arrow");
		txtLeftArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeftArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtLeftArrow.setEditable(false);
		txtLeftArrow.setColumns(10);
		txtLeftArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLeftArrow.setBackground(SystemColor.activeCaption);
		txtLeftArrow.setBounds(296, 250, 101, 33);
		contentPane.add(txtLeftArrow);
		
	}

	private void createevents() 
	{
		
		txtAddTextAfter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddText at = new AddText();
				at.setVisible(true);
			}
		});
		
		
		txtAddHyperText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddHyperText aht = new AddHyperText();
				AddHyperText.nestedSection = true;
				aht.setVisible(true);
			}
		});
		
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddSpace as  = new AddSpace();
				AddSpace.nestedSection = true;
				as.setVisible(true);
			}
		});
		
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddPath ap = new AddPath();
				AddPath.nestedSection = true;
				ap.setVisible(true);
			}
		});
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					sectionElements.clear();
					dispose();
				}
			}
		});
		
		
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddJavaCode.nestedSection = true;
				AddJavaCode aj = new AddJavaCode();
				aj.setVisible(true);
			}
		});
		
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
		
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				AddList.nestedSection = true;
				AddList al = new AddList();
				al.setVisible(true);
			}
		});
		
		
		
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(txtName.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Section Name is required");
				}
				else
				{
					Home.document.addItem(ElementFactory.createSection(txtName.getText(),txtDescription.getText(),false));
					Home.document.addAll(sectionElements);
					sectionElements.clear();
					JOptionPane.showMessageDialog(null,"Section added");
					dispose();
				}
				
			}
		});
		
		txtAddSubsection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddSubsection as1 = new AddSubsection();
				//AddSubsection.nestedSection = true;
				as1.setVisible(true); 
			}
		});
		
		
	}
}
