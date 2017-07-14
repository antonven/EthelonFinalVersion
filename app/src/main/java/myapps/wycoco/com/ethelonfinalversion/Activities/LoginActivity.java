package myapps.wycoco.com.ethelonfinalversion.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import myapps.wycoco.com.ethelonfinalversion.R;

public class LoginActivity extends AppCompatActivity {

    TextView signUp;
    EditText inputEmail, inputPassword;
    Button buttonLogin, buttonFacebook, buttonGoogle ;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        signUp = (TextView)findViewById(R.id.buttonSignup);
        inputEmail = (EditText)findViewById(R.id.inputEmail);
        inputPassword = (EditText)findViewById(R.id.inputPassword);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonFacebook = (Button)findViewById(R.id.buttonFacebook);
        buttonGoogle = (Button)findViewById(R.id.buttonGoogle);




        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,InterestsActivity.class));
            }
        });

        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}
