package neuq.edu.pokerface.inquiry.util;

import neuq.edu.pokerface.inquiry.model.weather.Weather;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class WeatherUtil {

    static final String ENDPOINT = "http://op.juhe.cn/onebox/weather";

    public interface WeatherService {
        @GET("/query")
        void getWeather(@Query("cityname")String cityname, @Query("key")String key, Callback<Weather> callback);
    }

    static RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();

    static public WeatherService weatherService = restAdapter.create(WeatherService.class);

}
