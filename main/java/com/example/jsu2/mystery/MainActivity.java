package com.example.jsu2.mystery;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> outputs = new ArrayList<>(22);
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        outputs.add("you get knocked out");
        outputs.add("you go somewhere else");
        outputs.add("you find a dead man");
        outputs.add("you find a dead woman");
        outputs.add("you meet a buxom blonde");
        outputs.add("someone has searched the place");
        outputs.add("a crooked cop warns you");
        outputs.add("you are arrested");
        outputs.add("you find a gun");
        outputs.add("you find a knife");
        outputs.add("you find a frayed rope");
        outputs.add("a bullet whizzes past your ear!");
        outputs.add("you are almost run over");
        outputs.add("you are being followed");
        outputs.add("you smell familiar perfume");
        outputs.add("the telephone rings");
        outputs.add("there is a knock at the door");
        outputs.add("you hear footsteps behind you");
        outputs.add("you hear a gunshot!");
        outputs.add("you hear a scream!");
        outputs.add("you are not alone...");
        outputs.add("... forget this story, it stinks!");

        TextView t = (TextView) findViewById(R.id.outputView);

        int index = random.nextInt(outputs.size());
        t.setText(outputs.get(index));

        outputs.remove(index);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void getHelpButtonClicked(View v){

        TextView t = (TextView) findViewById(R.id.outputView);

        int index = random.nextInt(outputs.size());
        t.setText(outputs.get(index));

        outputs.remove(index);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
