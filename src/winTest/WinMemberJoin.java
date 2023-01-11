package winTest;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinMemberJoin extends JFrame {

   private JPanel contentPane;
   private JTextField tfName;
   private JTextField tfId;
   private JTextField tfPw;
   private JTextField tfPw2;
   private JTextField tfBirth;
   private JTextField tfPhone;
   private JTextField tfEmail;
   private JButton btnDup;
   private JButton btnJoin;
   private JButton btnCancel;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinMemberJoin frame = new WinMemberJoin();
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
   public WinMemberJoin() {
      setTitle("»∏ø¯∞°¿‘√¢");
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 481, 437);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblName = new JLabel("¿Ã∏ß:");
      lblName.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblName.setBounds(43, 32, 101, 28);
      contentPane.add(lblName);
      
      tfName = new JTextField();
      tfName.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfId.requestFocus();
         }
      });
      tfName.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfName.setBounds(156, 29, 162, 31);
      contentPane.add(tfName);
      tfName.setColumns(10);
      
      tfId = new JTextField();
      tfId.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfPw.requestFocus();
         }
      });
      tfId.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfId.setColumns(10);
      tfId.setBounds(156, 70, 162, 31);
      contentPane.add(tfId);
      
      JLabel lblId = new JLabel("ID:");
      lblId.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblId.setBounds(43, 73, 101, 28);
      contentPane.add(lblId);
      
      tfPw = new JTextField();
      tfPw.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfPw2.requestFocus();
         }
      });
      tfPw.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfPw.setColumns(10);
      tfPw.setBounds(156, 111, 162, 31);
      contentPane.add(tfPw);
      
      JLabel lblPw = new JLabel("PW:");
      lblPw.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblPw.setBounds(43, 114, 101, 28);
      contentPane.add(lblPw);
      
      tfPw2 = new JTextField();
      tfPw2.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfBirth.requestFocus();
         }
      });
      tfPw2.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfPw2.setColumns(10);
      tfPw2.setBounds(156, 152, 162, 31);
      contentPane.add(tfPw2);
      
      JLabel lblPw2 = new JLabel("PW2:");
      lblPw2.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblPw2.setBounds(43, 155, 101, 28);
      contentPane.add(lblPw2);
      
      tfBirth = new JTextField();
      tfBirth.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfPhone.requestFocus();
         }
      });
      tfBirth.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfBirth.setColumns(10);
      tfBirth.setBounds(156, 193, 162, 31);
      contentPane.add(tfBirth);
      
      JLabel lblBirth = new JLabel("ª˝≥‚ø˘¿œ:");
      lblBirth.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblBirth.setBounds(43, 196, 101, 28);
      contentPane.add(lblBirth);
      
      tfPhone = new JTextField();
      tfPhone.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               tfEmail.requestFocus();
         }
      });
      tfPhone.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfPhone.setColumns(10);
      tfPhone.setBounds(156, 234, 162, 31);
      contentPane.add(tfPhone);
      
      JLabel lblPhone = new JLabel("¿¸»≠π¯»£:");
      lblPhone.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblPhone.setBounds(43, 237, 101, 28);
      contentPane.add(lblPhone);
      
      tfEmail = new JTextField();
      tfEmail.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(KeyEvent.VK_ENTER == e.getKeyCode())
               btnJoin.requestFocus();
         }
      });
      tfEmail.setFont(new Font("±º∏≤", Font.BOLD, 20));
      tfEmail.setColumns(10);
      tfEmail.setBounds(156, 275, 162, 31);
      contentPane.add(tfEmail);
      
      JLabel lblEmail = new JLabel("¿Ã∏ﬁ¿œ:");
      lblEmail.setFont(new Font("±º∏≤", Font.BOLD, 20));
      lblEmail.setBounds(43, 278, 101, 28);
      contentPane.add(lblEmail);
      
      btnDup = new JButton("¡ﬂ∫π»Æ¿Œ");
      btnDup.setFont(new Font("±º∏≤", Font.BOLD, 20));
      btnDup.setBounds(330, 70, 123, 31);
      contentPane.add(btnDup);
      
      btnJoin = new JButton("∞°¿‘");
      btnJoin.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		WinLogin winLogin =new WinLogin();
      		winLogin.setVisible(true);
      	}
      });
      btnJoin.setFont(new Font("±º∏≤", Font.BOLD, 20));
      btnJoin.setBounds(114, 341, 162, 42);
      contentPane.add(btnJoin);
      
      btnCancel = new JButton("√Îº“");
      btnCancel.setFont(new Font("±º∏≤", Font.BOLD, 20));
      btnCancel.setBounds(291, 341, 162, 42);
      contentPane.add(btnCancel);
   }

}