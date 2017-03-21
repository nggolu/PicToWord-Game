package com.example.goku.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;
    EditText name_of_word;
    Button submit1, restart;
    int level=1;
    TextView show;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit1 = (Button) findViewById(R.id.submit);
        restart = (Button) findViewById(R.id.reset);
        name_of_word = (EditText) findViewById(R.id.input);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        show = (TextView) findViewById(R.id.level);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // check();
               // String word = name_of_word.toString();

                String name = name_of_word.getText().toString();
                if (level ==1)
                {
                    name = name.toLowerCase();
                    System.out.println("hello oo : " +level+ " "+name );

                    if(name.equals("sandwich"))
                    {
                       // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a2_hot);
                        image2.setImageResource(R.drawable.b2_dog);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext()," sandwich is right ...",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==2)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("hotdog"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a3_ear);
                        image2.setImageResource(R.drawable.b3_ring);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"hotdog is right ...",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==3)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("earring"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a4_rain);
                        image2.setImageResource(R.drawable.b4_bow);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"earring is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==4)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("rainbow"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a5_sea);
                        image2.setImageResource(R.drawable.b5_saw);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"rainbow is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==5)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("seasaw"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a7_mill);
                        image2.setImageResource(R.drawable.b7_lion);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"seasaw is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==6)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("million"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a8_pea);
                        image2.setImageResource(R.drawable.b8_pole);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"million is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==7)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("people"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.a9_knight);
                        image2.setImageResource(R.drawable.b9_mare);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"people is right ....",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }
                else if (level ==8)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("nightmare"))
                    {
                        // System.out.println("hello oo : "+level);
                        level++;
                        image1.setImageResource(R.drawable.b6_pen);
                        image2.setImageResource(R.drawable.a6_knee);
                        name_of_word.setText("");
                        show.setText("Level "+level);
                        Toast.makeText(getApplicationContext(),"nightmare is right ....",Toast.LENGTH_LONG).show();


                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space...",Toast.LENGTH_LONG).show();
                    }
                }else if (level ==9)
                {
                    System.out.println("hello oo : " +level+ " "+name );
                    name = name.toLowerCase();
                    if(name.equals("penny"))
                    {
                        // System.out.println("hello oo : "+level);
                       // level++;
                        Toast.makeText(getApplicationContext(),"Level is complete",Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(MainActivity.this,Home.class);

                        startActivity(intent1);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Think correct word \n" +
                                " Be ware of blank space... ",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // level =1;
                name_of_word.setText("");
            }
        });
    }


}
