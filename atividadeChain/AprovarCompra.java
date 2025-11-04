public class AprovarCompra {

    private AbsHandler handler;

    public AprovarCompra(){
        AbsHandler comprador = new CompradorHandle();
        AbsHandler gerente = new GerenteHandler();
        AbsHandler diretor = new DiretorHandler();

        comprador.setNextHandler(gerente);
        gerente.setNextHandler(diretor);

        this.handler = comprador;
    }

    public void autorizar(double valor){
        handler.handleRequest(valor);
    }

    
}
