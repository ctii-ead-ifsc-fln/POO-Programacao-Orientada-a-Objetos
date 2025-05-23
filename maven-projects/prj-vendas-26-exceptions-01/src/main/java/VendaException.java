
public class VendaException extends Exception {
	//Constroi uma VendaException
	public VendaException() {
    }
	//Constroi uma VendaException com uma mensagem personalizada
    public VendaException(String msg) {
        super(msg);
    }
    //Constroi uma VendaException com uma mensagem personalizada e a causa
    public VendaException(String msg, Exception cause) {
        super(msg, cause);
    }
}
