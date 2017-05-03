package F9_ex2_moreviews.g_desenho;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Observable;
import java.util.Observer;

public class PainelDesenho extends Observable implements Observer
{
    private DadosDesenho dados;

    public PainelDesenho(DadosDesenho dados) 
    {
        this.dados = dados; //Modelo
        this.dados.addObserver(this); //Regista-se (a Vista) no Modelo para que este possa mandá-la actualizar-se

        // Liga os objectos gráficos aos respectivos listeners
        this.addMouseListener(new InicioListener());
        this.addMouseMotionListener(new DeslocaListener());
    }

    //  Liga os objectos gráficos aos respectivos listeners permitindo
    //  que interajam com o utilizador
    class InicioListener extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e) 
        {
            super.mousePressed(e);
            dados.defineNovalOval(e.getX(),e.getY());
        }
    }
    
    class DeslocaListener extends MouseMotionAdapter
    {
        @Override
        public void mouseDragged(MouseEvent e)
        {
            super.mouseDragged(e);
            dados.setCantoFinal(e.getX(),e.getY());
        }
    }

    @Override
    public void update(Observable o, Object arg)
    {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {

        int xi, xf, yi, yf;

        super.paintComponent(g);
        
        // Delimita o painel com linhas a preto
        g.setColor(Color.BLACK);
        g.drawRect(0,0,getWidth()-1,getHeight()-1);

        if (dados.getXi() < 0) //A figura ainda não se encontra definida
            return;

        // Define a cor da oval que será desenhada de acordo com a cor no Modelo (dados)
        g.setColor(new Color(dados.getComponenteCor_R(),dados.getComponenteCor_G(),dados.getComponenteCor_B()));

        // Obtém as coordenadas da oval no Modelo (dados)
        xi=dados.getXi(); xf=dados.getXf();
        yi=dados.getYi(); yf=dados.getYf();

        // Desenha uma oval a cheio no painel tendo em conta as coordenadas obtidas 
        g.fillOval(Math.min(xi,xf),Math.min(yi,yf),Math.abs(xf-xi) + 1,Math.abs(yf-yi) + 1);
        
    }

  
}
