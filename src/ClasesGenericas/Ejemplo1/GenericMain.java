package ClasesGenericas.Ejemplo1;

public class GenericMain {
    public static void main(String[] args) {

        Producto producto = new Producto();
        producto.setId("1");
        producto.setNombre("Iphone 16");
        producto.setDescripcion("Telefono de nuevo lanzamiento de apple 2025.");

        Notificacion<Producto> notificacion = new Notificacion<>(producto);
        notificacion.getRegistroHistorico().add("1) Producto fue enviado por el vendedor.");
        notificacion.getRegistroHistorico().add("2) Producto ha llegado al transportista.");
        notificacion.getRegistroHistorico().add("3) Producto ha salido del transportista.");

        registro(notificacion, "Productos nacionales");

        System.out.println(notificacion.getRegistroHistorico());

        //System.out.println(notificacion.getObjeto().getDescripcion());

        Proveedor proveedor = new Proveedor();
        proveedor.setId("18");
        proveedor.setNombre("Apple");
        proveedor.setDescripcion("Envio del producto via aerea.");

        Notificacion<Proveedor> notificacionProveedor = new Notificacion<>(proveedor);
        //System.out.println(notificacionProveedor.getObjeto().getDescripcion());
        notificacionProveedor.getRegistroHistorico().add("1) Producto disponible en stock del provedor.");

        registro(notificacionProveedor, "proveedores");
        System.out.println(notificacionProveedor.getRegistroHistorico());
    }

    public static void registro(Notificacion notificacion, String departamento){
        notificacion.getRegistroHistorico().add("Paso por el departamento: "+departamento);
    }
}
