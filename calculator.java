import java.awt.*;  
import java.awt.event.*;

public class calculator extends Frame implements ActionListener {

    TextField tf;
    String s1,s2,s3,s4,s5,c;
    int n;

    calculator()
    {
        Font font1 = new Font("SansSerif", Font.BOLD, 20);

        tf=new TextField(20);
       tf.setBounds(10,70,300,50);
       tf.setFont(font1);


        Button one=new Button("1");
        one.setBounds(10,150,50,50);
        Button two=new Button("2");
        two.setBounds(60,150,50,50);
        Button three=new Button("3");
        three.setBounds(110,150,50,50);
        Button four=new Button("4");
        four.setBounds(10,200,50,50);
        Button five=new Button("5");
        five.setBounds(60,200,50,50);
        Button six=new Button("6");
        six.setBounds(110,200,50,50);
        Button seven=new Button("7");
        seven.setBounds(10,250,50,50);
        Button eight=new Button("8");
        eight.setBounds(60,250,50,50);
        Button nine=new Button("9");
        nine.setBounds(110,250,50,50);
        Button zero=new Button("0");
        zero.setBounds(60,300,50,50);
        Button btn_equal=new Button("=");
        btn_equal.setBounds(110,300,50,50);
        Button clear=new Button("clear");
        clear.setBounds(10,300,50,50);


        Button btn_add=new Button("add");
        btn_add.setBounds(180,150,80,30);

        Button btn_sub=new Button("sub");
        btn_sub.setBounds(180,180,80,30);
         Button btn_mul=new Button("Multiply");
        btn_mul.setBounds(180,210,80,30);
         Button btn_div=new Button("divide");
        btn_div.setBounds(180,240,80,30);

        Button btn_mod=new Button("mod");
        btn_mod.setBounds(180,270,80,30);
        
        

        clear.addActionListener(this);
        btn_add.addActionListener(this);
        btn_sub.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
        btn_mod.addActionListener(this);
        btn_equal.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);

        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);

        // add(label1);
        // add(label2);
        //add(number1);
        add(btn_add);
        add(btn_sub);
        add(btn_mul);
        add(btn_div);
        //add(number2);
        add(btn_mod);
        add(clear);
        add(tf);
        add(btn_equal);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){  
        String no1,no2,ans;
        int no3,no4;
        // no1=number1.getText();
        //     no2=number2.getText();
        //     no3=Integer.parseInt(no1);
        //     no4=Integer.parseInt(no2);
        if(e.getActionCommand()=="add")
        {
            s1 = tf.getText();
            tf.setText("");
            c="add";
        }
         if(e.getActionCommand()=="sub")
        {
            s1 = tf.getText();
            tf.setText("");
            c="sub";
        }
         if(e.getActionCommand()=="Multiply")
        {
            s1 = tf.getText();
            tf.setText("");
            c="mul";
        }
         if(e.getActionCommand()=="divide")
        {
            s1 = tf.getText();
            tf.setText("");
            c="div";
        }
        else if(e.getActionCommand()=="mod")
        {
            s1 = tf.getText();
            tf.setText("");
            c="mod";
        }
         if(e.getActionCommand()=="clear")
        {
            
            tf.setText("");
        }
         if(e.getActionCommand()=="1")
        {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
         if(e.getActionCommand()=="2")
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
        }
         if(e.getActionCommand()=="3")
        {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        } if(e.getActionCommand()=="4")
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        } if(e.getActionCommand()=="5")
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        } if(e.getActionCommand()=="6")
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
         if(e.getActionCommand()=="7")
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        } if(e.getActionCommand()=="8")
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
         if(e.getActionCommand()=="9")
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        } if(e.getActionCommand()=="0")
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }



         if(e.getActionCommand()=="=")
        {
            s2 = tf.getText();
            if(c.equals("add"))
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else if(c.equals("sub"))
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else if(c.equals("mul"))
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else if(c.equals("div"))
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                      n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    tf.setText(String.valueOf(n));
                     }
                     else
                        tf.setText("Zero error");
 
                }
                catch(Exception i){}
            }
            if(c.equals("mod"))
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        
        }
    }

        public static void main(String args[])
        {
            new calculator();
        }
    }