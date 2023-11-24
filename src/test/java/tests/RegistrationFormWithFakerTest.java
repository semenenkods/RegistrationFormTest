package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;

public class RegistrationFormWithFakerTest extends TestBase {

    @Test
    void registrationFormTest() {

        registrationPage.openPage()
                .bannerRemove()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject.substring(0, 1), subject)
                .setHobbies(hobbies)
                .setPicture(picture)
                .setHomeAddress(streetAddress)
                .setState(state)
                .setCity(city)
                .submitForm();

        //Validations
        registrationPage
                .checkResult("Student Name", firstName)
                .checkResult("Student Name", lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", String.format("%s %s,%s", dayOfBirth, monthOfBirth, yearOfBirth))
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", streetAddress)
                .checkResult("State and City", String.format("%s %s", state, city));


    }
}
