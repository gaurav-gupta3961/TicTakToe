package com.example.tictaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i01,i02,i03,i04,i05,i06,i07,i08,i09;
    TextView t1,t2;
    Button b1;
    int t=0;
    ArrayList r,y,a,b,c,d,e,f;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new ArrayList();
        y = new ArrayList();
        a= new ArrayList();
        b= new ArrayList();
        c= new ArrayList();
        d= new ArrayList();
        e= new ArrayList();
        f= new ArrayList();


        i1 = (ImageView)findViewById(R.id.imageView1);
         i2 = (ImageView)findViewById(R.id.imageView2);
         i3 = (ImageView)findViewById(R.id.imageView3);
         i4 = (ImageView)findViewById(R.id.imageView4);
         i5 = (ImageView)findViewById(R.id.imageView5);
         i6 = (ImageView)findViewById(R.id.imageView6);
         i7 = (ImageView)findViewById(R.id.imageView7);
         i8 = (ImageView)findViewById(R.id.imageView8);
         i9 = (ImageView)findViewById(R.id.imageView9);
         i01 = (ImageView)findViewById(R.id.imageView01);
         i02= (ImageView)findViewById(R.id.imageView02);
         i03 = (ImageView)findViewById(R.id.imageView03);
         i04= (ImageView)findViewById(R.id.imageView04);
         i05= (ImageView)findViewById(R.id.imageView05);
         i06= (ImageView)findViewById(R.id.imageView06);
         i07= (ImageView)findViewById(R.id.imageView07);
         i08= (ImageView)findViewById(R.id.imageView08);
         i09= (ImageView)findViewById(R.id.imageView09);
         t1= (TextView)findViewById(R.id.textView);
         t2 = (TextView)findViewById(R.id.textView2);
         b1 =(Button)findViewById(R.id.button);
         a.add(1);
        a.add(2);
        a.add(3);
        b.add(7);
        b.add(8);
        b.add(9);
        c.add(1);
        c.add(4);
        c.add(7);
        d.add(3);
        d.add(6);
        d.add(9);
        e.add(1);
        e.add(5);
        e.add(9);
        f.add(3);
        f.add(5);
        f.add(7);

        final Intent i = new Intent(MainActivity.this,MainActivity.class);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);

            }
        });




          i1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                     if(t==0)
                     {
                         i01.animate().alpha(1);
                         y.add(1);
                         Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                             t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);

                      t = 1;
                     }
                     else
                     {
                         i1.animate().alpha(1);
                         r.add(1);
                         Collections.sort(r);
                         if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                             t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                         t=0;
                     }

              }
          });


            i2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(t==0)
                    {
                        i02.animate().alpha(1);
                        y.add(2);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    {
                        i2.animate().alpha(1);
                        r.add(2);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }
                }
            });

            i3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i03.animate().alpha(1);
                        y.add(3);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    {
                        i3.animate().alpha(1);
                        r.add(3);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }

                }
            });


            i4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i04.animate().alpha(1);
                        y.add(4);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);

                        t = 1;
                    }
                    else
                    {
                        i4.animate().alpha(1);
                        r.add(4);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }



                }
            });


            i5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i05.animate().alpha(1);
                        y.add(5);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    {
                        i5.animate().alpha(1);
                        r.add(5);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }

                }
            });



            i6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i06.animate().alpha(1);
                        y.add(6);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    {
                        i6.animate().alpha(1);
                        r.add(6);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }

                }
            });


            i7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i07.animate().alpha(1);
                        y.add(7);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    { i7.animate().alpha(1);
                        r.add(7);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }


                }
            });



            i8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(t==0)
                    {
                        i08.animate().alpha(1);
                        y.add(8);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    }
                    else
                    {
                        i8.animate().alpha(1);
                        r.add(8);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t=0;
                    }

                }
            });



            i9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (t == 0) {
                        i09.animate().alpha(1);
                        y.add(9);
                        Collections.sort(y);
                        if(y.containsAll(a)||y.containsAll(b)||y.containsAll(c)||y.containsAll(d)||y.containsAll(e)||y.containsAll(f))
                            t1.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 1;
                    } else {
                        i9.animate().alpha(1);
                        r.add(9);
                        Collections.sort(r);
                        if(r.containsAll(a)||r.containsAll(b)||r.containsAll(c)||r.containsAll(d)||r.containsAll(e)||r.containsAll(f))
                            t2.animate().scaleX(1f).scaleY(1f).setDuration(2000);
                        t = 0;
                    }
                }
            });



/*
   if(t==0) {
       i01.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                   i01.animate().alpha(1);
                   t = 1;

           }
       });
   }

       if(t==0) {
            i02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i02.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i03.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i04.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i04.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i05.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i05.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i06.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i06.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i07.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i08.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i08.animate().alpha(1);
                    t = 1;

                }
            });
        }
        if(t==0) {
            i09.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i09.animate().alpha(1);
                    t = 1;

                }
            });
        }

*/






    }


}
