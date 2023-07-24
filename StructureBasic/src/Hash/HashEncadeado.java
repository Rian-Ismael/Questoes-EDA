package Hash;

import java.util.ArrayList;

import Util.Aluno;

public class HashEncadeado {

    private ArrayList<Aluno>[] tabela;
    private final int CAPACIDADE_DEFAULT = 20;


    public HashEncadeado() {
        this.tabela = new ArrayList[CAPACIDADE_DEFAULT];
    }

    public HashEncadeado(int capacidade) {
        this.tabela = new ArrayList[capacidade];
    }
    
    public int hash(int chave) {
    	return chave % this.tabela.length;
    }
    
    private int hashMultiplicacao(Integer chave) {
        double a = 0.617648934;
        double hash = chave*a;
        hash = (hash % 1) * this.tabela.length;
        return (int)hash;        
    }
    
    public void put(Integer chave, Aluno valor) {
    	int hash = hash(chave);
    	ArrayList<Aluno> alunos = this.tabela[hash];
    	
    	
    	if(alunos == null) {
    		alunos = new ArrayList<Aluno>();
    		alunos.add(valor);
    		this.tabela[hash] = alunos;
    		
    	} else {
    		for(int i = 0; i < alunos.size(); i++) {
    			if(alunos.get(i).getMatricula().equals(chave)) {
    				alunos.set(i, valor);
    				return;
    			}
    		}
    		
    		alunos.add(valor);
    	}
    }
    
    public Aluno get(Integer chave) {
    	int hash = hash(chave);
    	
    	ArrayList<Aluno> alunos = this.tabela[hash];
    	
    	if(alunos == null) {
    		return null;
    	}
    	
    	for(int i = 0; i < alunos.size(); i++) {
    		if(alunos.get(i).getMatricula().equals(chave)) {
    			return alunos.get(i);
    		}
    	}
    	
    	return null;
    }
    
    
    public Aluno remove(int chave) {
    	int hash = hash(chave);
    	
    	ArrayList<Aluno> alunos = this.tabela[hash];
    	
    	Aluno atual = null;
    	
    	if(alunos == null) {
    		return null;
    	}
    	
    	
    	for(int i = 0; i < alunos.size(); i++) {
    		atual = alunos.get(i);
    		
    		if(alunos.get(i).getMatricula().equals(chave)) {
    			alunos.remove(i);
    			return atual;
    		}
    	}
    	
    	return atual;
    }


}