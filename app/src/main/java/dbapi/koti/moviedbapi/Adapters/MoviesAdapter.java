package dbapi.koti.moviedbapi.Adapters;

/**
 * Created by Koti on 11-04-2017.
 */
        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.List;

        import dbapi.koti.moviedbapi.ModelView.MovieResult;
        import dbapi.koti.moviedbapi.R;
        import dbapi.koti.moviedbapi.View.MovieDetails;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private Context context;
    private List<MovieResult> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);

        }
    }


    public MoviesAdapter(List<MovieResult> moviesList,Context context) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MovieResult movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieDetails.class);
                intent.putExtra("t1",movie.getTitle().toString());
                intent.putExtra("t2",movie.getOriginalTitle().toString());
                intent.putExtra("t3",movie.getReleaseDate().toString());
                intent.putExtra("t4",movie.getPopularity().toString());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
