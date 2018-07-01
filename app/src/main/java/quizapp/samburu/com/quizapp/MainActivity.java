package quizapp.samburu.com.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Question One and its answers pulled from resources and stored in string variables
    String questionOne = getResources().getString(R.string.question_1);
    String questionOneAnswerOne = getResources().getString(R.string.question_1_answer_1);
    String questionOneAnswerTwo = getResources().getString(R.string.question_1_answer_2_correct);
    String questionAnswerThree = getResources().getString(R.string.question_1_answer_3);
    String questionOneAnswerFour = getResources().getString(R.string.question_1_answer_4);

    //Question Two and its answers pulled from resources and stored in string variables
    String questionTwo = getResources().getString(R.string.question_2);
    String questionTwoAnswerOne = getResources().getString(R.string.question_2_answer_1);
    String questionTwoAnswerTwo = getResources().getString(R.string.question_2_answer_2);
    String questionTwoAnswerrThree = getResources().getString(R.string.question_2_answer_3_correct);
    String questionTwoAnswerFour = getResources().getString(R.string.question_2_answer_4);

    //Question Three and its answers pulled from resources and stored in string variables
    String questionThree = getResources().getString(R.string.question_3);
    String questionThreeAnswerOne = getResources().getString(R.string.question_3_answer_1);
    String questionThreeAnswerTwo = getResources().getString(R.string.question_3_answer_2);
    String questionThreeAnswerThree = getResources().getString(R.string.question_3_answer_3_correct);
    String questionThreeAnswerFour = getResources().getString(R.string.question_3_answer_4);
    String questionThreeAnswerFive = getResources().getString(R.string.question_3_answer_5_correct);

    //Question Four and its answers pulled from resources and stored in string variables
    String questionFour = getResources().getString(R.string.question_4);
    String questionFourAnswerOne = getResources().getString(R.string.question_4_answer_1);
    String questionFourAnswerTwo = getResources().getString(R.string.question_4_answer_2);
    String questionFourAnswerThree = getResources().getString(R.string.question_4_answer_3);
    String questionFourAnswerFour = getResources().getString(R.string.question_4_answer_4_correct);

    //Question Five and its answers pulled from resources and stored in string variables
    String questionFive = getResources().getString(R.string.question_5);
    String questionFiveAnswerOne = getResources().getString(R.string.question_5_answer_1_correct);
    String questionFiveAnswerTwo = getResources().getString(R.string.question_5_answer_2);
    String questionFiveAnswerThree = getResources().getString(R.string.question_5_answer_3);
    String questionFiveAnswerFour = getResources().getString(R.string.question_5_answer_4_correct);
    String questionFiveAnswerFive = getResources().getString(R.string.question_5_answer_5);
    String questionFiveAnswerSix = getResources().getString(R.string.question_5_answer_6_correct);

    //Question Six and its answers pulled from resources and stored in string variables
    String questionSix = getResources().getString(R.string.question_6);
    String questionSixAnswerOne = getResources().getString(R.string.question_6_answer_1);
    String questionSixAnswerTwo = getResources().getString(R.string.question_6_answer_2);
    String questionSixAnswerThree = getResources().getString(R.string.question_6_answer_3);
    String questionSixAnswerFour = getResources().getString(R.string.question_6_answer_4_correct);
    String questionSixAnswerFive = getResources().getString(R.string.question_6_answer_5);

    //Question Seven and its answers pulled from resources and stored in string variables
    String questionSevenInstructions = getResources().getString(R.string.question_7_instructions);
    String questionSevenA = getResources().getString(R.string.question_7_a);
    String questionSevenB = getResources().getString(R.string.question_7_b);
    String questionSevenAns = getResources().getString(R.string.question_7_answer_correct);

    //Question Eight and its answers pulled from resources and stored in string variables
    String questionEight = getResources().getString(R.string.question_8);
    String questionEightAnswerOne = getResources().getString(R.string.question_8_answer_1);
    String questionEightAnswerTwo = getResources().getString(R.string.question_8_answer_2_correct);
    String questionEightAnswerThree = getResources().getString(R.string.question_8_answer_3);
    String questionEightAnswerFour = getResources().getString(R.string.question_8_answer_4);

    //Question Nine and its answers pulled from resources and stored in string variables
    String questionNine = getResources().getString(R.string.question_9);
    String questionNineAnswer = getResources().getString(R.string.question_9_answer);

    //Question Ten and its answers pulled from resources and stored in string variables
    String questionTen = getResources().getString(R.string.question_10);
    String questionTenAnswerOne = getResources().getString(R.string.question_10_answer_1);
    String questionTenAnswerTwo = getResources().getString(R.string.question_10_answer_2);
    String questionTenAnswerThree = getResources().getString(R.string.question_10_answer_3);
    String questionTenAnswerFour = getResources().getString(R.string.question_10_answer_4_correct);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
