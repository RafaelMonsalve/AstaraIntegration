class SolicitudServicioDetalleMateriales {
    private int idLinea;
    private String estado;
    private String codigoCliente;
    private String campa;
    private String bastidor;
    private String matricula;
    private String codigoServicio;
    private String refMaterial;
    private String descMaterial;

    // Constructor
    public SolicitudServicioDetalleMateriales(int idLinea, String estado, String codigoCliente,
                                              String campa, String bastidor, String matricula,
                                              String codigoServicio, String refMaterial,
                                              String descMaterial) {
        this.idLinea = idLinea;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
        this.campa = campa;
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.codigoServicio = codigoServicio;
        this.refMaterial = refMaterial;
        this.descMaterial = descMaterial;
    }



    public void imprimirDetalles() {
        System.out.println("ID de línea: " + idLinea);
        System.out.println("Estado: " + estado);
        System.out.println("Código de cliente: " + codigoCliente);
        System.out.println("Campa: " + campa);
        System.out.println("Bastidor: " + bastidor);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Código de servicio: " + codigoServicio);
        System.out.println("Referencia de material: " + refMaterial);
        System.out.println("Descripción de material: " + descMaterial);
    }


