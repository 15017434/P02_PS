package sg.edu.rp.c347.p02_ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ModuleAdapter aa;
    ArrayList<Module> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvYear = (TextView) findViewById(R.id.tvYear);
        lv = (ListView) findViewById(R.id.lvModules);

        module = new ArrayList<Module>();
        module.add(new Module("New Year's Day\n1 Jan 2017", true));
        module.add(new Module("Labour Day\n1 May 2017", false));

        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Module selectedModule = new Module(module.get(position).getCode(),true);
                //al.get(position);

                Toast.makeText(SecondActivity.this, selectedModule.getCode() , Toast.LENGTH_SHORT).show();
            }
        });



    }



}

