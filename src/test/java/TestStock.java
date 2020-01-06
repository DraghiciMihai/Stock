import com.sda.stock.Stock;
import org.junit.Test;

public class TestStock {
    @Test
    public void testStock(){
        Stock stoc = new Stock("$", "dolar");
        stoc.setClosingPrice(85);
        stoc.setCurrentPrice(80);
        System.out.printf("%.2f %%",stoc.getChangePercent());
    }
}