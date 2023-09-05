
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Form extends JFrame{
    CuteClock c =new CuteClock();
    public Form(){
         this.setTitle("Cute Clock");
         this.setSize(500,500);
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(true);
         this.add(c);
         //c.setBackground(Color.red);
    }
    
}
