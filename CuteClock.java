
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class CuteClock extends JPanel{
    
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    
 
    Color black = new Color(0x000000);
    Color white = new Color(0xffffff);
    Color pink = new Color(0xf5a5bd);
    Color blue = new Color(0xc1ecf6);
    
  
    public CuteClock(){
         timeLabel = new JLabel();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawUI(g);
        drawClock(g);
   }
    
    public void drawUI(Graphics g){
        setBackground(blue);
        g.setColor(black);
        g.fillOval(70, 70, 150, 150);
        g.fillOval(290, 70, 150, 150);
        g.setColor(white);
        g.fillOval(80, 80, 350, 350);
        g.setColor(black);
        g.fillOval(150, 160, 80, 80);
        g.fillOval(280, 160, 80, 80);
        g.setColor(white);
        g.fillOval(190, 180, 20, 20);
        g.fillOval(300, 180, 20, 20);
        g.setColor(pink);
        g.fillOval(160, 235, 40, 20);
        g.fillOval(310, 235, 40, 20);
              
    }
    public void drawClock(Graphics g){
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel.setBounds(135, 270, 240, 100);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setForeground(pink);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
     
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        
        this.add(timeLabel);
     
    }
    
 
}
