package com.example.mypc.pinstagram.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.mypc.pinstagram.Likes.LikesActivity;
import com.example.mypc.pinstagram.Home.HomeActivity;
import com.example.mypc.pinstagram.Profile.ProfileActivity;
import com.example.mypc.pinstagram.R;
import com.example.mypc.pinstagram.Search.SearchActivity;
import com.example.mypc.pinstagram.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by My PC on 2/27/2018.
 */

public class BottomNavigatioViewHelper {
    private static final String TAG = "BottomNavigatioViewHelp";
    public static void setupBottomNavogationView(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.ic_house:
                       Intent intent1 = new Intent(context, HomeActivity.class); //ACTIVITI_NUM = 0
                       context.startActivity(intent1);
                       break;

                   case R.id.ic_search:
                       Intent intent2 = new Intent(context, SearchActivity.class);//ACTIVITI_NUM = 1
                       context.startActivity(intent2);
                       break;

                   case R.id.ic_circle:
                       Intent intent3 = new Intent(context, ShareActivity.class);//ACTIVITI_NUM = 2
                       context.startActivity(intent3);
                       break;

                   case R.id.ic_alert:
                       Intent intent4 = new Intent(context, LikesActivity.class);//ACTIVITI_NUM = 3
                       context.startActivity(intent4);
                       break;

                   case R.id.ic_android:
                       Intent intent5 = new Intent(context, ProfileActivity.class);//ACTIVITI_NUM = 4
                       context.startActivity(intent5);
                       break;
               }

                return false;
            }
        });
    }
}
