package ayp.aug.beatbox;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment onCreateFragment() {
        return BeatBoxFragment.newInstance();
    }
}
