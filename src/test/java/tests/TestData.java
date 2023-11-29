package tests;

import com.github.javafaker.Faker;
import utils.FakerUtils;

import java.util.Locale;


public class TestData {
    Faker faker = new Faker(new Locale("en-GB"));
    FakerUtils fakerUtils = new FakerUtils();


    public String

            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = fakerUtils.getGender(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            dayOfBirth = fakerUtils.getDay(),
            monthOfBirth = fakerUtils.getMonth(),
            yearOfBirth = fakerUtils.getYear(),
            subject = fakerUtils.getSubject(),
            hobbies = fakerUtils.getHobbies(),
            picture = fakerUtils.getImg(),
            streetAddress = faker.address().streetAddress(),
            state = fakerUtils.getState(),
            city = fakerUtils.getCity(state);


}
