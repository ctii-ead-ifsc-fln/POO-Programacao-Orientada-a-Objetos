
public class MainApp {
	public static void main(String[] args) {
		Porta p1 = new PortaCorrer();
		Porta p2 = new PortaConvencional();
		
		Janela j1 = new JanelaCorrer();
		Janela j2 = new JanelaBasculante();
		
		p1.abrir();
		p1.fechar();
		p2.abrir();
		p2.fechar();
		
		j1.abrir();
		j1.fechar();
		j2.abrir();
		j2.fechar();
	}
}
