package c15130700.a2019.itl.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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

    View login_layout;

    public void OnClickAbout(View v) {
        login_layout = this.getLayoutInflater().inflate(R.layout.about_layout, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Acerca de")
                .setView(login_layout)
                .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setCancelable(false)
                .setIcon(R.drawable.logo)
                .create()
                .show();
    }
}
