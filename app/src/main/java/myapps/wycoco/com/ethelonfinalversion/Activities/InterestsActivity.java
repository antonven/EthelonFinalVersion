package myapps.wycoco.com.ethelonfinalversion.Activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import myapps.wycoco.com.ethelonfinalversion.Fragments.InterestsDialogFragment;
import myapps.wycoco.com.ethelonfinalversion.R;

public class InterestsActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout linearNature, linearYouth, linearMedicine, linearDisaster, linearEducation;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        InterestsDialogFragment dialogFragment = new InterestsDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "MessageDialog");

        linearNature = (LinearLayout)findViewById(R.id.linearNature);
        linearYouth = (LinearLayout)findViewById(R.id.linearYouth);
        linearMedicine = (LinearLayout)findViewById(R.id.linearMedicine);
        linearDisaster = (LinearLayout)findViewById(R.id.linearDisaster);
        linearEducation = (LinearLayout)findViewById(R.id.linearEducation);


//        linearNature.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count += 1;
//                Toast.makeText(getApplicationContext(), "Nature!", Toast.LENGTH_SHORT).show();
//                if(count%2 == 0)
//                {
//                    view.setBackgroundColor(0x00000000);
//                }else {
//                    view.setBackgroundColor(Color.parseColor("#0D000000"));
//                }
//
////                view.setBackgroundResource(R.drawable.ambulance);
//            }
//        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.linearNature:
                Toast.makeText(this, "Nature!", Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.parseColor("#0D000000"));
                break;
        }
    }
}
