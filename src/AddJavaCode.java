import java.awt.EventQueue;
import java.awt.Image;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddJavaCode extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCaption;
	private JButton btnDone;
	private JButton btnCancel;
	public static boolean nestedList = false;
	public static boolean nestedSection = false;
	public static boolean nestedSubSection = false;
	private JTextArea txtCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddJavaCode frame = new AddJavaCode();
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
	public AddJavaCode() 
	{
		
		initcomponents();
		createevents();

	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Java Code");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caption: *");
		lblNewLabel.setBounds(10, 11, 68, 14);
		contentPane.add(lblNewLabel);
		
		txtCaption = new JTextField();
		txtCaption.setBounds(88, 8, 336, 20);
		contentPane.add(txtCaption);
		txtCaption.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Code: *");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCode = new JTextArea();
		txtCode.setBounds(88, 62, 336, 148);
		contentPane.add(txtCode);
		
		btnDone = new JButton("Done");
		btnDone.setBounds(335, 227, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");

		btnCancel.setBounds(10, 227, 89, 23);
		contentPane.add(btnCancel);
	}

	private void createevents() 
	{
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{				
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
				   nestedList = false;
				   nestedSection = false;
				   nestedSubSection = false;
				   dispose();
				}
			}
		});
		
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(txtCaption.getText().equals("") || txtCode.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill the required fields first");
				}
				else
				{
					JavaCode jc = (JavaCode) ElementFactory.createJavaCode(txtCaption.getText(),txtCode.getText());
					if(nestedList)
					{
						AddList.javacode = jc;
						nestedList = false;
						JOptionPane.showMessageDialog(null,"Java Code added");
						dispose();
					}
					else if(nestedSection)
					{
						AddSection.sectionElements.add(jc);
						nestedSection = false;
						JOptionPane.showMessageDialog(null,"Java Code added");
						dispose();
					}
					else if(nestedSubSection)
					{
						AddSubsection.subSectionElements.add(jc);
						nestedSubSection = false;
						JOptionPane.showMessageDialog(null,"Java Code added");
						dispose();
					}
					else
					{
						Home.document.addItem(jc);
						JOptionPane.showMessageDialog(null,"Java Code added");
						dispose();
					}
				}

			}
		});
		
	}
}
