package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithFakerTest extends TestBase {
    TestData td = new TestData();

    @Test
    void registrationFormTest() {

        registrationPage.openPage()
                .bannerRemove()
                .setFirstName(td.firstName)
                .setLastName(td.lastName)
                .setEmail(td.email)
                .setGender(td.gender)
                .setPhoneNumber(td.phoneNumber)
                .setDateOfBirth(td.dayOfBirth, td.monthOfBirth, td.yearOfBirth)
                .setSubject(td.subject.substring(0, 1), td.subject)
                .setHobbies(td.hobbies)
                .setPicture(td.picture)
                .setHomeAddress(td.streetAddress)
                .setState(td.state)
                .setCity(td.city)
                .submitForm();

        //Validations
        registrationPage
                .checkResult("Student Name", td.firstName)
                .checkResult("Student Name", td.lastName)
                .checkResult("Student Email", td.email)
                .checkResult("Gender", td.gender)
                .checkResult("Mobile", td.phoneNumber)
                .checkResult("Date of Birth", String.format("%s %s,%s", td.dayOfBirth, td.monthOfBirth, td.yearOfBirth))
                .checkResult("Subjects", td.subject)
                .checkResult("Hobbies", td.hobbies)
                .checkResult("Picture", td.picture)
                .checkResult("Address", td.streetAddress)
                .checkResult("State and City", String.format("%s %s", td.state, td.city));


    }
}
