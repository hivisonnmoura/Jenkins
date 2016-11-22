import br.com.jovensprofissionais.jenkins.Imposto;
import br.com.jovensprofissionais.jenkins.Orcamento;
import org.junit.Test;

/**
 * Created by hivisonmoura on 2016-11-22.
 */
public class ImpostoTest {
    @Test
    public void deveCalcularImpostoDeDezPorCento(){

        Orcamento orcamento = new Orcamento(100.00);
        Imposto imposto = new Imposto();
        asserEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
    }
}
