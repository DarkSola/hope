package hope.spider.job;

/**
 * Created by bing.a.qian on 12/9/2016.
 */
public class StockSZMarketFilter extends StockFilter {
    public boolean select(String code) {
        boolean result = false;
        if (code.startsWith("0") || code.startsWith("3")) {
            result = true;
        }
        return result;
    }
}
