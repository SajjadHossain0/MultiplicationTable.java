import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,600);
        frame.getContentPane().setBackground(new Color(0xFFFBEB));
        frame.setResizable(false);//turn off the maximize option
        frame.setTitle("Multiplication Table");
        frame.setLocationRelativeTo(null);

        JLabel label1 = new JLabel();
        label1.setText("Enter the number of multiplication table");
        label1.setBounds(17,40,250,20);
        frame.add(label1);

        JTextField textField = new JTextField();
        textField.setBounds(17,60,250,25);
        frame.add(textField);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("Arial", Font.BOLD, 30));
        label2.setBounds(30,140,250,400);
        frame.add(label2);

        JButton btn1 = new JButton("Enter");
        btn1.setBounds(17,90,100,40);
        btn1.setFocusable(false);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btn1){
                    int num = Integer.parseInt(textField.getText());
                    String a = "";
                    for (int i=1; i<=10; i++){
                        a += num+" x "+i+" = "+num*i+"<br>";
                    }label2.setText("<html>"+a+"</html>");
                }
            }
        });
        frame.add(btn1);

        JButton btn2 = new JButton("Reset");
        btn2.setBounds(165,90,100,40);
        btn2.setFocusable(false);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btn2){
                    textField.setText(null);
                    label2.setText(null);
                }
            }
        });
        frame.add(btn2);



        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setBounds(17,140,250,400);
        frame.add(panel);



        frame.setVisible(true);
    }



}

