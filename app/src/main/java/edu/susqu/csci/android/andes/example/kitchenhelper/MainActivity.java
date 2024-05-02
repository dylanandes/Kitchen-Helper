package edu.susqu.csci.android.andes.example.kitchenhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int STEP_REQUEST = 1;
    //The number of steps currently in the program
    public int stepNumber = 1;
    //Stores the steps and descriptions
    String step[][] = new String[10][2];
    public static final String EXTRA_STEP =
            "edu.susqu.csci.android.andes.example.kitchenhelper.STEP";
    //Initializes all of the Views we created (there are a lot...)
    TextView stepOneTitle;
    TextView stepOneDescription;
    Button deleteButtonOne;
    CheckBox checkBoxOne;
    TextView stepTwoTitle;
    TextView stepTwoDescription;
    Button deleteButtonTwo;
    CheckBox checkBoxTwo;
    TextView stepThreeTitle;
    TextView stepThreeDescription;
    Button deleteButtonThree;
    CheckBox checkBoxThree;
    TextView stepFourTitle;
    TextView stepFourDescription;
    Button deleteButtonFour;
    CheckBox checkBoxFour;
    TextView stepFiveTitle;
    TextView stepFiveDescription;
    Button deleteButtonFive;
    CheckBox checkBoxFive;
    TextView stepSixTitle;
    TextView stepSixDescription;
    Button deleteButtonSix;
    CheckBox checkBoxSix;
    TextView stepSevenTitle;
    TextView stepSevenDescription;
    Button deleteButtonSeven;
    CheckBox checkBoxSeven;
    TextView stepEightTitle;
    TextView stepEightDescription;
    Button deleteButtonEight;
    CheckBox checkBoxEight;
    TextView stepNineTitle;
    TextView stepNineDescription;
    Button deleteButtonNine;
    CheckBox checkBoxNine;
    TextView stepTenTitle;
    TextView stepTenDescription;
    Button deleteButtonTen;
    CheckBox checkBoxTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView stepOneTitle = findViewById(R.id.stepTitle1);
        TextView stepOneDescription = findViewById(R.id.stepDescription1);
    }

    //utilized after the user submits a step from the second activity
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == STEP_REQUEST) {
                if (resultCode == RESULT_OK) {
                    String title = data.getStringExtra(Steps.EXTRA_TITLE);
                    String description = data.getStringExtra(Steps.EXTRA_DESCRIPTION);
                    addStep(title, description);
                }
            }
    }


    //Based on the step number, the visibility and properties of the next step are updated.
    //The stepNumber is then incremented

    public void addStep(String title, String description) {
        if (stepNumber==1) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepOneTitle = findViewById(R.id.stepTitle1);
            TextView stepOneDescription = findViewById(R.id.stepDescription1);
            Button deleteButtonOne = findViewById(R.id.deleteButton1);
            CheckBox checkBoxOne = findViewById(R.id.checkBox1);
            stepOneTitle.setText(title);
            stepOneDescription.setText(description);
            deleteButtonOne.setVisibility(View.VISIBLE);
            checkBoxOne.setVisibility(View.VISIBLE);
        }
        if (stepNumber==2) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepTwoTitle = findViewById(R.id.stepTitle2);
            TextView stepTwoDescription = findViewById(R.id.stepDescription2);
            Button deleteButtonTwo = findViewById(R.id.deleteButton2);
            CheckBox checkBoxTwo = findViewById(R.id.checkBox2);
            stepTwoTitle.setText(title);
            stepTwoDescription.setText(description);
            deleteButtonTwo.setVisibility(View.VISIBLE);
            checkBoxTwo.setVisibility(View.VISIBLE);
        }
        if (stepNumber==3) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepThreeTitle = findViewById(R.id.stepTitle3);
            TextView stepThreeDescription = findViewById(R.id.stepDescription3);
            Button deleteButtonThree = findViewById(R.id.deleteButton3);
            CheckBox checkBoxThree = findViewById(R.id.checkBox3);
            stepThreeTitle.setText(title);
            stepThreeDescription.setText(description);
            deleteButtonThree.setVisibility(View.VISIBLE);
            checkBoxThree.setVisibility(View.VISIBLE);
        }
        if (stepNumber==4) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepFourTitle = findViewById(R.id.stepTitle4);
            TextView stepFourDescription = findViewById(R.id.stepDescription4);
            Button deleteButtonFour = findViewById(R.id.deleteButton4);
            CheckBox checkBoxFour = findViewById(R.id.checkBox4);
            stepFourTitle.setText(title);
            stepFourDescription.setText(description);
            deleteButtonFour.setVisibility(View.VISIBLE);
            checkBoxFour.setVisibility(View.VISIBLE);
        }
        if (stepNumber==5) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepFiveTitle = findViewById(R.id.stepTitle5);
            TextView stepFiveDescription = findViewById(R.id.stepDescription5);
            Button deleteButtonFive = findViewById(R.id.deleteButton5);
            CheckBox checkBoxFive = findViewById(R.id.checkBox5);
            stepFiveTitle.setText(title);
            stepFiveTitle.setVisibility(View.VISIBLE);
            stepFiveDescription.setText(description);
            stepFiveDescription.setVisibility(View.VISIBLE);
            deleteButtonFive.setVisibility(View.VISIBLE);
            checkBoxFive.setVisibility(View.VISIBLE);
        }
        if (stepNumber==6) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepSixTitle = findViewById(R.id.stepTitle6);
            TextView stepSixDescription = findViewById(R.id.stepDescription6);
            Button deleteButtonSix = findViewById(R.id.deleteButton6);
            CheckBox checkBoxSix = findViewById(R.id.checkBox6);
            stepSixTitle.setText(title);
            stepSixTitle.setVisibility(View.VISIBLE);
            stepSixDescription.setText(description);
            stepSixDescription.setVisibility(View.VISIBLE);
            deleteButtonSix.setVisibility(View.VISIBLE);
            checkBoxSix.setVisibility(View.VISIBLE);
        }
        if (stepNumber==7) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepSevenTitle = findViewById(R.id.stepTitle7);
            TextView stepSevenDescription = findViewById(R.id.stepDescription7);
            Button deleteButtonSeven = findViewById(R.id.deleteButton7);
            CheckBox checkBoxSeven = findViewById(R.id.checkBox7);
            stepSevenTitle.setText(title);
            stepSevenTitle.setVisibility(View.VISIBLE);
            stepSevenDescription.setText(description);
            stepSevenDescription.setVisibility(View.VISIBLE);
            deleteButtonSeven.setVisibility(View.VISIBLE);
            checkBoxSeven.setVisibility(View.VISIBLE);
        }
        if (stepNumber==8) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepEightTitle = findViewById(R.id.stepTitle8);
            TextView stepEightDescription = findViewById(R.id.stepDescription8);
            Button deleteButtonEight = findViewById(R.id.deleteButton8);
            CheckBox checkBoxEight = findViewById(R.id.checkBox8);
            stepEightTitle.setText(title);
            stepEightTitle.setVisibility(View.VISIBLE);
            stepEightDescription.setText(description);
            stepEightDescription.setVisibility(View.VISIBLE);
            deleteButtonEight.setVisibility(View.VISIBLE);
            checkBoxEight.setVisibility(View.VISIBLE);
        }
        if (stepNumber==9) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepNineTitle = findViewById(R.id.stepTitle9);
            TextView stepNineDescription = findViewById(R.id.stepDescription9);
            Button deleteButtonNine = findViewById(R.id.deleteButton9);
            CheckBox checkBoxNine = findViewById(R.id.checkBox9);
            stepNineTitle.setText(title);
            stepNineTitle.setVisibility(View.VISIBLE);
            stepNineDescription.setText(description);
            stepNineDescription.setVisibility(View.VISIBLE);
            deleteButtonNine.setVisibility(View.VISIBLE);
            checkBoxNine.setVisibility(View.VISIBLE);
        }
        if (stepNumber==10) {
            step[stepNumber-1][0] = title;
            step[stepNumber-1][1] = description;
            TextView stepTenTitle = findViewById(R.id.stepTitle10);
            TextView stepTenDescription = findViewById(R.id.stepDescription10);
            Button deleteButtonTen = findViewById(R.id.deleteButton10);
            CheckBox checkBoxTen = findViewById(R.id.checkBox10);
            stepTenTitle.setText(title);
            stepTenTitle.setVisibility(View.VISIBLE);
            stepTenDescription.setText(description);
            stepTenDescription.setVisibility(View.VISIBLE);
            deleteButtonTen.setVisibility(View.VISIBLE);
            checkBoxTen.setVisibility(View.VISIBLE);
        }
        stepNumber++;
    }




    public void deleteStep(int stepDel) {
        int numSteps = stepNumber;
        stepNumber = stepDel;
        for(; stepDel < numSteps; stepDel++) {
            addStep(step[stepNumber][0], step[stepNumber][1]);
        }
        numSteps--;
        if (numSteps ==1) {
            TextView stepOneTitle = findViewById(R.id.stepTitle1);
            TextView stepOneDescription = findViewById(R.id.stepDescription1);
            Button deleteButtonOne = findViewById(R.id.deleteButton1);
            CheckBox checkBoxOne = findViewById(R.id.checkBox1);
            stepOneTitle.setText("");
            stepOneDescription.setText("");
            deleteButtonOne.setVisibility(View.INVISIBLE);
            checkBoxOne.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==2) {
            TextView stepTwoTitle = findViewById(R.id.stepTitle2);
            TextView stepTwoDescription = findViewById(R.id.stepDescription2);
            Button deleteButtonTwo = findViewById(R.id.deleteButton2);
            CheckBox checkBoxTwo = findViewById(R.id.checkBox2);
            stepTwoTitle.setText("");
            stepTwoDescription.setText("");
            deleteButtonTwo.setVisibility(View.INVISIBLE);
            checkBoxTwo.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==3) {
            TextView stepThreeTitle = findViewById(R.id.stepTitle3);
            TextView stepThreeDescription = findViewById(R.id.stepDescription3);
            Button deleteButtonThree = findViewById(R.id.deleteButton3);
            CheckBox checkBoxThree = findViewById(R.id.checkBox3);
            stepThreeTitle.setText("");
            stepThreeDescription.setText("");
            deleteButtonThree.setVisibility(View.INVISIBLE);
            checkBoxThree.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==4) {
            TextView stepFourTitle = findViewById(R.id.stepTitle4);
            TextView stepFourDescription = findViewById(R.id.stepDescription4);
            Button deleteButtonFour = findViewById(R.id.deleteButton4);
            CheckBox checkBoxFour = findViewById(R.id.checkBox4);
            stepFourTitle.setText("");
            stepFourDescription.setText("");
            deleteButtonFour.setVisibility(View.INVISIBLE);
            checkBoxFour.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==5) {
            TextView stepFiveTitle = findViewById(R.id.stepTitle5);
            TextView stepFiveDescription = findViewById(R.id.stepDescription5);
            Button deleteButtonFive = findViewById(R.id.deleteButton5);
            CheckBox checkBoxFive = findViewById(R.id.checkBox5);
            stepFiveTitle.setText("");
            stepFiveDescription.setText("");
            deleteButtonFive.setVisibility(View.INVISIBLE);
            checkBoxFive.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==6) {
            TextView stepSixTitle = findViewById(R.id.stepTitle6);
            TextView stepSixDescription = findViewById(R.id.stepDescription6);
            Button deleteButtonSix = findViewById(R.id.deleteButton6);
            CheckBox checkBoxSix = findViewById(R.id.checkBox6);
            stepSixTitle.setText("");
            stepSixDescription.setText("");
            deleteButtonSix.setVisibility(View.INVISIBLE);
            checkBoxSix.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==7) {
            TextView stepSevenTitle = findViewById(R.id.stepTitle7);
            TextView stepSevenDescription = findViewById(R.id.stepDescription7);
            Button deleteButtonSeven = findViewById(R.id.deleteButton7);
            CheckBox checkBoxSeven = findViewById(R.id.checkBox7);
            stepSevenTitle.setText("");
            stepSevenDescription.setText("");
            deleteButtonSeven.setVisibility(View.INVISIBLE);
            checkBoxSeven.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==8) {
            TextView stepEightTitle = findViewById(R.id.stepTitle8);
            TextView stepEightDescription = findViewById(R.id.stepDescription8);
            Button deleteButtonEight = findViewById(R.id.deleteButton8);
            CheckBox checkBoxEight = findViewById(R.id.checkBox8);
            stepEightTitle.setText("");
            stepEightDescription.setText("");
            deleteButtonEight.setVisibility(View.INVISIBLE);
            checkBoxEight.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==9) {
            TextView stepNineTitle = findViewById(R.id.stepTitle9);
            TextView stepNineDescription = findViewById(R.id.stepDescription9);
            Button deleteButtonNine = findViewById(R.id.deleteButton9);
            CheckBox checkBoxNine = findViewById(R.id.checkBox9);
            stepNineTitle.setText("");
            stepNineDescription.setText("");
            deleteButtonNine.setVisibility(View.INVISIBLE);
            checkBoxNine.setVisibility(View.INVISIBLE);
        }
        if (numSteps ==10) {
            TextView stepTenTitle = findViewById(R.id.stepTitle10);
            TextView stepTenDescription = findViewById(R.id.stepDescription10);
            Button deleteButtonTen = findViewById(R.id.deleteButton10);
            CheckBox checkBoxTen = findViewById(R.id.checkBox10);
            stepTenTitle.setText("");
            stepTenDescription.setText("");
            deleteButtonTen.setVisibility(View.INVISIBLE);
            checkBoxTen.setVisibility(View.INVISIBLE);
        }
        if (stepNumber > 10) {stepNumber = 10;}
        stepNumber--;
    }


    //Looks for intent from the second activity
    public void goToAddStep(View view) {
        Log.d(LOG_TAG, "Add steps here!");
        Intent intent = new Intent(this, Steps.class);
        startActivityForResult(intent, STEP_REQUEST);
    }

    //A button triggers its relevant deletion method
    public void del1(View view) {
        deleteStep(1);
    }

    public void del2(View view) {
        deleteStep(2);
    }

    public void del3(View view) {
        deleteStep(3);
    }

    public void del4(View view) {
        deleteStep(4);
    }

    public void del5(View view) {
        deleteStep(5);
    }

    public void del6(View view) {
        deleteStep(6);
    }

    public void del7(View view) {
        deleteStep(7);
    }

    public void del8(View view) {
        deleteStep(8);
    }

    public void del9(View view) {
        deleteStep(9);
    }

    public void del10(View view) {
        deleteStep(10);
    }
}