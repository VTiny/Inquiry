package neuq.edu.pokerface.inquiry.util;

import neuq.edu.pokerface.inquiry.model.tel.Tel;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by PokerFace on 2015/8/20.
 */
public class TelUtil {

    static final String ENDPOINT = "http://apis.juhe.cn/mobile";

    public interface TelService {
        @GET("/get")
        void getTel(@Query("phone")String phone, @Query("key")String key, Callback<Tel> callback);
    }

    static RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();

    static public TelService telService = restAdapter.create(TelService.class);

}
