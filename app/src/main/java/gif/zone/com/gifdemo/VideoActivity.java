package gif.zone.com.gifdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageButton;

public class VideoActivity extends AppCompatActivity {

    private MediaController mc;
    private GifImageButton gib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gib = new GifImageButton(this);
        setContentView(gib);
        gib.setImageResource(R.drawable.b);
        //获取控制器
        mc = new MediaController(this);
        //将图片放入媒体控制器中
        mc.setMediaPlayer((GifDrawable) gib.getDrawable());
        mc.setAnchorView(gib);
        //给图片添加监听，点击就会显示播放控件
        gib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc.show();
            }
        });
    }
}
