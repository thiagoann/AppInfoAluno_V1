package com.example.professorsudoeste.appinfoaluno;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by thiag on 22/03/2018.
 */

public class SignUp extends AppCompatActivity {


   EditText edt_username, edt_password, edt_confirmpassword;
   Button btn_signup;

   InfoAlunoDB db = new InfoAlunoDB(this) {
       @Override
       public void onCreate(SQLiteDatabase sqLiteDatabase) {

       }

       @Override
       public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


       }
   };

    @Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            public boolean check = false;

            @Override
            public void onClick(View view) {

                if (edt_username.equals("")) {

                    check = false;
                    Toast.makeText(getApplicationContext(), " Choose an username. ", Toast.LENGTH_SHORT).show();

                    if (edt_password.equals("")) {

                        check = false;
                        Toast.makeText(getApplicationContext(), " You need to choose a password. ", Toast.LENGTH_SHORT).show();


                        if (edt_confirmpassword.equals("")) {

                        check = false;
                        Toast.makeText(getApplicationContext(), " You need to confirm the password. ", Toast.LENGTH_SHORT).show();
                        }
                    }
                    }
                }
            });


    }


}
