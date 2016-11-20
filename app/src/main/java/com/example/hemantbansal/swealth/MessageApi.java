package com.example.hemantbansal.swealth;

import android.util.Log;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Hemant Bansal on 11/19/2016.
 */

public class MessageApi {
/*

    public static JSONObject getJSONFromUrl(){
        InputStream is = null;
        JSONObject jsonObject=null;
        String jsonstring="";
       // String phone="9910596821";
        String ur= "http://api.textlocal.in/send/?username=gunpreet.34@gmail.com&hash=7296d9d0f6b5bfe873605979057253d2a1b68399&message=aaja&sender=TXTLCL&numbers=9468323889";
        String completeurl = ur;
        try {
            URL url = new URL(completeurl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setReadTimeout(15000);
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);

            is = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(is).useDelimiter("\\A");
            if(s.hasNext()){
                jsonstring= s.next();
            }
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            Log.d("error", "error in getjsonfromurl MalformedUrlexception");
        } catch (IOException e) {
            Log.d("error", "error in getjsonfromurl Ioexception");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Log.d("Answer=",jsonstring);

        try {
            jsonObject = new JSONObject(jsonstring);
        } catch (JSONException e) {
            Log.d("error", "Json exception in get JSONFRomURL ");
            return null;

        }
        return jsonObject;
    }
*/

public  static  void hit(String url){
    RequestBody requestBody=new FormEncodingBuilder()
            .add("email","hem.ban.061@gmail.com")
            .add("password","hemantbansal")
            .add("name","Swealth")
            .add("number","9468323889")
            .add("message","Your Otp is 3627")
            .build();
    Request request=new Request.Builder()
            .post(requestBody)
            .url(url)
            .build();
    make_req(request);
}
    public static void make_req(Request request) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {


            }

            @Override
            public void onResponse(Response response) throws IOException {
                String res = response.body().string();
                Log.d("Okkhttp Debug:", res);

            }
        });
    }
}
