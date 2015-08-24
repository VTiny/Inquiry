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
import neuq.edu.pokerface.inquiry.model.ip.Ip;
import neuq.edu.pokerface.inquiry.util.IpUtil;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class IpActivity extends Activity {

    static final String KEY = "040621325af8b5ca4097bbc5664f1f7b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        Button returnButton = (Button) findViewById(R.id.btn_ip_back);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button inquireButton = (Button) findViewById(R.id.btn_ip_inquire);
        inquireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_ip);
                String website = editText.getText().toString();
                if(!website.isEmpty()) {
                    IpUtil.ipService.getIp(website, KEY, new Callback<Ip>() {
                        @Override
                        public void success(Ip ip, Response response) {

                            Log.e("---result code:--", ip.getResultcode());
                            Log.e("---error code:---", String.valueOf(ip.getErrorCode()));
                            Log.e("---reason:-------", ip.getReason());

                            String ipResult = "";
                            ipResult = ipResult + "    地址：　" + ip.getResult().getArea() + "\n";
                            ipResult = ipResult + "    运营商：" + ip.getResult().getLocation() + "\n";

                            TextView txtResult = (TextView) findViewById(R.id.txt_ip_result);
                            txtResult.setText(ipResult);
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
