package myapps.wycoco.com.ethelonfinalversion.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import myapps.wycoco.com.ethelonfinalversion.R;

public class LoginActivity extends AppCompatActivity {

    Firebase firebase;
    TextView signUp;
    EditText inputEmail, inputPassword;
    Button buttonLogin, buttonFacebook, buttonGoogle ;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Firebase.setAndroidContext(this);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference table = database.getReference("sampleTable");

         firebase = new Firebase("https://ethelonfinalversion.firebaseio.com/sampleTable");

        firebase.child("name").setValue("Kyle");







        signUp = (TextView)findViewById(R.id.buttonSignup);
        inputEmail = (EditText)findViewById(R.id.inputEmail);
        inputPassword = (EditText)findViewById(R.id.inputPassword);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonFacebook = (Button)findViewById(R.id.buttonFacebook);
        buttonGoogle = (Button)findViewById(R.id.buttonGoogle);




        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebase.child("kobe").setValue("Kyle");
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
