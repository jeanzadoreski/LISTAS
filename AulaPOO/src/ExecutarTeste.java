import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("M�dulo Orienta��o Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("M�dulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("M�dulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(200));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("M�dulo de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega por Email");
		venda.setId(10L);
		venda.setNomeCliente("Jean Zadoreski");
		venda.setValorTotal(BigDecimal.valueOf(197.00)); 
		
		venda.getListaProduto().add(produto1);
		venda.getListaProduto().add(produto2);// N�o consigo fazer valida��es
		venda.addProduto(produto3);//Posso fazer valida��es antes de add na lista
		venda.addProduto(produto4);
		
		/*for (Produto produto : venda.getListaProduto()) {
			System.out.println("Descri��o produto: " + produto );
		}*/
		
		System.out.println("Descri��o da venda: " + venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal());
		
		
	}

}
