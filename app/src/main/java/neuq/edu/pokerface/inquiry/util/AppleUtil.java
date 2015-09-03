package neuq.edu.pokerface.inquiry.util;

/**
 * Created by PokerFace on 2015/9/3.
 */

import neuq.edu.pokerface.inquiry.model.apple.Apple;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

public class AppleUtil {

    static final String ENDPOINT = "http://apis.juhe.cn/appleinfo";

    public interface AppleService {
        @GET("/index")
        void getApple(@Query("sn")String sn, @Query("key")String key, Callback<Apple> callback);
    }

    static RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();

    static public AppleService appleService = restAdapter.create(AppleService.class);

}
