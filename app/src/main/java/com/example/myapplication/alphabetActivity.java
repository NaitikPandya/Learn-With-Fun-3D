package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication.alphabet.*;

public class alphabetActivity extends AppCompatActivity {
    CardView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    Intent intent ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, aobject.class);
                startActivity(intent);
            }
        });
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, bobject.class);
                startActivity(intent);
            }
        });
        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, cobject.class);
                startActivity(intent);
            }
        });
        d = findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, dobject.class);
                startActivity(intent);
            }
        });
        e = findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, eobject.class);
                startActivity(intent);
            }
        });
        f = findViewById(R.id.f);
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, fobject.class);
                startActivity(intent);
            }
        });
        g = findViewById(R.id.g);
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, gobject.class);
                startActivity(intent);
            }
        });
        h = findViewById(R.id.h);
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, hobject.class);
                startActivity(intent);
            }
        });
        i = findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, iobject.class);
                startActivity(intent);
            }
        });
        j = findViewById(R.id.j);
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, jobject.class);
                startActivity(intent);
            }
        });
        k = findViewById(R.id.k);
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, kobject.class);
                startActivity(intent);
            }
        });
        l = findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, lobject.class);
                startActivity(intent);
            }
        });
        m = findViewById(R.id.m);
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, mobject.class);
                startActivity(intent);
            }
        });
        n = findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, nobject.class);
                startActivity(intent);
            }
        });
        o = findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, oobject.class);
                startActivity(intent);
            }
        });
        p = findViewById(R.id.p);
        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, pobject.class);
                startActivity(intent);
            }
        });
        q = findViewById(R.id.q);
        q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, qobject.class);
                startActivity(intent);
            }
        });
        r = findViewById(R.id.r);
        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, robject.class);
                startActivity(intent);
            }
        });
        s = findViewById(R.id.s);
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, sobject.class);
                startActivity(intent);
            }
        });
        t = findViewById(R.id.t);
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, tobject.class);
                startActivity(intent);
            }
        });
        u = findViewById(R.id.u);
        u.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, uobject.class);
                startActivity(intent);
            }
        });
        v = findViewById(R.id.v);
        v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, vobject.class);
                startActivity(intent);
            }
        });
        w = findViewById(R.id.w);
        w.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, wobject.class);
                startActivity(intent);
            }
        });
        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, xobject.class);
                startActivity(intent);
            }
        });
        y = findViewById(R.id.y);
        y.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, yobject.class);
                startActivity(intent);
            }
        });
        z = findViewById(R.id.z);
        z.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(alphabetActivity.this, zobject.class);
                startActivity(intent);
            }
        });


    }
}
