package UserInterface.Forms;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import BusinessLogic.Entities.ALHormigaBL;
import UserInterface.Style;
import java.awt.BorderLayout;

public class Object extends JPanel {

    public static JFrame jfrObject;

    public JLabel ALjlbFranja = new JLabel(),
            ALjlbCedula = new JLabel("Cedula:"),
            ALjlbNombre = new JLabel("Nombres:"),
            ALjlbLTitulo = new JLabel("Hormiguero Virtual"),
            ALjlbLogo = new JLabel();

    public TextField ALtfCedula = new TextField("  1753193828"),
            ALtfNombre = new TextField("  LeninAmangandi");

    public JButton ALjbCrear = new JButton("Crear hormiga larva"),
            ALjbAlimentarG = new JButton("Alimentar con GenoAlimento"),
            ALjbAlimentarI = new JButton("Alimentar con Ingesta Nativa"),
            ALjbEliminar = new JButton("Eliminar"),
            ALjbGuardar = new JButton("Guardar");

    JComboBox<String> ALcbGeno = new JComboBox<>(new String[] { "<GenoAlimento>", "X", "XX", "XY" });
    JComboBox<String> ALcbIngesta = new JComboBox<>(
            new String[] { "<IngestaNativa>", "Carnívoro", "Herbívoro", "Omnívoro", "Insectívoro" });

    public Object() {
        ALCuztomizeComponent();
    }

    private void ALCuztomizeComponent() {
        setLayout(null);

        ImageIcon img_logo;
        img_logo = new ImageIcon(Style.URL_Logo);
        ALjlbLogo.setIcon(img_logo);

        String[] columnNames = { "Tipo Hormiga", "Sexo", "Ubicacion", "GenoAlimento", "IngestaNativa" };
        String[][] data = {
                { "Hormiga", "Hembra", "Pichincha", "Hoja", "Alta" },
                { "Reina", "Hembra", "Guayas", "Semilla", "Media" }
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        setBounds(30, 30, 40, 40);
        setVisible(true);

        try {
            // COLOR
            ALjlbLTitulo.setForeground(Style.COLOR_TITLE);
            ALjbCrear.setForeground(Style.COLOR_BOTON);
            ALjbAlimentarG.setForeground(Style.COLOR_BOTON);
            ALjbAlimentarI.setForeground(Style.COLOR_BOTON);
            ALjbCrear.setBackground(Style.COLOR_BOTON_U);
            ALjbAlimentarG.setBackground(Style.COLOR_BOTON_U);
            ALjbAlimentarI.setBackground(Style.COLOR_BOTON_U);
            ALjbGuardar.setBackground(Style.COLOR_BOTON_D);
            ALjbEliminar.setBackground(Style.COLOR_BOTON_D);
            ALcbGeno.setBackground(Color.WHITE);
            ALcbIngesta.setBackground(Color.WHITE);
            ALjlbFranja.setOpaque(true);
            ALjlbFranja.setBackground(Color.WHITE);
            // FONTS
            ALjlbCedula.setFont(Style.FONT_NEGRITA);
            ALjlbNombre.setFont(Style.FONT_NEGRITA);
            ALtfCedula.setFont(Style.Font_TXT);
            ALtfNombre.setFont(Style.Font_TXT);
            ALjlbLTitulo.setFont(Style.FONT_TITLE);
            // UBICACIONES
            ALjlbCedula.setBounds(200, 25, 100, 20);
            ALtfCedula.setBounds(450, 25, 150, 25);
            ALjlbNombre.setBounds(200, 50, 100, 20);
            ALtfNombre.setBounds(450, 50, 150, 25);
            ALjlbLogo.setBounds(50, 100, 45, 57); // IMAGEN
            ALjlbLTitulo.setBounds(125, 110, 200, 40);
            ALjbCrear.setBounds(450, 125, 200, 40);
            ALcbGeno.setBounds(150, 400, 200, 40);
            ALcbIngesta.setBounds(150, 450, 200, 40);
            ALjbAlimentarG.setBounds(450, 400, 200, 40);
            ALjbAlimentarI.setBounds(450, 450, 200, 40);
            ALjbGuardar.setBounds(450, 500, 200, 40);
            ALjbEliminar.setBounds(150, 500, 200, 40);
            scrollPane.setBounds(0, 180, 800, 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        add(ALjlbFranja);
        add(ALjlbCedula);
        add(ALjlbNombre);
        add(ALjlbLogo);
        add(ALjlbLTitulo);
        add(ALtfCedula);
        add(ALtfNombre);
        add(ALjbCrear);
        add(ALjbAlimentarG);
        add(ALjbAlimentarI);
        add(ALjbEliminar);
        add(ALjbGuardar);
        add(ALcbGeno);
        add(ALcbIngesta);
        add(scrollPane);
    }
}