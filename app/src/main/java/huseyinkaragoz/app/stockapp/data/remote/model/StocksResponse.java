package huseyinkaragoz.app.stockapp.data.remote.model;

import java.util.List;

import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public class StocksResponse {
    private List<StockEntity> results;

    public List<StockEntity> getResults() {
        return results;
    }

    public void setResults(List<StockEntity> results) {
        this.results = results;
    }
}
