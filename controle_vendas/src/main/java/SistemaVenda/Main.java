/**
 * 
 */
package SistemaVenda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import SistemaVenda.model.Produto;

/**
 * @author Evandro
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CRIAR 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cliente");
		//ALTERAR
		EntityManager em = emf.createEntityManager();
		
		String menu = "1 - Cadastrar \n 2 - Editar \n 3 - Remover \n 4 - Sair";
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
		case 1:
			String descricao = JOptionPane.showInputDialog("Informe a descrição do Produto ");
			String stoque = JOptionPane.showInputDialog("Quantidade ");
			String valor = JOptionPane.showInputDialog("Valor do Produto ");
			
			try {
				Produto p = new Produto();
				p.setDescricao(descricao);
				p.setStoque(Integer.parseInt(stoque));
				p.setValor(Double.parseDouble(valor));
				
				em.getTransaction().begin();
				em.persist(p);
				em.getTransaction().commit();
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"Erro ao cadastrar o produto. Verifique os dados e tente novamente");			}
			break;
		case 2:
			String opcao2 = JOptionPane.showInputDialog(null, "Infome o id do produto: ");
			String opcao3 = JOptionPane.showInputDialog(null, "Infome o nome do produto: ");
			String opcao4 = JOptionPane.showInputDialog(null, "Infome a quantidade em estoque: ");
			String opcao5 = JOptionPane.showInputDialog(null, "Infome o valor: ");
			
			break;
		case 3:
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Saindo...");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Invalida!");
			break;
		}

	}

}
