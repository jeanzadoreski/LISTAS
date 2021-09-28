import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(200));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega por Email");
		venda.setId(10L);
		venda.setNomeCliente("Jean Zadoreski");
		venda.setValorTotal(BigDecimal.valueOf(197.00)); 
		
		venda.getListaProduto().add(produto1);
		venda.getListaProduto().add(produto2);// Não consigo fazer validações
		venda.addProduto(produto3);//Posso fazer validações antes de add na lista
		venda.addProduto(produto4);
		
		/*for (Produto produto : venda.getListaProduto()) {
			System.out.println("Descrição produto: " + produto );
		}*/
		
		System.out.println("Descrição da venda: " + venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal());
		
		
	}

}
