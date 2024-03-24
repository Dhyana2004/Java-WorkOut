import javax.swing.*;
public class Gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello"+" "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "your age is"+" "+age);

        double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "your height is"+" "+height);

       // JOptionPane.showInputDialog("enter your age");
        
    }
    
}
