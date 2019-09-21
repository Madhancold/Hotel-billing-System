import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


  
class menu extends JFrame implements ActionListener
{
    public JButton ok,cn;

  JPanel panel1;
  JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
  
   menu()
  {
      label1 = new JLabel();
   label1.setText("code 1001 is parotta           rate rs.15");
   label2 = new JLabel();
   label2.setText("code 1002 is dosa              rate rs.40");
   label3 = new JLabel();
   label3.setText("code 1003 is veg biriyani      rate rs.60");
  label4 = new JLabel();
   label4.setText("code 1004 is chicken biriyani  rate rs.120");
label5 = new JLabel();
   label5.setText("code 1005 is mutton biriyani   rate rs.140");
   label6 = new JLabel();
   label6.setText("code 1006 is chicken noodles   rate rs.90");
label7 = new JLabel();
   label7.setText("code 1007 is chicken gravy     rate rs.110");
   label8 = new JLabel();
   label8.setText("code 1008 is chicken 65        rate rs.100");
   label9 = new JLabel();
   label9.setText("code 1009 is Full meals        rate rs.80");
   label10 = new JLabel();
   label10.setText("code 1010 is Butter Nan rate rs.40");
   ok=new JButton("enter your order");
     
       setLayout( new GridLayout(6,2));
   add(label1);add(label6);
   add(label2);add(label7);
   add(label3);add(label8);
   add(label4);add(label9);
   add(label5);add(label10);
   add(ok); 
   
  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("hotel order");
  setSize(600,600);
  ok.addActionListener(this);
  
   
   }
   
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getActionCommand().equals("enter your order"))
   {
        
   NextPage frame=new NextPage();
           frame.setVisible(true);

   }
   }
}
public class hotel
{
  public static void main(String[] arg)
  {
      menu f=new menu();
           f.setVisible(true);
  }
}