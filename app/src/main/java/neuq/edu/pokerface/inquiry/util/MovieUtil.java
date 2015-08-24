package neuq.edu.pokerface.inquiry.util;

import neuq.edu.pokerface.inquiry.model.movie.Movie;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class MovieUtil {

    static final String ENDPOINT = "http://v.juhe.cn/movie";

    public interface MovieService {
        @GET("/index")
        void getMovie(@Query("key")String key, @Query("title")String movieName, Callback<Movie> callback);
    }

    static RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();

    static public MovieService movieService = restAdapter.create(MovieService.class);

}
