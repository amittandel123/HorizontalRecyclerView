package tandel.amit.horizontalrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/*
 * Created by Amit Tandel on 4/5/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.GroceryViewHolder> {
    private List<Grocery> groceryList;
    Context context;

    // constructor
    public RecyclerViewAdapter(List<Grocery> groceries, Context context) {
        this.groceryList = groceries;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflate the layout
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.GroceryViewHolder holder, final int position) {
        holder.imageView.setImageResource(groceryList.get(position).getProductImage());
        holder.textView.setText(groceryList.get(position).getProductName());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ProductName = groceryList.get(position).getProductName();
                Toast.makeText(context, "Selected: " + ProductName, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public GroceryViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.idProductImage);
            textView = itemView.findViewById(R.id.idProductName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), textView.getText()+" selected", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}