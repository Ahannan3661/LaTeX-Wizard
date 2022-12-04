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

public class AddHyperText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtText;
	private JTextField txtLink;
	private JButton btnCancle;
	private JButton btnDone;
	
	public static boolean nestedSection = false;
	public static boolean nestedSubSection = false;
	private JLabel lblNewLabel_2;
	private JTextField txtDesc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddHyperText frame = new AddHyperText();
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
	public AddHyperText() {

		initcomponents();
		createevents();
		
	}

	private void initcomponents()
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setResizable(false);
		setTitle("Hyper Text");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Text :*");
		lblNewLabel.setBounds(10, 11, 79, 14);
		contentPane.add(lblNewLabel);
		
		txtText = new JTextField();
		txtText.setBounds(99, 8, 325, 20);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Link : *");
		lblNewLabel_1.setBounds(10, 55, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		txtLink = new JTextField();
		txtLink.setBounds(99, 52, 325, 20);
		contentPane.add(txtLink);
		txtLink.setColumns(10);
		
		btnCancle = new JButton("Cancel");

		btnCancle.setBounds(10, 130, 89, 23);
		contentPane.add(btnCancle);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(335, 130, 89, 23);
		contentPane.add(btnDone);
		
		lblNewLabel_2 = new JLabel("Descripton: *");
		lblNewLabel_2.setBounds(10, 93, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(99, 90, 325, 20);
		contentPane.add(txtDesc);
		txtDesc.setColumns(10);
		
	}

	private void createevents() 
	{
		
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					nestedSection =  false;
					nestedSubSection = false;
					dispose();
				}
			}
		});
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtText.getText().equals("") || txtLink.getText().equals("") || txtDesc.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill all the required Fields First");
				}
				else
				{
					HyperText hp = (HyperText) ElementFactory.createHyperText(txtText.getText(), txtLink.getText(),txtDesc.getText());
					if(nestedSection)
					{
						AddSection.sectionElements.add(hp);
						nestedSection =  false;
						JOptionPane.showMessageDialog(null,"Hyper Text added");
						dispose();
					}
					else if(nestedSubSection)
					{
						AddSubsection.subSectionElements.add(hp);
						nestedSubSection = false;
						JOptionPane.showMessageDialog(null,"Hyper Text added");
						dispose();
					}
					else
					{
						Home.document.addItem(hp);
						JOptionPane.showMessageDialog(null,"Hyper Text added");
						dispose();
					}
					
				}
			}
		});
		
	}

}
