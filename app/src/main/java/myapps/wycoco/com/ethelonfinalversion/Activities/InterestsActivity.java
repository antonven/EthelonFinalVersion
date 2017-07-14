package myapps.wycoco.com.ethelonfinalversion.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import myapps.wycoco.com.ethelonfinalversion.Fragments.InterestsDialogFragment;
import myapps.wycoco.com.ethelonfinalversion.R;

public class InterestsActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout linearNature, linearYouth, linearMedicine, linearDisaster, linearEducation;
    int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
    boolean selected;
    FloatingActionButton floatingActionButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.signature2Color));

        InterestsDialogFragment dialogFragment = new InterestsDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "MessageDialog");

        linearNature = (LinearLayout)findViewById(R.id.linearNature);
        linearYouth = (LinearLayout)findViewById(R.id.linearYouth);
        linearMedicine = (LinearLayout)findViewById(R.id.linearMedicine);
        linearDisaster = (LinearLayout)findViewById(R.id.linearDisaster);
        linearEducation = (LinearLayout)findViewById(R.id.linearEducation);


        linearNature.setOnClickListener(this);
        linearYouth.setOnClickListener(this);
        linearMedicine.setOnClickListener(this);
        linearDisaster.setOnClickListener(this);
        linearEducation.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        floatingActionButton = (FloatingActionButton)findViewById(R.id.floatButton);
        switch (view.getId()){
            case R.id.linearNature:
                count += 1;
                selected = true;
                Log.e("PISTE", "");
//                Toast.makeText(getApplicationContext(), "Nature!", Toast.LENGTH_SHORT).show();
                if(count%2 == 0)
                {
                    view.setBackgroundColor(0x00000000);
                }else {
                    view.setBackgroundColor(Color.parseColor("#26000000"));

                }
                break;
            case R.id.linearYouth:
                count1 += 1;
                if(count1%2 == 0)
                {
                    view.setBackgroundColor(0x00000000);
                }else {
                    view.setBackgroundColor(Color.parseColor("#26000000"));

                }
                break;
            case R.id.linearMedicine:
                count2 += 1;
                if(count2%2 == 0)
                {
                    view.setBackgroundColor(0x00000000);
                }else {
                    view.setBackgroundColor(Color.parseColor("#26000000"));

                }
                break;
            case R.id.linearDisaster:
                count3 += 1;
                if(count3%2 == 0)
                {
                    view.setBackgroundColor(0x00000000);
                }else {
                    view.setBackgroundColor(Color.parseColor("#26000000"));

                }
                break;
            case R.id.linearEducation:
                count4 += 1;
                if(count4%2 == 0)
                {
                    view.setBackgroundColor(0x00000000);
                }else {
                    view.setBackgroundColor(Color.parseColor("#26000000"));

                }
                break;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected) {
                    startActivity(new Intent(InterestsActivity.this, HomeActivity.class));
                }else{
                    Toast.makeText(InterestsActivity.this, "Please select at least one interest!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
