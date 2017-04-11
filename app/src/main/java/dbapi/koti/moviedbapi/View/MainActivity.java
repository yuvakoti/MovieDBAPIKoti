package dbapi.koti.moviedbapi.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import dbapi.koti.moviedbapi.Model.ResultSearchActivity;
import dbapi.koti.moviedbapi.R;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.daginge.tmdbsearch.MESSAGE";
    public static final String EXTRA_QUERY = "com.daginge.tmdbsearch.QUERY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void queryTMDB(View view) {
        Intent intent = new Intent(this, ResultSearchActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String query = editText.getText().toString();
        intent.putExtra(EXTRA_QUERY, query);
        startActivity(intent);
    }
}
