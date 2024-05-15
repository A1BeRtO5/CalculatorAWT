import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.util.Scanner;

public class MyMouseAdapter  extends MouseAdapter implements ActionListener, WindowListener {
    private Label label;

    static String a = "", b = "", operation = "", resultStr = "", operationTest = "";
    static int resultInt = 0;
    static int resultInt2 = 0;
    static int scaner = 0;

    static double resultD = 0;

    public MyMouseAdapter(Label label) {
        this.label = label;
    }

    public MyMouseAdapter() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        String s = e.getActionCommand();
        Scanner keyboard = new Scanner(e.getActionCommand());
        double value1 = keyboard.nextDouble();

            if (value1 >= 0 && value1 <= 9 ) {
                if (operation.equals("")) {
                    a = a + s;
                } else {
                    b = b + s;
                }
            }
            label.setText(a+operation+b);
        } catch (Exception exception) {
            operation = e.getActionCommand();
            if (Objects.equals(e.getActionCommand(), "C")) {
                operation = a = b = "";
                label.setText("");
            } else if (Objects.equals(operation, "+")) {
                operationTest = "+";
                label.setText(a+operation+b);
            } else if (Objects.equals(operation, "-")) {
                operationTest = "-";
                label.setText(a+operation+b);
            } else if (Objects.equals(operation, "*")) {
                operationTest = "*";
                label.setText(a+operation+b);
            } else if (Objects.equals(operation, "/")) {
                operationTest = "/";
                label.setText(a+operation+b);
            } else if (Objects.equals(operation, "=")) {
                if (operationTest.equals("+")) {
                    resultInt = Integer.parseInt(a) + Integer.parseInt(b);
                }if (operationTest.equals("-")) {
                    resultInt = Integer.parseInt(a) - Integer.parseInt(b);
                }if (operationTest.equals("*")) {
                    resultInt = Integer.parseInt(a) * Integer.parseInt(b);
                }if (operationTest.equals("/")) {
                    resultInt = Integer.parseInt(a) / Integer.parseInt(b);
                }
                System.out.println(Integer.parseInt(a));
                System.out.println(Integer.parseInt(b));

                resultStr = String.valueOf(resultInt);
                System.out.println(resultInt);
                label.setText(resultStr);
                a = operation = b = "";
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();//закривання по кнопці
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}