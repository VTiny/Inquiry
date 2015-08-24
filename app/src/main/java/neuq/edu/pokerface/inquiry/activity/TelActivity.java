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

                            TextView provinceTV = (TextView) findViewById(R.id.txt_tel_result_province);
                            TextView cityTV = (TextView) findViewById(R.id.txt_tel_result_city);
                            TextView areacodeTV = (TextView) findViewById(R.id.txt_tel_result_areacode);
                            TextView zipTV = (TextView) findViewById(R.id.txt_tel_result_zip);
                            TextView companyTV = (TextView) findViewById(R.id.txt_tel_result_company);
                            TextView cardTV = (TextView) findViewById(R.id.txt_tel_result_card);

                            provinceTV.setText(tel.getResult().getProvince());
                            cityTV.setText(tel.getResult().getCity());
                            areacodeTV.setText(tel.getResult().getAreacode());
                            zipTV.setText(tel.getResult().getZip());
                            companyTV.setText(tel.getResult().getCompany());
                            cardTV.setText(tel.getResult().getCard());

                            provinceTV.setVisibility(View.VISIBLE);
                            cityTV.setVisibility(View.VISIBLE);
                            areacodeTV.setVisibility(View.VISIBLE);
                            zipTV.setVisibility(View.VISIBLE);
                            companyTV.setVisibility(View.VISIBLE);
                            cardTV.setVisibility(View.VISIBLE);

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
