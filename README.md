Atividade numero 3.2

/* Primeiro erro no for, onde o ArrayList vai de 0 a 9, pois contém
  * 10 indices, nesse caso o loop não funcionara por 0 é o menor número.
 */
 System.out.println("Produtos no estoque:");
 for (int i = 0; i <= produtos.size(); i++) {
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
