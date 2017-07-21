package org.lunainc.chatbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.lunainc.chatbar.ViewChatBar;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ViewChatBar viewChatBar;
    private String text;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewChatBar = (ViewChatBar) findViewById(R.id.chatbar);
        txt = (TextView) findViewById(R.id.textView);


        viewChatBar.setMessageBoxHint("Escribe aquí");

        viewChatBar.setSendClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = viewChatBar.getMessageText();
                txt.setText(text);
                viewChatBar.setClearMessage(true);
            }
        });


    }
}
