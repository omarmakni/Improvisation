package com.k2m.improvisation;

/**
 * Created by omarm on 09/04/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.cooltechworks.views.ScratchImageView;


public class Jazz extends Activity
{
    Button button;
    RadioButton kitkat, lollipop, marshmallow;
    RadioGroup radioGroup;
    ScratchImageView scratchImageView;

   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jazz);

       button = (Button) findViewById(R.id.button);
       scratchImageView = (ScratchImageView) findViewById(R.id.scratchView1);

       scratchImageView.setRevealListener(new ScratchImageView.IRevealListener() {
           @Override
           public void onRevealed(ScratchImageView scratchImageView) {

               //Don't Write Any Code Here
           }
       });

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


           }
       });

    }
}
