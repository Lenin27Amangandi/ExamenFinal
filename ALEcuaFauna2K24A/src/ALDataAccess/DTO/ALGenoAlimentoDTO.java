package ALDataAccess.DTO;

public class ALGenoAlimentoDTO {

    private Integer idGenoAlimento;
    private String nombre;
    private String estado;
    private String fechaCrea;
    private String fechaModifica;

    public ALGenoAlimentoDTO() {
    }

    public ALGenoAlimentoDTO(Integer idGenoAlimento, String nombre, String estado, String fechaCrea, String fechaModifica) {
        this.idGenoAlimento = idGenoAlimento;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
        this.fechaModifica = fechaModifica;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n idGenoAlimento:     " + getIdGenoAlimento()      +
                "\n nombre:             " + getNombre()           + 
                "\n estado:            " + getEstado()           +
                "\n fechaCrea:          " + getFechaCrea()          + 
                "\n fechaModifica:      " + getFechaModifica()           + "\n";
    }

    public Integer getIdGenoAlimento() {
        return idGenoAlimento;
    }

    public void setIdGenoAlimento(Integer idGenoAlimento) {
        this.idGenoAlimento = idGenoAlimento;
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