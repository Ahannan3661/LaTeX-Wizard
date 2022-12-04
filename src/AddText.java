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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AddText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtText;
	private JButton btnCancel;
	private JButton btnDone;
	private JTextField txtRightArrow;
	private JTextField txtLeftArrow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddText frame = new AddText();
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
	public AddText()
	{
		initcomponents();
		createevents();

	}

	private void initcomponents() {
		setResizable(false);
		setTitle("Text");
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Text : *");
		lblNewLabel.setBounds(10, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtText = new JTextField();
		txtText.setBounds(66, 24, 358, 20);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		btnDone = new JButton("Done");

		btnDone.setBounds(335, 156, 89, 23);
		contentPane.add(btnDone);
		
		btnCancel = new JButton("Cancel");

		btnCancel.setBounds(10, 156, 89, 23);
		contentPane.add(btnCancel);
		
		txtRightArrow = new JTextField();
		txtRightArrow.setText("Right Arrow");
		txtRightArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtRightArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRightArrow.setEditable(false);
		txtRightArrow.setColumns(10);
		txtRightArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtRightArrow.setBackground(SystemColor.activeCaption);
		txtRightArrow.setBounds(99, 67, 101, 33);
		contentPane.add(txtRightArrow);
		
		txtLeftArrow = new JTextField();
		txtLeftArrow.setText("Left Arrow");
		txtLeftArrow.setHorizontalAlignment(SwingConstants.CENTER);
		txtLeftArrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtLeftArrow.setEditable(false);
		txtLeftArrow.setColumns(10);
		txtLeftArrow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLeftArrow.setBackground(SystemColor.activeCaption);
		txtLeftArrow.setBounds(249, 67, 101, 33);
		contentPane.add(txtLeftArrow);
		
	}

	private void createevents() {
		
		txtRightArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtText.setText(txtText.getText()+" $\\Rightarrow$ ");
			}
		});
		
		txtLeftArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtText.setText(txtText.getText()+" $\\Leftarrow$ ");
			}
		});
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtText.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill all the required Fields first");
				}
				else
				{
					AddSection.sectionElements.add(ElementFactory.createText(txtText.getText()));
					JOptionPane.showMessageDialog(null,"Text added");
					dispose();
				}
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel?", "Warning!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					dispose();
				}
			}
		});
		
	}
}
