import java.util.List;

import ALDataAccess.ALHormigaDAO;
import ALDataAccess.DTO.ALCatalogoDTO;
import ALDataAccess.DTO.ALHormigaDTO;
import UserInterface.Forms.ALMain;

public class App {
    public static void main(String[] args) throws Exception {
        ALMain formulario = new ALMain("EcuaFauna 2K24A");

        try {
        ALHormigaDAO hoorDAO = new ALHormigaDAO();
        for (ALHormigaDTO hormiga : hoorDAO.readAll()) {
        System.out.println(hormiga);
        }
        } catch (Exception e) {
        System.err.println("Error al leer las hormigas: " + e.getMessage());
        e.printStackTrace();
        }

        // ALHormigaDTO s = new ALHormigaDTO();
        // s.setTipoHormiga(4);
        // s.setSexo(6);
        // s.setProvincia(4);
        // s.setGenoAlimento(4);
        // s.setIngestaNativa(4);
        // s.setEstado("Viva");
        //ALHormigaDAO oH = new ALHormigaDAO();
        // oH.create(s);
        // System.out.println(oH.readBy(2).toString());
        //Funciona para buscar con readby
        //System.out.println(oH.readBy(4));
    }
}
