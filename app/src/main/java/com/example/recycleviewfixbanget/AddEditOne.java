package com.example.recycleviewfixbanget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AddEditOne extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    List<President> presidentList;
    EditText et_presDate , et_presName, et_presImageUrl;
    TextView tv_presId;
    int id;

    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_one);

        presidentList = myApplication.getPresidentList();

        btn_ok = findViewById(R.id.btn_ok);
        btn_cancel = findViewById(R.id.btn_cancel);
        et_presDate = findViewById(R.id.et_dateElection);
        et_presName = findViewById(R.id.et_presidentName);
        et_presImageUrl = findViewById(R.id.et_pictureUrl);
        tv_presId = findViewById(R.id.tv_presidentidNumber);

        Intent intent = getIntent();
        id = intent.getIntExtra("id",-1);
        President president = null;

        if ( id > 0){
            // edit the president
            for (President p:presidentList) {
                if (p.getId() == id){
                    president = p;
                }
            }
            et_presName.setText(president.getName());
            et_presDate.setText(String.valueOf(president.getDateOfElection()));
            et_presImageUrl.setText(president.getImageUrl());
            tv_presId.setText(String.valueOf(id));
        } else {
            // create new president
        }



        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (id >- 0) {
                    // Update
                    President updatePresident = new President(id ,et_presName.getText().toString(), Integer.parseInt(et_presDate.getText().toString()),et_presImageUrl.getText().toString());
                    presidentList.set(id, updatePresident);
                }
                else {
                    // add new pres
                    // Create President Object
                    int nextId = MyApplication.getNextId();
                    President newPresident = new President(nextId,et_presName.getText().toString(), Integer.parseInt(et_presDate.getText().toString()),et_presImageUrl.getText().toString());
                    // Add The object at the global list of president
                    presidentList.add(newPresident);
                    myApplication.setNextId(nextId++);
                }

                //Go back to main activity

                Intent intent = new Intent(AddEditOne.this, MainActivity.class);
                startActivity(intent);
            }
        });
    btn_cancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(AddEditOne.this, MainActivity.class);
            startActivity(intent);
        }
    });

    }
}