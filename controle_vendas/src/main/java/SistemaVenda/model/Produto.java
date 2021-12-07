/**
 * 
 */
package SistemaVenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evandro
 *
 */

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String descricao;
	@Column
	private int stoque;
	@Column
	private double valor;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getStoque() {
		return stoque;
	}
	
	public void setStoque(int stoque) {
		this.stoque = stoque;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", stoque=" + stoque + ", valor=" + valor + "]";
	}
}