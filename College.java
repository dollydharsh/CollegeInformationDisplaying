import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class College implements ActionListener{
College(){
JFrame fr1 =new JFrame();
fr1.setTitle("HOME FRAME");
fr1.setVisible(true);
fr1.setLayout(new FlowLayout(FlowLayout.LEFT));
fr1.setSize(1350,750);
Container co = fr1.getContentPane();
co.setBackground(new Color(204, 100, 166));
JLabel l1=new JLabel("*****  JM COLLEGE OF ENGINEERING *****");
l1.setForeground(Color.GREEN);
l1.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,30));
JLabel l2=new JLabel(" ##            Trichy                  @ Accredited by National Board of Accreditation (NBA) for programs applied");
l2.setForeground(Color.YELLOW);
l2.setFont(new Font("Times New Roman",Font.BOLD,28));
ImageIcon icon=new ImageIcon("crtlogo.png");
JLabel label=new JLabel(icon);
co.add(label);
JButton b1=new JButton("HOME");
JButton b2=new JButton("ABOUT");
JButton b3=new JButton("DEPARTMENTS");
JButton b4=new JButton("WHY JM");
JButton b5=new JButton("INFRASTRUCTURE");
JButton b6=new JButton("RESEARCH");
JButton b7=new JButton("PLACEMENTS");
JButton b8=new JButton("ADMISSION");
b1.setBackground(Color.PINK);
b2.setBackground(Color.PINK);
b3.setBackground(Color.PINK);
b4.setBackground(Color.PINK);
b5.setBackground(Color.PINK);
b6.setBackground(Color.PINK);
b7.setBackground(Color.PINK);
b8.setBackground(Color.PINK);
b1.setForeground(Color.BLUE);
b2.setForeground(Color.BLUE);
b3.setForeground(Color.BLUE);
b4.setForeground(Color.BLUE);
b5.setForeground(Color.BLUE);
b6.setForeground(Color.BLUE);
b7.setForeground(Color.BLUE);
b8.setForeground(Color.BLUE);
b1.setFont(new Font("Times New Roman",Font.BOLD,24));
b2.setFont(new Font("Times New Roman",Font.BOLD,24));
b3.setFont(new Font("Times New Roman",Font.BOLD,24));
b4.setFont(new Font("Times New Roman",Font.BOLD,24));
b5.setFont(new Font("Times New Roman",Font.BOLD,24));
b6.setFont(new Font("Times New Roman",Font.BOLD,24));
b7.setFont(new Font("Times New Roman",Font.BOLD,24));
b8.setFont(new Font("Times New Roman",Font.BOLD,24));

