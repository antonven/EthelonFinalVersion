package myapps.wycoco.com.ethelonfinalversion.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myapps.wycoco.com.ethelonfinalversion.R;

/**
 * Created by dell on 7/15/2017.
 */

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_layout, container, false);
        return v;
    }
}
