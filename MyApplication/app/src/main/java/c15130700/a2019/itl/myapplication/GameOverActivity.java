package c15130700.a2019.itl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    public void onClickYes(View view){
        Singleton.getInstance().setResponse(true);
        finish();
    }

    public void onClickNo(View view){
        Singleton.getInstance().setResponse(false);
        finish();
    }
}
