package com.zerokaraapp.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからリストビューのオブジェクトを取得
        ListView lvPlanet = findViewById(R.id.lvPlanet);
        //リストビューオブジェクトにリスナのインスタンスを設定
        lvPlanet.setOnItemClickListener(new ListClickListener());
    }

    //リストのリスナクラスの定義
    private class ListClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view,int position,long id){

            //タップされた惑星名を取得
            String PlanetEnglish = (String) parent.getItemAtPosition(position);
            //出力する文字の変数の定義
            String outputString = "";

            //惑星名で条件分岐、出力する文字列の作成
            switch(position){
                case 0:
                    outputString = PlanetEnglish +"は"+getString(R.string.mercury)+"です";
                    break;
                case 1:
                    outputString = PlanetEnglish +"は"+getString(R.string.venus)+"です";
                    break;
                case 2:
                    outputString = PlanetEnglish +"は"+getString(R.string.earth)+"です";
                    break;
                case 3:
                    outputString = PlanetEnglish +"は"+getString(R.string.mars)+"です";
                    break;
                case 4:
                    outputString = PlanetEnglish +"は"+getString(R.string.jupiter)+"です";
                    break;
                case 5:
                    outputString = PlanetEnglish +"は"+getString(R.string.saturn)+"です";
                    break;
                case 6:
                    outputString = PlanetEnglish +"は"+getString(R.string.uranus)+"です";
                    break;
                case 7:
                    outputString = PlanetEnglish +"は"+getString(R.string.neptune)+"です";
                    break;
                default :
                    break;
            }

            // 出力欄のオブジェクトを取得
            TextView textView = findViewById(R.id.textView);
            //出力欄に文字を設定
            textView.setText(outputString);

        }
    }

}