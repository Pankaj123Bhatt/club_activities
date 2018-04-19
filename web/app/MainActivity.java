package com.example.pankajbhatt.web;

//package straightforwardapps.second_networking;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

// import com.bumptech.glide.Glide;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class MainActivity extends AppCompatActivity {


    EditText rno;
    TextView mac, st;
   String mac_add = "38:a4:ed:e9:e8:1d";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        rno = (EditText) findViewById(R.id.rno);
        mac = (TextView) findViewById(R.id.mac);
        st = (TextView) findViewById(R.id.st);
        mac.setText(mac_add);

    }

    public void sendshiz(View view) {
        new SendPostRequest().execute();
    }

    public class SendPostRequest extends AsyncTask<String, String, String> {

        String us = rno.getText().toString();
        String pas = mac.getText().toString();

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            try
            {
                URL url = new URL("https://android-club-project.herokuapp.com/upload_details?reg_no="+us+"&"+"mac="+pas);
                HttpURLConnection x = (HttpURLConnection) url.openConnection();
                x.connect();

                InputStream stream = x.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

                String line = "";
                StringBuffer buffer = new StringBuffer( );
                while((line=reader.readLine())!=null)
                {
                    buffer.append(line);
                }
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "Problem with internet connection";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            st.setText(s);
        }
    }

}
