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

public class AddSpace extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSize;
	private JButton btnCancel;
	private JButton btnDone;
	public static boolean nestedSection = false;
	public static boolean nestedSubSection  = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSpace frame = new AddSpace();
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
	public AddSpace() {

		initcomponents();
		createevents();

	}

	private void initcomponents()
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Space");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Space Size: *");
		lblNewLabel.setBounds(10, 11, 160, 14);
		contentPane.add(lblNewLabel);
		
		txtSize = new JTextField();
		txtSize.setBounds(201, 8, 223, 20);
		contentPane.add(txtSize);
		txtSize.setColumns(10);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(335, 70, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");

		btnCancel.setBounds(10, 70, 89, 23);
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
				if(txtSize.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill all the required Fields First");
				}
				else
				{
					try
					{
						int i = Integer.parseInt(txtSize.getText());
						VSpace space = (VSpace) ElementFactory.createVSpace(i);
						if(nestedSection)
						{
							nestedSection = false;
							AddSection.sectionElements.add(space);
							JOptionPane.showMessageDialog(null,"Space added");
							dispose();
						}
						else if(nestedSubSection)
						{
							nestedSubSection = false;
							AddSubsection.subSectionElements.add(space);
							JOptionPane.showMessageDialog(null,"Space added");
							dispose();
						}
//						else
//						{
//							Home.document.addItem(space);
//							JOptionPane.showMessageDialog(null,"Space added");
//							dispose();
//						}
					}catch (Exception E)
					{
						JOptionPane.showMessageDialog(null,"Invalid Input");
					}
				}
			}
		});
		
	}
}
