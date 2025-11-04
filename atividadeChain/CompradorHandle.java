public class CompradorHandle extends AbsHandler{

    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)){
            System.out.println("Compra autorizada para o comprador");
        }else{
            nextHandler.handleRequest(valor);
        }
    }

    private boolean canHandle(double valor){
        return (valor<=1000);
    }
    
}
