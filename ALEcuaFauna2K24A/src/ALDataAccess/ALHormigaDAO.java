package ALDataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ALDataAccess.DTO.ALHormigaDTO;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ALHormigaDAO extends SQLiteDataHelper implements IDAO<ALHormigaDTO> {

    @Override
    public boolean create(ALHormigaDTO entity) throws Exception {

        String query = " INSERT INTO Hormiga (TipoHormiga,Sexo,Provincia,GenoAlimento,IngestaNativa) VALUES (?, ?, ?, ?,?)";
        try {Connection conn = openConnection();
            //  Statement stmt = conn.createStatement()
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getTipoHormiga());
            pstmt.setInt(2, entity.getSexo());
            pstmt.setInt(3, entity.getProvincia());
            pstmt.setInt(4, entity.getGenoAlimento());
            pstmt.setInt(5, entity.getIngestaNativa());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE Hormiga SET Estado = ? WHERE id = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "A");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Integer getMaxRow() throws Exception {
        String query = " SELECT COUNT(*)          "
                + " FROM    Hormiga"
                + " WHERE   Estado ='A'      ";
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return 0;
    }


    @Override
    public List<ALHormigaDTO> readAll() throws Exception {
        List<ALHormigaDTO> lst = new ArrayList<>();
        String query = "SELECT IdHormiga, TipoHormiga, Sexo, Provincia, GenoAlimento, IngestaNativa, Estado, FechaCrea, FechaModifica FROM Hormiga WHERE Estado = 'A'";
        try (Connection conn = openConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                ALHormigaDTO hormigaDTO = new ALHormigaDTO(
                    rs.getInt("IdHormiga"),
                    rs.getInt("TipoHormiga"),
                    rs.getInt("Sexo"),
                    rs.getInt("Provincia"),
                    rs.getInt("GenoAlimento"),
                    rs.getInt("IngestaNativa"),
                    rs.getString("Estado"),
                    rs.getString("FechaCrea"),
                    rs.getString("FechaModifica")
                );
                lst.add(hormigaDTO);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    @Override
    public ALHormigaDTO readBy(Integer id) throws Exception {
        ALHormigaDTO hormigaDTO = new ALHormigaDTO();
                String query = "SELECT IdHormiga, TipoHormiga, Sexo, Provincia, GenoAlimento, IngestaNativa,Estado,FechaCrea,FechaModifica "
             + "FROM Hormiga "
             + "WHERE Estado = 'A' AND IdHormiga = "+id;

        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                hormigaDTO = new ALHormigaDTO(rs.getInt("IdHormiga"),
                rs.getInt("TipoHormiga"),
                rs.getInt("Sexo"),
                rs.getInt("Provincia"),
                rs.getInt("GenoAlimento"),
                rs.getInt("IngestaNativa"),
                rs.getString("Estado"),
                rs.getString("FechaCrea"),
                rs.getString("FechaModifica"));
            }
        } catch (SQLException e) {
            throw e;
        }
        return hormigaDTO;
    }

    @Override
    public boolean update(ALHormigaDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Hormiga SET TipoHormiga = ? , FechaModifica = ? WHERE id = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, entity.getTipoHormiga());
            pstmt.setInt(2, entity.getSexo());
            pstmt.setInt(3, entity.getProvincia());
            pstmt.setInt(4, entity.getGenoAlimento());
            pstmt.setInt(5, entity.getIngestaNativa());
            pstmt.setString(6, dtf.format(now).toString());
            pstmt.setInt(7, entity.getIdHormiga());
            pstmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

}
