
public class PagamentoVista {

	public static void main(String[] args) {

		double saldoCliente = 1000.00;
		double valorProduto = 600.00;
		int qtdProduto = 2;
		double valorTotal = saldoCliente * qtdProduto;

		if (saldoCliente >= valorTotal) {

			System.out.println("compra aprovada");

		} else {

			System.out.println("compra reprovada");

		}

	}

}
