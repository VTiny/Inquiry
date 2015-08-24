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
import neuq.edu.pokerface.inquiry.model.weather.Weather;
import neuq.edu.pokerface.inquiry.model.weather.result.data.RecentWeather;
import neuq.edu.pokerface.inquiry.model.weather.result.data.recentweather.Info;
import neuq.edu.pokerface.inquiry.util.WeatherUtil;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class WeatherActivity extends Activity {

    static final String KEY = "ec36267cdc99b4e97b5edc9903b9fa3b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Button returnButton = (Button) findViewById(R.id.btn_weather_back);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button weatherButton = (Button) findViewById(R.id.btn_weather_inquire);
        weatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_weather);
                String cityname = editText.getText().toString();
                if(!cityname.isEmpty()){
                    WeatherUtil.weatherService.getWeather(cityname, KEY, new Callback<Weather>() {
                        @Override
                        public void success(Weather weather, Response response) {
                            Log.e("---error code:---", String.valueOf(weather.getErrorCode()));
                            Log.e("---reason:-------", weather.getReason());

                            String realTime;
                            String reaCityName, reaDate, reaTime, reaWeek, reaMoon, reaWeather, reaWind;
                            String reaWeaTemperature, reaWeaHumidify, reaWeaInfo, reaWeaImg;
                            String reaWinDirect, reaWinPower, reaWinOffset, reaWinWindSpeed;
                            reaCityName = weather.getResult().getData().getRealtime().getCityName();
                            reaDate     = weather.getResult().getData().getRealtime().getDate();
                            reaTime     = weather.getResult().getData().getRealtime().getTime();
                            reaWeek     = String.valueOf(weather.getResult().getData().getRealtime().getWeek());
                            reaMoon     = weather.getResult().getData().getRealtime().getMoon();
                            reaWeaTemperature = weather.getResult().getData().getRealtime().getWeather().getTemperature();
                            reaWeaHumidify    = weather.getResult().getData().getRealtime().getWeather().getHumidity();
                            reaWeaInfo        = weather.getResult().getData().getRealtime().getWeather().getInfo();
                            reaWinDirect    = weather.getResult().getData().getRealtime().getWind().getDirect();
                            reaWinPower     = weather.getResult().getData().getRealtime().getWind().getPower();
                            reaWinOffset    = String.valueOf(weather.getResult().getData().getRealtime().getWind().getOffset());
                            reaWinWindSpeed = String.valueOf(weather.getResult().getData().getRealtime().getWind().getWindspeed());
                            reaWeather = "    温度： " + reaWeaTemperature + "\n    湿度： " + reaWeaHumidify + "\n    天气： " + reaWeaInfo + "\n";
                            reaWind    = "    风向： " + reaWinDirect + "\n    风力： " + reaWinPower + "\n    风速： " + reaWinWindSpeed + "\n";
                            realTime = "    现在是" + reaDate + ", 阴历" + reaMoon + ", 在" + reaTime + "发布的天气预报为：\n" + reaWeather + reaWind + "\n\n";

                            String pm25;
                            String key, showDec, dateTime, cityName, pm25Data;
                            String pmdCurPm, pmdPm25, pmdPm10, pmdLevel, pmdQuality, pmdDes;
                            pmdCurPm   = weather.getResult().getData().getPm25().getPm25Data().getCurPm();
                            pmdPm25    = weather.getResult().getData().getPm25().getPm25Data().getPm25();
                            pmdPm10    = weather.getResult().getData().getPm25().getPm25Data().getPm10();
                            pmdLevel   = String.valueOf(weather.getResult().getData().getPm25().getPm25Data());
                            pmdQuality = weather.getResult().getData().getPm25().getPm25Data().getQuality();
                            pmdDes     = weather.getResult().getData().getPm25().getPm25Data().getDes();
                            dateTime = weather.getResult().getData().getPm25().getDateTime();
                            cityName = weather.getResult().getData().getPm25().getCityName();
                            pm25 = "    在"+dateTime+"发布的"+cityName+"空气质量报告为："+"\n   空气污染指数: "+pmdCurPm+"\n   pm2.5指数: "+pmdPm25
                                    +"\n   pm10指数: "+pmdPm10+"\n   空气质量为: "+pmdQuality+", "+pmdDes+"\n\n";


                            //妈蛋这儿处理不明白了，哪天心情好继续
                            String recentWeather = "";
                            List<RecentWeather> recentWeathersList = weather.getResult().getData().getRecentWeather();
                            for(int i = 0; i < recentWeathersList.size(); i++){

                                String recentWeatherDate = recentWeathersList.get(i).getDate();
                                Info recentWeatherInfo = recentWeathersList.get(i).getInfo();
                                String recentWeatherWeek = recentWeathersList.get(i).getWeek();
                                String recentWeatherNongli = recentWeathersList.get(i).getNongli();
                                recentWeather = reaWeather+"date:"+recentWeatherDate+"week:"+recentWeatherWeek+"nongli"+recentWeatherNongli;
                                Object[][] recentWeatherData = new Object[3][];
                                if(i!=0) {
                                    List<String> infoDawn = recentWeatherInfo.getDawn();
                                    recentWeatherData[0] = infoDawn.toArray();
                                }
                                List<String> infoDay  = recentWeatherInfo.getDay();
                                recentWeatherData[1] = infoDay.toArray();
                                List<String> infoNight = recentWeatherInfo.getNight();
                                recentWeatherData[2] = infoNight.toArray();
                                for(int j = 0; j < recentWeatherData.length; j++){
                                    for(int k = 0; k < recentWeatherData[j].length; k++){
                                        recentWeather = recentWeather + recentWeatherData[j][k] + " ";
                                    }
                                    recentWeather = recentWeather + "/n";
                                }


                            }


                            TextView weatherTxt = (TextView) findViewById(R.id.txt_weather_result);
                            weatherTxt.setText(realTime+pm25+recentWeather);

                        }

                        @Override
                        public void failure(RetrofitError error) {
                            Log.e("---error:-------", error.getMessage());
                        }
                    });

                }
            }



        });
    }
}
