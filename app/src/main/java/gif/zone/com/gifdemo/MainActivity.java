package gif.zone.com.gifdemo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// gif-Drawable一共提供了3中可以显示动态图片的控件：GifImageView 、GifImageButton和GifTextView。
// 当需要赋的图像值是gif格式的图片的时候，会显示动态图片，如果是普通的静态图片，例如是png,jpg的，这个时候，
// gifImageView等这些控件的效果和ImageView是一样的。也就是说gif-drawable比ImageView更强大。

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.videoB:
                startActivity(new Intent(this, VideoActivity.class));
                break;
            case R.id.muliGifC:
                startActivity(new Intent(this, MuliGifActivity.class));
                break;
            case R.id.clickStop:
                Drawable[] drawables = ((GifTextView) view).getCompoundDrawables();
                GifDrawable drawable = (GifDrawable) drawables[3];//是bottom
                if (drawable.isPlaying())
                    drawable.stop();
                else
                    drawable.start();
                break;
        }

    }
}
