package dangelo.justin.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Timestamp;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnSendClick(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);

        EditText etMessage = (EditText) findViewById(R.id.etMessage);
        String message = etMessage.getText().toString();

        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);

        Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show();

        Intent intent1 = new Intent(this, MyIntentService.class);
        startService(intent1);
    }
}
