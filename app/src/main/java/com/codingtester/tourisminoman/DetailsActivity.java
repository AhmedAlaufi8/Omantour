package com.codingtester.tourisminoman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView img = findViewById(R.id.img);
        ImageView imgLoc = findViewById(R.id.imgLocation);
        TextView txtName = findViewById(R.id.txtNameDet);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtDes = findViewById(R.id.txtDescDet);
        Button btn = findViewById(R.id.btnContactUs);
        MapView mapView = findViewById(R.id.mapView);

        Model model = (Model) getIntent().getSerializableExtra("model");

        if(model.getLat().isEmpty() || model.getLng().isEmpty()) {
            mapView.setVisibility(View.GONE);
        } else {

            mapView.onCreate(savedInstanceState);
            mapView.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(@NonNull GoogleMap googleMap) {
                    googleMap.clear();
                    googleMap.addMarker(
                            new MarkerOptions().position(
                                    new LatLng(Double.parseDouble(model.getLat()), Double.parseDouble(model.getLng()))
                            ).title("الموقع")
                    );
                    googleMap.animateCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                    new LatLng(Double.parseDouble(model.getLat()), Double.parseDouble(model.getLng())), 16f
                            )
                    );
                }
            });
        }

        img.setImageResource(model.getImage());
        txtName.setText(model.getName());
        txtDes.setText(model.getDescription());

        if(model.getPhone()!= null && !model.getPhone().isEmpty()) {
            btn.setText("Contact us on   " + model.getPhone());
            btn.setVisibility(View.VISIBLE);
        } else  {
            btn.setVisibility(View.GONE);
        }

        if(model.getAddress() != null && !model.getAddress().isEmpty()) {
            txtAddress.setText(model.getAddress());
        } else {
            txtAddress.setVisibility(View.GONE);
            imgLoc.setVisibility(View.GONE);
        }

        btn.setOnClickListener(view -> {
            //
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", model.getPhone(), null));
            startActivity(intent);
        });
    }
}