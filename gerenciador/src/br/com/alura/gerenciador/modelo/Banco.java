package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	static ArrayList<Empresa> lista = new ArrayList<Empresa>(); 
	
	private static Integer chaveSequencial = 1;
	
	

	public void adiciona(Empresa newEmpresa) {
		newEmpresa.setId(chaveSequencial++);
		Banco.lista.add(newEmpresa);
	}
	
	public void exclui(Empresa newEmpresa) {
		
		Banco.lista.remove(newEmpresa);
	
	}

	public List<Empresa> getEmpresas() {
		
		return Banco.lista;
	}

	public Empresa findCompanyById(String paramId) {
		
		Integer id = Integer.parseInt(paramId);
		
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}
	
	
	
}
