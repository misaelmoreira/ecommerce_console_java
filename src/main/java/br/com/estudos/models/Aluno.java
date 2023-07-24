package br.com.estudos.models;

import java.util.ArrayList;
import java.util.List;

import br.com.estudos.abstracao.PessoaImpl;
import br.com.estudos.enums.Tipo;
import br.com.estudos.interfaces.IPessoa;
import br.com.estudos.interfaces.ITipo;

public class Aluno extends PessoaImpl{
    private List<Double> notas; 
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

    public List<Double> getNotas(){
        if(this.notas == null){
            this.notas = new ArrayList<Double>();
        }
        return notas;
    }

    public void setNotas(List<Double> notas){
        this.notas = notas;
    }

    public String situacao(){
        if(this.media() >= 7) return "Aprovado";
        else if( this.media() >= 5 && this.media() <= 6) return "Recuperação";
        return "Reprovado";
    }

    public double media(){
        double calculoMedia = 0;
        for(double nota : this.getNotas()){
            calculoMedia += nota;
        }

        calculoMedia = calculoMedia / this.getNotas().size();
        return calculoMedia;
    }

    public String notasFormatadas(){
        String notasSeparadasPorVirgula = "";
        for(double nota : this.getNotas()){
            notasSeparadasPorVirgula += nota + ",";
        }

        return notasSeparadasPorVirgula.substring(0, notasSeparadasPorVirgula.length() - 1);
    }
    
    @Override
    public List<IPessoa> Todos() {
        return null;
    }


    @Override
    public void SalvarSemStrategy(Tipo tipo) {
       return;
    }


    @Override
    public void Salvar(ITipo tipo) {
        return;
    }       
}
