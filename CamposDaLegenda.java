package humblehandler;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CamposDaLegenda extends JFrame{
    
    private JTextField pipoca, batata, pacoca;
    private JPasswordField alcacus;
    
    public CamposDaLegenda(){
        
        super("Pipoca Batata e paçoca");
        setLayout(new FlowLayout());
        
        pipoca = new JTextField(10);
        add (pipoca);
        
        batata = new JTextField("Insira o contexto ");
        add(batata);
        
        pacoca = new JTextField("Texto Intankavel ", 21);
        pacoca.setEditable(false);
        add(pacoca);
        
        alcacus = new JPasswordField("Texto oculto ");
        add(alcacus);
        
        Humbler handler = new Humbler();
        pipoca.addActionListener(handler);
        batata.addActionListener(handler);
        pacoca.addActionListener(handler);
        alcacus.addActionListener(handler);
       
    }
    
    private class Humbler implements ActionListener{
      
        public void actionPerformed(ActionEvent event){
            String linha = "";
            
            if(event.getSource() == pipoca)
                linha  = String.format("pipoca: %s", event.getActionCommand());
                
            else if(event.getSource() == batata)
                linha  = String.format("batata: %s", event.getActionCommand());
                
            else if(event.getSource() == pacoca)
                linha  = String.format("pacoca: %s", event.getActionCommand());
                
            else if(event.getSource() == alcacus)
                linha  = String.format("alcacus: %s", event.getActionCommand());
                
                JOptionPane.showMessageDialog(null, linha);
            
        }
    } 
}
