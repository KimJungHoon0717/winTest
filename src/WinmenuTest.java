import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import winTest.WinBMI;
import winTest.WinLogin;
import winTest.WinMemberJoin;
import winTest.WinTemperature;

import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class WinmenuTest extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinmenuTest frame = new WinmenuTest();
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
   public WinmenuTest() {
      setTitle("±èÁ¤ÈÆÀÇ ¸Þ´º¿¬½À");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 602, 429);
      
      JMenuBar menuBar = new JMenuBar();
      menuBar.setToolTipText("\uC708\uB3C4\uC6B0 \uC5F4\uAE30");
      setJMenuBar(menuBar);
      
      JMenu mnuFile = new JMenu("File");
      mnuFile.setMnemonic('F');
      menuBar.add(mnuFile);
      
      JMenuItem mnuOpen = new JMenuItem("Open...");
      mnuOpen.setIcon(new ImageIcon(WinmenuTest.class.getResource("/winTest/images/open-folder.png")));
      mnuOpen.setMnemonic('O');
      
      mnuOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
      mnuOpen.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
         }
      });
      mnuFile.add(mnuOpen);
      
      JMenuItem mnuSave = new JMenuItem("Save...");
      mnuSave.setIcon(new ImageIcon(WinmenuTest.class.getResource("/winTest/images/diskette.png")));
      mnuSave.setMnemonic('S');
      mnuSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
      mnuSave.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(null);
         }
      });
      mnuFile.add(mnuSave);
      
      mnuFile.addSeparator();  // ±¸ºÐ¼± Ãß°¡
      
      JMenuItem mnuExit = new JMenuItem("Exit");
      mnuExit.setIcon(new ImageIcon(WinmenuTest.class.getResource("/winTest/images/logout.png")));
      mnuExit.setMnemonic('x');
      mnuExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
      mnuExit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("´ÝÈû");
            System.exit(EXIT_ON_CLOSE);
         }         
      });
      mnuFile.add(mnuExit);
      
      JMenu mnuEdit = new JMenu("Edit");
      menuBar.add(mnuEdit);
      
      JMenuItem mnuUndo = new JMenuItem("Undo");
      mnuEdit.add(mnuUndo);
      
      JMenuItem mnuRedo = new JMenuItem("Redo");
      mnuEdit.add(mnuRedo);
      
      mnuEdit.addSeparator(); // ±¸ºÐ¼± Ãß°¡
      
      JMenuItem mnuCut = new JMenuItem("Cut");
      mnuEdit.add(mnuCut);
      
      JMenuItem mnuCopy = new JMenuItem("Copy");
      mnuEdit.add(mnuCopy);
      
      JMenuItem mnuPaste = new JMenuItem("Paste");
      mnuEdit.add(mnuPaste);
      
      JMenu mnNewMenu = new JMenu("Color");
      mnuEdit.add(mnNewMenu);
      
      JMenuItem mntmNewMenuItem = new JMenuItem("Red");
      mnNewMenu.add(mntmNewMenuItem);
      
      JMenuItem mntmNewMenuItem_2 = new JMenuItem("Green");
      mnNewMenu.add(mntmNewMenuItem_2);
      
      JMenuItem mntmNewMenuItem_1 = new JMenuItem("Blue");
      mnNewMenu.add(mntmNewMenuItem_1);
      
      JMenu mnuColor = new JMenu("Color");
      menuBar.add(mnuColor);
      
      JMenuItem mnuRed = new JMenuItem("»¡°­");
      mnuRed.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            contentPane.setBackground(new Color(255, 0, 0));
            
         }
      });
      mnuRed.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
      mnuColor.add(mnuRed);
      
      JMenuItem mnuGreen = new JMenuItem("ÃÊ·Ï");
      mnuGreen.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            contentPane.setBackground(Color.GREEN);
         }
      });
      mnuGreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
      mnuColor.add(mnuGreen);
      
      JMenuItem mnuBlue = new JMenuItem("ÆÄ¶û");
      mnuBlue.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            contentPane.setBackground(Color.blue);
         }
      });
      mnuBlue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
      mnuColor.add(mnuBlue);
      
      JMenu mnuWindow = new JMenu("\uC708\uB3C4\uC6B0\uC5F4\uAE30");
      menuBar.add(mnuWindow);
      
      JMenuItem mnuBMI = new JMenuItem("BMI \uCE21\uC815\uD558\uAE30");
      mnuBMI.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		WinBMI winBMI = new WinBMI();
      		winBMI.setVisible(true);
      		
      	}
      });
      mnuWindow.add(mnuBMI);
      
      JMenuItem mnuLogin = new JMenuItem("\uB85C\uADF8\uC778");
      mnuLogin.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		WinLogin WinLogin = new WinLogin();
      		WinLogin.setVisible(true);
      		
      	}
      });
      mnuWindow.add(mnuLogin);
      
      JMenuItem mnuSignUp = new JMenuItem("\uD68C\uC6D0\uAC00\uC785");
      mnuSignUp.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		WinMemberJoin WinMemberJoin = new WinMemberJoin();
      		
      		WinMemberJoin.setVisible(true);
      		
      		
      		
      	}
      });
      mnuWindow.add(mnuSignUp);
      
      JMenuItem mnuTemperaqture = new JMenuItem("\uC628\uB3C4\uBCC0\uD654");
      mnuTemperaqture.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		winTest.WinTemperature WinTemperature = new WinTemperature();
      		WinTemperature.setVisible(true);
      	}
      });
      mnuWindow.add(mnuTemperaqture);
      contentPane = new JPanel();
      contentPane.setBackground(SystemColor.activeCaption);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
   }

}