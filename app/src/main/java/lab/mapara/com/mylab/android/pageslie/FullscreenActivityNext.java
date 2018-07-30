package lab.mapara.com.mylab.android.pageslie;

import android.app.Activity;
import android.os.Bundle;

import lab.mapara.com.mylab.R;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivityNext extends Activity {
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        setContentView(R.layout.activity_fullscreen_next);
        System.out.println("----Secondactivity activity---onCreates---");
    }

}
