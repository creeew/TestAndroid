package top.sadboy.www.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText usr;
    EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById(R.id.usr1);
        pwd = (EditText) findViewById(R.id.pwd1);
        Button login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(usr.getText().toString().trim(), pwd.getText().toString().trim());
            }
        });
    }

    public void check(String usr, String pwd) {
        if (usr.equals("hzq") && pwd.equals("123")) {
            Toast.makeText(MainActivity.this, "Successful login", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Failed Login", Toast.LENGTH_SHORT).show();
        }
    }
}
