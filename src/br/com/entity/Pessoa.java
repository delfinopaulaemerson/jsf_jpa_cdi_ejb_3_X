package br.com.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pessoa implements Serializable {

	
	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}
	
	@Id
	@GeneratedValue(generator = "genpessoa")
	@SequenceGenerator(sequenceName = "pessoa_codigo_seq",name = "genpessoa")
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public String getEmail() {
		return this.email;
	}

	@Column(nullable = false, unique = true)
	public void setEmail(String email) {
		this.email = email;
	}
   
}
