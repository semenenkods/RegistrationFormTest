package tests;

import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {
    static Faker faker = new Faker(new Locale("en-GB"));


    public static String

            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = utils.FakerUtils.getGender(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            dayOfBirth = utils.FakerUtils.getDay(),
            monthOfBirth = utils.FakerUtils.getMonth(),
            yearOfBirth = utils.FakerUtils.getYear(),
            subject = utils.FakerUtils.getSubject(),
            hobbies = utils.FakerUtils.getHobbies(),
            picture = utils.FakerUtils.getImg(),
            streetAddress = faker.address().streetAddress(),
            state = utils.FakerUtils.getState(),
            city = utils.FakerUtils.getCity(state);


}
