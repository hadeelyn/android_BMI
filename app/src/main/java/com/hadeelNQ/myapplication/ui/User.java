package com.hadeelNQ.myapplication.ui;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.hadeelNQ.myapplication.FoodList;


public class User {
    public static User user;
    private FirebaseAuth fAuth;
    private ArrayList<BMIRecord> records=new ArrayList<BMIRecord>();
    private ArrayList<FoodList> Foods=new ArrayList<FoodList>();
    private String name,email,password,id;
    private boolean male,female;
    public User(String name,String email,String password,String re_password,AppCompatActivity context)throws UserInfoException{
        if (!name.matches("[A-Za-z\\s]+"))throw new UserInfoException("name");
        if (!email.matches("[A-Za-z][\\w]{0,33}@[\\w]{2,10}\\.com"))throw new UserInfoException("email");
        if (!password.equals(re_password))throw new UserInfoException("re-password");
        if (password.length()<5) throw new UserInfoException("re-password");
        this.name=name;
        this.email=email;
        this.password=password;

    }
public User(){
        this.records=new ArrayList<BMIRecord>();
        records.add(new BMIRecord("20/12/2021",22,132));
    records.add(new BMIRecord("20/12/2021",26,182));
    records.add(new BMIRecord("20/12/2021",28,132));
    records.add(new BMIRecord("20/12/2021",22,132));
    records.add(new BMIRecord("20/12/2021",52,177));
    records.add(new BMIRecord("20/12/2021",22,132));
    records.add(new BMIRecord("20/12/2021",18,132));
    records.add(new BMIRecord("20/12/2021",22,132));
    records.add(new BMIRecord("20/12/2021",52,142));


}
 public ArrayList<BMIRecord> getRecords(){return records; }

    public FirebaseAuth getFAuth(){return fAuth;}
    public void setFAuth(FirebaseAuth fAuth){this.fAuth=fAuth;}
    public String getName(){return name;}
    public void setName(FirebaseAuth fAuth){this.name=name;}


    public User(String email,String password){
        this.email=email;
        this.password=password;
    }
    public boolean isMale(){
        return male;
    }
    public boolean isFemale(){
        return female;
    }
    public void setPassword(String password){this.password=password;}


public void uploadUserData(){}

    public void updateLists(DataSnapshot dataSnapshot, AppCompatActivity actv) {
    }

    public String getMessage() {
        return "hi";
    }
}
