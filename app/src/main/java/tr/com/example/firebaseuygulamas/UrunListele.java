package tr.com.example.firebaseuygulamas;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tr.com.example.firebaseuygulamas.databinding.ActivityUrunListeleBinding;

public class UrunListele extends AppCompatActivity {
    ActivityUrunListeleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUrunListeleBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

    }
}