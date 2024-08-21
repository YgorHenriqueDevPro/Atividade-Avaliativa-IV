import java.util.ArrayList;
public class GerenciamentoDeEstoque {
 public static void main(String[] args) {
 ArrayList<String> produtos = new ArrayList<String>();
 // Adicionando produtos ao estoque
 produtos.add("Camiseta");
 produtos.add("Calça");
 produtos.add("Tênis");
 produtos.add("Boné");
 
 /* Primeiro erro no for, onde o ArrayList vai de 0 a 9, pois contém
  * 10 indices, nesse caso o loop não funcionara por 0 é o menor número.
 */
 System.out.println("Produtos no estoque:");
 for (int i = 0; i <= produtos.size(); i++) {
 System.out.println(produtos.get(i));
 }
 // Removendo um produto específico
 String produtoARemover = "Camiseta";
 if (produtos.contains(produtoARemover)) {
 produtos.remove(produtoARemover);
 }

 // Tentando remover um produto que não existe
 String produtoNaoExistente = "Sapato";
 produtos.remove(produtoNaoExistente);
 // Exibindo produtos atualizados
 System.out.println("\nProdutos atualizados no estoque:");
 for (int i = 0; i < produtos.size(); i++) {
 System.out.println(produtos.get(i));
 }
 
 /* Segundo erro é que esta lendo o indice 10, sendo que este indice não existe 
  * pois o mesmo vai até o 9.
 */
 System.out.println("\nTentando acessar um produto fora do
índice válido:");
 System.out.println(produtos.get(10)); // Esse índice pode não
existir
 }
}