import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(310, 800);
        frame.setTitle("Esto es el titulo");

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Nombre:");
        JTextField textField1 = new JTextField(20);
        JLabel label2 = new JLabel("Apellido:");
        JTextField textField2 = new JTextField(20);
        JLabel label3 = new JLabel("Telefono:");
        JTextField textField3 = new JTextField(20);

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.setBackground(Color.yellow);

        JButton button1 = new JButton("Datos personales");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,
                        "Nombre: " + textField1.getText() + "\n" +
                                "Apellido: " + textField2.getText() + "\n" +
                                "Teléfono: " + textField3.getText());

            }
        });

        panel.add(button1);
        frame.getContentPane().add(panel);

        JPanel panel1 = new JPanel();

        JLabel label4 = new JLabel("Edad:");
        JTextField textField4 = new JTextField(20);
        JLabel label5 = new JLabel("Peso:");
        JTextField textField5 = new JTextField(20);

        JButton button2 = new JButton("Calcular edad ");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int edad = Integer.parseInt(textField4.getText());
                int ano = 2024 - edad;
                JOptionPane.showMessageDialog(frame, "Año de nacimiento: " + ano);

            }
        });
        JButton button3 = new JButton("Verificar peso");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = Double.parseDouble(textField5.getText());
                if (peso < 50) {
                    JOptionPane.showMessageDialog(frame, "Peso normal");
                } else {
                    JOptionPane.showMessageDialog(frame, "Peso excedido");
                }
            }
        });
        JButton button4 = new JButton("Verificar mayoría de edad");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int edad = Integer.parseInt(textField4.getText());
                if (edad >= 18) {
                    JOptionPane.showMessageDialog(frame, "Es mayor de edad");
                } else {
                    JOptionPane.showMessageDialog(frame, "No es mayor de edad");
                }
            }
        });
        panel1.add(label4);
        panel1.add(textField4);
        panel1.add(label5);
        panel1.add(textField5);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.setBackground(Color.green);

        frame.getContentPane().add(panel1);

        JPanel mathPanel = new JPanel();
        mathPanel.setLayout(new GridLayout(5, 3));
        mathPanel.setBackground(Color.cyan);

        JButton addButton = new JButton("Suma");
        addButton.addActionListener(e -> performOperation(frame, "suma"));
        JButton subtractButton = new JButton("Resta");
        subtractButton.addActionListener(e -> performOperation(frame, "resta"));
        JButton multiplyButton = new JButton("Multiplicación");
        multiplyButton.addActionListener(e -> performOperation(frame, "multiplicación"));
        JButton divideButton = new JButton("División");
        divideButton.addActionListener(e -> performOperation(frame, "división"));
        JButton sinButton = new JButton("Seno");
        sinButton.addActionListener(e -> performOperation(frame, "seno"));
        JButton cosButton = new JButton("Coseno");
        cosButton.addActionListener(e -> performOperation(frame, "coseno"));
        JButton sqrtButton = new JButton("Raíz Cuadrada");
        sqrtButton.addActionListener(e -> performOperation(frame, "raíz"));
        JButton powButton = new JButton("Potencia");
        powButton.addActionListener(e -> performOperation(frame, "potencia"));
        JButton logButton = new JButton("Logaritmo");
        logButton.addActionListener(e -> performOperation(frame, "logaritmo"));
        JButton expButton = new JButton("Exponencial");
        expButton.addActionListener(e -> performOperation(frame, "exponencial"));
        JButton tanButton = new JButton("Tangente");
        tanButton.addActionListener(e -> performOperation(frame, "tangente"));
        JButton absButton = new JButton("Valor Absoluto");
        absButton.addActionListener(e -> performOperation(frame, "absoluto"));
        JButton ceilButton = new JButton("Techo");
        ceilButton.addActionListener(e -> performOperation(frame, "techo"));
        JButton floorButton = new JButton("Piso");
        floorButton.addActionListener(e -> performOperation(frame, "piso"));
        JButton cbrtButton = new JButton("Raíz Cúbica");
        cbrtButton.addActionListener(e -> performOperation(frame, "raíz cúbica"));

        mathPanel.add(addButton);
        mathPanel.add(subtractButton);
        mathPanel.add(multiplyButton);
        mathPanel.add(divideButton);
        mathPanel.add(sinButton);
        mathPanel.add(cosButton);
        mathPanel.add(sqrtButton);
        mathPanel.add(powButton);
        mathPanel.add(logButton);
        mathPanel.add(expButton);
        mathPanel.add(tanButton);
        mathPanel.add(absButton);
        mathPanel.add(ceilButton);
        mathPanel.add(floorButton);
        mathPanel.add(cbrtButton);

        frame.getContentPane().add(mathPanel);
        frame.setVisible(true);
    }

    private static void performOperation(JFrame frame, String operation) {
        String input1 = JOptionPane.showInputDialog(frame, "Ingrese el primer número:");
        double num1 = Double.parseDouble(input1);
        double result = 0;

        switch (operation) {
            case "suma":
                String input2 = JOptionPane.showInputDialog(frame, "Ingrese el segundo número:");
                double num2 = Double.parseDouble(input2);
                result = num1 + num2;
                break;
            case "resta":
                input2 = JOptionPane.showInputDialog(frame, "Ingrese el segundo número:");
                num2 = Double.parseDouble(input2);
                result = num1 - num2;
                break;
            case "multiplicación":
                input2 = JOptionPane.showInputDialog(frame, "Ingrese el segundo número:");
                num2 = Double.parseDouble(input2);
                result = num1 * num2;
                break;
            case "división":
                input2 = JOptionPane.showInputDialog(frame, "Ingrese el segundo número:");
                num2 = Double.parseDouble(input2);
                result = num1 / num2;
                break;
            case "seno":
                result = Math.sin(num1);
                break;
            case "coseno":
                result = Math.cos(num1);
                break;
            case "raíz":
                result = Math.sqrt(num1);
                break;
            case "potencia":
                input2 = JOptionPane.showInputDialog(frame, "Ingrese el exponente:");
                num2 = Double.parseDouble(input2);
                result = Math.pow(num1, num2);
                break;
            case "logaritmo":
                result = Math.log(num1);
                break;
            case "exponencial":
                result = Math.exp(num1);
                break;
            case "tangente":
                result = Math.tan(num1);
                break;
            case "absoluto":
                result = Math.abs(num1);
                break;
            case "techo":
                result = Math.ceil(num1);
                break;
            case "piso":
                result = Math.floor(num1);
                break;
            case "raíz cúbica":
                result = Math.cbrt(num1);
                break;
        }

        JOptionPane.showMessageDialog(frame, "Resultado de la " + operation + ": " + result);
    }
}
