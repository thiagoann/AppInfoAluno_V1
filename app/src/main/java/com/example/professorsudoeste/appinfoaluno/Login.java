package com.example.professorsudoeste.appinfoaluno;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Professor Sudoeste on 08/03/2018.
 */

public class Login extends AppCompatActivity {

    EditText edtUser, edtPassword;
    Button btnLogin;

    InfoAlunoDB db = new InfoAlunoDB(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            Boolean valida = true;
            @Override
            public void onClick(View v) {
                // Verificar se o campo usuário e senha foram preenchidos
                if(edtUser.equals("")){
                    valida = false;
                    Toast.makeText(getApplicationContext(), "Digite o usuário", Toast.LENGTH_LONG).show();
                }
                if(edtPassword.equals("")){
                    valida = false;
                    Toast.makeText(getApplicationContext(), "Digite a senha", Toast.LENGTH_LONG).show();
                }
                // Confrimar se o usuario e a senha correspondem ao do banco de dados.
                
            }
        });
    }
}