fr1.add(l1);
fr1.add(l2);
fr1.add(b1);
fr1.add(b2);
fr1.add(b3);
fr1.add(b4);
fr1.add(b5);
fr1.add(b6);
fr1.add(b7);
fr1.add(b8);
JLabel l3=new JLabel("                                                                                                                                           ");
fr1.add(l3); 
ImageIcon icon1=new ImageIcon("JM COLLGE.png");
JLabel label1=new JLabel(icon1);
co.add(label1);
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
String st=e.getActionCommand();
if(st=="ABOUT")
{
JFrame fr2=new JFrame();
fr2.setTitle("ABOUT FRAME");
fr2.setVisible(true);
fr2.setLayout( new BorderLayout());                                                                                                                                                                                                                       fr2.setSize(1350,750);
Container co1 = fr2.getContentPane();
co1.setSize(2000,2000);
co1.setBackground(new Color(99, 55, 135));
ImageIcon icon1=new ImageIcon("vision.png");
JLabel la1=new JLabel(icon1);
ImageIcon icon2=new ImageIcon("mission.png");
JLabel la2=new JLabel(icon2);
ImageIcon icon3=new ImageIcon("management.png");
JLabel la3=new JLabel(icon3);
ImageIcon icon4=new ImageIcon("fees.png");
JLabel la4=new JLabel(icon4);
String Edit[]={"SELECT THE TOPIC","VISION","MISSION","MANAGEMNET","FEES"};
JComboBox <String> cb=new JComboBox<>(Edit);
cb.setFont(new Font("Times New Roman",Font.BOLD,24));
fr2.add(cb,BorderLayout.NORTH);
cb.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ae){
String s=cb.getSelectedItem().toString();
if(ae.getStateChange()==1)
{
if(s=="SELECT THE TOPIC")
{
JOptionPane OP1=new JOptionPane();
OP1.showMessageDialog(OP1,"SELECT ANY ONE OPTION FROM THE LIST");
}
if(s=="VISION"){
fr2.remove(la2);
fr2.remove(la3);
 fr2.remove(la4);
fr2.add(la1,BorderLayout.CENTER);
fr2.revalidate();
fr2.repaint();
}
if(s=="MISSION")

{
fr2.remove(la1);
fr2.remove(la3);
fr2.remove(la4);
fr2.add(la2,BorderLayout.CENTER);
fr2.revalidate();
fr2.repaint();
}
 if(s=="MANAGEMNET")
{
fr2.add(la3,BorderLayout.CENTER);
fr2.remove(la1);
fr2.remove(la2);
fr2.remove(la4);
fr2.revalidate();
fr2.repaint();

}
if(s=="FEES")
{
fr2.add(la4,BorderLayout.CENTER);
fr2.remove(la1);
fr2.remove(la2);
fr2.remove(la3);
fr2.revalidate();
fr2.repaint();
}}
}}
);
}
if(st=="DEPARTMENTS")
{
JFrame fr3=new JFrame();
fr3.setVisible(true);
fr3.setLayout(null);
fr3.setTitle("DEPARTMENT FRAME");
fr3.setSize(1350,750);
Container co1 = fr3.getContentPane();
co1.setBackground(new Color(99, 55, 135));
String Edit[]={"SELECT THE BRANCH","COMPUTER SCIENCE AND ENGINEERING","INFORMATION TECHNOLOGY","CIVIL ENGINEERING","MECHANICAL ENGINEERING","ELECTRICAL AND ELECTRONICS ENGINEERING","ELECTRONICS AND COMMUNICATION ENGINEERING"};
JComboBox <String> cb=new JComboBox<>(Edit);
cb.setFont(new Font("Times New Roman",Font.BOLD,24));
cb.setBounds(100,0,800,50);
fr3.add(cb);
ImageIcon icon1=new ImageIcon("CSE.png");
JLabel la1=new JLabel(icon1);
la1.setSize(500,500);
JScrollPane jp=new JScrollPane(la1);
jp.setBounds(40,75,1300,600);
ImageIcon icon2=new ImageIcon("IT.png");
JLabel la2=new JLabel(icon2);
la1.setSize(500,500);
JScrollPane jp1=new JScrollPane(la2);
jp1.setBounds(40,75,1300,600);
ImageIcon icon3=new ImageIcon("CE.png");
JLabel la3=new JLabel(icon3);
la3.setSize(500,500);
JScrollPane jp2=new JScrollPane(la3);
jp2.setBounds(40,75,1300,600);
ImageIcon icon4=new ImageIcon("ME.png");
JLabel la4=new JLabel(icon4);
la4.setSize(500,500);
JScrollPane jp3=new JScrollPane(la4);
jp3.setBounds(40,75,1300,600);
ImageIcon icon5=new ImageIcon("EEE.png");
JLabel la5=new JLabel(icon5);
la5.setSize(500,500);
JScrollPane jp4=new JScrollPane(la5);
jp4.setBounds(40,75,1300,600);
ImageIcon icon6=new ImageIcon("ECE.png");
JLabel la6=new JLabel(icon6);
la6.setSize(500,500);
JScrollPane jp5=new JScrollPane(la6);
jp5.setBounds(40,75,1300,600);
cb.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ae){
String s=cb.getSelectedItem().toString();
if(ae.getStateChange()==1)
{
if(s=="SELECT THE BRANCH")
{
JOptionPane OP2=new JOptionPane();
OP2.showMessageDialog(OP2,"SELECT ANY ONE OPTION FROM THE LIST");
}
if(s=="COMPUTER SCIENCE AND ENGINEERING"){
fr3.add(jp);
fr3.remove(jp1);
fr3.remove(jp2);
fr3.remove(jp3);
fr3.remove(jp4);
fr3.remove(jp5);
jp.revalidate();
jp.repaint();
}
if(s=="INFORMATION TECHNOLOGY")
{
fr3.add(jp1);
fr3.remove(jp2);
fr3.remove(jp3);
fr3.remove(jp4);
fr3.remove(jp5);
fr3.remove(jp);
fr3.revalidate();
fr3.repaint();
}
 if(s=="CIVIL ENGINEERING")
{
fr3.add(jp2);
fr3.remove(jp);
fr3.remove(jp1);
fr3.remove(jp3);
fr3.remove(jp4);
fr3.remove(jp5);
fr3.revalidate();
fr3.repaint();

}
if(s=="MECHANICAL ENGINEERING")
{
fr3.add(jp3);
fr3.remove(jp);
fr3.remove(jp1);
fr3.remove(jp2);
fr3.remove(jp4);
fr3.remove(jp5);
fr3.revalidate();
fr3.repaint();
}
if(s=="ELECTRICAL AND ELECTRONICS ENGINEERING")
{
fr3.add(jp4);
fr3.remove(jp);
fr3.remove(jp1);
fr3.remove(jp2);
fr3.remove(jp3);
fr3.remove(jp5);
fr3.revalidate();
fr3.repaint();
}
if(s=="ELECTRONICS AND COMMUNICATION ENGINEERING")
{
fr3.add(jp5);
fr3.remove(jp);
fr3.remove(jp1);
fr3.remove(jp2);
fr3.remove(jp3);
fr3.remove(jp4);
fr3.revalidate();
fr3.repaint();
}

}}}
);
}
if (st=="WHY JM")
{
JFrame fr4=new JFrame("WHY FRAME");
Container co2= fr4.getContentPane();
co2.setBackground(new Color(99, 55, 135));
fr4.setSize(1350,750);
fr4.setLayout(new BorderLayout());
fr4.setVisible(true);
ImageIcon icon1=new ImageIcon("JM COLLGE.png");
JLabel label1=new JLabel(icon1);
JTextArea ta=new JTextArea();
JScrollPane jp=new JScrollPane(ta);
try
{
ta.setForeground(Color.RED);
ta.setBackground( Color.YELLOW);
ta.setFont(new Font("Times New Roman",Font.BOLD,24));
ta.setEditable(false);
ta.read(new InputStreamReader(getClass().getResourceAsStream("WHY.txt")),null);
}
catch(IOException ex)
{
ex.printStackTrace();
}
fr4.add(jp,BorderLayout.CENTER);
fr4.add(label1,BorderLayout.NORTH);
}
if(st=="INFRASTRUCTURE")
{
JFrame fr5=new JFrame();
fr5.setTitle("INFRASTRUCTURE FRAME");
fr5.setVisible(true);
fr5.setLayout( new BorderLayout());                                                                                                                                                                                                                       fr5.setSize(1350,750);
Container co1 = fr5.getContentPane();
co1.setSize(2000,2000);
co1.setBackground(new Color(99, 55, 135));
String Edit[]={"SELECT YOUR OPTION","AUDITORIUM","CLASS ROOMS", "HOSTEL","LABORATORIES","LIBRARY","PLAY GROUND"};
JComboBox <String> cb=new JComboBox<>(Edit);
cb.setFont(new Font("Times New Roman",Font.BOLD,24));
fr5.add(cb,BorderLayout.NORTH);
ImageIcon icon1=new ImageIcon("LAB.png");
JLabel la1=new JLabel(icon1);
JScrollPane jp=new JScrollPane(la1);
ImageIcon icon2=new ImageIcon("AU.png");
JLabel la2=new JLabel(icon2);
JScrollPane jp1=new JScrollPane(la2);
ImageIcon icon3=new ImageIcon("CL.png");
JLabel la3=new JLabel(icon3);
JScrollPane jp2=new JScrollPane(la3);
ImageIcon icon4=new ImageIcon("HO.png");
JLabel la4=new JLabel(icon4);
JScrollPane jp3=new JScrollPane(la4);
ImageIcon icon5=new ImageIcon("LU.png");
JLabel la5=new JLabel(icon5);
JScrollPane jp4=new JScrollPane(la5);
ImageIcon icon6=new ImageIcon("PG.png");
JLabel la6=new JLabel(icon6);
JScrollPane jp5=new JScrollPane(la6);
cb.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ae){
String s=cb.getSelectedItem().toString();
if(ae.getStateChange()==1)
{
if(s=="SELECT YOUR OPTION")
{
JOptionPane OP3=new JOptionPane();
OP3.showMessageDialog(OP3,"SELECT ANY ONE OPTION FROM THE LIST");
}
if(s=="LABORATORIES"){
fr5.add(jp,BorderLayout.CENTER);
fr5.remove(jp1);
fr5.remove(jp2);
fr5.remove(jp3);
fr5.remove(jp4);
fr5.remove(jp5);
fr5.revalidate();
fr5.repaint();
}
if(s=="AUDITORIUM")
{
fr5.add(jp1,BorderLayout.CENTER);
fr5.remove(jp);
fr5.remove(jp2);
fr5.remove(jp3);
fr5.remove(jp4);
fr5.remove(jp5);
fr5.revalidate();
fr5.repaint();
}
 if(s=="CLASS ROOMS")
{
fr5.add(jp2,BorderLayout.CENTER);
fr5.remove(jp);
fr5.remove(jp1);
fr5.remove(jp3);
fr5.remove(jp4);
fr5.remove(jp5);
fr5.revalidate();
fr5.repaint();
}
if(s=="HOSTEL")
{
fr5.add(jp3,BorderLayout.CENTER);
fr5.remove(jp);
fr5.remove(jp1);
fr5.remove(jp2);
fr5.remove(jp4);
fr5.remove(jp5);
fr5.revalidate();
fr5.repaint();}
if(s=="LIBRARY")
{
fr5.add(jp4,BorderLayout.CENTER);
fr5.remove(jp);
fr5.remove(jp1);
fr5.remove(jp2);
fr5.remove(jp3);
fr5.remove(jp5);
fr5.revalidate();
fr5.repaint();}
if(s=="PLAY GROUND")
{
fr5.add(jp5,BorderLayout.CENTER);
fr5.remove(jp);
fr5.remove(jp1);
fr5.remove(jp2);
fr5.remove(jp3);
fr5.remove(jp4);
fr5.revalidate();
fr5.repaint();
}

}}}
);

}
if(st=="RESEARCH")
{
JFrame fr6=new JFrame();
fr6.setTitle("RESEARCH FRAME");
fr6.setVisible(true);
fr6.setLayout( new BorderLayout());                                                                                                                                                                                                                       fr6.setSize(1350,750);
Container co1 = fr6.getContentPane();
co1.setSize(1250,1000);
co1.setBackground(new Color(99, 55, 135));
ImageIcon icon=new ImageIcon("RESEARCH.png");
JLabel label=new JLabel(icon);
co1.add(label,BorderLayout.CENTER);
}
if(st=="PLACEMENTS")
{
JFrame fr7=new JFrame();
fr7.setTitle("PLACEMENT FRAME");
fr7.setVisible(true);
fr7.setLayout( new BorderLayout());                                                                                                                                                                                                                       fr7.setSize(1350,750);
Container co1 = fr7.getContentPane();
co1.setSize(1500,1500);
co1.setBackground(new Color(99, 55, 135));
JTextArea ta=new JTextArea();
JScrollPane jp=new JScrollPane(ta);
try
{
ta.setForeground(Color.BLACK);
ta.setBackground( Color.PINK);
ta.setFont(new Font("Times New Roman",Font.BOLD,18));
ta.setEditable(false);
ta.read(new InputStreamReader(getClass().getResourceAsStream("PLACEMENT.txt")),null);
}
catch(IOException ex)
{
ex.printStackTrace();
}
fr7.add(jp,BorderLayout.CENTER);
}
if(st=="ADMISSION")
{
JFrame fr8=new JFrame();
fr8.setTitle("ADMISSION FRAME");
fr8.setVisible(true);
fr8.setLayout( new BorderLayout());                                                                                                                                                                                                                       fr8.setSize(1350,750);
Container co1 = fr8.getContentPane();
co1.setSize(1600,700);
co1.setBackground(new Color(99, 55, 135));
JTextArea ta=new JTextArea();
JScrollPane jp=new JScrollPane(ta);
try
{
ta.setForeground(Color.YELLOW);
ta.setBackground( Color.RED);
ta.setFont(new Font("Times New Roman",Font.BOLD,18));
ta.setEditable(false);
ta.read(new InputStreamReader(getClass().getResourceAsStream("ADMISSION.txt")),null);
}
catch(IOException ex)
{
ex.printStackTrace();
}
fr8.add(jp,BorderLayout.CENTER);
}
}
public static void main(String args[]){
SwingUtilities.invokeLater(
new Runnable(){
public void run(){
College c=new College();
}
});
}}
