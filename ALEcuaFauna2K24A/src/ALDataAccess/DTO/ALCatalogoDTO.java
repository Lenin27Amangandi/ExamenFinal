package ALDataAccess.DTO;

public class ALCatalogoDTO {

    private Integer idCatalogo;
    private Integer idCatalogoTipo;
    private String nombre;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALCatalogoDTO() {
    }

    public ALCatalogoDTO(Integer idCatalogo, Integer idCatalogoTipo, String nombre, String estado, String fechaCrea,
            String fechaModifica) {
        this.idCatalogo = idCatalogo;
        this.idCatalogoTipo = idCatalogoTipo;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n idCatalogo:         " + getIdCatalogo()      +
                "\n idCatalogoTipo:     " + getIdCatalogoTipo()  +
                "\n nombre;             " + getNombre()           + 
                "\n estado:            " + getEstado()           +
                "\n fechaCrea            " + getFechaModifica()          + 
                "\n fechaModifica       " + getFechaModifica()           + "\n";
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Integer getIdCatalogoTipo() {
        return idCatalogoTipo;
    }

    public void setIdCatalogoTipo(Integer idCatalogoTipo) {
        this.idCatalogoTipo = idCatalogoTipo;
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
