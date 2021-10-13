import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc {
    private JPanel calc;
    private JButton btnopenbracket;
    private JButton btnclosebracket;
    private JButton btnmc;
    private JButton btnmplus;
    private JTextField textField1;
    private JButton btnmminus;
    private JButton btnmr;
    private JButton btnC;
    private JButton btnPlusMinus;
    private JButton button9;
    private JButton btnDivision;
    private JButton btn2nd;
    private JButton btnCubed;
    private JButton xYButton;
    private JButton btnepowx;
    private JButton btn10powx;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnmultiply;
    private JButton btnSquared;
    private JButton btnxroot2;
    private JButton btn1overX;
    private JButton btnxrootx;
    private JButton btnxrooty;
    private JButton btnln;
    private JButton btnlogbase10;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnminus;
    private JButton button31;
    private JButton btnSin;
    private JButton btnCos;
    private JButton btntan;
    private JButton btne;
    private JButton btnEE;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnplus;
    private JButton btnRad;
    private JButton btnsinh;
    private JButton btncosh;
    private JButton btntanh;
    private JButton btnPi;
    private JButton btnRand;
    private JButton btn0;
    private JButton btnfullstop;
    private JButton btnEquals;

    public calc() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = btn1.getText();
                textField1.setText(btn1Text);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calc");
        frame.setContentPane(new calc().calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
