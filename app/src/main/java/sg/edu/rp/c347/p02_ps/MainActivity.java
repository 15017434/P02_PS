package sg.edu.rp.c347.p02_ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aaYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lvYear);

        al = new ArrayList<String>();
        al.add("Secular");

        aaYear = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al);

        lv.setAdapter(aaYear);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = al.get(position);

                Intent intent = new Intent(getBaseContext(), SecondActivity.class);

                intent.putExtra("year", selectedYear);

                startActivity(intent);
            }
        });



    }


}
