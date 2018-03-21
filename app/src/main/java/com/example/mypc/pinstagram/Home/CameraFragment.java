package com.example.mypc.pinstagram.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mypc.pinstagram.R;

/**
 * Created by My PC on 2/27/2018.
 */

public class CameraFragment extends android.support.v4.app.Fragment {
    private static final String TAG = "CameraFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera,container, false);

        return view;
    }
}
