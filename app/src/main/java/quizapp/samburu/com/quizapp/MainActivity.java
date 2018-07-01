package quizapp.samburu.com.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int questionOne = 0;
    int questionTwo = 0;
    int questionThree = 0;
    int questionFour = 0;
    int questionFive = 0;
    int questionSix = 0;
    int questionSeven = 0;
    int questionEight = 0;
    int questionNine = 0;
    int questionTen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton() {
        int result = questionOne + questionTwo + questionThree + questionFour + questionFive + questionSix + questionSeven + questionEight + questionNine + questionTen;
        Toast displayResultToast = Toast.makeText(this, "Your score is: " + result + "out of 10", Toast.LENGTH_LONG);
        displayResultToast.show();
    }

    public void questionOneAnswer(View view) {
        LinearLayout background = findViewById(R.id.questionOneLinearLayout);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.questionOneAnswerOneRadioButton:
                if (checked)
                    // Set background color to red
                    background.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.questionOneAnswerTwoRadioButton:
                if (checked)
                    // Set background color to green
                    background.setBackgroundColor(Color.parseColor("#00ff00"));
                questionOne = 1;
                break;
            case R.id.questionOneAnswerThreeRadioButton:
                if (checked)
                    // Set background color to red
                    background.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.questionOneAnswerFourRadioButton:
                if (checked)
                    // Set background color to red
                    background.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
        }

    }

    public void questionTwoAnswer() {
    }

    public void questionThreeAnswer() {
    }

    public void questionFourAnswer() {
    }

    public void questionFiveAnswer() {
    }

    public void questionSixAnswer() {
    }

    public void questionSevenAnswer() {
    }

    public void questionEightAnswer() {
    }

    public void questionNineAnswer() {
    }

    public void questionTenAnswer() {
    }


}
