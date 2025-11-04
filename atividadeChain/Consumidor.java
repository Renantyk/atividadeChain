public class Consumidor {
    
    public static void main(String[] args) {
        AprovarCompra aprovar = new AprovarCompra();

        aprovar.autorizar(400);
        aprovar.autorizar(4000);
        aprovar.autorizar(400000);
    }
}
