import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {

  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter() {

  JFrame frame = new JFrame("Lets Count");

  frame.setLayout(new FlowLayout());
  frame.setSize(200,110);

  JButton b1 = new JButton("Left");
  JButton b2 = new JButton("Right");

  leftCount = 0;
  rightCount = 0;

  b1.addActionListener(this);
  b2.addActionListener(this);

  leftLabel = new JLabel("Count" + leftCount);
  rightLabel = new JLabel("Count" + rightCount);

  frame.add(b1);
  frame.add(b2);

  frame.add(leftLabel);
  frame.add(rightLabel);
  
  JButton reset = new JButton("Reset");
  reset.addActionListener(this);
  frame.add(reset);

  frame.setVisible(true);
  }

public void actionPerformed(ActionEvent a) {

if(a.getActionCommand().equals("Left")) {
  
  leftCount++;
  leftLabel.setText("Count: " + leftCount);

} 

else if (a.getActionCommand().equals("Right")) {

rightCount++;
rightLabel.setText("Count: " + rightCount);

}

else if(a.getActionCommand().equals("Reset")) {
  
  leftCount = 0;
  rightCount = 0;
  
  leftLabel.setText("Count: " + leftCount);
  rightLabel.setText("Count: " + rightCount);
}

}

}