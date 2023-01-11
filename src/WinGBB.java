

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinGBB extends JFrame {

   private JPanel contentPane;
   private JLabel lblComputer;
   private JLabel lblHuman;
   private String GBB[] = {"gawi","bawi","bo"};
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinGBB frame = new WinGBB();
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
   public WinGBB() {
      setTitle("∞°¿ßπŸ¿ß∫∏ ∞‘¿”");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 464, 381);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      lblHuman = new JLabel("");
      lblHuman.setBackground(new Color(255, 255, 0));
      lblHuman.setBounds(12, 32, 154, 182);
      contentPane.add(lblHuman);
      lblHuman.setOpaque(true);
      
      lblComputer = new JLabel("");
      lblComputer.setBackground(new Color(255, 255, 0));
      lblComputer.setBounds(282, 32, 154, 182);
      contentPane.add(lblComputer);
      lblComputer.setOpaque(true);
      
      JButton btnGawi = new JButton("");      
      btnGawi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(0);
            
            showComputer(0);
         }
      });
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/gawi.jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      btnGawi.setIcon(img);
      
      btnGawi.setBounds(12, 238, 100, 100);
      contentPane.add(btnGawi);
      
      JButton btnBawi = new JButton("");
      btnBawi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(1);
            
            showComputer(1);
         }
      });
      image = new ImageIcon(WinGBB.class.getResource("/images/bawi.jpg"));
      pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      img = new ImageIcon(pic);
      btnBawi.setIcon(img);
      btnBawi.setBounds(170, 238, 100, 100);
      contentPane.add(btnBawi);
      
      JButton btnBo = new JButton("");
      btnBo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            showHuman(2);
            
            showComputer(2);
         }
      });
      image = new ImageIcon(WinGBB.class.getResource("/images/bo.jpg"));
      pic = image.getImage();
      pic = pic.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      img = new ImageIcon(pic);
      btnBo.setIcon(img);
      btnBo.setBounds(327, 238, 100, 100);
      contentPane.add(btnBo);
      
      JLabel lblHuman2 = new JLabel("Human");
      lblHuman2.setBounds(64, 7, 57, 15);
      contentPane.add(lblHuman2);
      
      JLabel lblComputer2 = new JLabel("Computer");
      lblComputer2.setBounds(327, 7, 77, 15);
      contentPane.add(lblComputer2);
   }

   protected void showHuman(int i) {
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/"+GBB[i]+".jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(154, 182, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      lblHuman.setIcon(img);
   }

   protected void showComputer(int human) {
      int computer = (int)(Math.random()*3);
      String strName = GBB[computer];
      
      System.out.println(strName);      
      ImageIcon image = new ImageIcon(WinGBB.class.getResource("/images/" + strName + ".jpg"));
      Image pic = image.getImage();
      pic = pic.getScaledInstance(154, 182, Image.SCALE_SMOOTH);
      ImageIcon img = new ImageIcon(pic);
      lblComputer.setIcon(img);      
      
      if(computer == human)
          setTitle("∫Ò±Ë");
      else if((computer+1)%3==human)
         setTitle("¿Ã±Ë");
      else
         setTitle("¡¸");
   }

}