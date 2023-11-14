package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithPageObject extends TestBase {

    @Test
    void registrationFormTest() {

        registrationPage.openPage()
                .bannerRemove()
                .setFirstName("Test")
                .setLastName("First")
                .setEmail("testfirst@gmail.com")
                .setGender("Female")
                .setNumber("1234567890")
                .setDateOfBirth("13", "September", "1990")
                .setSubject("m", "Maths")
                .setHobbies("Sports")
                .setPicture("test_picture.jpg")
                .setAddress("my current address")
                .setState("NCR")
                .setCity("Delhi")
                .submitForm();

        //Validations
        registrationPage
                .checkResult("Student Name", "Test First")
                .checkResult("Student Email", "testfirst@gmail.com")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "13 September,1990")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "test_picture.jpg")
                .checkResult("Address", "my current address")
                .checkResult("State and City", "NCR Delhi");


    }
}

