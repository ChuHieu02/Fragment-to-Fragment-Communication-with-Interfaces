package hieu.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements FragmanetA.FragmentAListener,FragmnetB.FragmentBListener {
    private FragmanetA fragmentA;
    private FragmnetB fragmentB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentA = new FragmanetA();
        fragmentB = new FragmnetB();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, fragmentA)
                .replace(R.id.container2, fragmentB)
                .commit();


    }

    @Override
    public void onInputASent(CharSequence input) {
        fragmentB.updateEditText(input);
    }

    @Override
    public void onInputBSent(CharSequence input) {
        fragmentA.updateEditText(input);

    }
}
