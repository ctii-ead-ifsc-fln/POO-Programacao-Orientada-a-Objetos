import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private LocalDate data;
    private BigDecimal total;
    private boolean pago;
    private double taxaDesconto;
    private static String empresa;
    
    private EStatusVenda statusVenda;
    //Associação por composição de Venda com ItemDeVenda
    private List<ItemDeVenda> itensDeVenda = new ArrayList<>();
    //Associação com o Cliente
    private Cliente cliente;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        calcularTotalVenda();
        return total;
    }
    
    
    /* o método setTotal foi retirado para evitar inconsistência, logo, para obter o total é necessário
       executar o método calcularTotalVenda que é chamado pelo método getTotal*/
    //public void setTotal(BigDecimal total) {
    //    this.total =;
    //}

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    
    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public static String getEmpresa() {
        return empresa;
    }

    public static void setEmpresa(String empresa) {
        Venda.empresa = empresa;
    }
    
    public EStatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(EStatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public List<ItemDeVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    public void setItensDeVenda(List<ItemDeVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //Métodos add declaram as exceções:
    //  lançada VendaException
    //  propagada EstoqueException
    public void add(int idItem, int  quantidade, Produto produto) throws EstoqueException, VendaException {
    	if (statusVenda != EStatusVenda.ABERTA) {
    		//lança a exceção VendaException
    		throw new VendaException("Não é possível atualizar esta Venda. Status: " + statusVenda.toString());
    	}
        //criando o objeto ItemDeVenda - associação por composição
    	ItemDeVenda itemVenda = new ItemDeVenda(idItem, quantidade, produto.getPreco(), produto);
    	itensDeVenda.add(itemVenda);
    	itemVenda.setVenda(this);
    	//a chamada deste método requer o tratamento ou propagação da exceção 
    	//Propaga a exceção EstoqueException
    	produto.getEstoque().retirar(quantidade);
    }

    /* sobrecarga  do método add para receber um valor diferenciado do preco do produto */
    public void add(int idItem, int  quantidade, BigDecimal valorAjustado, Produto produto) throws EstoqueException, VendaException {
    	if (statusVenda != EStatusVenda.ABERTA) {
    		//lança a exceção VendaException
    		throw new VendaException("Não é possível atualizar esta Venda. Status: " + statusVenda.toString());
    	}
    	//criando o objeto ItemDeVenda - associação por composição
    	ItemDeVenda itemVenda = new ItemDeVenda(idItem, quantidade, valorAjustado, produto);
    	itensDeVenda.add(itemVenda);
    	itemVenda.setVenda(this);
    	//a chamada deste método requer o tratamento ou propagação da exceção
    	//propaga a exceção EstoqueException
    	produto.getEstoque().retirar(quantidade);
    }
    
    //Métodos remove declara a exceção VendaException
    public void remove(ItemDeVenda itemVenda) throws VendaException, EstoqueException  {
    	if (statusVenda != EStatusVenda.ABERTA) {
    		//lança a exceção VendaException
    		throw new VendaException("Não é possível atualizar esta Venda. Status: " + statusVenda.toString());
    	}
    	itensDeVenda.remove(itemVenda);
        itemVenda.setVenda(null);
        //faz estorno do estoque e propaga a exceção EstoqueException
        itemVenda.getProduto().getEstoque().repor(itemVenda.getQuantidade());
    }
    
    private void calcularTotalVenda() {
        total = new BigDecimal(0.0);
        for (ItemDeVenda item: this.getItensDeVenda()) {
            total = total.add(item.getValor());
        }
        if (taxaDesconto >= 0) {
            BigDecimal desconto = new BigDecimal(total.doubleValue() * taxaDesconto / 100.0);
            total = total.subtract(desconto);    
        }
    }
}