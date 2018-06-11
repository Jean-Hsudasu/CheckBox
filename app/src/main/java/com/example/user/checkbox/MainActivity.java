package com.example.user.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkbasketball,chkbaseball,chkrun;
    private TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkbasketball = (CheckBox)findViewById(R.id.chkbacketball);
        chkbaseball = (CheckBox)findViewById(R.id.chkbaseball);
        chkrun = (CheckBox)findViewById(R.id.chkrun);
        txtresult = (TextView)findViewById(R.id.txtresult);

        chkbasketball.setOnCheckedChangeListener(listener);
        chkbaseball.setOnCheckedChangeListener(listener);
        chkrun.setOnCheckedChangeListener(listener);
    }

    private CheckBox.OnCheckedChangeListener listener = new CheckBox.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int n = 0;
            String sel="";
            String s1="",s2="",s3="";

            if(chkbasketball.isChecked()) {
                n++;
                s1 = chkbasketball.getText().toString()+"";

            } else {
                s1="";
            }
            if(chkbaseball.isChecked()) {
                n++;
                s2 = chkbaseball.getText().toString()+"";
            } else {
                s2="";
            }
            if(chkrun.isChecked()) {
                n++;
                s3 = chkrun.getText().toString()+"";
            } else {
                s3="";
            }
            sel = s1+s2+s3;
            txtresult.setText("最喜歡的運動有:" + sel + "共" + n + "項" );

        }
    };
}
