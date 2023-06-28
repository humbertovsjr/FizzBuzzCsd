import org.example.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTeste {

    @Test
    public void deveImprimirNumerosDeUmAhCem() {
        Assert.assertEquals("1", new FizzBuzz().print(1));
        Assert.assertEquals("2", new FizzBuzz().print(2));
        //Assert.assertEquals("3", new FizzBuzz().print(2));
        Assert.assertEquals("4", new FizzBuzz().print(4));
        //Assert.assertEquals("5", new FizzBuzz().print(5));
    }

    @Test
    public void deveImprimirFizzParaNumeroMultiplosDe3() {
        Assert.assertEquals("Fizz", new FizzBuzz().print(3));
        Assert.assertEquals( "Fizz", new FizzBuzz().print(6));
    }

    @Test
    public void deveImprimirBuzzParaNumeroMultiplosDe5() {
        Assert.assertEquals("Buzz", new FizzBuzz().print(5));
        Assert.assertEquals("Buzz", new FizzBuzz().print(10));
    }

    @Test
    public void deveImprimirFizzBuzzParaNumeroMultiplosDe3Ou5(){
        Assert.assertEquals("FizzBuzz", new FizzBuzz().print(15));
        Assert.assertEquals("FizzBuzz", new FizzBuzz().print(30));
        Assert.assertEquals("FizzBuzz", new FizzBuzz().print(45));
    }
}
