package com.dhruva.shopping;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView friedRice, kottu, noodles, soup;
    private ImageView nasi, salad, pazta, seaFood;
    private ImageView pizza, chicken, dessert, juice;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        friedRice = (ImageView) findViewById(R.id.f_rice);
        kottu = (ImageView) findViewById(R.id.koththu_r);
        noodles = (ImageView) findViewById(R.id.noodles_i);
        soup = (ImageView) findViewById(R.id.soup_i);

        nasi = (ImageView) findViewById(R.id.nasi_i);
        salad = (ImageView) findViewById(R.id.salad_i);
        pazta = (ImageView) findViewById(R.id.pazta_i);
        seaFood = (ImageView) findViewById(R.id.sea_food);

        pizza = (ImageView) findViewById(R.id.pizza_i);
        chicken = (ImageView) findViewById(R.id.chicken_i);
        dessert = (ImageView) findViewById(R.id.dessert_i);
        juice = (ImageView) findViewById(R.id.juice_i);


        friedRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fried Rice");
                startActivity(intent);
            }
        });
        kottu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kottu");
                startActivity(intent);
            }
        });


        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Noodles");
                startActivity(intent);
            }
        });


        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Soup");
                startActivity(intent);
            }
        });


        nasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Nasi");
                startActivity(intent);
            }
        });


        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Salad");
                startActivity(intent);
            }
        });



        pazta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pazta");
                startActivity(intent);
            }
        });


        seaFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sea food");
                startActivity(intent);
            }
        });



        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pizza");
                startActivity(intent);
            }
        });


        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Chicken items");
                startActivity(intent);
            }
        });


        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dessert items");
                startActivity(intent);
            }
        });


        juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Juice items");
                startActivity(intent);
            }
        });
    }
}
