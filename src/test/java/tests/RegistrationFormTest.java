package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTest {

    @BeforeAll
    static void browserConfiguration() {
        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void completeFormTest() {

        open("https://demoqa.com/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Test");
        $("#lastName").setValue("First");
        $("#userEmail").setValue("testfirst@gmail.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(("1234567890"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOptionContainingText("1990");
        $(".react-datepicker__month-select").selectOptionContainingText("September");
        $(".react-datepicker-popper").$(byText("13")).click();

        $("#subjectsInput").setValue("m");
        $("#subjectsWrapper").$(byText("Maths")).click();

        $("#hobbiesWrapper").$(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("test_picture.jpg");
        $("#currentAddress").setValue("my current address");


        $("#state").click();
        $("#state").$(byText("NCR")).click();
        $("#city").click();
        $("#city").$(byText("Delhi")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Test First"));
        $(".table-responsive").shouldHave(text("testfirst@gmail.com"));
        $(".table-responsive").shouldHave(text("Female"));
        $(".table-responsive").shouldHave(text("1234567890"));
        $(".table-responsive").shouldHave(text("13 September,1990"));
        $(".table-responsive").shouldHave(text("Maths"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("test_picture.jpg"));
        $(".table-responsive").shouldHave(text("my current address"));
        $(".table-responsive").shouldHave(text("NCR Delhi"));
    }
}
