package br.edu.ifsc.fln.report;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import br.edu.ifsc.fln.domain.Venda;
import br.edu.ifsc.fln.domain.ItemDeVenda;

public class CupomFiscal {
	public String gerarCupom(Venda venda) {
		StringBuilder sb = new StringBuilder();
        String formatText = "%-15s";//String com mínimo de 15 caracteres. O sinal de menos é  alinhamento a esquerda
        String formatValor = "%5.2f";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        //obtendo dados direto da venda
        sb.append("       ***** CUPOM FISCAL ******        ").append("\n");
        sb.append("Empresa........: ").append(venda.getEmpresa()).append("\n");
        sb.append("========================================").append("\n");
        sb.append("Número.........: ").append(venda.getId()).append("\n");
        sb.append("Data...........: ").append(venda.getData().format(formatterData)).append("\n");
        sb.append("     Horario...: ").append(LocalTime.now().format(formatterTime)).append("\n");
        sb.append("==========[ ITENS DO CUPOM ]============").append("\n");
        sb.append("Item\tDescricao\tqtd\tValor").append("\n");
        int i = 0;
        //neste laço são obtidos os dados de item de venda, e de cada item de venda são extraídos dados do produto
        for (ItemDeVenda item: venda.getItensDeVenda()) {
            sb.append(++i).append("\t").append(
                    String.format(formatText, (item.getProduto().getNome().length()>15)?item.getProduto().getNome().substring(0, 14):item.getProduto().getNome())).append("\t")
                    .append(item.getQuantidade()).append("\t")
                    .append(String.format(formatValor, item.getValor()))
                    .append("\n");
        }
        sb.append("----------------------------------------").append("\n");
        sb.append("TOTAL\t\t\t\t").append(String.format(formatValor, venda.getTotal())).append("\n");
        sb.append("========================================").append("\n");
        //obtendo dados do cliente vinculado a venda
        sb.append("Cliente.......: ").append(venda.getCliente().getCpf()).append(", ").append(venda.getCliente().getNome()).append("\n\n");
        sb.append(" ****** OBRIGADO PELA PREFERÊNCIA ***** ").append("\n");
        return sb.toString();
	}
}
