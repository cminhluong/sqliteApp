package com.example.sqliteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    com.example.sqlliteapp.DatabaseHelper myDb;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new com.example.sqlliteapp.DatabaseHelper(this);
        btnAdd = (Button)findViewById(R.id.btn_Add);
        add_data();
    }

    public void add_data()
    {
        btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean result = myDb.insertUser("minh", "123456", "Minh Luong", "minh.test.com");

                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert user data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert user data", Toast.LENGTH_LONG).show();

                        result = myDb.insertStock("APL","Apple stocks");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert stock data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert stock data", Toast.LENGTH_LONG).show();

                        result = myDb.insertTransaction("minh","APL", 546.5, true, "2019-04-15");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert transaction data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert transaction data", Toast.LENGTH_LONG).show();

                        result = myDb.insertTransaction("minh","APL", 560.5, true, "2019-04-15");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert transaction data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert transaction data", Toast.LENGTH_LONG).show();

                        result = myDb.insertTransaction("minh","APL", 760.5, false, "2019-04-15");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert transaction data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert transaction data", Toast.LENGTH_LONG).show();

                        result = myDb.insertWatchlist("minh","Minh watch list", "2019-04-14");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert watchlist data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert watchlist data", Toast.LENGTH_LONG).show();

                        result = myDb.insertWatchlist_stock(1,"APL", "2019-04-14");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert watchlist stock data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert watchlist stock data", Toast.LENGTH_LONG).show();

                        result = myDb.insertNote("Note testing", "2019-04-15" , "minh");
                        if(result)
                            Toast.makeText(MainActivity.this, "Success to insert note data", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Failed to insert note data", Toast.LENGTH_LONG).show();
                    }
                }

        );
    }
}

