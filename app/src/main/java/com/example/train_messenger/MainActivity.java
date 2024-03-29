package com.example.train_messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Вызвать OnSendMessage() при шелке на кнопке
    public void onSendMessage(View view){
        EditText messageVies = (EditText)findViewById(R.id.message);
        String messageText = messageVies.getText().toString();

       /* Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);*/

       Intent intent = new Intent(Intent.ACTION_SEND);
       intent.setType("text/plain");
       intent.putExtra(Intent.EXTRA_TEXT, messageText);
       String chooserTitle = getString(R.string.chooser);
       Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
       startActivity(chosenIntent);
    }
}
