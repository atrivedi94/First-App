/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 *
 */
package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int numberOfCofees = 0;

    /** This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = "Total: $" + numberOfCofees*5;
        if(numberOfCofees == 0)
        {
            priceMessage = priceMessage + "\nFree!";
        }
        else
        {
            priceMessage = priceMessage + "\nThank You!";
        }
        displayMessage(priceMessage);
    }

    /** This method increases the quantity
     */
    public void increment(View view) {
        numberOfCofees = numberOfCofees + 1;
        display(numberOfCofees);
    }

    /** This method decreases the quantity
     */
    public void decrement(View view) {
        numberOfCofees = numberOfCofees - 1;
        if(numberOfCofees > -1) {
            display(numberOfCofees);
        }
        else {
            numberOfCofees = 0;
        }
    }

    /**This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**This method displays the string on the screen
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}