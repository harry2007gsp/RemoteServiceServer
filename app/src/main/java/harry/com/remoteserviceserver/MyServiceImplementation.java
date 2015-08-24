package harry.com.remoteserviceserver;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Harry on 8/22/15.
 */
public class MyServiceImplementation extends Service {
    MyService.Stub stub = new MyService.Stub() {
        @Override
        public String returnString(String string) throws RemoteException {
            return "hello "+string;
        }
    };
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("test", "server onBind");
        return stub.asBinder();
    }
}
