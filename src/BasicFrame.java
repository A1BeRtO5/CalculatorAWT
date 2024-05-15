import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicFrame extends Frame {
    public BasicFrame() throws HeadlessException {

        addWindowListener(new MyMouseAdapter());
        int r = 196;
        int g = 168;
        int b = 57;
//        int r = 169;
//        int g = 156;
//        int b = 32;
        Font fontButton = new Font("Arrial", Font.BOLD, 20);

        setSize(400, 600);
//        setBackground(new Color(40, 46, 51));
        setBackground(new Color(24, 26, 32));
        setVisible(true);
        setLayout(null);
        Button button0 = new Button("0");
        button0.setBackground(new Color(r, g, b));
        button0.setFont(fontButton);

        Button button1 = new Button("1");
        button1.setBackground(new Color(r, g, b));
        button1.setFont(fontButton);

        Button button2 = new Button("2");
        button2.setBackground(new Color(r, g, b));
        button2.setFont(fontButton);

        Button button3 = new Button("3");
        button3.setBackground(new Color(r, g, b));
        button3.setFont(fontButton);

        Button button4 = new Button("4");
        button4.setBackground(new Color(r, g, b));
        button4.setFont(fontButton);

        Button button5 = new Button("5");
        button5.setBackground(new Color(r, g, b));
        button5.setFont(fontButton);

        Button button6 = new Button("6");
        button6.setBackground(new Color(r, g, b));
        button6.setFont(fontButton);

        Button button7 = new Button("7");
        button7.setBackground(new Color(r, g, b));
        button7.setFont(fontButton);

        Button button8 = new Button("8");
        button8.setBackground(new Color(r, g, b));
        button8.setFont(fontButton);

        Button button9 = new Button("9");
        button9.setBackground(new Color(r, g, b));
        button9.setFont(fontButton);

        Button buttonComa = new Button("C");
        buttonComa.setBackground(new Color(r, g, b));
        buttonComa.setFont(fontButton);

        Button buttonDelete = new Button("=");
        buttonDelete.setBackground(new Color(r, g, b));
        buttonDelete.setFont(fontButton);

        Button buttonAdd = new Button("+");
        buttonAdd.setBackground(new Color(r, g, b));
        buttonAdd.setFont(fontButton);

        Button buttonSubtract = new Button("-");
        buttonSubtract.setBackground(new Color(r, g, b));
        buttonSubtract.setFont(fontButton);

        Button buttonMultiply = new Button("*");
        buttonMultiply.setBackground(new Color(r, g, b));
        buttonMultiply.setFont(fontButton);

        Button buttonDivide = new Button("/");
        buttonDivide.setBackground(new Color(r, g, b));
        buttonDivide.setFont(fontButton);

        button1.setBounds(10, 240, 113,70);
        button2.setBounds(143, 240, 113,70);
        button3.setBounds(276, 240, 113,70);

        button4.setBounds(10, 330, 113,70);
        button5.setBounds(143, 330, 113,70);
        button6.setBounds(276, 330, 113,70);

        button7.setBounds(10, 420, 113,70);
        button8.setBounds(143, 420, 113,70);
        button9.setBounds(276, 420, 113,70);

        buttonComa.setBounds(10, 510, 113,70);
        button0.setBounds(143, 510, 113,70);
        buttonDelete.setBounds(276, 510, 113,70);

        buttonAdd.setBounds(10, 150, 85,70);
        buttonSubtract.setBounds(108, 150, 85,70);
        buttonMultiply.setBounds(206, 150, 85,70);
        buttonDivide.setBounds(304, 150, 85,70);


        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(buttonComa);
        add(button0);
        add(buttonDelete);

        add(buttonAdd);
        add(buttonSubtract);
        add(buttonMultiply);
        add(buttonDivide);

        Label label = new Label(" ", 2);
        label.setBounds(11, 50, 375,80);
        label.setBackground(new Color(66,79,90));
        add(label);

        Font font = new Font("Arial", Font.ITALIC, 60);
        label.setFont( font);
        label.addMouseListener(new MyMouseAdapter(label));

        button1.addActionListener(new MyMouseAdapter(label));
        button2.addActionListener(new MyMouseAdapter(label));
        button3.addActionListener(new MyMouseAdapter(label));
        button4.addActionListener(new MyMouseAdapter(label));
        button5.addActionListener(new MyMouseAdapter(label));
        button6.addActionListener(new MyMouseAdapter(label));
        button7.addActionListener(new MyMouseAdapter(label));
        button8.addActionListener(new MyMouseAdapter(label));
        button9.addActionListener(new MyMouseAdapter(label));
        button0.addActionListener(new MyMouseAdapter(label));
        buttonComa.addActionListener(new MyMouseAdapter(label));
        buttonDelete.addActionListener(new MyMouseAdapter(label));
        buttonAdd.addActionListener(new MyMouseAdapter(label));
        buttonMultiply.addActionListener(new MyMouseAdapter(label));
        buttonSubtract.addActionListener(new MyMouseAdapter(label));
        buttonDivide.addActionListener(new MyMouseAdapter(label));

         button0.addMouseListener(new MyMouseAdapter(label));
    }

}
