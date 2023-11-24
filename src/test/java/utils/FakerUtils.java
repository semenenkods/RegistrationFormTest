package utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class FakerUtils {
    static Faker faker = new Faker(new Locale("en-GB"));


    public static String getGender() {
        String[] genderOptions = {"Male", "Female", "Other"};

        return faker.options().option(genderOptions);
    }


    public static String getDay() {
        String day = String.valueOf(faker.number().numberBetween(1, 28));

        return faker.options().option(day);

    }

    public static String getMonth() {
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

    public static String getYear() {
        String year = String.valueOf(faker.number().numberBetween(1923, 2020));

        return faker.options().option(year);
    }

    public static String getSubject() {
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

    public static String getHobbies() {
        String[] hobby = {"Sports", "Reading", "Music"};

        return faker.options().option(hobby);
    }

    public static String getState() {
        String[] state = getCityBasedOnState().keySet().toArray(String[]::new);

        return faker.options().option(state);
    }

    public static String getCity(String state) {
        String[] city = getCityBasedOnState().get(state);

        return faker.options().option(city);

    }

    public static Map<String, String[]> getCityBasedOnState() {
        HashMap<String, String[]> cityBasedOnState = new HashMap();
        cityBasedOnState.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        cityBasedOnState.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        cityBasedOnState.put("Haryana", new String[]{"Karnal", "Panipat"});
        cityBasedOnState.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

        return cityBasedOnState;
    }

    public static String getImg() {
        String[] img = {"test_picture.jpg", "test_picture_2.jpg"};
        return faker.options().option(img);

    }


}
