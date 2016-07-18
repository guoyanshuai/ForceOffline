package com.example.com.forceoffline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private EditText edit_user;
    private EditText edit_pwd;
    private Button login;
    private String mUser;
    private String mPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_user = (EditText) findViewById(R.id.edit_user);
        edit_pwd = (EditText) findViewById(R.id.edit_pwd);

    }
    public void click(View v)
    {
        mUser = edit_user.getText().toString().trim();
        mPwd = edit_pwd.getText().toString().trim();
        if (mUser.equals("admin") && mPwd.equals("123")) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
            finish();
        }else
        {
            Toast.makeText(MainActivity.this,"User or PassWord is invalid"+mPwd+mUser
                    ,Toast.LENGTH_SHORT).show();
        }
    }
}
