package com.andreyvolkov.tinkofffintechapp.Model;

import android.content.Context;

import com.andreyvolkov.tinkofffintechapp.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class JSONClient {

    private Context context;

    public JSONClient(Context context) {
        this.context = context;
    }

    private String getStringFromFile() {
        String line = "";
        try {
            InputStream is = context.getApplicationContext().getResources().openRawResource(R.raw.internships_data);
            Charset inputCharset = Charset.forName("Cp1251");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, inputCharset));
            while ((line = reader.readLine()) != null) {
                return line;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public ArrayList<PostItem> getListPostItem() {
        Gson gson = new Gson();
        PostItem[] postItemsArray = gson.fromJson(getStringFromFile(), PostItem[].class);
        ArrayList<PostItem> postItems = new ArrayList<>();
        postItems.addAll(Arrays.asList(postItemsArray));
        return postItems;
    }
}
