package br.com.mb;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.entity.Pessoa;
import br.com.entity.PessoaFisica;

@ManagedBean
@SessionScoped
public class CadastroPessoasBean {
	
	private Pessoa pessoaSelecionada;
	
	Collection<Pessoa> lista;
	

	@PostConstruct
	public void init() {
		this.pessoaSelecionada = new PessoaFisica();
		this.lista = new ArrayList<Pessoa>();
		
		for(int i=0; i < 10 ; i++) {
			
			Pessoa p = new PessoaFisica();
			p.setNome(String.format("Fulano %02d", i));
			p.setEmail(String.format("filano%02d@teste.com", i));
			p.setTelefone(String.format("9999.88%02d", i));
			
			this.lista.add(p);
		}
	}
	
	
	public void salvar() {
		if(!this.lista.contains(this.pessoaSelecionada)) {
			this.lista.add(this.pessoaSelecionada);
		}
	}
	
	
	public void excluir() {
		
		this.lista.remove(this.pessoaSelecionada);
		this.pessoaSelecionada = new PessoaFisica();
	}

	public Pessoa getPessoaSelecionada() {
		return pessoaSelecionada;
	}

	public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}

	public Collection<Pessoa> getLista() {
		return lista;
	}

	public void setLista(Collection<Pessoa> lista) {
		this.lista = lista;
	}

}
