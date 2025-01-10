package digi.coders.bijliwalaayauser.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import de.hdodenhof.circleimageview.CircleImageView;
import digi.coders.bijliwalaayauser.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    CircleImageView userPic1;
    TextView txt_Welcome, txt_Location;
    CardView serach_card, btn_Card;
    Button btn_service, btn_shopping, btn_resell;
    ImageView search_icon, mic_icon;
    EditText edit_Search;
    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userPic1 = findViewById(R.id.userPic1);
        txt_Welcome = findViewById(R.id.txt_Welcome);
        txt_Location = findViewById(R.id.txt_Location);
        serach_card = findViewById(R.id.serach_card);
        btn_Card = findViewById(R.id.btn_Card);
        btn_service = findViewById(R.id.btn_service);
        btn_shopping = findViewById(R.id.btn_shopping);
        btn_resell = findViewById(R.id.btn_resell);
        search_icon = findViewById(R.id.search_icon);
        mic_icon = findViewById(R.id.mic_icon);
        edit_Search = findViewById(R.id.edit_Search);
        fragmentContainerView = findViewById(R.id.fragContainView);





    }


// Load Fragment...
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragContainView, fragment)
                .commit();
    }
}