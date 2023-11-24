package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        $(".react-datepicker__year-select").selectOptionContainingText(year);
        $(".react-datepicker__month-select").selectOptionContainingText(month);
        $(String.format(".react-datepicker__day--%03d:not(.react-datepicker__day--outside-month)", Integer.parseInt(day))).click();

    }
}
