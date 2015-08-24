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
import neuq.edu.pokerface.inquiry.model.tel.Tel;
import neuq.edu.pokerface.inquiry.util.TelUtil;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by PokerFace on 2015/8/20.
 */


public class TelActivity extends Activity {

    static final String KEY = "2b45775eb29e4998116242f56ad49f8c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);

        Button returnButton = (Button) findViewById(R.id.btn_tel_back);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button telButton = (Button) findViewById(R.id.btn_tel_inquire);
        telButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_tel);
                String telInquire = editText.getText().toString();
                if(!telInquire.isEmpty()) {
                    TelUtil.telService.getTel(telInquire, KEY, new Callback<Tel>() {
                        @Override
                        public void success(Tel tel, Response response) {
                            Log.e("---result code:-----", String.valueOf(tel.getResultcode()));
                            Log.e("---reason:----------", tel.getReason());
                            Log.e("---error code:------", String.valueOf(tel.getError_code()));

                            String telResult = "";
                            telResult = telResult + "  省份：　" + tel.getResult().getProvince() + "\n";
                            telResult = telResult + "  城市：　" + tel.getResult().getCity() + "\n";
                            telResult = telResult + "  区号：　" + tel.getResult().getAreacode() + "\n";
                            telResult = telResult + "  邮编：　" + tel.getResult().getZip() + "\n";
                            telResult = telResult + "  运营商：" + tel.getResult().getCompany() + "\n";
                            telResult = telResult + "  卡类型：" + tel.getResult().getCard() + "\n";

                            TextView txtResult = (TextView) findViewById(R.id.txt_tel_result);
                            txtResult.setText(telResult);
                            txtResult.setVisibility(View.VISIBLE);

                        }

                        @Override
                        public void failure(RetrofitError error) {
                            Log.e("---error message:---", error.getMessage());
                        }
                    });
                }
            }
        });
    }
}
