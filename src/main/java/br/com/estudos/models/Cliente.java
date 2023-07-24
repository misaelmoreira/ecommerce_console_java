package br.com.estudos.models;

import br.com.estudos.interfaces.IPessoa;
import br.com.estudos.interfaces.ITipo;

import java.util.List;

import br.com.estudos.abstracao.PessoaImpl;
import br.com.estudos.enums.Tipo;

public class Cliente extends PessoaImpl {
    private int id;
    private String nome;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public List<IPessoa> Todos() {
        return null;
    }

    @Override
    public void Salvar(ITipo tipo){
        System.out.println("Alterando comportamento");    
        super.salvar(tipo); // chamando o metodo original   
    }

    @Override
    public void SalvarSemStrategy(Tipo tipo) {
        return;
    }
}
