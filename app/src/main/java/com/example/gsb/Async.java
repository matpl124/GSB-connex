package com.example.gsb;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Async extends AsyncTask<String, Void, String> {


    private Context context;

    public Async(Context ctx){
        this.context = ctx;
    }

    @Override
    protected String doInBackground(String... strings) {
        return networkUtil.getLogin(strings[0], strings[1]);

    }

    @Override
    protected void onPostExecute(String s) {
        Log.d("TEST", s);
        super.onPostExecute(s);
        String mailT = null;
        String name = null;
        String surname = null;
        String statut = null;
        try {
            JSONObject jsonObject = new JSONObject(s);
            JSONObject items = jsonObject.getJSONObject("0");
            mailT = items.getString("login");
            name = items.getString("name");
            surname = items.getString("surname");
            statut = items.getString("statut");

            Intent intent = new Intent(context, MainActivity2.class);
            intent.putExtra("mail", mailT);
            intent.putExtra("surname", surname);
            intent.putExtra("name", name);
            intent.putExtra("statut", statut);
            context.startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(context, "login ou password faux", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
