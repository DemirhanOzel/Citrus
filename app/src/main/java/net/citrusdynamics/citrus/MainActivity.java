package net.citrusdynamics.citrus;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signin = (Button) findViewById(R.id.signin);
        Button signup = (Button) findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent signin_intent = new Intent(MainActivity.this, SigninActivity.class);
                startActivity(signin_intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup_intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(signup_intent);

            }
        });

    }
}