package com.example.admin.circularrevealeffect;

import android.animation.Animator;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       open=(Button)findViewById(R.id.button2);
open.setOnClickListener(this);
        MyDialog dialogToAnimate=new MyDialog();

    }




    @Override
    public void onClick(View v) {
        MyDialog dialogToAnimate=new MyDialog();


        dialogToAnimate.show(getSupportFragmentManager(),"MY_DIALOG");
    }
}
