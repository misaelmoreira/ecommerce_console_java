package br.com.estudos.models;

import java.util.List;

import br.com.estudos.abstracao.PessoaImpl;
import br.com.estudos.enums.Tipo;
import br.com.estudos.interfaces.IPessoa;
import br.com.estudos.interfaces.ITipo;

public class Pessoa extends PessoaImpl{
    private int id;
    protected String nome;
    protected String sobrenome;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    } 

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    } 


    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public List<IPessoa> Todos() {
        throw new UnsupportedOperationException("Unimplemented method 'Todos'");
    }

    @Override
    public void SalvarSemStrategy(Tipo tipo) {
        throw new UnsupportedOperationException("Unimplemented method 'SalvarSemStrategy'");
    }

    @Override
    public void Salvar(ITipo tipo) {
        throw new UnsupportedOperationException("Unimplemented method 'Salvar'");
    }

}
