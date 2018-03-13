package com.example.professorsudoeste.appinfoaluno;

import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by thiag on 08/03/2018.
 */

public class Login extends AppCompatActivity {


EditText edt_Name, edt_Password;
Button btn_login;



InfoAlunoDB db = new InfoAlunoDB(this) {
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login.setOnClickListener(new View.OnClickListener() {
            Boolean valida = false;
            @Override
            public void onClick(View view) {
                //Verificar se o campo username e password foram preenchidos
                if (edt_Name.equals("")){
                    valida = false;
                    Toast.makeText(getApplicationContext(), " Digite o usuário ", Toast.LENGTH_LONG).show();
                }
                if (edt_Password.equals("")){
                    valida = false;
                    Toast.makeText(getApplicationContext(), " Digite o usuário ", Toast.LENGTH_LONG).show();
                }

            }
        });
     }
}

