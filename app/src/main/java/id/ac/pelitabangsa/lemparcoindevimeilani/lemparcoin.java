package id.ac.pelitabangsa.lemparcoindevimeilani;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class lemparcoin extends Activity implements View.OnClickListener {
    private Button buttonlempar;
    private Button buttonulangi;
    private Button buttonkeluar;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak= new Random();
        setContentView(R.layout.activity_lemparcoin);
        buttonlempar=(Button)findViewById(R.id.button);
        buttonulangi=(Button)findViewById(R.id.button4);
        buttonkeluar=(Button)findViewById(R.id.button5);
        buttonlempar.setOnClickListener(this);
        buttonulangi.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);


}
@Override
public void onClick(View view){
    if (view==buttonlempar){
        Log.d("CLICK_EVENT","lempar button dclick!");
        TextView tw=(TextView)findViewById(R.id.textView);
        ImageView iw=(ImageView)findViewById(R.id.imageView);

        if(acak.nextDouble() < 0.5){
            tw.setText("kepala");
            iw.setImageResource(R.drawable.head);

        } else {
            tw.setText("cross");
            iw.setImageResource(R.drawable.tail);

        }
        buttonlempar.setVisibility(view.INVISIBLE);
        buttonulangi.setVisibility(view.VISIBLE);
        buttonkeluar.setVisibility(view.VISIBLE);

    } else if (view==buttonulangi){
        TextView tw=(TextView)findViewById(R.id.textView);
        ImageView iw=(ImageView)findViewById(R.id.imageView);

        buttonlempar.setVisibility(view.VISIBLE);
        buttonulangi.setVisibility(view.VISIBLE);
        buttonkeluar.setVisibility(view.INVISIBLE);

    } else if(view==buttonkeluar){
        this.finish();
    }
    }
}
