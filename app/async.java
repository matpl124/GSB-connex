import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class async extends AsyncTask<String, Void, String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {
        return networkUtil.getLogin(strings[0]);    }

}
