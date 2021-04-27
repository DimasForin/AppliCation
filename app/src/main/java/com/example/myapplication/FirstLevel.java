package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;


public class FirstLevel extends Activity {
    private int a;
    private int b;
    private int c;
int answer;
EditText edit;
Button btn1;
Button btn2;
Button btn3;
Button btn4;
Button btn5;
Button btn6;
Button btn7;
public static boolean pass=false;
public static String TAG="tag";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        edit=findViewById(R.id.txt);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        edit.setVisibility(View.INVISIBLE);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn1.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {

                Random xa= new Random();
                a=xa.nextInt(100);
                Random xb= new Random();
                b=xb.nextInt(100);
                //System.out.println("eto b "+b);
                for (;b>a;a+=7){}
                c=b;
                //Random
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+c);
                int right= a-c;

                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
//                        int green=Color.parseColor(R.color.background_btn_color);
                            btn1.setText(reply);
                            btn1.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn1.setEnabled(false);
                            btn2.setEnabled(true);
                            btn2.setText(reply);
                            //задать вопрос setBackgroundColor setForeground i pro xml cveta ne zabud chto za INT COLOR CHO ON INT?
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k+=7;}
                if (z==0){z+=5;}
                if (x==a){
                    if (x>=k){a=x-k;
                    }else{a=k-x;}
                }else{a=x;}
                Log.i(TAG,a+"eto A");
                    if (y==b){
                        if (y>=z){b=y-z;
                        }else{b=z-y;}
                    }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;
                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply2 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply2.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
//                        int green=Color.parseColor(R.color.background_btn_color);
                            //btn2.setText(reply2);
                            btn2.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn2.setEnabled(false);
                            btn3.setEnabled(true);
                            btn3.setText(reply2);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k+=9;}
                Log.i(TAG,k+"Eto K");
                if (z==0){z+=5;}
                if (x==a){
                    if (x>=k){a=x-k;
                    }else{a=k-x;}
                    Log.i(TAG,a+"Eto novoe A");
                }else{a=x;}
                if (y==b){
                    if (y>=z){b=y-z;
                    }else{b=z-y;}
                }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;
                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply3 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply3.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
                            btn3.setText(reply3);
                            btn3.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn3.setEnabled(false);
                            btn4.setEnabled(true);
                            btn4.setText(reply3);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k+=2;}
                if (z==0){z-=1;}
                if (x==a){
                    if (x>=k){a=x-k;
                    }else{a=k-x;}
                }else{a=x;}
                if (y==b){
                    if (y>=z){b=y-z;
                    }else{b=z-y;}
                }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;

                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply4 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply4.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
                            btn4.setText(reply4);
                            btn4.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn4.setEnabled(false);
                            btn5.setEnabled(true);
                            btn5.setText(reply4);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k-=3;}
                if (z==0){z+=3;}
                if (x==a){
                    if (x>=k){a=x-k;
                    }else{a=k-x;}
                }else{a=x;}
                if (y==b){
                    if (y>=z){b=y-z;
                    }else{b=z-y;}
                }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;
                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply5 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply5.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
                            btn5.setText(reply5);
                            btn5.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn5.setEnabled(false);
                            btn6.setEnabled(true);
                            btn6.setText(reply5);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k+=1;}
                if (z==0){z-=4;}
                if (x==a){
                    if (x>k){a=x-k;
                    }else{a=k-x;}
                }else{a=x;}
                if (y==b){
                    if (y>z){b=y-z;
                    }else{b=z-y;}
                }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;
                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply6 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply6.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
                            btn6.setText(reply6);
                            btn6.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn6.setEnabled(false);
                            btn7.setEnabled(true);
                            btn7.setText(reply6);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random xa= new Random();
                int x = xa.nextInt(100);
                Random xb= new Random();
                int y = xb.nextInt(100);
                Random xc = new Random();
                int z = xc.nextInt(100);
                Random xk = new Random();
                int k = xc.nextInt(100);
                if(k==0){k+=4;}
                if (z==0){z+=3;}
                if (x==a){
                    if (x>k){a=x-k;
                    }else{a=k-x;}
                }else{a=x;}
                if (y==b){
                    if (y>z){b=y-z;
                    }else{b=z-y;}
                }else{b=y;}
                for (;b>a;a+=7){}
                edit.setVisibility(View.VISIBLE);
                edit.setHint(a+"-"+b);
                int right= a-b;
                edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reply7 = edit.getText().toString();
                        try{
                            answer = Integer.parseInt(reply7.trim());}catch (NumberFormatException nfe){
                            Toast.makeText(FirstLevel.this, "ОТВЕТ ЭТО ЦЕЛОЕ ЧИСЛО", Toast.LENGTH_SHORT).show();
                        }
                        if(answer==right){
                            btn7.setText("done");
                            btn3.setBackgroundColor(getResources().getColor(R.color.done_green));
                            edit.setVisibility(View.INVISIBLE);
                            btn7.setEnabled(false);
                            setPass();
                            Intent intent = new Intent(FirstLevel.this, AboutActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(FirstLevel.this, "Попробуй еще раз", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
    public void setPass(){
        SharedPreferences sp = getSharedPreferences(AboutActivity.MY_SETTINGS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(AboutActivity.PASS,true);
        editor.apply();
    }
}
