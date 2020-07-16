package tandel.amit.horizontalrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Grocery> groceryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        // add divider after each item
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.HORIZONTAL));
        groceryAdapter = new RecyclerViewAdapter(groceryList,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(groceryAdapter);
        PopulateGroceryList();
    }

    private void PopulateGroceryList(){
        Grocery potato = new Grocery("Potato",R.drawable.potato);
        Grocery onion = new Grocery("Onion",R.drawable.onion);
        Grocery broccoli = new Grocery("Broccoli",R.drawable.broccoli);
        Grocery carrot = new Grocery("Carrot",R.drawable.carrot);
        Grocery cauliflower = new Grocery("Cauliflower",R.drawable.cauliflower);
        Grocery spinach = new Grocery("Spinach",R.drawable.spinach);
        Grocery beetroot = new Grocery("BeetRoot",R.drawable.beetroot);
        groceryList.add(potato);
        groceryList.add(onion);
        groceryList.add(broccoli);
        groceryList.add(carrot);
        groceryList.add(cauliflower);
        groceryList.add(spinach);
        groceryList.add(beetroot);

        groceryAdapter.notifyDataSetChanged();

    }
}
