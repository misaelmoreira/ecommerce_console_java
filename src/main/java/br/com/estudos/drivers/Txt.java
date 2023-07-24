package br.com.estudos.drivers;

import br.com.estudos.interfaces.ITipo;

public class Txt implements ITipo{

    @Override
    public void Salvar() {
        System.out.println("Estou salvando o dado como Txt");
    }        
}
