package com.hadeelNQ.myapplication.ui;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.hadeelNQ.myapplication.FoodList;
import com.hadeelNQ.myapplication.MainActivity;
import com.hadeelNQ.myapplication.home;
import com.hadeelNQ.myapplication.ui.BMIRecordAdapter;
import com.hadeelNQ.myapplication.ui.FireBaseConnect;
import com.hadeelNQ.myapplication.ui.User;
public class FireBaseConnect {
    public static void addListenerForUserUpdate(AppCompatActivity actv) {
     /*   DB.getCurrentUserData().addValueEventListner(new ValueEventListner(){
           public void onDataChange(@NonNull DataSnapshot dataSnapshot){
               User.user.updateLists(dataSnapshot,actv);
               home.checkBMIChange();
           }
           public void onCancelled(@NonNull DatabaseError error){}
        });
    }
    public static void logout(){User.user.getFAuth().signOut();}
    public static void addBMIRecord(BMIRecord record){
        String key=DB.getCurrentUserBMIRecords().push().getKey();
        record.setId(key);
        DB.getCurrentUserBMIRecords().child(key).setValue(record);
    }
    public static void removeBMIRecord(BMIRecord record){
        DB.getCurrentUserBMIRecords().child(record.getId()).removeValue();
    }
    public static void addFood(FoodList record){
        String key=DB.getCurrentUserFoods().push().getKey();
        record.setId(key);
        DB.getCurrentUserFoods().child(key).setValue(record);
    }
    public static void removeFood(FoodList record){
        DB.getCurrentUserFoods().child(record.getId()).removeValue();
    }

public static class DB{
        public static DatabaseReferance getUsers(){
            return FireBaseConnect.getInstance().getReferance("Users");
        }
    public static DatabaseReferance getCurrentUserData(){
        return getUsers().child(User.user.getfAuth).getCurrentUser().getUid();
    }
    public static DatabaseReferance getCurrentUserFoods(){
        return getCurrentUserData().child( "foods");    }
    public static DatabaseReferance getCurrentUserBMIRecords(){
        return getCurrentUserData().child( "records");    }
    public static DatabaseReferance getCurrentUserName(){
        return getCurrentUserData().child( "name");    }
    public static DatabaseReferance getCurrentUserGender(){
        return getCurrentUserData().child( "gender");    }
    public static DatabaseReferance getCurrentUserBirthDate(){
        return getCurrentUserData().child( "birthdate");    }
}

    private static Object getInstance() {
    }
*/
    }


}