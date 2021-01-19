package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.applikeysolutions.cosmocalendar.selection.RangeSelectionManager;
import com.applikeysolutions.cosmocalendar.settings.appearance.ConnectedDayIconPosition;
import com.applikeysolutions.cosmocalendar.settings.lists.connected_days.ConnectedDays;
import com.applikeysolutions.cosmocalendar.utils.SelectionType;
import com.applikeysolutions.cosmocalendar.view.CalendarView;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DateBookingActivity extends AppCompatActivity implements View.OnClickListener {

    CalendarView calendarView;
    String startDate, endDate;
    ImageButton imClose, imSetDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_booking);

        //INIT VIEW
        calendarView = findViewById(R.id.calendar_view);
        imClose = findViewById(R.id.im_close);
        imSetDate = findViewById(R.id.im_set_date);

        //Set First day of the week
        calendarView.setFirstDayOfWeek(Calendar.SUNDAY);

        //Set Orientation 0 = Horizontal | 1 = Vertical
        calendarView.setCalendarOrientation(0);

        calendarView.setWeekendDays(new HashSet(){{
            add(Calendar.SUNDAY);
        }});

        //Range SelectionType
        calendarView.setSelectionType(SelectionType.RANGE);

        //Set days you want to connect
        Calendar calendar = Calendar.getInstance();
        Set<Long> days = new TreeSet<>();
        days.add(calendar.getTimeInMillis());

        //Define colors
        int textColor = Color.parseColor("#E6B31E");
        int selectedTextColor = Color.parseColor("#FFFFFF");
        int disabledTextColor = Color.parseColor("#707070");
        ConnectedDays connectedDays = new ConnectedDays(days, textColor, selectedTextColor, disabledTextColor);

        //Connect days to calendar
        calendarView.addConnectedDays(connectedDays);
        calendarView.setConnectedDayIconPosition(ConnectedDayIconPosition.BOTTOM);

        imSetDate.setOnClickListener(this);
        imClose.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_close:
                finish();
                break;
            case R.id.im_set_date:
//                if (calendarView.getSelectionManager() instanceof RangeSelectionManager){
//                    RangeSelectionManager rangeSelectionManager = (RangeSelectionManager) calendarView.getSelectionManager();
//                    if (rangeSelectionManager.getDays() != null){
//                        startDate = rangeSelectionManager.getDays().first.toString();
//                        endDate = rangeSelectionManager.getDays().second.toString();
//                    } else {
//                        Toast.makeText(DateBookingActivity.this, "Invalid Selection", Toast.LENGTH_SHORT).show();
//                    }
//                }
                break;
        }
    }
}