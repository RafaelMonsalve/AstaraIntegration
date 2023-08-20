import java.util.Date;

class SolicitudServiciosManualesAutomaticos {
    private int idLinea;
    private String estado;
    private String codigoCliente;
    private String campa;
    private String bastidor;
    private String matricula;
    private String codigoServicio;
    private String descServicio;
    private Date fechaSolicitud;
    private String refCliente;
    private String refAlmacen;
    private String prioridad;
    private String flota;
    private Date fechaInicio;
    private Date fechaMaxEntrega;


    public SolicitudServiciosManualesAutomaticos(int idLinea, String estado, String codigoCliente,
                                                 String campa, String bastidor, String matricula,
                                                 String codigoServicio, String descServicio,
                                                 Date fechaSolicitud, String refCliente,
                                                 String refAlmacen, String prioridad, String flota,
                                                 Date fechaInicio, Date fechaMaxEntrega) {
        this.idLinea = idLinea;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
        this.campa = campa;
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.codigoServicio = codigoServicio;
        this.descServicio = descServicio;
        this.fechaSolicitud = fechaSolicitud;
        this.refCliente = refCliente;
        this.refAlmacen = refAlmacen;
        this.prioridad = prioridad;
        this.flota = flota;
        this.fechaInicio = fechaInicio;
        this.fechaMaxEntrega = fechaMaxEntrega;
    }

