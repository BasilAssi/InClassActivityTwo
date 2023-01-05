package com.example.inclassactivitytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


  private EditText name , salary;
  private Spinner spinner;
  private Button btn;
  private ListView listView;

  private ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private ArrayList<String> jobTime = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
        jobTime.add("Full Time");
        jobTime.add("Part Time");
        ArrayAdapter<String> ad1= new ArrayAdapter<String>(this , android.R.layout.simple_spinner_item , jobTime );
        spinner.setAdapter(ad1);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = name.getText().toString();
                Double salary1 = Double.valueOf(salary.getText()+"");
                String cat = spinner.getSelectedItem().toString();

                Employee emp = new Employee(name1 ,salary1,cat);
                employeeArrayList.add(emp);

                ArrayAdapter<Employee> arrayAdapter  =  new ArrayAdapter<Employee>(getApplicationContext(),android.R.layout.simple_list_item_1 , employeeArrayList);
                listView.setAdapter(arrayAdapter);

            }
        });

    }

    public void setUpView(){
     name = findViewById(R.id.edtName);
     salary= findViewById(R.id.edtSalary);
     spinner = findViewById(R.id.spinner);
     btn = findViewById(R.id.button);
     listView = findViewById(R.id.listView);
    }






}