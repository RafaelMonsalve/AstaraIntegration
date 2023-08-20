import java.util.Date;

class PackingList {
    private String nombrePackingList;
    private String codigoMedioPackingList;
    private Date fechaSalidaOrigen;
    private Date fechaPrevistaLlegada;
    private String estado;
    private int cantidadVehiculos;
    private String campa;
    private String codigoCliente;

    // Constructor
    public PackingList(String nombrePackingList, String codigoMedioPackingList,
                      Date fechaSalidaOrigen, Date fechaPrevistaLlegada,
                      String estado, int cantidadVehiculos,
                      String campa, String codigoCliente) {
        this.nombrePackingList = nombrePackingList;
        this.codigoMedioPackingList = codigoMedioPackingList;
        this.fechaSalidaOrigen = fechaSalidaOrigen;
        this.fechaPrevistaLlegada = fechaPrevistaLlegada;
        this.estado = estado;
        this.cantidadVehiculos = cantidadVehiculos;
        this.campa = campa;
        this.codigoCliente = codigoCliente;
    }

    // Getters y setters

    public String getNombrePackingList() {
        return nombrePackingList;
    }

    public void setNombrePackingList(String nombrePackingList) {
        this.nombrePackingList = nombrePackingList;
    }

    public String getCodigoMedioPackingList() {
        return codigoMedioPackingList;
    }

    public void setCodigoMedioPackingList(String codigoMedioPackingList) {
        this.codigoMedioPackingList = codigoMedioPackingList;
    }

    public Date getFechaSalidaOrigen() {
        return fechaSalidaOrigen;
    }

    public void setFechaSalidaOrigen(Date fechaSalidaOrigen) {
        this.fechaSalidaOrigen = fechaSalidaOrigen;
    }

    public Date getFechaPrevistaLlegada() {
        return fechaPrevistaLlegada;
    }

    public void setFechaPrevistaLlegada(Date fechaPrevistaLlegada) {
        this.fechaPrevistaLlegada = fechaPrevistaLlegada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public String getCampa() {
        return campa;
    }

    public void setCampa(String campa) {
        this.campa = campa;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
