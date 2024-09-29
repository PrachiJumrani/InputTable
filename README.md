<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp"
        android:background="@android:color/white">

        <TableLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:stretchColumns="1"
            android:layout_marginTop="16dp"
            android:background="@android:color/white">


            <TableRow>
                <TextView
                    android:id="@+id/Desription"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="Description"
                    android:textStyle="bold"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <TextView
                    android:id="@+id/DateInput"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="Date"
                    android:textStyle="bold"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <TextView
                    android:id="@+id/amountInput"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="Amount"
                    android:textStyle="bold"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />
            </TableRow>


            <TableRow>
                <EditText
                    android:id="@+id/descriptionInput2"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Description"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <EditText
                    android:id="@+id/dateInput2"
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:background="@drawable/cell_border"
                    android:clickable="true"
                    android:focusable="false"
                    android:hint="Select Date"
                    android:minHeight="48dp"
                    android:padding="8dp" />

                <EditText
                    android:id="@+id/amountInput2"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Amount"
                    android:inputType="numberDecimal"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />
            </TableRow>
            <TableRow>
                <EditText
                    android:id="@+id/descriptionInput3"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Description"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <EditText
                    android:id="@+id/dateInput3"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Select Date"
                    android:clickable="true"
                    android:focusable="false"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <EditText
                    android:id="@+id/amountInput3"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Amount"
                    android:inputType="numberDecimal"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />
            </TableRow>
            <TableRow>
                <EditText
                    android:id="@+id/descriptionInput4"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Description"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <EditText
                    android:id="@+id/dateInput4"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Select Date"
                    android:clickable="true"
                    android:focusable="false"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />

                <EditText
                    android:id="@+id/amountInput4"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:minHeight="48dp"
                    android:hint="Enter Amount"
                    android:inputType="numberDecimal"
                    android:padding="8dp"
                    android:background="@drawable/cell_border" />
            </TableRow>

        </TableLayout>
    </LinearLayout>
</ScrollView>
