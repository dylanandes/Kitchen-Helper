package edu.susqu.csci.android.andes.example.kitchenhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class Steps extends AppCompatActivity {


    //Creates some variables, essentially so we can send them back to the MainActivity
    private static final String LOG_TAG = Steps.class.getSimpleName();
    EditText titleInput;
    EditText descriptionInput;
    public static final String EXTRA_TITLE =
            "edu.susqu.csci.android.andes.example.kitchenhelper.TITLE";
    public static final String EXTRA_DESCRIPTION =
            "edu.susqu.csci.android.andes.example.kitchenhelper.DESCRIPTION";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        Intent intent = getIntent();
        titleInput = findViewById(R.id.titleInput);
        descriptionInput = findViewById(R.id.descriptionInput);

    }

    //This sends the input from the user to MainActivity using intent.
    public void addNewStep(View view) {
            String title = titleInput.getText().toString();
            String description = descriptionInput.getText().toString();
            Intent stepIntent = new Intent();
            stepIntent.putExtra(EXTRA_TITLE, title);
            stepIntent.putExtra(EXTRA_DESCRIPTION, description);
            setResult(RESULT_OK, stepIntent);
            finish();

    }
}