package com.example.mypc.pinstagram.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.mypc.pinstagram.R;
import com.example.mypc.pinstagram.Utils.BottomNavigatioViewHelper;
import com.example.mypc.pinstagram.Utils.GridImageAdapter;
import com.example.mypc.pinstagram.Utils.UniversalImageLoader;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

/**
 * Created by My PC on 2/27/2018.
 */

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;
    private static final int NUM_GRID_COLUMS = 3;

    private Context mContext = ProfileActivity.this;

    private ProgressBar mProgressBar;
    private ImageView profilePhoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started");
        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);

        setupBottomNavigationView();
        setupToolbar();
        setupActivityWidgets();
        setProfileImage();

        tempGridSetup();

    }

    private  void tempGridSetup(){
        ArrayList<String> imgURLs = new ArrayList<>();
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=KMrijfvWvKaMNM%253A%252C5RTu1qS62pV07M%252C_&usg=__mlKbShaIhnK1RCVLt8FLh3r0Ysc%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IwAEwCw#imgrc=KMrijfvWvKaMNM:");
        imgURLs.add("http://developer.android.com/images/dialog_buttons.png");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=ok3Ujapxrx5yrM%253A%252CnVrbZ6x84_QItM%252C_&usg=__cFM2GzCYZtRn8ByZYXapVRUqjgY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IygEwEA#imgrc=ok3Ujapxrx5yrM:");
        imgURLs.add("http://developer.android.com/images/dialog_buttons.png");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=lAHthDF3S1ACoM%253A%252C2bZLA8JdC6ZaTM%252C_&usg=__Kzu9sB22CMAqAB5fSkL81NlFFyY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IyAEwDw#imgrc=fiJ-HZc0KFC-WM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=lAHthDF3S1ACoM%253A%252C2bZLA8JdC6ZaTM%252C_&usg=__Kzu9sB22CMAqAB5fSkL81NlFFyY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IyAEwDw#imgrc=Tck2Y_BFj_sFFM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=KMrijfvWvKaMNM%253A%252C5RTu1qS62pV07M%252C_&usg=__mlKbShaIhnK1RCVLt8FLh3r0Ysc%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IwAEwCw#imgrc=KMrijfvWvKaMNM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=KMrijfvWvKaMNM%253A%252C5RTu1qS62pV07M%252C_&usg=__mlKbShaIhnK1RCVLt8FLh3r0Ysc%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IwAEwCw#imgrc=mVrwcCQle9g31M:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=ok3Ujapxrx5yrM%253A%252CnVrbZ6x84_QItM%252C_&usg=__cFM2GzCYZtRn8ByZYXapVRUqjgY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IygEwEA#imgrc=ok3Ujapxrx5yrM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=lAHthDF3S1ACoM%253A%252C2bZLA8JdC6ZaTM%252C_&usg=__Kzu9sB22CMAqAB5fSkL81NlFFyY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IyAEwDw#imgrc=lAHthDF3S1ACoM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=lAHthDF3S1ACoM%253A%252C2bZLA8JdC6ZaTM%252C_&usg=__Kzu9sB22CMAqAB5fSkL81NlFFyY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IyAEwDw#imgrc=fiJ-HZc0KFC-WM:");
        imgURLs.add("https://www.google.com.np/search?q=image&tbm=isch&source=iu&ictx=1&fir=lAHthDF3S1ACoM%253A%252C2bZLA8JdC6ZaTM%252C_&usg=__Kzu9sB22CMAqAB5fSkL81NlFFyY%3D&sa=X&ved=0ahUKEwi-keGRsubZAhWCrY8KHWzQAxQQ_h0IyAEwDw#imgrc=Tck2Y_BFj_sFFM:");

        setupImageGrid(imgURLs);
    }

    private void setupImageGrid(ArrayList<String> imgURLs){
        GridView gridView = (GridView) findViewById(R.id.gridView);

        int gridWidth = getResources().getDisplayMetrics().widthPixels;
        int imageWidth = gridWidth/NUM_GRID_COLUMS;
        gridView.setColumnWidth(imageWidth);

        GridImageAdapter adapter = new GridImageAdapter(mContext, R.layout.layout_grid_imageview, "",imgURLs);
        gridView.setAdapter(adapter);
    }

    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile photo.");
        String imgURL = "http://developer.android.com/images/dialog_buttons.png";
        UniversalImageLoader.setImage(imgURL, profilePhoto,mProgressBar,"https://");
    }

    private void setupActivityWidgets(){
        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);

        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating to account settings.");
                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });

// <------Menu bar Deleted --------->
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Log.d(TAG, "onMenuItemClick: clicked menu item" + item);
//
//                switch (item.getItemId()){
//                    case R.id.profileName:
//                        Log.d(TAG, "onMenuItemClick: Navigating to Profile Preferences.");
//                }
//                return false;
//            }
//        });


    }

    /**
     * *BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx= (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigatioViewHelper.setupBottomNavogationView(bottomNavigationViewEx);

        //navigation enabled here
        BottomNavigatioViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}