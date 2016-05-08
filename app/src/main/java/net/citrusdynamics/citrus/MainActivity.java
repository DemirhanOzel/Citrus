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
        signup.setOnClickListener(viewhandler1);


    }

    View.OnClickListener viewhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.activity_signup);
            Intent signup_intent = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(signup_intent);
        }
    };
}
