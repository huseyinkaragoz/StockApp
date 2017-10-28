package huseyinkaragoz.app.stockapp.data.remote;

import huseyinkaragoz.app.stockapp.data.remote.model.StocksResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public interface StockDBService {

    @GET("a/b")
    Call<StocksResponse> loadStocks();
}
