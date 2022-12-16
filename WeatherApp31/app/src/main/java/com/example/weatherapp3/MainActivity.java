package com.example.weatherapp3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.preference.PreferenceManager;

        import com.example.weatherapp3.db.City;
        import com.example.weatherapp3.util.CityTest;
        import com.example.weatherapp3.util.Constant;

        import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LitePal.getDatabase();
        getSupportActionBar().hide();
        Context ctx=this;
        //CityTest.getProvince();
        //  CityTest.getCity(28);
       // CityTest.getCounty(28,270);

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);

    }
}