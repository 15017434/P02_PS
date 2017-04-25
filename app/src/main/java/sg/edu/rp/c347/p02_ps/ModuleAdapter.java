package sg.edu.rp.c347.p02_ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017434 on 25/4/2017.
 */

public class ModuleAdapter extends ArrayAdapter<Module> {
    private ArrayList<Module> module;
    private Context context;
    private TextView tvModules;
    private ImageView ivProg;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        //Store the food that is passed to this adapter
        module = objects;
        //Store Context object as we would need to use it later
        this.context = context;
    }

    //getView() is the method ListView will call to get the View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //The usual way to get the LayoutInflater object to "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //"Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        //Get the TextView object
        tvModules = (TextView) rowView.findViewById(R.id.tvModules);
        //Get the ImageView object
        ivProg = (ImageView) rowView.findViewById(R.id.ivProg);

        //The parameter "position" is the index of the row ListView is requesting
        //We get back the food at the same index
        Module currentModule = module.get(position);
        //Set the textview to show the food

        tvModules.setText(currentModule.getCode());
        //Set the image to star or nostar accordingly
        if(currentModule.isProg()){
            ivProg.setImageResource(R.drawable.newyear);
        }
        else{
            ivProg.setImageResource(R.drawable.labourday);
        }
        //Return the nicely done up View to the ListView
        return rowView;
    }

}