package Hash;


import java.util.HashSet;
import java.util.Set;

import Util.Aluno;

public class HashAberto {

	private Set<Integer> chaves;
	private Set<Aluno> valores;
	private Aluno[] tabela;
	private int size;
	private double fatorDeCarga;
	
	
	private static final double FATOR_DE_CARGA_DEFAULT = 0.75;
	
	private static final int CAPACIDADE_DEFAULT = 20;
	
	public static final Aluno APAGADO = new Aluno(Integer.MIN_VALUE, "APAGADO");
	
	public HashAberto() {
		this.fatorDeCarga = FATOR_DE_CARGA_DEFAULT;
		this.tabela = new Aluno[CAPACIDADE_DEFAULT];
		this.size = 0;
	}
	
	public HashAberto(int capacidade, double fatorDeCarga) {
		this.tabela = new Aluno[capacidade];
		this.fatorDeCarga = fatorDeCarga;
		this.chaves = new HashSet<Integer>();
		this.valores = new HashSet<Aluno>();
		this.size = 0;
	}
	
	
	public Set<Integer> getKeys() {
		return this.chaves;
	}
	
	public Set<Aluno> getValue() {
		return this.valores;
	}
	
	public void put(Aluno[] tabela, Integer chave, Aluno valor) {
		int hash;
		
		int sondagem = 0;
		
		while(sondagem < tabela.length) {
			hash = (hash(chave) + sondagem) % tabela.length;
			if(tabela[hash] == null || tabela[hash].getMatricula().equals(chave) || tabela[hash] == APAGADO) {
				chaves.add(chave);
				valores.add(valor);
				tabela[hash] = valor;
				this.size++;
				return;
			}
			
			sondagem++;
		}
	}
	
	
	
	public void put2(Aluno[] alunos, Integer chave, Aluno valor) {
		int sondagem = 0;
		int hash;
		
		while(sondagem < alunos.length) {
			hash = (hash(chave) + sondagem) % alunos.length;
			
			if(alunos[hash].equals(chave) || alunos[hash] == APAGADO || alunos[hash] == null) {
				alunos[hash] = valor;
				this.chaves.add(chave);
				this.valores.add(valor);
				this.size++;
				return;
				
			}
			sondagem++;
		}
	}
	
	public void put2Resize(Integer chave, Aluno valor) {
		if(this.size / this.tabela.length >= this.fatorDeCarga) {
			Aluno[] novaTabela = new Aluno[this.tabela.length*2];
			
			for(int i = 0; i < this.tabela.length; i++) {
				put(novaTabela, this.tabela[i].getMatricula(), this.tabela[i]);
			}
			
			put(novaTabela, chave, valor);
			
			this.tabela  = novaTabela;
		} else {
			put(this.tabela, chave, valor);
		}
	}
	
	
	private boolean Verificaresize() {
		return (this.size / this.tabela.length >= this.fatorDeCarga);
	}
	
	public void put(Integer chave, Aluno valor) {
		
		if(Verificaresize()) {
			
			Aluno[] novaTabela = new Aluno[this.tabela.length * 2];
			
			this.valores = new HashSet<Aluno>();
			this.chaves = new HashSet<Integer>();
			this.size = 0;
			
			for(int i = 0; i < this.tabela.length; i++) {
				put(novaTabela, this.tabela[i].getMatricula(), this.tabela[i]);
			}
			
			put(novaTabela, chave, valor);
			this.tabela = novaTabela;
			
		} else {
			put(this.tabela, chave, valor);
		}
	}

	private int hash(Integer chave) {
		return chave % this.tabela.length;
	}
	
	
	public Aluno get(Integer chave) {
		int sondagem = 0;
		int hash;
		
		while(sondagem < this.tabela.length) {
			hash = (hash(chave) + 1) % this.tabela.length;
			
			if(this.tabela[hash] == null) {
				return null;
			}
			
			if(this.tabela[hash].getMatricula().equals(chave)) {
				return this.tabela[hash];
			}
			
			sondagem++;
		}
		
		return null;
	}
	
	
	public Aluno remove(Integer chave) {
		
		int sondagem = 0;
		
		int hash;
		
		while (sondagem < this.tabela.length) {
			hash = (hash(chave) + 1) % this.tabela.length;
			
			if(this.tabela[hash] != null || this.tabela[hash].getMatricula().equals(chave)) {
				Aluno aluno = this.tabela[hash];
				this.tabela[hash] = APAGADO;
				this.chaves.remove(chave);
				this.valores.remove(aluno);
				this.size--;
			}
			sondagem++;
		}
		
		return null;
		
	}
	
	
	public Aluno remove2(Integer chave) {
		int sondagem = 0;
		int hash;
		
		while(sondagem < this.tabela.length) {
			hash = (hash(chave) + sondagem) % this.tabela.length;
			
			if(this.tabela[hash].getMatricula().equals(chave)) {
				Aluno aluno = this.tabela[hash];
				this.tabela[hash] = APAGADO;
				this.chaves.remove(chave);
				this.valores.remove(aluno);
				this.size--;
				return aluno;
				
			}
			sondagem++;
		}
		
		return null;
	}
	
	
	public int size() {
		return this.size;
	}
}
