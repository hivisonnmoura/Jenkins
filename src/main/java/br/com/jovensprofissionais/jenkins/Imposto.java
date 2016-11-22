package br.com.jovensprofissionais.jenkins;
/**
 * Created by hivisonmoura on 2016-11-22.
 */
public class Imposto {

    public Imposto() {
    }

    public double calcula(Orcamento orcamento){
        System.out.println("teste");
        return orcamento.getValor()* 0.1;
    }
}
