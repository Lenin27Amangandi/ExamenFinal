package ALDataAccess.DTO;

public class ALTipoHormigaDTO {

    private Integer idTipoHormiga;
    private String nombre;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALTipoHormigaDTO() {
    }

    public ALTipoHormigaDTO(Integer idTipoHormiga, String nombre, String estado, String fechaCrea, String fechaModifica) {
        this.idTipoHormiga = idTipoHormiga;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n idTipoHormiga:     " + getIdTipoHormiga()      +
                "\n nombre:             " + getNombre()           + 
                "\n estado:            " + getEstado()           +
                "\n fechaCrea:          " + getFechaCrea()          + 
                "\n fechaModifica:      " + getFechaModifica()           + "\n";
    }

    public Integer getIdTipoHormiga() {
        return idTipoHormiga;
    }

    public void setIdTipoHormiga(Integer idTipoHormiga) {
        this.idTipoHormiga = idTipoHormiga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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