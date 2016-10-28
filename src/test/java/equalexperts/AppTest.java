package equalexperts;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by topik on 2016-10-28.
 */
public class AppTest {


    private App app = new App();

    @Test
    public void getFizzBuzzFor1Returns1() {
        Assert.assertEquals("1", app.getFizzBuzz(1));
    }

    @Test
    public void getFizzBuzzFor3ReturnsFizz() {
        Assert.assertEquals("fizz", app.getFizzBuzz(3));
    }

    @Test
    public void getFizzBuzzFor5ReturnsBuzz() {
        Assert.assertEquals("buzz", app.getFizzBuzz(5));
    }

    @Test
    public void getFizzBuzzFor15ReturnsFizzBuzz() {
        Assert.assertEquals("fizzbuzz", app.getFizzBuzz(15));
    }

    @Test
    public void getFizzBuzzForMinus30ReturnsFizzBuzz() {
        Assert.assertEquals("fizzbuzz", app.getFizzBuzz(-30));
    }
}