package com.example.assignment2;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    String selectedAnswer;
    String correctAnswer;
    ImageView imageView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageVFlag);
        button1 = itemView.findViewById(R.id.button1);
        button2 = itemView.findViewById(R.id.button2);
        button3 = itemView.findViewById(R.id.button3);
        button4 = itemView.findViewById(R.id.button4);

        button1.setBackgroundColor(Color.GRAY);
        button2.setBackgroundColor(Color.GRAY);
        button3.setBackgroundColor(Color.GRAY);
        button4.setBackgroundColor(Color.GRAY);

        // Set click listeners for the buttons
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                selectedAnswer = button1.getText().toString();
                if (selectedAnswer.equals(correctAnswer)) {
                    // Set background color for button1 to blue and others to gray
                    setButtonColors(button1,button2,button3,button4, Color.BLUE, Color.GRAY, Color.GRAY, Color.GRAY);
                } else {
                    // Set background color for all buttons to red
                    setButtonColors(button1,button2,button3,button4, Color.RED, Color.RED, Color.RED, Color.RED);
                }
                break;
            case R.id.button2:
                selectedAnswer = button2.getText().toString();
                if (selectedAnswer.equals(correctAnswer)) {
                    // Set background color for button2 to blue and others to gray
                    setButtonColors(button1,button2,button3,button4, Color.GRAY, Color.BLUE, Color.GRAY, Color.GRAY);
                } else {
                    // Set background color for all buttons to red
                    setButtonColors(button1,button2,button3,button4, Color.RED, Color.RED, Color.RED, Color.RED);
                }
                break;
            case R.id.button3:
                selectedAnswer = button3.getText().toString();
                if (selectedAnswer.equals(correctAnswer)) {
                    // Set background color for button3 to blue and others to gray
                    setButtonColors(button1,button2,button3,button4, Color.GRAY, Color.GRAY, Color.BLUE, Color.GRAY);
                } else {
                    // Set background color for all buttons to red
                    setButtonColors(button1,button2,button3,button4, Color.RED, Color.RED, Color.RED, Color.RED);
                }
                break;
            case R.id.button4:
                selectedAnswer = button4.getText().toString();
                if (selectedAnswer.equals(correctAnswer)) {
                    // Set background color for button4 to blue and others to gray
                    setButtonColors(button1,button2,button3,button4, Color.GRAY, Color.GRAY, Color.GRAY, Color.BLUE);
                } else {
                    // Set background color for all buttons to red
                    setButtonColors(button1,button2,button3,button4, Color.RED, Color.RED, Color.RED, Color.RED);
                }
                break;
        }
    }
    private void setButtonColors(Button button1,Button button2,Button button3,Button button4, int color1, int color2, int color3, int color4) {

        button1.setBackgroundColor(color1);
        button2.setBackgroundColor(color2);
        button3.setBackgroundColor(color3);
        button4.setBackgroundColor(color4);
    }
}