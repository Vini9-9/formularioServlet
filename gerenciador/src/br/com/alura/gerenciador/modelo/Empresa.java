package br.com.alura.gerenciador.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;

public class Empresa {
	
	private Integer id;
	
	private String nome;
	
	private Date dataCadastro = null;
	
	private Date logDataCadastro = null;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Date getDataCadastro()  {
		return dataCadastro;
	}

	public Date getLogDataCadastro() {
		return logDataCadastro;
	}

	public void setLogDataCadastro(Date dataHoraAtual) {
		this.logDataCadastro = dataHoraAtual;
	}
	
	public void setDataCadastroFormatted(String paramDataCadastrada) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dataCadastrada = sdf.parse(paramDataCadastrada);
		
		setDataCadastro(dataCadastrada);
	}
	
}
