package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableResultsComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    //Selenide Elements
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
            userHobbiesInput = $($("#hobbiesWrapper").$(byText("Sports"))),
            userUploadPicture = $("#uploadPicture"),
            userAddressInput = $("#currentAddress"),
            userOpenStateList = $("#stateCity-wrapper").$(byText("Select State")),
            userSelectState = $("#stateCity-wrapper").$(byText("NCR")),
            userOpenCityList = $("#stateCity-wrapper").$(byText("Select City")),
            userSelectCity = $("#stateCity-wrapper"),
            userSubmitForm = $("#submit");


    //Actions
    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");

        return this;
    }

    public RegistrationPage bannerRemove() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.click();

        return this;
    }

    public RegistrationPage setNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String typeName, String selectName) {
        userSubjectInput.setValue(typeName);
        userSubjectSelect.$(byText(selectName)).click();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        userHobbiesInput.click();

        return this;
    }


    public RegistrationPage setPicture(String value) {
        userUploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        userAddressInput.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        userOpenStateList.click();
        userSelectState.click();

        return this;
    }

    public RegistrationPage setCity(String city) {
        userOpenCityList.click();
        userSelectCity.$(byText(city)).click();

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
