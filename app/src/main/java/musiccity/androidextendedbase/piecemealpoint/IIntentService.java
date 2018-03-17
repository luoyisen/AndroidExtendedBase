package musiccity.androidextendedbase.piecemealpoint;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by commi on 2018/3/17.
 */

public class IIntentService extends IntentService {

    public IIntentService() {
        super("IIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
