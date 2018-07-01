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

    public void submitButton(View v) {

        LinearLayout backgroundQuestionOne = findViewById(R.id.questionOneLinearLayout);
        LinearLayout backgroundQuestionTwo = findViewById(R.id.questionTwoLinearLayout);
        LinearLayout backgroundQuestionThree = findViewById(R.id.questionThreeLinearLayout);
        LinearLayout backgroundQuestionFour = findViewById(R.id.questionFourLinearLayout);
        LinearLayout backgroundQuestionFive = findViewById(R.id.questionFiveLinearLayout);
        LinearLayout backgroundQuestionSix = findViewById(R.id.questionSixLinearLayout);
        LinearLayout backgroundQuestionSeven = findViewById(R.id.questionSevenLinearLayout);
        LinearLayout backgroundQuestionEight = findViewById(R.id.questionEightLinearLayout);
        LinearLayout backgroundQuestionNine = findViewById(R.id.questionNineLinearLayout);
        LinearLayout backgroundQuestionTen = findViewById(R.id.questionTenLinearLayout);
        count = questionOne + questionTwo + questionThree + questionFour + questionFive + questionSix + questionSeven + questionEight + questionNine + questionTen;
        int result = count;
        Toast displayResultToast = Toast.makeText(this, "Your score is: " + result + " out of 10", Toast.LENGTH_LONG);
        displayResultToast.show();
    }

    public void questionOneAnswer(View view) {


        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionOneAnswerOneRadioButton:
                if (checked)
                    questionOne = 0;
                break;
            case R.id.questionOneAnswerTwoRadioButton:
                if (checked)
                    questionOne = 1;
                break;
            case R.id.questionOneAnswerThreeRadioButton:
                if (checked)
                    questionOne = 0;
                break;
            case R.id.questionOneAnswerFourRadioButton:
                if (checked)
                    questionOne = 0;
                break;
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
    }

    public void questionSevenAnswer(View view) {
    }

    public void questionEightAnswer(View view) {
    }

    public void questionNineAnswer(View view) {
        //Create a new EditText variable, find and store the xml value into it
        EditText questionNineAnswer = findViewById(R.id.questionNineAnswerEditText);
        //Convert the typed answer from the EditText box in a new String variable
        String typedAnswer = questionNineAnswer.getText().toString().toLowerCase();
        //Create a string variable to store the correct answer
        String correctAnswer = "multiple input multiple output";


        if (typedAnswer.equalsIgnoreCase(correctAnswer)) {
            questionNine = 1;
        } else
            questionNine = 0;
    }

    public void questionTenAnswer() {
    }


}
