package neuq.edu.pokerface.inquiry.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import neuq.edu.pokerface.inquiry.R;
import neuq.edu.pokerface.inquiry.model.movie.Movie;
import neuq.edu.pokerface.inquiry.model.movie.Result;
import neuq.edu.pokerface.inquiry.util.MovieUtil;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class MovieActivity extends Activity {

    static final String KEY = "f15ec1198caaf3349ed3264a24d668b1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Button returnButton = (Button) findViewById(R.id.btn_movie_back);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button inquireButton = (Button) findViewById(R.id.btn_movie_inquire);
        inquireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_movie);
                String movieName = editText.getText().toString();
                if(!movieName.isEmpty()){
                    MovieUtil.movieService.getMovie(KEY, movieName, new Callback<Movie>() {
                        @Override
                        public void success(Movie movie, Response response) {
                            Log.e("---result code:--", movie.getResultcode());
                            Log.e("---error code:---", String.valueOf(movie.getErrorCode()));
                            Log.e("---reason:-------", movie.getReason());

                            List<Result> movieData = movie.getResult();
                            String movieInquireResult = "";
                            movieInquireResult = movieInquireResult+"共搜索到"+movieData.size()+"条结果：\n\n";
                            for(int i = 0; i < movieData.size(); i++) {
                                //poster 待处理
                                movieInquireResult = movieInquireResult + "  这是第" + (i+1) + "条结果：\n";
                                movieInquireResult = movieInquireResult+"    电影名："+ movieData.get(i).getTitle() +"\n";
                                movieInquireResult = movieInquireResult+"    年份："+ movieData.get(i).getYear() +"\n";
                                movieInquireResult = movieInquireResult+"    评分："+ movieData.get(i).getRating() +"\n";
                                movieInquireResult = movieInquireResult+"    分类："+ movieData.get(i).getRuntime() +"\n";
                                movieInquireResult = movieInquireResult+"    语言："+ movieData.get(i).getLanguage() +"\n";
                                movieInquireResult = movieInquireResult+"    时长："+ movieData.get(i).getRuntime() +"\n";
                                movieInquireResult = movieInquireResult+"    拍摄地："+ movieData.get(i).getFilmLocations() + "\n";
                                movieInquireResult = movieInquireResult+"    导演："+ movieData.get(i).getDirectors() +"\n";
                                movieInquireResult = movieInquireResult+"    演员："+ movieData.get(i).getActors() +"\n";
                                movieInquireResult = movieInquireResult+"    剧情介绍："+ movieData.get(i).getPlotSimple() +"\n";
                                movieInquireResult = movieInquireResult+"    别名："+ movieData.get(i).getAlsoKnownAs() +"\n";
                            }

                            Log.e("---content:---", movieInquireResult);
                            TextView txtResult = (TextView) findViewById(R.id.txt_movie_result);
                            txtResult.setText(movieInquireResult);
                            txtResult.setVisibility(View.VISIBLE);



                        }

                        @Override
                        public void failure(RetrofitError error) {

                            Log.e("---error reason:---", error.getMessage());

                        }
                    });
                }
            }
        });

    }
}
