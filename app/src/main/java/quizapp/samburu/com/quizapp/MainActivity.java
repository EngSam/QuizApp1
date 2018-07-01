package quizapp.samburu.com.quizapp;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    int questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix, questionSeven, questionEight, questionNine, questionTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view) {
        questionSevenAnswer();
        questionNineAnswer();
        count = questionOne + questionTwo + questionThree + questionFour + questionFive + questionSix + questionSeven + questionEight + questionNine + questionTen;
        int result = count;
        Toast displayResultToast = Toast.makeText(this, "Your score is: " + result + " out of 10", Toast.LENGTH_LONG);
        displayResultToast.show();
        if (questionOne == 1) {
            LinearLayout questionOneLayout = findViewById(R.id.questionOneLinearLayout);
            questionOneLayout.setBackgroundColor(0x00ff000);
        } else if (questionOne == 0) {
            LinearLayout questionOneLayout = findViewById(R.id.questionOneLinearLayout);
            questionOneLayout.setBackgroundColor(0xff00000);
        }
        if (questionTwo == 1) {
            LinearLayout questionTwoLayout = findViewById(R.id.questionTwoLinearLayout);
            questionTwoLayout.setBackgroundColor(0x00ff000);
        } else if (questionTwo == 0) {
            LinearLayout questionTwoLayout = findViewById(R.id.questionTwoLinearLayout);
            questionTwoLayout.setBackgroundColor(0xff00000);
        }
        if (questionThree == 1) {
            LinearLayout questionThreeLayout = findViewById(R.id.questionThreeLinearLayout);
            questionThreeLayout.setBackgroundColor(0x00ff000);
        } else if (questionThree == 0) {
            LinearLayout questionThreeLayout = findViewById(R.id.questionThreeLinearLayout);
            questionThreeLayout.setBackgroundColor(0xff00000);
        }
        if (questionFour == 1) {
            LinearLayout questionFourLayout = findViewById(R.id.questionFourLinearLayout);
            questionFourLayout.setBackgroundColor(0x00ff000);
        } else if (questionFour == 0) {
            LinearLayout questionFourLayout = findViewById(R.id.questionFourLinearLayout);
            questionFourLayout.setBackgroundColor(0xff00000);
        }
        if (questionFive == 1) {
            LinearLayout questionFiveLayout = findViewById(R.id.questionFiveLinearLayout);
            questionFiveLayout.setBackgroundColor(0x00ff000);
        } else if (questionFive == 0) {
            LinearLayout questionFiveLayout = findViewById(R.id.questionFiveLinearLayout);
            questionFiveLayout.setBackgroundColor(0xff00000);
        }
        if (questionSix == 1) {
            LinearLayout questionSixLayout = findViewById(R.id.questionSixLinearLayout);
            questionSixLayout.setBackgroundColor(0x00ff000);
        } else if (questionSix == 0) {
            LinearLayout questionSixLayout = findViewById(R.id.questionSixLinearLayout);
            questionSixLayout.setBackgroundColor(0xff00000);
        }
        if (questionSeven == 1) {
            LinearLayout questionSevenLayout = findViewById(R.id.questionSevenLinearLayout);
            questionSevenLayout.setBackgroundColor(0x00ff000);
        } else if (questionSeven == 0) {
            LinearLayout questionSevenLayout = findViewById(R.id.questionSevenLinearLayout);
            questionSevenLayout.setBackgroundColor(0xff00000);
        }
        if (questionEight == 1) {
            LinearLayout questionEightLayout = findViewById(R.id.questionEightLinearLayout);
            questionEightLayout.setBackgroundColor(0x00ff0000);
        } else if (questionEight == 0) {
            LinearLayout questionEightLayout = findViewById(R.id.questionEightLinearLayout);
            questionEightLayout.setBackgroundColor(0xff00000);
        }
        if (questionNine == 1) {
            LinearLayout questionNineLayout = findViewById(R.id.questionNineLinearLayout);
            questionNineLayout.setBackgroundColor(0x00ff0000);
        } else if (questionNine == 0) {
            LinearLayout questionNineLayout = findViewById(R.id.questionNineLinearLayout);
            questionNineLayout.setBackgroundColor(0xff00000);
        }
        if (questionTen == 1) {
            LinearLayout questionTenLayout = findViewById(R.id.questionTenLinearLayout);
            questionTenLayout.setBackgroundColor(0x00ff000);
        } else if (questionTen == 0) {
            LinearLayout questionTenLayout = findViewById(R.id.questionTenLinearLayout);
            questionTenLayout.setBackgroundColor(0xff00000);
        }
    }

    public void questionOneAnswer(View view) {


        RadioButton questionOneRadioButtonOne = findViewById(R.id.questionOneAnswerOneRadioButton);
        RadioButton questionOneRadioButtonTwo = findViewById(R.id.questionOneAnswerTwoRadioButton);
        RadioButton questionOneRadioButtonThree = findViewById(R.id.questionOneAnswerThreeRadioButton);
        RadioButton questionOneRadioButtonFour = findViewById(R.id.questionOneAnswerFourRadioButton);

        if (questionOneRadioButtonTwo.isChecked()) {
            questionOne = 1;
        } else if (questionOneRadioButtonOne.isChecked() || questionOneRadioButtonThree.isChecked() || questionOneRadioButtonFour.isChecked()) {
            questionOne = 0;
        }


    }

    public void questionTwoAnswer(View view) {
        RadioButton questionTwoRadioButtonOne = findViewById(R.id.questionTwoAnswerOneRadioButton);
        RadioButton questionTwoRadioButtoTwo = findViewById(R.id.questionTwoAnswerTwoRadioButton);
        RadioButton questionTwoRadioButtonThree = findViewById(R.id.questionTwoAnswerThreeRadioButton);
        RadioButton questionTwoRadioButtonFour = findViewById(R.id.questionTwoAnswerFourRadioButton);

        if (questionTwoRadioButtonThree.isChecked()) {
            questionTwo = 1;
        } else if (questionTwoRadioButtonOne.isChecked() || questionTwoRadioButtoTwo.isChecked() || questionTwoRadioButtonFour.isChecked()) {
            questionTwo = 0;
        }
    }

    public void questionThreeAnswer(View view) {
        CheckBox questionThreeCheckBoxOne = findViewById(R.id.questionThreeAnswerOneCheckBox);
        CheckBox questionThreeCheckBoxTwo = findViewById(R.id.questionThreeAnswerTwoCheckBox);
        CheckBox questionThreeCheckBoxThree = findViewById(R.id.questionThreeAnswerThreeCheckBox);
        CheckBox questionThreeCheckBoxFour = findViewById(R.id.questionThreeAnswerFourCheckBox);
        CheckBox questionThreeCheckBoxFive = findViewById(R.id.questionThreeAnswerFiveCheckBox);


        if (questionThreeCheckBoxThree.isChecked() && questionThreeCheckBoxFive.isChecked() && !(questionThreeCheckBoxOne.isChecked() || questionThreeCheckBoxTwo.isChecked() || questionThreeCheckBoxFour.isChecked())) {

            questionThree = 1;
        } else if (questionThreeCheckBoxOne.isChecked() || questionThreeCheckBoxTwo.isChecked() || questionThreeCheckBoxFour.isChecked()) {
            questionThree = 0;
        }

    }


    public void questionFourAnswer(View view) {
        RadioButton questionFourRadioButtonOne = findViewById(R.id.questionFourAnswerOneRadioButton);
        RadioButton questionFourRadioButtonTwo = findViewById(R.id.questionFourAnswerTwoRadioButton);
        RadioButton questionFourRadioButtonThree = findViewById(R.id.questionFourAnswerThreeRadioButton);
        RadioButton questionFourRadioButtonFour = findViewById(R.id.questionFourAnswerFourRadioButton);

        if (questionFourRadioButtonFour.isChecked()) {
            questionFour = 1;
        } else if (questionFourRadioButtonOne.isChecked() || questionFourRadioButtonTwo.isChecked() || questionFourRadioButtonThree.isChecked()) {
            questionFour = 0;
        }
    }

    public void questionFiveAnswer(View view) {
        CheckBox questionFiveCheckBoxOne = findViewById(R.id.questionFiveAnswerOneCheckBox);
        CheckBox questionFiveCheckBoxTwo = findViewById(R.id.questionFiveAnswerTwoCheckBox);
        CheckBox questionFiveCheckBoxThree = findViewById(R.id.questionFiveAnswerThreeCheckBox);
        CheckBox questionFiveCheckBoxFour = findViewById(R.id.questionFiveAnswerFourCheckBox);
        CheckBox questionFiveCheckBoxFive = findViewById(R.id.questionFiveAnswerFiveCheckBox);
        CheckBox questionFiveCheckBoxSix = findViewById(R.id.questionFiveAnswerSixCheckBox);
        // Only options 1,4 & 6 are valid. The rest are not.
        if (questionFiveCheckBoxOne.isChecked() && questionFiveCheckBoxFour.isChecked() && questionFiveCheckBoxSix.isChecked() && !(questionFiveCheckBoxTwo.isChecked() || questionFiveCheckBoxThree.isChecked() || questionFiveCheckBoxFive.isChecked())) {
            questionFive = 1;
        } else if (questionFiveCheckBoxTwo.isChecked() || questionFiveCheckBoxThree.isChecked() || questionFiveCheckBoxFive.isChecked()) {
            questionFive = 0;
        }
    }

    public void questionSixAnswer(View view) {
        RadioButton questionSixRadioButtonOne = findViewById(R.id.questionSixAnswerOneRadioButton);
        RadioButton questionSixRadioButtonTwo = findViewById(R.id.questionSixAnswerTwoRadioButton);
        RadioButton questionSixRadioButtonThree = findViewById(R.id.questionSixAnswerThreeRadioButton);
        RadioButton questionSixRadioButtonFour = findViewById(R.id.questionSixAnswerFourRadioButton);
        RadioButton questionSixRadioButtonFive = findViewById(R.id.questionSixAnswerFiveRadioButton);

        if (questionSixRadioButtonFour.isChecked()) {
            questionSix = 1;
        } else if (questionSixRadioButtonOne.isChecked() || questionSixRadioButtonTwo.isChecked() || questionSixRadioButtonThree.isChecked() || questionSixRadioButtonFive.isChecked()) {
            questionSix = 0;
        }
    }

    public void questionSevenAnswer() {
        //Create a new EditText variable, find and store the xml value into it
        EditText questionSevenAnswer = findViewById(R.id.questionSevenAnswerEditText);
        //Convert the typed answer from the EditText box in a new String variable
        String typedAnswer = questionSevenAnswer.getText().toString().toLowerCase();
        //Create a string variable to store the correct answer
        String correctAnswer = "tethering";

        if (typedAnswer.contains(correctAnswer)) {
            questionSeven = 1;
        } else
            questionSeven = 0;

    }

    public void questionEightAnswer(View view) {
        RadioButton questionEightRadioButtonOne = findViewById(R.id.questionEightAnswerOneRadioButton);
        RadioButton questionEightRadioButtonTwo = findViewById(R.id.questionEightAnswerTwoRadioButton);
        RadioButton questionEightRadioButtonThree = findViewById(R.id.questionEightAnswerThreeRadioButton);
        RadioButton questionEightRadioButtonFour = findViewById(R.id.questionEightAnswerFourRadioButton);


        if (questionEightRadioButtonTwo.isChecked()) {
            questionEight = 1;
        } else if (questionEightRadioButtonOne.isChecked() || questionEightRadioButtonThree.isChecked() || questionEightRadioButtonFour.isChecked()) {
            questionEight = 0;
        }
    }

    public void questionNineAnswer() {
        //Create a new EditText variable, find and store the xml value into it
        EditText questionNineAnswer = findViewById(R.id.questionNineAnswerEditText);
        //Convert the typed answer from the EditText box in a new String variable
        String typedAnswer = questionNineAnswer.getText().toString().toLowerCase();
        //Create a string variable to store the correct answer
        String correctAnswer = "multiple input multiple output";


        if (typedAnswer.contains(correctAnswer)) {
            questionNine = 1;
        } else
            questionNine = 0;
    }

    public void questionTenAnswer(View view) {
        RadioButton questionTenRadioButtonOne = findViewById(R.id.questionTenAnswerOneRadioButton);
        RadioButton questionTenRadioButtonTwo = findViewById(R.id.questionTenAnswerTwoRadioButton);
        RadioButton questionTenRadioButtonThree = findViewById(R.id.questionTenAnswerThreeRadioButton);
        RadioButton questionTenRadioButtonFour = findViewById(R.id.questionTenAnswerFourRadioButton);


        if (questionTenRadioButtonFour.isChecked()) {
            questionTen = 1;
        } else if (questionTenRadioButtonOne.isChecked() || questionTenRadioButtonTwo.isChecked() || questionTenRadioButtonThree.isChecked()) {
            questionTen = 0;
        }
    }


}
