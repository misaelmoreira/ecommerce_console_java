package br.com.estudos.abstracao;

import java.util.List;

import br.com.estudos.enums.Tipo;
import br.com.estudos.interfaces.IPessoa;
import br.com.estudos.interfaces.ITipo;

public abstract class PessoaImpl implements IPessoa{

    public abstract List<IPessoa> Todos();
    
    public void salvar(ITipo tipo){
        tipo.Salvar();       
    }   
    
    public void salvarSemStrategy(Tipo tipo){
        if(tipo == Tipo.JSON)
            System.out.println("Estou salvando o dado da classe" + this.getClass().getName() + " como JSON");
        else if(tipo == Tipo.CSV)
            System.out.println("Estou salvando o dado da classe" + this.getClass().getName() + "  como CSV");
        else if(tipo == Tipo.XML)
            System.out.println("Estou salvando o dado da classe" + this.getClass().getName() + " como XML");
    }
}
