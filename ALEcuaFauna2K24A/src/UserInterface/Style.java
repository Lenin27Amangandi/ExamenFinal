package UserInterface;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.SwingConstants;

public abstract class Style {
    public static final Color COLOR_BOTON= Color.WHITE;
    public static final Color COLOR_BOTON_U= new Color(90,97,98);
    public static final Color COLOR_BOTON_D= new Color(171,233,247);
    public static final Color COLOR_INTERFAZ= new Color(205,218,213);
    public static final Color COLOR_TITLE= Color.BLUE;
    
    public static final Font Font_Normal = new Font("Arial", 0 , 10);
    public static final Font Font_TXT = new Font("Arial", 0|1 , 12);
    public static final Font FONT_TITLE = new Font("Verdana",1,18);
    public static final Font FONT_NEGRITA = new Font("JetBrains Mono",1,14);
    public static final Font FONT_CURSIVA = new Font("JetBrains Mono",2,14);;
    
    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;
    public static final int ALIGNMENT_RIGT = SwingConstants.RIGHT;
    public static final int ALIGNMENT_CENTER = SwingConstants.CENTER;

    public static final URL URL_Logo = Style.class.getResource("/UserInterface/Resources/Img/Logo.jpg");
}
