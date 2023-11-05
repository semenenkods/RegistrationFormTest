import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationFormTest {
    @Test
    void successfulSearchTest() throws InterruptedException {

        Configuration.browser = "edge";
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Test");
        $("#lastName").setValue("First");
        $("#userEmail").setValue("testfirst@gmail.com");
        $(byText("Female")).click();
        $("#userNumber").setValue(("1234567890"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOptionContainingText("1990");
        $(".react-datepicker__month-select").selectOptionContainingText("September");
        $(byText("13")).click();
        $("#subjectsInput").setValue("m");
        $(byText("Maths")).click();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("test_picture.jpg");
        $("#currentAddress").setValue("my current address");
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Delhi")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Test First"), text("testfirst@gmail.com"), text("1234567890"), text("my current address"));
    }
}
