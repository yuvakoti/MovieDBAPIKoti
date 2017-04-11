package dbapi.koti.moviedbapi.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import dbapi.koti.moviedbapi.R;

public class MovieDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        TextView t1=(TextView)findViewById(R.id.title);
        TextView t2=(TextView)findViewById(R.id.originalTitle);
        TextView t3=(TextView)findViewById(R.id.releaseDate);
        TextView t4=(TextView)findViewById(R.id.popularity);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
          String title =  b.getString("t1");
        String originaltitle =  b.getString("t2");
        String release =  b.getString("t3");
        String pop =  b.getString("t4");
            t1.setText(title);
        t2.setText(originaltitle);
         t3.setText(release);
        t4.setText(pop);
    }
}
