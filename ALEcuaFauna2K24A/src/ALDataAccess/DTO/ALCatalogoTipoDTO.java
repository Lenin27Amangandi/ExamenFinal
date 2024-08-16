package ALDataAccess.DTO;

public class ALCatalogoTipoDTO {

    private int idCatalogoTipo;
    private String nombre;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALCatalogoTipoDTO() {
    }

    public ALCatalogoTipoDTO(int idCatalogoTipo, String nombre, String estado, String fechaCrea, String fechaModifica) {
        this.idCatalogoTipo = idCatalogoTipo;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n idCatalogoTipo:         " + getIdCatalogoTipo()  +
                "\n nombre:                 " + getNombre()          + 
                "\n estado:                 " + getEstado()          +
                "\n fechaCrea:              " + getFechaCrea()       + 
                "\n fechaModifica:          " + getFechaModifica()   + "\n";
    }

    public int getIdCatalogoTipo() {
        return idCatalogoTipo;
    }

    public void setIdCatalogoTipo(int idCatalogoTipo) {
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