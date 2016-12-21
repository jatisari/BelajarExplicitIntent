package net.agusharyanto.belajarexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String value1 = extras.getString("tanya");

        if (value1 != null ) {
            EditText text1 = (EditText) findViewById(R.id.editTextdr1);
            text1.setText(value1);
        }
        Button btnOpen = (Button) findViewById(R.id.btnClose);
        btnOpen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish(); //close activity
            }
        });
    }

    @Override
    public void finish() {
        Intent data = new Intent();
        EditText text2 = (EditText) findViewById(R.id.editText2);
        String dataactivity_2 = text2.getText().toString();
        data.putExtra("jawaban", dataactivity_2);
        setResult(RESULT_OK, data);
        super.finish();
    }
}
