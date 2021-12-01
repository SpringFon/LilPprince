package com.example.lilprince;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMorning, btnDay, btnEvening, btnNight;
    private ImageView imgMorning, imgDay, imgEvening, imgNight;
    private ConstraintLayout layoutMorning;

    public static final int notificationMorning = 1;
    public static final int notificationDay = 2;
    public static final int notificationEvening = 3;
    public static final int notificationNight = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMorning = (Button) findViewById(R.id.btnMorning);
        btnDay = (Button) findViewById(R.id.btnDay);
        btnEvening = (Button) findViewById(R.id.btnEvening);
        btnNight = (Button) findViewById(R.id.btnNight);
        imgMorning = (ImageView) findViewById(R.id.imgMorning);
        imgDay = (ImageView) findViewById(R.id.imgDay);
        imgEvening = (ImageView) findViewById(R.id.imgEvening);
        imgNight = (ImageView) findViewById(R.id.imgNight);
        layoutMorning = (androidx.constraintlayout.widget.ConstraintLayout)
                        findViewById(R.id.layoutMorning);
    }

    public void btnMorningClick(View view) {
        layoutMorning.setVisibility(View.VISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.morning)
                        .setContentTitle("Утро")
                        .setContentText("Привести в порядок свою планету")
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(notificationDay, mBuilder.build());
    }

    public void btnDayClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.VISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.rose)
                .setContentTitle("День")
                .setContentText("Полить розу")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(notificationDay, mBuilder.build());
    }

    public void btnEveningClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.VISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.home)
                        .setContentTitle("Вечер")
                        .setContentText("Закрыть розу ширмой")
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(notificationDay, mBuilder.build());
    }

    public void btnNightClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.VISIBLE);

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.night)
                        .setContentTitle("Ночь")
                        .setContentText("полюбоваться закатом")
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(notificationDay, mBuilder.build());
    }

    public void onPrinceClick(View view) {
        Toast Prince = Toast.makeText(getApplicationContext(),
                "Маленький принц", Toast.LENGTH_LONG);
        Prince.setGravity(Gravity.BOTTOM, 0, 0);
        Prince.show();
    }

    public void onPlanetClick(View view) {
        Toast Planet = Toast.makeText(getApplicationContext(),
                "Астероид Б-12. Планета, на которой живёт Маленький принц", Toast.LENGTH_LONG);
        Planet.setGravity(Gravity.BOTTOM, 0, 0);
        Planet.show();
    }

    public void onVolcanoClick(View view) {
        Toast Volcano = Toast.makeText(getApplicationContext(),
                "Потухший вулкан. О нём тоже нужно заботиться", Toast.LENGTH_LONG);
        Volcano.setGravity(Gravity.BOTTOM, 0, 0);
        Volcano.show();
    }

    public void onRoseClick(View view) {
        Toast Rose = Toast.makeText(getApplicationContext(),
                "Роза. Её нужно поливать, а на ночь укрывать ширмой и колпаком", Toast.LENGTH_LONG);
        Rose.setGravity(Gravity.BOTTOM, 0, 0);
        Rose.show();
    }

    public void onBreakfastClick(View view) {
        Toast Breakfast = Toast.makeText(getApplicationContext(),
                "Действующий вулкан. На нём удобно разогревать завтрак", Toast.LENGTH_LONG);
        Breakfast.setGravity(Gravity.BOTTOM, 0, 0);
        Breakfast.show();
    }
}