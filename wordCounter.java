import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
public class wordCounter extends JFrame implements ActionListener{  

JLabel maintitle;
JTextArea txt;  
JButton b;  
wordCounter(){  
    super("Word Counter");  

    maintitle = new JLabel("Word Counter");
    Font font= new Font("Viner Hand ITC", Font.PLAIN, 20); 
    maintitle.setFont(font);
    maintitle.setBounds(170,0,150,60);

    txt=new JTextArea();  
    txt.setBounds(30,50,420,250);  
        
    b=new JButton("Count Word");  
    b.setBounds(170,320,150,30);  
      
    
      
    b.addActionListener(this);  
    
    add(maintitle);
    add(txt); 
    add(b);
     
    setSize(500,500);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=txt.getText();  
    if(e.getSource()==b){  
        String words[]=text.split("\\s");  
        JOptionPane.showMessageDialog(this,"Total words: "+words.length);  
    }  
}  
public static void main(String[] args) {  
    new wordCounter();  
}  
}  