import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal extends javax.swing.JFrame implements ActionListener {
    JButton b[] = new JButton[21];
    JTextField io = new JTextField("");

    public Cal() {
        setLayout(new BorderLayout());
        add(io, BorderLayout.NORTH);
        for (int i = 0; i < 10; i++)
            b[i] = new JButton("" + i);
        b[10] = new JButton("+");
        b[11] = new JButton("-");
        b[12] = new JButton("*");
        b[13] = new JButton("/");
        b[14] = new JButton("%");
        b[15] = new JButton("(");
        b[16] = new JButton(")");
        b[17] = new JButton(".");
        b[18] = new JButton("back");
        b[19] = new JButton("clr");
        b[20] = new JButton("=");
        JPanel p = new JPanel(new GridLayout(5, 4));
        for (int i = 0; i < 20; i++)
            p.add(b[i]);
        add(p, BorderLayout.CENTER);
        add(b[20], BorderLayout.SOUTH);
        setSize(600, 600);
        for (int i = 0; i < 21; i++)
            b[i].addActionListener(this);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cal c = new Cal();
                c.setVisible(true);
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                c.show();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        try {

            if (src == b[0] || src == b[1] || src == b[2] || src == b[3] || src == b[4] || src == b[5] || src == b[6]
                    || src == b[7] || src == b[8] || src == b[9] || src == b[10] || src == b[11] || src == b[12]
                    || src == b[13] || src == b[14] || src == b[15] || src == b[16] || src == b[17]) // just form an
                                                                                                     // expression
                io.setText(io.getText() + e.getActionCommand());
            else if (src == b[18]) // backspace
                io.setText(io.getText().substring(0, io.getText().length() - 1));
            else if (src == b[19]) // clear
                io.setText("");
            else if (src == b[20]) // perform any Calculation
            {
                ScriptEngine runtime = new ScriptEngineManager().getEngineByName("javascript");
                if (io.getText().contains(".") || io.getText().contains("/")) {
                    Double r = (Double) runtime.eval(io.getText().toString());
                    io.setText(String.valueOf(r));
                } else {
                    Integer r = (Integer) runtime.eval(io.getText().toString());
                    io.setText(String.valueOf(r));
                }
            }
        } catch (Exception er) {
            io.setText(er.toString());
        }
    }
}
