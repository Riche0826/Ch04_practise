package flag.com.tw.ch04_ezcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    TextView txv;
    Button addBtn, subtractBtn, endBtn;
    int counter = 1, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        addBtn = (Button) findViewById(R.id.addBtn);
        subtractBtn = (Button) findViewById(R.id.subtractBtn);
        endBtn = (Button) findViewById(R.id.endBtn);

        //監聽addBtn, subtractBtn, endBtn有無click動作
        addBtn.setOnClickListener(this);
        subtractBtn.setOnClickListener(this);
        endBtn.setOnClickListener(this);

        //監聽addBtn, txv有無長按動作
        addBtn.setOnLongClickListener(this);
        txv.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.addBtn){
            counter++;

            txv.setText(String.valueOf(counter));
        }else if(v.getId() == R.id.subtractBtn){
            counter--;

            txv.setText(String.valueOf(counter));
        }else if(v.getId() == R.id.endBtn) finish();//finish 結束程式

    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.txv){
            counter = 0;
            txv.setText("0");
        }else{
            counter += 2;
            txv.setText(String.valueOf(counter));
        }

        return true;
    }
}
