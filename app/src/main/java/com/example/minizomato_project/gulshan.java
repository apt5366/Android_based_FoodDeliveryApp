package com.example.minizomato_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class gulshan extends AppCompatActivity {
    CheckBox dal, butterchicken, zeeraaloo, channa, mixveg,achaaripaneer, handipaneer, tawachaap;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulshan);


        dal=findViewById(R.id.dal);
        butterchicken= findViewById(R.id.butterchicken);
        zeeraaloo=findViewById(R.id.zeeraaloo);
        channa= findViewById(R.id.channamasala);
        mixveg= findViewById(R.id.mixveg);
        achaaripaneer= findViewById(R.id.achaaripaneer);
        handipaneer=findViewById(R.id.handipaneer);
        tawachaap= findViewById(R.id.tawachaap);


        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int total=0;
                StringBuffer sb= new StringBuffer();

                if(dal.isChecked())
                {
                    sb.append("Dal's price is Rs.40\n");
                    total += 40;
                }


                if(butterchicken.isChecked())
                {
                    sb.append("Butter Chicken's price is Rs.50\n");
                    total += 50;
                }


                if(zeeraaloo.isChecked())
                {
                    sb.append("zeeraaloo's price is Rs.60\n");
                    total += 60;
                }


                if(channa.isChecked())
                {
                    sb.append("Channa Masala's's price is Rs.45\n");
                    total += 45;
                }
                if(handipaneer.isChecked())
                {
                    sb.append("handipaneer's price is Rs.50\n");
                    total += 60;
                }

                if(achaaripaneer.isChecked())
                {
                    sb.append("achaaripaneer's price is Rs.55\n");
                    total += 55;
                }


                if(tawachaap.isChecked())
                {
                    sb.append("tawachaap's price is Rs.45\n");
                    total += 45;
                }



                if(mixveg.isChecked())
                {
                    sb.append("mixveg's price is Rs.50\n");
                    total += 45;
                }






                sb.append("\n\n"+"Net Amount: "+total);

                String data=sb.toString();
                Intent intent=new Intent(gulshan.this, Bill.class );
                intent.putExtra("message", data);
                startActivity(intent);




            }
        });

    }
}
