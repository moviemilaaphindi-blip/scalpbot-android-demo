package com.scalpbot.demo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(28, 36, 28, 28);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setBackgroundColor(Color.rgb(12, 18, 32));

        TextView title = new TextView(this);
        title.setText("ScalpBot F&O");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(-1, -2));

        TextView subtitle = new TextView(this);
        subtitle.setText("AI Trading Dashboard • Demo");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        status = new TextView(this);
        status.setText("\nStatus: STOPPED\n\nMode: PAPER TRADING\n\nProfit/Loss: ₹0.00\n\nReal orders: DISABLED");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        root.addView(status);

        Button start = new Button(this);
        start.setText("START DEMO BOT");
        root.addView(start, new LinearLayout.LayoutParams(-1, -2));
        start.setOnClickListener(v -> {
            status.setText("\nStatus: RUNNING (DEMO)\n\nMode: PAPER TRADING\n\nProfit/Loss: ₹0.00\n\nReal orders: DISABLED");
            Toast.makeText(this, "Demo started. No real trades.", Toast.LENGTH_LONG).show();
        });

        Button stop = new Button(this);
        stop.setText("STOP BOT");
        root.addView(stop, new LinearLayout.LayoutParams(-1, -2));
        stop.setOnClickListener(v -> {
            status.setText("\nStatus: STOPPED\n\nMode: PAPER TRADING\n\nProfit/Loss: ₹0.00\n\nReal orders: DISABLED");
        });

        Button risk = new Button(this);
        risk.setText("RISK SETTINGS");
        root.addView(risk, new LinearLayout.LayoutParams(-1, -2));
        risk.setOnClickListener(v -> Toast.makeText(this,
            "Demo only: risk settings will be added next.", Toast.LENGTH_LONG).show());

        setContentView(root);
    }
}
