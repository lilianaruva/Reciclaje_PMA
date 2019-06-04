package mx.edu.itl.a2019.c15130722.u3lapachangaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    TextView Pass;
    TextView User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Pass = findViewById(R.id.txtPassword);
        User = findViewById(R.id.txtUser);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if(Singleton.getInstance().getCode() == 0)
            Pass.setText(Singleton.getInstance().getPassword());
        if(Singleton.getInstance().getCode() == 1)
            User.setText(Singleton.getInstance().getUser());
    }

    public void ClickUser(View v){
        Singleton.getInstance().setCode(1);
        Intent intent = new Intent(this, ValorActivity.class);
        startActivity(intent);
    }

    public void ClickPassword(View v){
        Singleton.getInstance().setCode(0);
        Intent intent = new Intent(this, ValorActivity.class);
        startActivity(intent);
    }

    public void ClickAcercaDe(View v){
        Intent intent = new Intent(this, AcercaDeActivity.class);
        startActivity(intent);
    }

    public void ClickLogIn(View v) {
        if(User.getText().toString().equals("pma") && Pass.getText().toString().equals("android")){
            Intent intent = new Intent(this, PachangaActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, User.getText() + " " + Pass.getText(), Toast.LENGTH_LONG).show();
        }
    }
}
