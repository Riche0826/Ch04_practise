package flag.com.tw.ch04_ezcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txv;
    Button addBtn;
    int counter = 1, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        counter += counter;

        txv.setText(String.valueOf(counter));
        addBtn.setText("加" + counter);
    }
}
