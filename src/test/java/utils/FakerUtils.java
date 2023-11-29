package utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class FakerUtils {
    Faker faker = new Faker(new Locale("en-GB"));


    public String getGender() {
        String[] genderOptions = {"Male", "Female", "Other"};

        return faker.options().option(genderOptions);
    }


    public String getDay() {
        String day = String.valueOf(faker.number().numberBetween(1, 28));

        return faker.options().option(day);

    }

    public String getMonth() {
        String[] month = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};

        return faker.options().option(month);
    }

    public String getYear() {
        String year = String.valueOf(faker.number().numberBetween(1923, 2020));

        return faker.options().option(year);
    }

    public String getSubject() {
        String[] subject = {
                "Hindi",
                "English",
                "Physics",
                "Chemistry",
                "Biology",
                "Computer Science",
                "Accounting",
                "Economics",
                "Social Studies",
                "History",
                "Civics"};

        return faker.options().option(subject);

    }

    public String getHobbies() {
        String[] hobby = {"Sports", "Reading", "Music"};

        return faker.options().option(hobby);
    }

    public String getState() {
        String[] state = getCityBasedOnState().keySet().toArray(String[]::new);

        return faker.options().option(state);
    }

    public String getCity(String state) {
        String[] city = getCityBasedOnState().get(state);

        return faker.options().option(city);

    }

    public Map<String, String[]> getCityBasedOnState() {
        HashMap<String, String[]> cityBasedOnState = new HashMap();
        cityBasedOnState.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        cityBasedOnState.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        cityBasedOnState.put("Haryana", new String[]{"Karnal", "Panipat"});
        cityBasedOnState.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

        return cityBasedOnState;
    }

    public String getImg() {
        String[] img = {"test_picture.jpg", "test_picture_2.jpg"};
        return faker.options().option(img);

    }


}
