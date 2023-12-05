package Auto;

public class CorreoElectronico {
    private String direccion;
    private String proveedor;

    public CorreoElectronico(String direccion, String proveedor) {
        this.direccion = direccion;
        this.proveedor = proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
