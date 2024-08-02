package com.develovit.kendaraan;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView vehicleInfoTextView;
    private Button displayCarInfoButton;
    private Button displayBikeInfoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicleInfoTextView = findViewById(R.id.vehicleInfoTextView);
        displayCarInfoButton = findViewById(R.id.displayCarInfoButton);
        displayBikeInfoButton = findViewById(R.id.displayBikeInfoButton);

        // Buat objek Car dan Bike
        final Vehicle car = new Car("Toyota", 180, 4);
        final Vehicle bike = new Bike("Yamaha", 120, true);

        // Mengatur listener untuk tombol
        displayCarInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehicleInfoTextView.setText("Car Name: " + car.getName() + "\nSpeed: " + car.getSpeed() + " km/h\nDoors: " + ((Car) car).getNumberOfDoors());
            }
        });

        displayBikeInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehicleInfoTextView.setText("Bike Name: " + bike.getName() + "\nSpeed: " + bike.getSpeed() + " km/h\nHas Carrier: " + ((Bike) bike).isHasCarrier());
            }
        });
    }
}
