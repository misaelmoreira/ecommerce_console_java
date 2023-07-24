package br.com.estudos;

import java.io.IOException;
import br.com.estudos.drivers.Json;
import br.com.estudos.enums.Tipo;
import br.com.estudos.models.Aluno;
import br.com.estudos.models.Cliente;
import br.com.estudos.servicos.PessoaServico;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        // Tipos de variveis

        // int numero = 5;
        // double moeda = 5.99;
        // char umCaracter = 'M';
        // boolean verdade = true;
        // String texto = "um texto";

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // System.out.println( "Digite o seu nome:" );

        // var nome = reader.readLine();
        // System.out.println( "O nome digitado:" + nome );

        // var calculo = 4.555;
        // System.out.printf("O resultado é %.2f", calculo);

        // if( calculo > 5){
        // System.out.printf("O calculo é maior");
        // }

        // // Sintaxe Caso
        // var numero = 3;
        // switch(numero){
        // case 2:
        // System.out.printf("O numero é 2");
        // break;
        // case 3:
        // System.out.printf("O numero é 3");
        // break;
        // default:
        // System.out.printf("O numero é desconhecido");
        // break;
        // }

        // for(int i = 0; i <= 5; i++){
        // System.out.println("O numero é : " + i);
        // }

        // // Array -> precisa definir o tamanho
        // String[] cars = { "Volvo", "Bmw", "Ford", "Mazda"};
        // System.out.println(cars[0]);

        // //ArrayList -> nao precisa definir o tamanho
        // List<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("Bmw");

        // var alunoDaniel = new Aluno();
        // alunoDaniel.setNome("Roberto");
        // alunoDaniel.getNotas().add(7.8);
        // alunoDaniel.getNotas().add(9.9);

        // System.out.println(alunoDaniel.media());
        // System.out.println(alunoDaniel.situacao());
        orientacaoAoObjetos();
    }

    private static void orientacaoAoObjetos() {
        var cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Leandro");

        var aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Marcio");

        aluno.salvarSemStrategy(Tipo.CSV);

        aluno.salvar(new Json());

        var mensagemAluno = PessoaServico.Apresentar(aluno);
        var mensagemCliente = PessoaServico.Apresentar(cliente);

        System.out.println(mensagemAluno);
        System.out.println(mensagemCliente);   
        
        cliente.Salvar(new Json());
    }
}
