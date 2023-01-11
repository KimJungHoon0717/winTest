package winTest;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WInEx extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WInEx frame = new WInEx();
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
	public WInEx() {//생성자
		setTitle("첫번째프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton cilck = new JButton("클릭");
		cilck.setBounds(151, 10, 57, 23);
		cilck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stName = tfName.getText();	
				lblNewLabel.setText(stName + "안뇽?");
				setTitle(stName + "김정훈의 첫 번째 프로그램");
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(cilck);
		
		lblNewLabel = new JLabel("김정훈");
		lblNewLabel.setBounds(110, 116, 164, 69);
		contentPane.add(lblNewLabel);
		
		TextField tfName = new TextField();
		tfName.setText("반갑소?");
		tfName.setBounds(70, 62, 93, 23);
		contentPane.add(tfName);
		
		
	}
}
