package br.com.entity;

import br.com.entity.Pessoa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id   
	private int codigo;

	private Date data;
	
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "cod_pessoa")
	private Pessoa cliente;
	
	@OneToMany(mappedBy = "reserva", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Collection<DiariaReservada> diarias;

	public Reserva() {
		super();
	}
	
 
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}   
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Collection<DiariaReservada> getDiarias() {
		return diarias;
	}

	public void setDiarias(Collection<DiariaReservada> diarias) {
		this.diarias = diarias;
	}
}
