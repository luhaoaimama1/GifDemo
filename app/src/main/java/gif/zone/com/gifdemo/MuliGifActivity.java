package gif.zone.com.gifdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.io.IOException;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.MultiCallback;

public class MuliGifActivity extends AppCompatActivity {


    private GifImageView mul1, mul2;
    private GifDrawable gifDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muli);

        // 就是多个Gif view  加载同一张GifDrawable的时候 需要 同步显示的时候 用此方案
        mul1 = (GifImageView) findViewById(R.id.mul1);
        mul2 = (GifImageView) findViewById(R.id.mul2);
        try {
            gifDrawable=new GifDrawable(getResources(),R.drawable.b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MultiCallback multiCallback = new MultiCallback();

        mul1.setImageDrawable(gifDrawable);
        multiCallback.addView(mul1);

        mul2.setImageDrawable(gifDrawable);
        multiCallback.addView(mul2);

        gifDrawable.setCallback(multiCallback);

    }

}
