package com.example.al.auto_run.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.al.auto_run.R;

public class HistoryDetailed extends AppCompatActivity {
    ImageButton history_detailed_reback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_detailed);
        history_detailed_reback=(ImageButton)findViewById(R.id.history_detailed_reback);
        history_detailed_reback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HistoryDetailed.this.finish();
            }
        });
    }
}

