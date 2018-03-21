package com.example.mypc.pinstagram.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mypc.pinstagram.R;
import com.example.mypc.pinstagram.Utils.UniversalImageLoader;

/**
 * Created by My PC on 2/28/2018.
 */

public class EditProfilefragment extends android.support.v4.app.Fragment {
    private static final String TAG = "EditProfilefragment";

    private ImageView mProfilePhoto;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editprofile,container, false);
        mProfilePhoto = (ImageView) view.findViewById(R.id.profile_photo);


        setProfileImage();

        //back arrow for navigating back to "ProfileActivity"
        ImageView backArrow = (ImageView) view.findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating back to profileActivity");
                getActivity().finish();
            }
        });

        return view;
    }

    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image.");
        String imgURL = "https://www.google.com.np/imgres?imgurl=https://josephratliff.name/wp-content/uploads/2017/11/android-central.jpg&imgrefurl=https://josephratliff.name/who-is-misleading-us-about-latest-android-news/&h=999&w=1332&tbnid=_UsufijKPWfHmM:&tbnh=194&tbnw=259&usg=__jjUZSRQmc6LFudyZSJnIfrL_ns8%3D&vet=1&docid=CgZ_k3jpgVqNJM";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto,null, "https://");

        //https://josephratliff.name/who-is-misleading-us-about-latest-android-news/
    }
}
