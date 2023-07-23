package br.com.estudos.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Double> notas;      

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

    // polimorfismo
    public String nomeCompleto(){
        return this.nome + " - " + this.sobrenome;
    }
}
