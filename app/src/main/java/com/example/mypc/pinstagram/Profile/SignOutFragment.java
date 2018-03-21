package com.example.mypc.pinstagram.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mypc.pinstagram.R;

/**
 * Created by My PC on 2/28/2018.
 */

public class SignOutFragment extends android.support.v4.app.Fragment {
    private static final String TAG = "SignOutFragment";
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signout,container, false);

        return view;
    }
}
