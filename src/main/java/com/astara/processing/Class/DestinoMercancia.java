import java.util.Date;

class DestinoMercancia {
    private String codigoEntidad;
    private String codigoDireccion;
    private String estado;
    private String codigoCliente;
    private String campa;
    private String descripcionEntidad;
    private String tipoVia;
    private String descripcionDireccion;
    private String numeroVia;
    private String extensionDireccion;
    private String localidad;
    private String codigoPostal;
    private String provincia;
    private String telefonoContacto;
    private Date fechaCreacionSIL;
    private Date fechaModificacionSIL;

    // Constructor
    public DestinoMercancia(String codigoEntidad, String codigoDireccion, String estado,
                            String codigoCliente, String campa, String descripcionEntidad,
                            String tipoVia, String descripcionDireccion, String numeroVia,
                            String extensionDireccion, String localidad, String codigoPostal,
                            String provincia, String telefonoContacto, Date fechaCreacionSIL,
                            Date fechaModificacionSIL) {
        this.codigoEntidad = codigoEntidad;
        this.codigoDireccion = codigoDireccion;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
        this.campa = campa;
        this.descripcionEntidad = descripcionEntidad;
        this.tipoVia = tipoVia;
        this.descripcionDireccion = descripcionDireccion;
        this.numeroVia = numeroVia;
        this.extensionDireccion = extensionDireccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.telefonoContacto = telefonoContacto;
        this.fechaCreacionSIL = fechaCreacionSIL;
        this.fechaModificacionSIL = fechaModificacionSIL;
    }

