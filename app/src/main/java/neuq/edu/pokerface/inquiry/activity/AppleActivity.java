package neuq.edu.pokerface.inquiry.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import neuq.edu.pokerface.inquiry.R;
import neuq.edu.pokerface.inquiry.model.apple.Apple;
import neuq.edu.pokerface.inquiry.util.AppleUtil;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by PokerFace on 2015/9/3.
 */
public class AppleActivity extends Activity {

    static final String KEY = "2589806d1fb518eb87cb79200c9ca149";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        Button returnButton = (Button) findViewById(R.id.btn_apple_back);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppleActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button inquireButton = (Button) findViewById(R.id.btn_apple_inquire);
        inquireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_apple);
                String sn = editText.getText().toString();
                if(!sn.isEmpty()){
                    AppleUtil.appleService.getApple(sn, KEY, new Callback<Apple>() {
                        @Override
                        public void success(Apple apple, Response response) {

                            Log.e("---result code:--", String.valueOf(apple.getResultcode()));
                            Log.e("---reason:-------", apple.getReason());

                            String result = "";
                            result = result + "设备型号: " + apple.getResult().getPhoneModel() + "\n";
                            result = result + "设备序列号: " + apple.getResult().getSerialNumber() + "\n";
                            result = result + "激活状态: " + apple.getResult().getActive() + "\n";
                            result = result + "保修状态: " + apple.getResult().getWarrantyStatus() + "\n";
                            result = result + "保修到期: " + apple.getResult().getWarranty() + "\n";
                            result = result + "电话支持状态: " + apple.getResult().getTeleSupportStatus() + "\n";
                            result = result + "电话支持到期: " + apple.getResult().getTeleSupport() + "\n";
                            result = result + "生产工厂: " + apple.getResult().getMadeArea() + "\n";
                            result = result + "生产时间开始: " + apple.getResult().getStartDate() + "\n";
                            result = result + "生产时间结束: " + apple.getResult().getEndDate() + "\n";
                            result = result + "颜色: " + apple.getResult().getColor() + "\n";
                            result = result + "规格: " + apple.getResult().getSize() + "\n";

                            TextView txtResult = (TextView) findViewById(R.id.txt_apple_result);
                            txtResult.setText(result);
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
