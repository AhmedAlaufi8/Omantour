package com.codingtester.tourisminoman.models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codingtester.tourisminoman.Model;
import com.codingtester.tourisminoman.R;
import com.codingtester.tourisminoman.category.CatAdapter;

import java.util.ArrayList;
import java.util.List;

public class ModelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_models);

        String name = getIntent().getStringExtra("type");
        RecyclerView recyclerView = findViewById(R.id.recyclerModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        if(name.equals("Tourist Areas")) {
            ModelsAdapter adapter = new ModelsAdapter(getAllTorism());
            recyclerView.setAdapter(adapter);
        } else if(name.equals("Restaurants")) {
            ModelsAdapter adapter = new ModelsAdapter(getAllRestaurant());
            recyclerView.setAdapter(adapter);
        } else if(name.equals("Hotels")) {
            ModelsAdapter adapter = new ModelsAdapter(getAllHotels());
            recyclerView.setAdapter(adapter);
        } else {
            ModelsAdapter adapter = new ModelsAdapter(getAllTrans());
            recyclerView.setAdapter(adapter);
        }
    }


    public static List<Model> getAllTorism() {
        Model model = new Model(
                "1",
                "The Royal Opera House Muscat",
                "",
                "23.613952",
                "58.4685124",
                "The Royal Opera House Muscat is the first opera house in the Arabian Gulf region and on the Arabian Peninsula. Sultan Qaboos ordered its construction in 2001. Construction of the building began in 2007 and was completed on October 12, 2011. It was constructed on a vast area of eighty thousand square meters and the built-up area is more than twenty-five thousand square meters",
                R.drawable.the_royal_opera_house);

        Model model2 = new Model(
                "2",
                "The royal palace in Muscat",
                "",
                "23.6159086",
                "58.5946997",
                "The palace of science or the royal palace of Muscat, is a palace located in Muscat. It is the prestigious residence of Sultan Haitham bin Tariq, who does not live in it, but generally receives his guests in it.The palace has witnessed the largest maintenance operation during the reign of Sultan Qaboos bin Said",
                R.drawable.the_royal_palace_in_muscat);

        Model model3 = new Model(
                "3",
                "Al-Jalali Castle, Al-Kut Al-Sharqi or al-Sharqiya Castle",
                "",
                "23.6168648",
                "58.5977858",
                "Al-Jalali Castle, Al-Kut Al-Sharqi or al-Sharqiya Castle is an archaeological Castle located on rocks overlooking the sea of Oman northeast of Muscat, built by the Portuguese in 1588 to replace an old building believed to have been an observatory in the form of towers erected by Muscat people, the castle was used as a place for political prisoners and as a defensive position from which the city is monitored from various sides.",
                R.drawable.al_qalaa);

        Model model4 = new Model(
                "4",
                "National Museum in Muscat",
                "",
                "23.6129449",
                "58.5989493",
                "The National Museum is the most prominent cultural edifice in the Sultanate of Oman, dedicated to highlighting the components of Oman's cultural heritage, since the emergence of human impact on the Omani Peninsula about millions of years ago, and to the present day; through which we look forward to our promising future.",
                R.drawable.national_museum);

        List<Model> list = new ArrayList<>();
        list.add(model);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        return list;
    }

    public static List<Model> getAllHotels() {
        Model model = new Model(
                "1",
                "Crowne Plaza Muscat, an IHG Hotel",
                "+968 24 660660",
                "",
                "",
                "Experience the ultimate home away from home at Crowne Plaza Muscat perched atop the tranquil Qurum Heights, in the heart of Muscat, offering stunning views of the city and the sea. Crowne Plaza Muscat is short 25-minute drive from the Muscat International Airport and, a 7-minute drive from Qurum Natural Park and the Royal Opera House.\n",
                R.drawable.crowne_plaza, "112 Ruwi Street Qurum Heights");

        Model model2 = new Model(
                "2",
                "InterContinental Muscat, an IHG Hotel",
                "+968 24 680000",
                "",
                "",
                "With a spectacular location on the public beachfront, 35 acres of gardens & distant view of the majestic Hajar Mountains, our five-star urban city resort is located in the heart of Muscat’s prestigious residential and diplomatic quarter. One of the country’s most preeminent event venues, our elegant meeting space accommodates up to 700 guests. With inviting pools, and proximity to the Royal Opera House, Mutrah Souk and Muscat’s City Center, InterContinental® Muscat invites you to discover Oman.",
                R.drawable.interhotel, "Area 114 Al Kharjiya Street");

        Model model3 = new Model(
                "3",
                "Royal Tulip Muscat",
                "+968 22 125555",
                "",
                "",
                "Al-Jalali Castle, Al-Kut Al-Sharqi or al-Sharqiya Castle is an archaeological Castle located on rocks overlooking the sea of Oman northeast of Muscat, built by the Portuguese in 1588 to replace an old building believed to have been an observatory in the form of towers erected by Muscat people, the castle was used as a place for political prisoners and as a defensive position from which the city is monitored from various sides.",
                R.drawable.royaltulip, "Al Marafah Street, Way No. 238, Al Ghubrah Nort");

        Model model4 = new Model(
                "4",
                "The Chedi Muscat",
                "+968 24 524400",
                "",
                "",
                "The National Museum is the most prominent cultural edifice in the Sultanate of Oman, dedicated to highlighting the components of Oman's cultural heritage, since the emergence of human impact on the Omani Peninsula about millions of years ago, and to the present day; through which we look forward to our promising future.",
                R.drawable.thechedi, "133 November street, Muscat, Oman");

        List<Model> list = new ArrayList<>();
        list.add(model);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        return list;
    }

    public static List<Model> getAllRestaurant() {
        Model model = new Model(
                "1",
                "Angham Restaurant",
                "+968 22 077777",
                "",
                "",
                "An Omani restaurant serving traditional Omani dishes, including Shewa and Haris, in addition to popular Arab and Middle Eastern cuisine and meals. Al Angam restaurant, located at the Royal Opera House, is one of the most conservative restaurants in Oman and serves local Omani meals. Its design is very beautiful, and its patrons have praised its cleanliness and excellent service.",
                R.drawable.angham, "463 Al kharijah Street, Muscat, Oman");

        Model model2 = new Model(
                "2",
                "Ubar Restaurant",
                "+968 24 699826",
                "",
                "",
                "Opar restaurant in Muscat offers a modern alternative to traditional places with a vision that takes Omani hospitality to new heights, from the service staff to the interior design, uniforms and menu featuring traditional dishes like never before. They left the Omani Homeland. He cooked before. The signature options offered by the restaurant include biryani, cantilevered rice, tacos, burgers, roast beef and chicken nuggets, which are wonderfully served alongside potatoes, dips, salads and more. In addition to sweets, hot and cold drinks",
                R.drawable.upar, "Al Kharjiyah St OM, 100، Oman");

        Model model3 = new Model(
                "3",
                "Beghms Restaurant",
                "+968 9307 4000",
                "",
                "",
                "A decent non-vegetarian premium Indian cuisine restaurant located in Muscat at Al Khuwair and Bousher. Good tasty food",
                R.drawable.beghms, "Bediyah House, Bawshar St");

        Model model4 = new Model(
                "4",
                "Slider Station Restaurant",
                "+968 24 698990",
                "",
                "",
                "The restaurant serves grills, burgers, various salads and desserts. An American-themed restaurant, designed as an American gas station with the atmosphere of the Forties of the last century.",
                R.drawable.slider, "Muscat, Oman");

        List<Model> list = new ArrayList<>();
        list.add(model);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        return list;
    }

    public static List<Model> getAllTrans() {
        Model model = new Model(
                "1",
                "City Bus",
                "",
                "",
                "",
                "",
                R.drawable.buses, "");

        Model model2 = new Model(
                "1",
                "Taxi Car",
                "",
                "",
                "",
                "",
                R.drawable.car, "");

        Model model3 = new Model(
                "1",
                "Marhaba Car",
                "",
                "",
                "",
                "",
                R.drawable.marhaba, "");

        Model model4 = new Model(
                "1",
                "Women Car",
                "",
                "",
                "",
                "",
                R.drawable.women, "");

        List<Model> list = new ArrayList<>();
        list.add(model);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        return list;
    }
}