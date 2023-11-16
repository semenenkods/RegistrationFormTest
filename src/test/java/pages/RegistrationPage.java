package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableResultsComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();
    TableResultsComponent table = new TableResultsComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            userSubjectInput = $("#subjectsInput"),
            userSubjectSelect = $("#subjectsWrapper"),
            userHobbiesInput = $("#hobbiesWrapper"),
            userUploadPicture = $("#uploadPicture"),
            userAddressInput = $("#currentAddress"),
            userStateInput = $("#state"),
            userCityInput = $("#city"),
            userSubmitForm = $("#submit");


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");

        return this;
    }

    public RegistrationPage bannerRemove() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationPage setEmail(String email) {
        userEmailInput.setValue(email);

        return this;
    }

    public RegistrationPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();

        return this;
    }

    public RegistrationPage setPhoneNumber(String phoneNumber) {
        userNumberInput.setValue(phoneNumber);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String typeSubject, String selectSubject) {
        userSubjectInput.setValue(typeSubject);
        userSubjectSelect.$(byText(selectSubject)).click();

        return this;
    }

    public RegistrationPage setHobbies(String hobby) {
        userHobbiesInput.$(byText(hobby)).click();

        return this;
    }


    public RegistrationPage setPicture(String img) {
        userUploadPicture.uploadFromClasspath(img);

        return this;
    }

    public RegistrationPage setHomeAddress(String homeAddress) {
        userAddressInput.setValue(homeAddress);

        return this;
    }

    public RegistrationPage setState(String state) {
        userStateInput.click();
        userStateInput.$(byText(state)).click();

        return this;
    }

    public RegistrationPage setCity(String city) {
        userCityInput.click();
        userCityInput.$(byText(city)).click();

        return this;
    }

    public RegistrationPage submitForm() {
        userSubmitForm.click();

        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        table.checkLineInTable(key, value);

        return this;
    }


}
