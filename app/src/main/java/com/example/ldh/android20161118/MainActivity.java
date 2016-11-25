package com.example.ldh.android20161118;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, btn1, btn2;
    TextView t1, t2;
    Switch sw;
    RadioButton r1, r2, r3;
    RadioGroup rg;
    ImageView iview;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진보기");
        button = (Button)findViewById(R.id.button);
        t1 = (TextView)findViewById(R.id.textview1);
        t2 = (TextView)findViewById(R.id.textView2);
        sw = (Switch) findViewById(R.id.switch1);
        rg = (RadioGroup)findViewById(R.id.rg);
        r1 = (RadioButton)findViewById(R.id.radioButton1);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        iview =(ImageView)findViewById(R.id.imageView);
        btn1 = (Button)findViewById(R.id.button2);
        btn2 = (Button)findViewById(R.id.button3);
        LL = (LinearLayout)findViewById(R.id.LL);

        LL.setVisibility(View.INVISIBLE);
        iview.setVisibility(View.INVISIBLE);





        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked ==true){
                    LL.setVisibility(View.VISIBLE);

                }
                else {
                   LL.setVisibility(View.INVISIBLE);
                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(group.getId()==R.id.rg){
                    switch (checkedId){
                        case R.id.radioButton1 :
                            Toast.makeText(getApplicationContext(),"젤리빈을 선택하였습니다.", Toast.LENGTH_SHORT).show();
                            iview.setImageResource(R.drawable.zel);
                            iview.setVisibility(View.VISIBLE);
                            break;
                        case R.id.radioButton2 :
                            Toast.makeText(getApplicationContext(), "킷캣을 선택하였습니다.", Toast.LENGTH_SHORT).show();
                            iview.setImageResource(R.drawable.kit);
                            iview.setVisibility(View.VISIBLE);
                            break;
                        case R.id.radioButton3 :
                            Toast.makeText(getApplicationContext(), "롤리팝을 선택하였습니다.", Toast.LENGTH_SHORT).show();
                            iview.setImageResource(R.drawable.lol);
                            iview.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setChecked(false);
                LL.setVisibility(View.INVISIBLE);
                r1.setChecked(true);

            }
        });
    }
}
