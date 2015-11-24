package com.saad.asaad.lesson2lab;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create new Linear Layout with Vertical Orientation and Top Gravity
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.TOP);
        // Create three TextView objects
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
        // Set the TextView font size to scale independent and a size that looks good.
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        textView3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        // Set the TextView colors to something other than black.
        textView1.setTextColor(Color.RED);
        textView2.setTextColor(Color.RED);
        textView3.setTextColor(Color.RED);
        // Use the first TextView as a title. Use the second TextView as the body text. Use the third TextView as a closing remark.
        textView1.setText("Title");
        textView2.setText("Body Text");
        textView3.setText("Closing Remark");
        // Add the TextViews to the custom linear layout.
        layout.addView(textView1);
        layout.addView(textView2);
        layout.addView(textView3);
        // Display the layout in your app.
        setContentView(layout);
    }


}
