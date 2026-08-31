import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BhaskSolver extends JFrame implements ActionListener {

    JLabel lb1 = new JLabel("Valor de A");
    JLabel lb2 = new JLabel("Valor de B");
    JLabel lb3 = new JLabel("Valor de C");
    JLabel lbout = new JLabel("Bhaskara");

    JTextField txt1 = new JTextField(8);
    JTextField txt2 = new JTextField(8);
    JTextField txt3 = new JTextField(8);

    JTextField txtout = new JTextField(8);

    JButton[] buttons = {
            new JButton("Calcular"),
            new JButton("<"),
            new JButton(">")
    };

    Object[][] historico = new Object[3][4];
    int idx = 0;
    int maxHistorico = 0;

    public BhaskSolver() {
        super("Bhaskara Solver");
        setSize(new Dimension(200, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        txtout.setEditable(false);

        add(lb1);
        add(txt1);
        add(lb2);
        add(txt2);
        add(lb3);
        add(txt3);
        add(lbout);
        add(txtout);

        for (JButton b : buttons) {
            add(b);
            b.addActionListener(this);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[0]) {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                double c = Double.parseDouble(txt3.getText());

                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "A deve ser diferente de 0 !");
                    txt1.setText("");
                    return;
                }

                double delta = Calculo.calcularDelta(a, b, c);
                double[] raizes = Calculo.calcularRaizes(a, b, c);

                String resultado;
                if (delta < 0) {
                    resultado = "Sem solucao real";
                } else if (delta == 0) {
                    resultado = String.format("Delta=%.2f; RES=%.2f", delta, raizes[0]);
                    rotina(resultado, a, b, c);
                } else {
                    resultado = String.format("Delta=%.2f; x1=%.2f; x2=%.2f", delta, raizes[0], raizes[1]);
                    rotina(resultado, a, b, c);
                }

                txtout.setText(resultado);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valores incorretos ou inadequados ! ");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro de execucao !");
            }

        } else if (e.getSource() == buttons[1]) { // anterior
            if (idx + 1 < maxHistorico) {
                idx++;
                carregarHistorico(idx);
            }
        } else if (e.getSource() == buttons[2]) { // próximo
            if (idx - 1 >= 0) {
                idx--;
                carregarHistorico(idx);
            }
        }
    }

    private void adicionarNoHistorico(String resultado, String a, String b, String c) {

        historico[2] = historico[1];
        historico[1] = historico[0];
        historico[0] = new String[] { resultado, a, b, c };
        idx = 0;
        if (maxHistorico < 3)
            maxHistorico++;
    }

    private void carregarHistorico(int indice) {
        txtout.setText(historico[indice][0] + "");
        txt1.setText(historico[indice][1] + "");
        txt2.setText(historico[indice][2] + "");
        txt3.setText(historico[indice][3] + "");
    }

    private void rotina(String resultado, double a, double b, double c) {
        String[] arr = { resultado, a + "", b + "", c + "" };
        if (historico[0] != null) {
            boolean igual = true;
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals(historico[0][i])) {
                    igual = false;
                    break;
                }
            }
            if (igual)
                return;
        }
        adicionarNoHistorico(resultado, a + "", b + "", c + "");

    }

    public static void main(String[] args) {
        new BhaskSolver();
    }
}

class Calculo {
    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double[] calcularRaizes(double a, double b, double c) {
        double delta = calcularDelta(a, b, c);
        if (delta < 0)
            return null; // sem solução real
        double[] raizes = {
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a) };
        return raizes;
    }
}