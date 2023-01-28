import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
      
        MyLabelLogo logo = new MyLabelLogo(); // Cria o objeto para o logo
        //logo.setText("E ai meu garoto!");
        JPanel logoPanel = new JPanel(); // Criao  um objeto painel baseado na definição 
        logoPanel.setBackground(Constantes.primaryColor); // seta a cor do painel
        logoPanel.setBounds(0, 0, 170, 100 ); // define o tamanho do painel
        
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Constantes.primaryColor);  
        menuPanel.setBounds(170, 0, 330, 100 );

        JPanel conteudoPanel = new JPanel();
        conteudoPanel.setBackground(Constantes.secundaryColor);  
        conteudoPanel.setBounds(0, 100, 500, 400 );
        conteudoPanel.setLayout(null);
        
        MyFrame myFrame = new MyFrame();  // Cria o objeto Frame
        
        logoPanel.add(logo); // adciona o objeto logo ao objeto painel
        myFrame.add(logoPanel); // adiciona o objeto painel ao objeto frame
         
        myFrame.add(menuPanel);
    

        myFrame.add(conteudoPanel);
        
    }
}
