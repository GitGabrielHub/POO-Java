import br.edu.ifpb.Conversor;
import junit.framework.TestCase;
import org.junit.Test;

public class TestarConversor {

    @Test
    public void TesteConversorBinario() {
        Conversor conversor = new Conversor();


        //Teste binário
        String result_1 = conversor.converterBin(2);
        String result_2 = conversor.converterBin(4);

        TestCase.assertEquals("10",result_1);
        TestCase.assertEquals("100",result_2);

    }

    @Test
    public void TesteConversorHexa() {
        Conversor conversor = new Conversor();


        //Teste binário
        String result_1 = conversor.converterHex(10);
        String result_2 = conversor.converterHex(15);

        TestCase.assertEquals("a",result_1);
        TestCase.assertEquals("f",result_2);

    }
}
