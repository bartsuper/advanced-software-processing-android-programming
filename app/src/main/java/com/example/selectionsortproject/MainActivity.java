package com.example.selectionsortproject;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText arrayInput = findViewById(R.id.editTextText);
        Button submitButton = findViewById(R.id.button);
        TextView resultView = findViewById(R.id.textView);

        arrayInput.setHint("Enter integer array");
        resultView.setText("Input an array of integers\ne.g. 1 5 2 3 (separated with spaces)\nIt will then output the step by step process of an insertion sort algorithm\n\nPlease note that your input characters have to be integers between [0 - 9],\nand your input array has to be of length [3 - 8]\nEnter quit to quit application.");

        SortingAlgorithm insertionSort = new SortingAlgorithm();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = arrayInput.getText().toString();
                String result = insertionSort.insertionSort(inputText);
                arrayInput.setText("");
                arrayInput.onEditorAction(EditorInfo.IME_ACTION_DONE);
                resultView.setText(result);
            }
        });
    }

    public void quit(){
        finishAffinity();
    }
}