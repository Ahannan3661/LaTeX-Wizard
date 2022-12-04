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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddPath extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPath;
	private JButton btnDone;
	private JButton btnCancel;
	public static boolean nestedSection = false;
	public static boolean nestedSubSection = false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPath frame = new AddPath();
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
	public AddPath() 
	{

		initcomponents();
		createevents();

	}
	
	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Path");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Path Here: *");
		lblNewLabel.setBounds(10, 11, 128, 14);
		contentPane.add(lblNewLabel);
		
		txtPath = new JTextField();
		txtPath.setBounds(148, 8, 276, 20);
		contentPane.add(txtPath);
		txtPath.setColumns(10);
		
		btnDone = new JButton("Done");
		
		btnDone.setBounds(335, 82, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");

		btnCancel.setBounds(10, 82, 89, 23);
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
					nestedSection = false;
					nestedSubSection = false;
					dispose();
				}
			}
		});
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtPath.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill all the required Fields First");
				}
				else
				{
					if(nestedSection)
					{
						AddSection.sectionElements.add(ElementFactory.createPath(txtPath.getText()));
						nestedSection = false;
						JOptionPane.showMessageDialog(null,"Path added");
						dispose();
					}
					else if(nestedSubSection)
					{
						AddSubsection.subSectionElements.add(ElementFactory.createPath(txtPath.getText()));
						nestedSubSection = false;
						JOptionPane.showMessageDialog(null,"Path added");
						dispose();
					}
					else
					{
						Home.document.addItem(ElementFactory.createPath(txtPath.getText()));
						JOptionPane.showMessageDialog(null,"Path added");
						dispose();
					}
				}
			}
		});
		
	}



}
