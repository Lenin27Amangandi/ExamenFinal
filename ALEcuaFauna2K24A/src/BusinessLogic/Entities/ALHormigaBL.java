package BusinessLogic.Entities;

import java.util.List;

import ALDataAccess.ALHormigaDAO;
import ALDataAccess.DTO.ALHormigaDTO;

public class ALHormigaBL {
    private ALHormigaDTO sexo;
    private ALHormigaDAO sDAO = new ALHormigaDAO();

    public ALHormigaBL(){}

    public List<ALHormigaDTO> getAll() throws Exception{
        List<ALHormigaDTO> lst = sDAO.readAll();
        for (ALHormigaDTO XXHormigaDTO : lst) 
            XXHormigaDTO.setTipoHormiga(XXHormigaDTO.getTipoHormiga());
        return lst;
    }
    public ALHormigaDTO getBy(int idSexo) throws Exception{
        sexo = sDAO.readBy(idSexo);
        return sexo;
    }
    public boolean add(ALHormigaDTO XXHormigaDTO) throws Exception{   
        return sDAO.create(XXHormigaDTO);
    }
    public boolean update(ALHormigaDTO XXHormigaDTO) throws Exception{
        return sDAO.update(XXHormigaDTO);
    }
    public boolean delete(int idSexo) throws Exception{
        return sDAO.delete(idSexo);
    }
    public Integer getRowCount() throws Exception{
        return sDAO.getMaxRow();
    }
}
