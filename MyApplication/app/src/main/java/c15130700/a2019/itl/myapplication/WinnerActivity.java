package c15130700.a2019.itl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
    }

    public void onClickFinish(View v) {
        Singleton.getInstance().setResponse(false);
        finish();
    }
}
