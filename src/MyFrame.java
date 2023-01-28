
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener  {

    JButton button;

    public MyFrame(){
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);

        this.setSize(Constantes.LARGURA, Constantes.ALTURA); // Defini altura e largura this
        this.setTitle("This principal Java Swing"); // Defini titulo do Frgame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define ação do botão close
        this.setLayout(null); //Define layout do frane 
        this.setResizable(true); // Define ajuste tamanha do this
        this.setVisible(true); // Torna visível o this
        this.setBackground(Constantes.secundaryColor);
        // this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().setBackground(Constantes.primaryColor);
        //this.pack();
        button.setText("OK");
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Botão foi clicado!");
		//ALTERA A FONTE
		button.setFont(new Font("SansSerif", Font.BOLD, 20));

        
    }


}
