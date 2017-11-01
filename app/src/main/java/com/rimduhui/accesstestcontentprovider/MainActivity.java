package com.rimduhui.accesstestcontentprovider;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.neo1125.numberkeyview.NumberKeyButton;
import com.neo1125.numberkeyview.NumberKeyOnClickListener;
import com.neo1125.numberkeyview.NumberKeyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = (TextView) findViewById(R.id.result);

        Cursor cursor = getContentResolver().query(TestContract.BASE_PATH_URI, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
            result.setText(String.valueOf(cursor.getInt(cursor.getColumnIndex(TestContract.COLUMN_INT))));
        }
    }
}
