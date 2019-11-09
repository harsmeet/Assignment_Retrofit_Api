package com.event.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.event.myapplication.adapter.EnquiryAdapter;
import com.event.myapplication.networking.APIService;
import com.event.myapplication.networking.ApiUtils;
import com.event.myapplication.pojoi.Example;
import com.event.myapplication.pojoi.Woman;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    private APIService mAPIService;

    EnquiryAdapter enquiryAdapter;
    Context context;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAPIService = ApiUtils.getAPIService();

        context = MainActivity.this;

        rv = (RecyclerView)findViewById(R.id.rv);

        mAPIService.getwikiData().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {


                    List<Woman> status = response.body().getWomen();

                        setdata(status);

                        Toast.makeText(getApplicationContext(),"ssssss", Toast.LENGTH_LONG).show();


            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {


                Toast.makeText(getApplicationContext(), "fffffff", Toast.LENGTH_LONG).show();


            }
        });


    }

    private void setdata(List<Woman> status) {


        enquiryAdapter = new EnquiryAdapter(MainActivity.this, context, status);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(enquiryAdapter);
    }
}
