package br.unibh.loja.model;

import java.math.BigDecimal;
import java.util.Date;

public class Produto {
	private Long id;
	private String descricao;
	private String marca;
	private BigDecimal preco;
	private String cnpjFornecedor;
	private String nomeFornecedor;
	private Date dataDatastro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public Date getDataDatastro() {
		return dataDatastro;
	}

	public void setDataDatastro(Date dataDatastro) {
		this.dataDatastro = dataDatastro;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", marca=" + marca + ", preco=" + preco
				+ ", cnpjFornecedor=" + cnpjFornecedor + ", nomeFornecedor=" + nomeFornecedor + ", dataDatastro="
				+ dataDatastro + "]";
	}

	public Produto() {
		super();
	}

}
