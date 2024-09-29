package com.example.inputtable;

import static com.example.inputtable.R.id.dateInput4;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText dateInput2, dateInput3, dateInput4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dateInput2 = findViewById(R.id.dateInput2);
        dateInput3 = findViewById(R.id.dateInput3);
        dateInput4 = findViewById(R.id.dateInput4);


        setDateInputListener(dateInput2);
        setDateInputListener(dateInput3);
        setDateInputListener(dateInput4);
    }

    private void setDateInputListener(final EditText dateInput) {
        dateInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                                dateInput.setText(selectedDate);
                            }
                        }, year, month, day);

                datePickerDialog.show();
            }
        });
    }
}
