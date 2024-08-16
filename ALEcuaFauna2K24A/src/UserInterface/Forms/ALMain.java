package UserInterface.Forms;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ALDataAccess.ALHormigaDAO;
import ALDataAccess.DTO.ALHormigaDTO;
import UserInterface.Style;

public class ALMain extends JFrame {

    JPanel pnlMain = new JPanel();
    Object pnlObject = new Object();
    JFrame jfrRaya = new JFrame();
    ALHormigaDAO hormigaDAO = new ALHormigaDAO();


    // Campos de texto para ingresar valores
    JTextField ALtxtTipoHormiga = new JTextField();
    JComboBox<String> ALcmbSexo = new JComboBox<String>();
    JComboBox<String> ALcmbProvincia = new JComboBox<String>();
    JComboBox<String> ALcmbGenoAlimento = new JComboBox<String>();
    JComboBox<String> ALcmbIngestaNativa = new JComboBox<String>();


    public ALMain(String titleInterface) {
        cuztomizeComponent(titleInterface);


        ALcmbSexo.addItem("Macho");
        ALcmbSexo.addItem("Hembra");
        ALcmbProvincia.addItem("Provincia 1");
        ALcmbProvincia.addItem("Provincia 2");
        ALcmbGenoAlimento.addItem("Geno Alimento 1");
        ALcmbGenoAlimento.addItem("Geno Alimento 2");
        ALcmbIngestaNativa.addItem("Ingestión Nativa 1");
        ALcmbIngestaNativa.addItem("Ingestión Nativa 2");

        pnlObject.ALjbCrear.addActionListener(e -> System.exit(0));

        pnlObject.ALjbCrear.addActionListener(e -> {
            ALHormigaDTO hormigaDTO = new ALHormigaDTO();
            hormigaDTO.setTipoHormiga(Integer.parseInt(ALtxtTipoHormiga.getText()));
            hormigaDTO.setSexo(ALcmbSexo.getSelectedIndex() + 1); // +1 porque el índice del combo comienza en 0
            hormigaDTO.setProvincia(ALcmbProvincia.getSelectedIndex() + 1);
            hormigaDTO.setGenoAlimento(ALcmbGenoAlimento.getSelectedIndex() + 1);
            hormigaDTO.setIngestaNativa(ALcmbIngestaNativa.getSelectedIndex() + 1);
        
            try {
                hormigaDAO.create(hormigaDTO);
                System.out.println("Hormiga creada con éxito");
            } catch (Exception ex) {
                System.out.println("Error al crear hormiga: " + ex.getMessage());
            }
        });

        pnlObject.ALjbCrear.addActionListener(e -> {
            ALHormigaDTO hormigaDTO = new ALHormigaDTO();
            hormigaDTO.setTipoHormiga(1); 
            hormigaDTO.setSexo(1); 
            hormigaDTO.setProvincia(1); 
            hormigaDTO.setGenoAlimento(1); 
            hormigaDTO.setIngestaNativa(1); 

            try {
                hormigaDAO.create(hormigaDTO);
                System.out.println("Hormiga creada con éxito");
            } catch (Exception ex) {
                System.out.println("Error al crear hormiga: " + ex.getMessage());
            }
        });

        pnlObject.ALjbAlimentarG.addActionListener(e -> System.exit(0));
        pnlObject.ALjbAlimentarI.addActionListener(e -> System.exit(0));
        pnlObject.ALjbEliminar.addActionListener(e -> System.exit(0));
        pnlObject.ALjbGuardar.addActionListener(e -> System.exit(0));

    }

    private void cuztomizeComponent(String titleInterface) {
        setBackground(Style.COLOR_INTERFAZ);
        setTitle(titleInterface);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        add(pnlObject);
        setVisible(true);
    }
}
