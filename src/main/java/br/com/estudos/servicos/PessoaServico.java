package br.com.estudos.servicos;
import br.com.estudos.drivers.Xml;
import br.com.estudos.interfaces.IPessoa;

public class PessoaServico {
    public static String Apresentar(IPessoa pessoa){

        pessoa.Salvar(new Xml());
        return pessoa.getId() + " - " + pessoa.getNome();
    }       
}
