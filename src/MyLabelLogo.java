import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.Border;

public class MyLabelLogo extends JLabel{

    MyLabelLogo() {
        ImageIcon image = new ImageIcon("cawt.png"); // Cria um objeto imagem
        Border border = BorderFactory.createLineBorder(Color.orange, 3);
     
        this.setIcon(image);  // Define a imagem para o label
        this.setHorizontalTextPosition(JLabel.CENTER);  // alinha o texto do label
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(Constantes.secundaryColor); // Define cor
        this.setFont(Constantes.primaryFont);   // Define cor da fonte do label
        this.setIconTextGap(-25);  // Posiciona o texto em relação a imagem
        this.setBackground(Color.black); // Define o cor do fundo do label
        this.setOpaque(true);
        this.setBorder(border); // Define o uso da bordar
        this.setBounds(10, 20, 150, 60); // Posiona o label

        this.setHorizontalAlignment(JLabel.CENTER); // define posição horizontal
        this.setVerticalAlignment(JLabel.CENTER); // define posição vertical
    }

    
}
