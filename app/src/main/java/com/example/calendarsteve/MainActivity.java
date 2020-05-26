package com.example.calendarsteve;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarComponent;
    TextView chosenDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarComponent = (CalendarView) findViewById(R.id.calendarComponent);
        chosenDate = (TextView) findViewById(R.id.chosenDate);

        calendarComponent.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (year + 1) + " / " + month + " / " + dayOfMonth;
                chosenDate.setText(date);
            }
        });
    }
}
