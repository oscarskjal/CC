package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;

    double[] values = { 3.5,4.4,9.0,1.2,6.5,12.0 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        double version = 3.14159;
        int year = 2024;
        String author = "Oscar";

        outputText.setText(String.format(
                "Appens version %.1f år %d by %s"
                , version
                , year
                , author));

        outputText.setText("Appen funkar");
    }



    public void calculate(View view) {

        double[] values = { 3.5,4.4,9.0,1.2,6.5,12.0 };

        double sum = 0;

        for (int i = 0; i <values.length; i++) {

            sum += values[i];


            double mean = sum / values.length;

            outputText.setText(String.format("medelvärde %.2f" , Statistics.calcmean(values)));


        }

    }
        public void buttonHandler(View view) {
                outputText.setText(inputText.getText().toString());


        }

    }
