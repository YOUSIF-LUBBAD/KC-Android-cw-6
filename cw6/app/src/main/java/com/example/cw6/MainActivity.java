package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Fridge> Fridgearray = new ArrayList<Fridge>();
    int currentProduct = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Company = findViewById(R.id.fridgeManufacturer);
        TextView Name = findViewById(R.id.fridgeName);
        ImageView picture = findViewById(R.id.imageView);
        TextView Feature = findViewById(R.id.FridgeFeatures);

        TextView height = findViewById(R.id.fridgeHeight);


        Button button = findViewById(R.id.button);




        Fridge Samsung = new Fridge ("Samsung Refrigerator Top Mounted Freezer 720L 25 Cft Silver", 178.5, R.drawable.fridge_1__1_, "top tier cooling and it has a freezer", "samsung");
        Fridge LG = new Fridge("Super-Capacity 3 Door French Door Refrigerator", 1.78435, R.drawable.fridge2__1_, "dispenses ice and water. Plus, has child lock!", "LG");
        Fridge HM = new Fridge ("Harry Maguire", 1.94, R.drawable.harry___1_, "Annoys MU fans. The most expensive fridge out there being worth 80m", "Manchester United");

Fridgearray.add(Samsung);
Fridgearray.add(LG);
Fridgearray.add(HM);

        Company.setText(Fridgearray.get(currentProduct).getCompany());
        Name.setText(Fridgearray.get(currentProduct).getName());
        picture.setImageResource(Fridgearray.get(currentProduct).getImage());
        Feature.setText(Fridgearray.get(currentProduct).getFeatures());
        height.setText(String.valueOf(Fridgearray.get(currentProduct).getHeight()));


button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {



        currentProduct ++ ;

            if (currentProduct == Fridgearray.size()) {

                currentProduct = 0 ;

            }




            Company.setText(Fridgearray.get(currentProduct).getCompany());
        Name.setText(Fridgearray.get(currentProduct).getName());
        picture.setImageResource(Fridgearray.get(currentProduct).getImage());
        Feature.setText(Fridgearray.get(currentProduct).getFeatures());
        height.setText(String.valueOf(Fridgearray.get(currentProduct).getHeight()));


    }
});








    }
}