package growlingstromach.example.com;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class GrowlingStromach extends ActionBarActivity {

    public void startATF(View view){
        Intent intent = new Intent(this,ATF.class);
        startActivity(intent);
    }

    public void startEspanya(View view){
        Intent intent = new Intent(this,Espanya.class);
        startActivity(intent);
    }

    public void startLacson(View view){
        Intent intent = new Intent(this,Lacson.class);
        startActivity(intent);
    }

    public void startDapitan(View view){
        Intent intent = new Intent(this,Dapitan.class);
        startActivity(intent);
    }

    public void startPnoval(View view){
        Intent intent = new Intent(this,Pnoval.class);
        startActivity(intent);
    }

    public void startCarpark(View view){
        Intent intent = new Intent(this,Carpark.class);
        startActivity(intent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growling_stromach);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.growling_stromach, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
