
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


  
class NextPage extends JFrame implements ActionListener
{
    public JButton ok,cn;

  JPanel panel1;
  JLabel label1,label2,label3,label4,label5,total;
  final JTextField  text1,text2,text3,text4,text5,q1,q2,q3,q4,q5;
   NextPage()
  {
      label1 = new JLabel();
   label1.setText("order 1:");
   text1 = new JTextField(15);
   
   label2 = new JLabel();
   label2.setText("order 2:");
   text2 = new JTextField(15);
   
   label3 = new JLabel();
   label3.setText("order 3:");
   text3 = new JTextField(15);

   label4 = new JLabel();
   label4.setText("order 4");
   text4 = new JTextField(15);

   label5 = new JLabel();
   label5.setText("oeder 5:");
   text5 = new JTextField(15);
   q1 = new JTextField(15);
   q2 = new JTextField(15);
   q3 = new JTextField(15);
   q4 = new JTextField(15);
   q5 = new JTextField(15);
   total = new JLabel();
   total.setText("....");


   ok=new JButton("OK");
   cn=new JButton("cancel");   
       setLayout( new GridLayout(6,2));
   add(label1);
   add(text1);
   add(q1);
   add(label2);
   add(text2);
   add(q2);
   add(label3);
   add(text3);
   add(q3);
   add(label4);
   add(text4);
   add(q4);
   add(label5);
   add(text5);
   add(q5);
   add(ok);
   add(cn);
  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("hotel order");
  setSize(600,600);
  ok.addActionListener(this);
  cn.addActionListener(this);
   
   }
   
   public void actionPerformed(ActionEvent ae)
   {
   
   String value1=text1.getText();
   String value2=text2.getText();
   String value3=text3.getText();
   String value4=text4.getText();
   String value5=text5.getText();
   String value6=q1.getText();
   int qn1=Integer.parseInt(value6);
  String value7=q2.getText();
   int qn2=Integer.parseInt(value7);
   String value8=q3.getText();
   int qn3=Integer.parseInt(value8);
   String value9=q4.getText();
   int qn4=Integer.parseInt(value9);
   String value10=q5.getText();
   int c1=0,c2=0,c3=0,c4=0,c5=0;
   int qn5=Integer.parseInt(value10);
  if(ae.getActionCommand().equals("OK"))
   {
   if(value1.equals("1001"))
       c1=15*qn1;
   else if(value1.equals("1002"))
       c1=40*qn1;
   else if(value1.equals("1003"))
       c1=60*qn1;
else if(value1.equals("1004"))
       c1=120*qn1;
else if(value1.equals("1005"))
       c1=140*qn1;
else if(value1.equals("1006"))
       c1=90*qn1;
else if(value1.equals("1007"))
       c1=110*qn1;
else if(value1.equals("1008"))
       c1=100*qn1;
else if(value1.equals("1009"))
       c1=80*qn1;
else if(value1.equals("1010"))
       c1=40*qn1;
   
   if(value2.equals("1001"))
       c2=15*qn2;
   else if(value2.equals("1002"))
       c2=40*qn2;
   else if(value2.equals("1003"))
       c2=60*qn2;
else if(value2.equals("1004"))
       c2=120*qn2;
else if(value2.equals("1005"))
       c2=140*qn2;
else if(value2.equals("1006"))
       c2=90*qn2;
else if(value2.equals("1007"))
       c2=110*qn2;
else if(value2.equals("1008"))
       c2=100*qn2;
else if(value2.equals("1009"))
       c2=80*qn2;
else if(value2.equals("10010"))
       c2=40*qn2;
   if(value3.equals("1001"))
       c3=15*qn3;
   else if(value3.equals("1002"))
       c3=40*qn3;
   else if(value3.equals("1003"))
       c3=60*qn3;
else if(value3.equals("1004"))
       c3=120*qn3;
else if(value3.equals("1005"))
       c3=140*qn3;
else if(value3.equals("1006"))
       c3=90*qn3;
else if(value3.equals("1007"))
       c3=110*qn3;
else if(value3.equals("1008"))
       c3=100*qn3;
else if(value3.equals("1009"))
       c3=80*qn3;
else if(value3.equals("1010"))
       c3=40*qn3;
   if(value4.equals("1001"))
       c4=15*qn4;
   else if(value4.equals("1002"))
       c4=40*qn4;
   else if(value4.equals("1003"))
       c4=60*qn4;
else if(value4.equals("1004"))
       c4=120*qn4;
else if(value4.equals("1005"))
       c4=140*qn4;
else if(value4.equals("1006"))
       c4=90*qn4;
else if(value4.equals("1007"))
       c4=110*qn4;
else if(value4.equals("1008"))
       c4=100*qn4;
else if(value4.equals("1009"))
       c4=80*qn4;
else if(value4.equals("1010"))
       c4=40*qn4;
   if(value5.equals("1001"))
       c5=15*qn5;
   else if(value5.equals("1002"))
       c5=40*qn5;
   else if(value5.equals("1003"))
       c5=60*qn5;
else if(value5.equals("1004"))
       c5=120*qn5;
else if(value5.equals("1005"))
       c5=140*qn5;
else if(value5.equals("1006"))
       c5=90*qn5;
else if(value5.equals("1007"))
       c5=110*qn5;
else if(value5.equals("1008"))
       c5=100*qn5;
else if(value5.equals("1009"))
       c5=80*qn5;
else if(value5.equals("1010"))
       c5=40*qn5;
  dispose();
   int t=c1+c2+c3+c4+c5;
   total.setText( "total ammount is:"+Integer.toString(t));
   
   setLayout( new GridLayout(6,2));
    add(total);
    setVisible(true);
    setSize(600,300);
    setTitle("success");
    
          
   }
  else if(ae.getActionCommand().equals("cancel"))
  {
      dispose();
      NextPage frame=new NextPage();
           frame.setVisible(true);
  }
  }
}

  