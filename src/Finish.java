import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Finish extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnFinish;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finish frame = new Finish();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Finish() throws IOException 
	{
		setResizable(false);
		
		initcomponents();
		createevents();
		writeCode(textArea_1);
	}

	public static void writeCode(JTextArea textArea) throws IOException 
	{
		Home.document.writeCode();
		String res = "";
		try {
		      File myObj = new File("LatexCode.tex");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        res += myReader.nextLine()+"\n";
		      }
		      textArea.setEditable(true);
		      textArea.setText(res);
		      textArea.setEditable(false);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	private void initcomponents() 
	{
		Image img = new ImageIcon(this.getClass().getResource("/Icon.png")).getImage();
		setIconImage(img);
		setTitle("Finish");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 31, 395, 297);
		contentPane.add(scrollPane);
		
		textArea_1 = new JTextArea();
		textArea_1.setText("");
		textArea_1.setEditable(false);
		scrollPane.setViewportView(textArea_1);
		
		btnFinish = new JButton("Finish");

		btnFinish.setBounds(454, 339, 89, 23);
		contentPane.add(btnFinish);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Finish");
		rdbtnNewRadioButton_2_1.setSelected(true);
		rdbtnNewRadioButton_2_1.setEnabled(false);
		rdbtnNewRadioButton_2_1.setBounds(6, 183, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("|");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(16, 165, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Add Components");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(6, 135, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(16, 114, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Title");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(6, 84, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("|");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(16, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Home");
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(6, 33, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("Here is your final LaTex Code:-");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(148, 11, 395, 14);
		contentPane.add(lblNewLabel_2);
		
	}

	private void createevents() 
	{

		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Home.document = null;
				dispose();
			}
		});
	}
}
