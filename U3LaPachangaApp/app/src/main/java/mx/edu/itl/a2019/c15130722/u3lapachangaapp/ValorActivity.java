package mx.edu.itl.a2019.c15130722.u3lapachangaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ValorActivity extends AppCompatActivity {

    EditText edValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor);

        edValor = findViewById(R.id.edValor);
    }

    public void ClickIngresar(View v){
        if(Singleton.getInstance().getCode() == 1){
            Singleton.getInstance().setUser(edValor.getText().toString());
        }
        if(Singleton.getInstance().getCode() == 0){
            Singleton.getInstance().setPassword(edValor.getText().toString());
        }
        finish();
    }


}
