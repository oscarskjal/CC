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

    double[] testdata = { 200535, 346112, 554667, 232454, 598733, 287444, 312390, 412545, 434506, 80121, 89010};
 ArrayList<Double> values = New ArrayList<>();

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



            outputText.setText(String.format("medelvärde %.2f?\n median: %.2f" ,
                    Statistics.calcmean(values),
                    Statistics.calcmedian(values)
                    ));


        }

    }
        public void buttonHandler(View view) {
                outputText.setText(inputText.getText().toString());


        }

    }
