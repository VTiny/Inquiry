package neuq.edu.pokerface.inquiry.util;

import neuq.edu.pokerface.inquiry.model.ip.Ip;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class IpUtil {

    static final String ENDPOINT = "http://apis.juhe.cn/ip";

    public interface IpService {
        @GET("/ip2addr")
        void getIp(@Query("ip")String website, @Query("key")String key, Callback<Ip> callback);
    }

    static RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();

    static public IpService ipService = restAdapter.create(IpService.class);

}
