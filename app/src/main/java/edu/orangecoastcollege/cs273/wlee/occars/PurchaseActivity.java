package edu.orangecoastcollege.cs273.wlee.occars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class PurchaseActivity extends AppCompatActivity {

    private EditText carPriceEditText;
    private EditText downPaymentEditText;
    private RadioButton threeYearsRadioButton;
    private RadioButton fourYearsRadioButton;
    private RadioButton fiveYearsRadioButton;

    private Car currentCar;

    private String monthlyPaymentTerm;
    private String loanSummaryTerm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        carPriceEditText = (EditText)findViewById(R.id.carPriceEditText);
        downPaymentEditText = (EditText)findViewById(R.id.downPaymentEditText);

        currentCar = new Car();
    }

    // When associating the button with an event, set the onClick property
    // Define the method as public void (with one parameter View view)
    public void activateLoanReport(View view)
    {
        double price, downPayment;

    }
}
