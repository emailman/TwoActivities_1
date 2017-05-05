package dangelo.justin.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static dangelo.justin.twoactivities.MainActivity.MESSAGE_KEY;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Intent i = getIntent();

        String messageSent = i.getStringExtra(MESSAGE_KEY);

        TextView tvMessageReceived = (TextView) findViewById(R.id.tvMessageReceived);
        tvMessageReceived.setText(messageSent);
    }

    public void onBtnReturnClick(View view) {
        Toast.makeText(this, "Returning to Main Activity", Toast.LENGTH_SHORT).show();

        // Return to the Main Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}