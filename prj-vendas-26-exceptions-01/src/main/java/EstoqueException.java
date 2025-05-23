
public class EstoqueException extends Exception{
	//Constroi EstoqueException
	public EstoqueException() {
	}
	//Constroi EstoqueException com uma mensagem personalizada
	public EstoqueException(String msg) {
		super(msg);
	}
	//Constroi EstoqueException com uma mensagem personalizada e a causa
	public EstoqueException(String msg, Exception cause) {
	    super(msg, cause);
	}
}
