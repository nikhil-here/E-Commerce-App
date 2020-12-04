package com.application.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;

import android.app.ActionBar;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductsAdapter.productSelectInterface {

    private RecyclerView rvCategories,rvProducts;
    private List<CategoryModal> categoryModalList = new ArrayList<>();
    private List<ProductModal> productModalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        hideActionStatusBar();
        initViews();
        getData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        //initiazling products category
        rvCategories.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        rvCategories.hasFixedSize();
        rvCategories.setAdapter(new CategoryAdapter(categoryModalList));
        //initializing products
        rvProducts.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        rvProducts.hasFixedSize();
        rvProducts.setAdapter(new ProductsAdapter(productModalList,this));
    }

    private void getData() {
        //get category list
        categoryModalList.add(new CategoryModal(1,"Most Popular"));
        categoryModalList.add(new CategoryModal(1,"All Body"));
        categoryModalList.add(new CategoryModal(1,"Skin Care"));
        categoryModalList.add(new CategoryModal(1,"On Sale"));
    }

    private void initViews() {
        rvCategories = findViewById(R.id.activity_main_rv_product_category);
        rvProducts = findViewById(R.id.activity_main_rv_products);
    }

    private void hideActionStatusBar() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    @Override
    public void onItemClick(View  view) {
        Intent productDetailsIntent = new Intent(this,ProductDetailsActivity.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View,String>(view,"image");
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this,pairs);
        startActivity(productDetailsIntent,activityOptions.toBundle());
    }
}