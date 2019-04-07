package c15130700.a2019.itl.myapplication;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton bV,bAz,bAm,bN;
    ImageButton bo1,bo2,bo3,bo4;
    ImageButton bp1,bp2,bp3,bp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciamos imagenbuttons con las variables
        //botes
        bV= (ImageButton)findViewById(R.id.boteVerde);
        bAz= (ImageButton)findViewById(R.id.boteAzul);
        bAm= (ImageButton)findViewById(R.id.boteAmarillo);
        bN= (ImageButton)findViewById(R.id.boteNegro);
        //basura organica
        bo1=(ImageButton)findViewById(R.id.o1);
        bo2=(ImageButton)findViewById(R.id.o2);
        bo3=(ImageButton)findViewById(R.id.o3);
        bo4=(ImageButton)findViewById(R.id.o4);
        //basura plasticos
        bp1=(ImageButton)findViewById(R.id.p1);
        bp2=(ImageButton)findViewById(R.id.p2);
        bp3=(ImageButton)findViewById(R.id.p3);
        bp4=(ImageButton)findViewById(R.id.p4);

        //eventos dragListener (los que vamos a recibir)
        bV.setOnDragListener(dragListener);
        bAz.setOnDragListener(dragListener);
        bAm.setOnDragListener(dragListener);
        bN.setOnDragListener(dragListener);
        //eventos onLong (los que vamos a arrastrar)
        //basura organica
        bo1.setOnLongClickListener(longClickListener);
        bo2.setOnLongClickListener(longClickListener);
        bo3.setOnLongClickListener(longClickListener);
        bo4.setOnLongClickListener(longClickListener);
        //basura plasticos
        bp1.setOnLongClickListener(longClickListener);
        bp2.setOnLongClickListener(longClickListener);
        bp3.setOnLongClickListener(longClickListener);
        bp4.setOnLongClickListener(longClickListener);

    }

    View.OnLongClickListener longClickListener= new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadow = new View.DragShadowBuilder(v);
            v.startDrag(data,myShadow,v,0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();

            switch (dragEvent){
               /* case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case  DragEvent.ACTION_DRAG_EXITED:
                    break;*/
                case DragEvent.ACTION_DROP:
                    //ORGANICA
                    if(view.getId()==R.id.o1&&v.getId()==R.id.boteVerde){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                        if(view.getId()==R.id.o2&&v.getId()==R.id.boteVerde){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                    if(view.getId()==R.id.o3&&v.getId()==R.id.boteVerde){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }

                    if(view.getId()==R.id.o4&&v.getId()==R.id.boteVerde){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                    //fails
                    if(view.getId()==R.id.o1&&v.getId()!=R.id.boteVerde) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.o2&&v.getId()!=R.id.boteVerde) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.o3&&v.getId()!=R.id.boteVerde) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.o4&&v.getId()!=R.id.boteVerde) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }


                    //PLASTICOS
                    if(view.getId()==R.id.p1&&v.getId()==R.id.boteAzul){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                    if(view.getId()==R.id.p2&&v.getId()==R.id.boteAzul){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                    if(view.getId()==R.id.p3&&v.getId()==R.id.boteAzul){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }

                    if(view.getId()==R.id.p4&&v.getId()==R.id.boteAzul){
                        LinearLayout oldParent = (LinearLayout)view.getParent();
                        oldParent.removeView(view);
                        MediaPlayer media = MediaPlayer.create(MainActivity.this,R.raw.trash);
                        media.start();
                    }
                    //fails
                    if(view.getId()==R.id.p1&&v.getId()!=R.id.boteAzul) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.p2&&v.getId()!=R.id.boteAzul) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.p3&&v.getId()!=R.id.boteAzul) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }
                    if(view.getId()==R.id.p4&&v.getId()!=R.id.boteAzul) {
                        MediaPlayer mediaf = MediaPlayer.create(MainActivity.this,R.raw.fail);
                        mediaf.start();
                    }

                    break;
            }
            return true;
        }
    };
}
