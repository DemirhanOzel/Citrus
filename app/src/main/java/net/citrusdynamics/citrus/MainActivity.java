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

        signin.setOnClickListener(onclicklistener);
        signup.setOnClickListener(onclicklistener);

    }

    private View.OnClickListener onclicklistener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch (v.getId()) {
                case R.id.signin:

                    Intent signin_intent = new Intent(MainActivity.this, SigninActivity.class);
                    startActivity(signin_intent);
                    break;
                case R.id.signup:

                    Intent signup_intent = new Intent(MainActivity.this, SignupActivity.class);
                    startActivity(signup_intent);

                    break;

            }
        }
    };
}



