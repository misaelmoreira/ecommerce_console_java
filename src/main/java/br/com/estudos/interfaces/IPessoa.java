package br.com.estudos.interfaces;

import br.com.estudos.enums.Tipo;

public interface IPessoa {
    int getId();
    void setId(int id);

    String getNome();
    void setNome(String nome);

    void SalvarSemStrategy(Tipo tipo);
    void Salvar(ITipo tipo);
}
