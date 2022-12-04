import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class AddList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtContent;
	private JTextField textField_3;
	private JButton btnAddItem;
	private JButton btnCnacel;
	private JButton btnDone;
	public static boolean nestedSubSection = false;
	public static boolean nestedSection = false;
	private List Itemslist = (List) ElementFactory.createList();
	public static JavaCode javacode = null;
	private JTextField txtRightArrow;
	private JTextField txtLeftArrow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddList frame = new AddList();
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
	public AddList() 
	{
		initcomponents();
		createevents();

	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Content: *");
		lblNewLabel.setBounds(10, 70, 82, 14);
		contentPane.add(lblNewLabel);
		
		txtContent = new JTextField();
		txtContent.setBounds(102, 67, 322, 20);
		contentPane.add(txtContent);
		txtContent.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Note:\r\nYou can add multiple items. just type in item Content field and click \"Add Item\"");
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 440, 48);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();

		textField_3.setText("Add Java Code");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_3.setBackground(SystemColor.activeCaption);
		textField_3.setBounds(10, 131, 101, 33);
		contentPane.add(textField_3);
		
		btnAddItem = new JButton("Add Item");

		btnAddItem.setBounds(189, 263, 89, 23);
		contentPane.add(btnAddItem);
		
		btnCnacel = new JButton("Cnacel");

		btnCnacel.setBounds(10, 263, 89, 23);
		contentPane.add(btnCnacel);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(361, 263, 89, 23);
		contentPane.add(btnDone);
		
		txtRightArrow = new JTextField();

		txtRightArrow.setText("Right Arrow");
		txtRightArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtRightArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRightArrow.setEditable(false);
		txtRightArrow.setColumns(10);
		txtRightArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtRightArrow.setBackground(SystemColor.activeCaption);
		txtRightArrow.setBounds(136, 131, 101, 33);
		contentPane.add(txtRightArrow);
		
		txtLeftArrow = new JTextField();

		txtLeftArrow.setText("Left Arrow");
		txtLeftArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeftArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtLeftArrow.setEditable(false);
		txtLeftArrow.setColumns(10);
		txtLeftArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLeftArrow.setBackground(SystemColor.activeCaption);
		txtLeftArrow.setBounds(269, 131, 101, 33);
		contentPane.add(txtLeftArrow);
		
	}

	private void createevents() 
	{
		
		txtLeftArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtContent.setText(txtContent.getText()+" $\\Leftarrow$ ");
			}
		});
		
		txtRightArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtContent.setText(txtContent.getText()+" $\\Rightarrow$ ");
			}
		});
		
		btnCnacel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					nestedSection = false;
					nestedSubSection = false;
					javacode = null;
					dispose();
				}
			}
		});
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(Itemslist.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"No Items have been added to the list");
				}
				else
				{
					if(nestedSection)
					{
						AddSection.sectionElements.add(Itemslist);
						nestedSection = false;
						JOptionPane.showMessageDialog(null,"List added");
						dispose();
					}
					else if(nestedSubSection)
					{
						AddSubsection.subSectionElements.add(Itemslist);
						nestedSubSection = false;
						JOptionPane.showMessageDialog(null,"List added");
						dispose();
					}
					else
					{
						Home.document.addItem(Itemslist);
						JOptionPane.showMessageDialog(null,"List added");
						dispose();
					}
				}
			}
		});
		
		
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddJavaCode aj = new AddJavaCode();
				AddJavaCode.nestedList = true;
				aj.setVisible(true);
			}
		});
		
		
		
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(txtContent.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill the required field(s)");
				}
				else
				{
					if(javacode == null)
					{
						ListItem li = (ListItem) ElementFactory.createListItem(txtContent.getText());
						Itemslist.addItem(li);
					}
					else
					{
						ListItem li = new ListItem(txtContent.getText());
						li.addElement(new JavaCode(javacode.getCaption(),javacode.getCode()));
						Itemslist.addItem(li);
						javacode = null;
					}
					txtContent.setText("");
				}
			}
		});
	}

}
