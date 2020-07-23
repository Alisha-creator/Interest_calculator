package alisha.digipodium.interest_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText principal,rate,time;
    TextView interest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principal = (EditText)findViewById(R.id.principal);
        rate = (EditText)findViewById(R.id.rate);
        time = (EditText)findViewById(R.id.time);
        interest = (TextView)findViewById(R.id.interest);
    }

    public void siCalc(View view) {
        double fp,fr,ft,si;
        fp = Double.parseDouble(principal.getText().toString());
        fr = Double.parseDouble(rate.getText().toString());
        ft = Double.parseDouble(time.getText().toString());
        si = fp*fr*ft/100;
        interest.setText(" Simple Interest is = "+si);
    }

    public void ciCalc(View view) {
        double fp,fr,ft,ci;
        fp = Double.parseDouble(principal.getText().toString());
        fr = Double.parseDouble(rate.getText().toString());
        ft = Double.parseDouble(time.getText().toString());
        ci = fp* Math.pow((1+fr/100),ft)-fp;
        interest.setText("Compound Interest is = "+ci);
    }
}