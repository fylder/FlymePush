package fylder.push.flyme;

import android.app.Application;

import com.meizu.cloud.pushsdk.PushManager;

/**
 * Created by 剑指锁妖塔 on 2016/12/22.
 */

public class FlymeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PushManager.register(this, "110160", "b22b1e9089af452db2a151a60865c085");//App ID   ,App Key
    }
}
