import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Game {
    
    //declare
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    
    //construct
    Game() {
        
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        
        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        frame.add(label);
        frame.setVisible(true);
        
    }
    
    public class upAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
    
    public class downAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
    
    public class leftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
    
    public class rightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
    
}
