package ALDataAccess.DTO;

public class ALHormigaDTO {

    private Integer idHormiga;
    private Integer tipoHormiga;
    private Integer sexo;
    private Integer provincia;
    private Integer genoAlimento;
    private Integer ingestaNativa;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALHormigaDTO(Integer idHormiga, Integer tipoHormiga, Integer sexo, Integer provincia, Integer genoAlimento,
            Integer ingestaNativa, String estado, String fechaCrea, String fechaModifica) {
        this.idHormiga = idHormiga;
        this.tipoHormiga = tipoHormiga;
        this.sexo = sexo;
        this.provincia = provincia;
        this.genoAlimento = genoAlimento;
        this.ingestaNativa = ingestaNativa;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    public ALHormigaDTO() {
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n idHormiga:         " + getIdHormiga() +
                "\n tipoHormiga:       " + getTipoHormiga() +
                "\n sexo:              " + getSexo() +
                "\n provincia:         " + getProvincia() +
                "\n genoAlimento:      " + getGenoAlimento() +
                "\n ingestaNativa:     " + getIngestaNativa() +
                "\n estado:            " + getEstado() +
                "\n fechaCrea:         " + getFechaCrea() +
                "\n fechaModifica:     " + getFechaModifica() + "\n";
    }

    public Integer getIdHormiga() {
        return idHormiga;
    }

    public void setIdHormiga(Integer idHormiga) {
        this.idHormiga = idHormiga;
    }

    public Integer getTipoHormiga() {
        return tipoHormiga;
    }

    public void setTipoHormiga(Integer tipoHormiga) {
        this.tipoHormiga = tipoHormiga;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getProvincia() {
        return provincia;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia;
    }

    public Integer getGenoAlimento() {
        return genoAlimento;
    }

    public void setGenoAlimento(Integer genoAlimento) {
        this.genoAlimento = genoAlimento;
    }

    public Integer getIngestaNativa() {
        return ingestaNativa;
    }

    public void setIngestaNativa(Integer ingestaNativa) {
        this.ingestaNativa = ingestaNativa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(String fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public String getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

}