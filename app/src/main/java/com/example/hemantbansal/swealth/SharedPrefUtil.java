package com.example.hemantbansal.swealth;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Hemant Bansal on 11/20/2016.
 */

public class SharedPrefUtil {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefUtil(Context context) {
        sharedPreferences=context.getSharedPreferences(UtilVariables.sharedpreffilename,context.MODE_PRIVATE);
        editor=sharedPreferences.edit();

    }
    public DonorDetails getdata(){
        int dnrno=sharedPreferences.getInt("name",-1);
        String physique=sharedPreferences.getString("imgcode",null);
        String skinTone=sharedPreferences.getString("phn",null);
        String hairColor=sharedPreferences.getString("",null);
        int height=sharedPreferences.getInt("",-1);
        int weight=sharedPreferences.getInt("",-1);
        return new DonorDetails(dnrno, physique, height,weight, hairColor,skinTone  );
    }
}
