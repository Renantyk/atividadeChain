public abstract class AbsHandler {
    protected AbsHandler nextHandler;

    public void setNextHandler(AbsHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(double valor);

    private boolean canHandle(double valor){
        return false;
    }
}
