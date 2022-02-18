package com.example.cargaimagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = Volley.newRequestQueue(this);






        List<Hero> list = new ArrayList<Hero>();
        Hero uno = new Hero ("spiderman", "fhdjskkajh");
        Hero dos = new Hero ("batman", "fhdjskkajh");
        Hero tres = new Hero ("spiderman", "fhdjskkajh");
        Hero cuatro = new Hero ("batman", "fhdjskkajh");
        Hero cinco = new Hero ("spiderman", "fhdjskkajh");
        Hero seis = new Hero ("batman", "fhdjskkajh");
        list.add(uno);
        list.add(dos);
        list.add(tres);
        list.add(cuatro);
        list.add(cinco);
        list.add(seis);




    }

}