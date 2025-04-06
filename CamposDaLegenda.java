import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CamposDaLegenda extends JFrame{

    private JTextField pipoca;
    private JPasswordField alcacus;
    private JButton ok;
    private JLabel loggol;

    public CamposDaLegenda(){

        super("Pipoca e Alcaçus");
        setLayout(null);
        loggol = new JLabel(new ImageIcon("img.png"));
        loggol.setBounds(10, 10, 242, 208);
        add(loggol);

        pipoca = new JTextField(10);
        pipoca.setBounds(262, 40, 120, 25);
        add (pipoca);

        alcacus = new JPasswordField(10);
        alcacus.setBounds(262, 80, 120, 25);
        add(alcacus);

        ok = new JButton("Ok");
        ok.setBounds(300, 120, 60, 30);
        add(ok);

        Humbler handler = new Humbler();
        ok.addActionListener(handler);

    }

    private class Humbler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            String linha = "";
            String senha = "";
            linha  = pipoca.getText();
            senha  = new String (alcacus.getPassword());

            JOptionPane.showMessageDialog(null, "Ola "+linha+", sua senha é: "+senha);

        }
    }
}
