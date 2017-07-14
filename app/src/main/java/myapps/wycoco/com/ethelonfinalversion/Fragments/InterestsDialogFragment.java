package myapps.wycoco.com.ethelonfinalversion.Fragments;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;

/**
 * Created by dell on 7/13/2017.
 */

public class InterestsDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder
                .setTitle("Welcome Anton!")
                .setMessage("Please choose your interests and skills. This will determine the different activities that would be displayed in your home screen.")
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        InterestsDialogFragment.this.dismiss();
                    }
                });

        return builder.create();
    }


}
