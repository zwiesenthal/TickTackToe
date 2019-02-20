package com.tick.zwies.ticktacktoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView tl;
    TextView tm;
    TextView tr;
    TextView ml;
    TextView mm;
    TextView mr;
    TextView bl;
    TextView bm;
    TextView br;

    TextView win;
    Button rest;

    int turns = 0;
    //TextView[] myArray;// = {tl,tm,tr,ml,mm,mr,bl,bm,br};
    //TextView[] myArray = {tl,tm,tr,ml,mm,mr,bl,bm,br};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tl = (TextView)findViewById(R.id.tl);
        tm = (TextView)findViewById(R.id.tm);
        tr = (TextView)findViewById(R.id.tr);
        ml = (TextView)findViewById(R.id.ml);
        mm = (TextView)findViewById(R.id.mm);
        mr = (TextView)findViewById(R.id.mr);
        bl = (TextView)findViewById(R.id.bl);
        bm = (TextView)findViewById(R.id.bm);
        br = (TextView)findViewById(R.id.br);
        win = (TextView)findViewById(R.id.win);
        rest = (Button)findViewById(R.id.restart);
        //TextView[] myArray = {tl,tm,tr,ml,mm,mr,bl,bm,br};



    }

    int checkWin(){
        TextView[] myArray = {tl,tm,tr,ml,mm,mr,bl,bm,br};




        if(tl.getText()=="X" && tm.getText() == "X" && tr.getText() == "X" || ml.getText() == "X" && mm.getText() == "X" && mr.getText() == "X" || bl.getText() == "X" && bm.getText() == "X" && br.getText() == "X"||
                tl.getText() == "X" && ml.getText() == "X" && bl.getText() == "X" || tm.getText() == "X" && mm.getText() == "X" && bm.getText() == "X" ||tr.getText() == "X" && mr.getText() == "X" && br.getText() == "X"
                || tr.getText() == "X" && mm.getText() == "X" && bl.getText() == "X" || br.getText() == "X" && mm.getText() == "X" && tl.getText() == "X"){
            win.setVisibility(View.VISIBLE);
            win.setText("The First Player Has Won!");
            rest.setVisibility(View.VISIBLE);
            return 1;
        }
        else if(tl.getText()=="O" && tm.getText() == "O" && tr.getText() == "O" || ml.getText() == "O" && mm.getText() == "O" && mr.getText() == "O" || bl.getText() == "O" && bm.getText() == "O" && br.getText() == "O"||
                tl.getText() == "O" && ml.getText() == "O" && bl.getText() == "O" || tm.getText() == "O" && mm.getText() == "O" && bm.getText() == "O" ||tr.getText() == "O" && mr.getText() == "O" && br.getText() == "O"
                || tr.getText() == "O" && mm.getText() == "O" && bl.getText() == "O" || br.getText() == "O" && mm.getText() == "O" && tl.getText() == "O"){
            win.setVisibility(View.VISIBLE);
            win.setText("The Second Player Has Won!");
            rest.setVisibility(View.VISIBLE);
            return 2;
        }

        else{
            for(int i = 0; i<myArray.length;i++){
                if(myArray[i].getText() != "X" && myArray[i].getText() != "O"){
                    turns+=1;
                    return 0;
                }
            }
            win.setVisibility(View.VISIBLE);
            win.setText("It's a tie, no winner");
            rest.setVisibility(View.VISIBLE);
            return 3;
        }


    }
    void Restarted(View v){
        TextView[] myArray = {tl,tm,tr,ml,mm,mr,bl,bm,br};
        for(int i =0;i<myArray.length;i++){
            myArray[i].setText("");
        }
        win.setVisibility(View.INVISIBLE);
        rest.setVisibility(View.INVISIBLE);
    }
    void tlClicked(View v){
        if(tl.getText()=="X" || tl.getText()=="O"){

        }
        else{
            if(turns%2 == 0){
                tl.setText("X");
                checkWin();

            }
            else{
                tl.setText("O");
                checkWin();
            }
        }
    }
    void tmClicked(View v){
        if(tm.getText()=="X" || tm.getText()=="O"){

        }
        else{
            if(turns%2 == 0){
                tm.setText("X");
                checkWin();

            }
            else{
                tm.setText("O");
                checkWin();
            }
        }
    }
    void trClicked(View v){
        if(tr.getText()=="X" || tr.getText()=="O"){

        }
        else{
            if(turns%2 == 0){
                tr.setText("X");
                checkWin();
            }
            else{
                tr.setText("O");
                checkWin();
            }
        }
    }
    void mlClicked(View v){
        if(ml.getText()=="X" || ml.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                ml.setText("X");
                checkWin();
            }
            else{
                ml.setText("O");
                checkWin();
            }
        }
    }
    void mmClicked(View v){
        if(mm.getText()=="X" || mm.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                mm.setText("X");
                checkWin();
            }
            else{
                mm.setText("O");
                checkWin();
            }
        }
    }
    void mrClicked(View v){
        if(mr.getText()=="X" || mr.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                mr.setText("X");
                checkWin();
            }
            else{
                mr.setText("O");
                checkWin();
            }
        }
    }
    void blClicked(View v){
        if(bl.getText()=="X" || bl.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                bl.setText("X");
                checkWin();
            }
            else{
                bl.setText("O");
                checkWin();
            }
        }
    }
    void bmClicked(View v){
        if(bm.getText()=="X" || bm.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                bm.setText("X");
                checkWin();
            }
            else{
                bm.setText("O");
                checkWin();
            }
        }
    }
    void brClicked(View v){
        if(br.getText()=="X" || br.getText()=="O"){
        }
        else{
            if(turns%2 == 0){
                br.setText("X");
                checkWin();
            }
            else{
                br.setText("O");
                checkWin();
            }
        }
    }






//working on replay button









}
