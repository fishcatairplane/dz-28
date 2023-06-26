import io.qameta.allure.Description;
import org.testng.annotations.Test;
import objects.TableFormPage;
public class TableFormTest extends BasicTest {
    private final static String FIRST_NAME = "TestName";
    private final static String LAST_NAME = "TestLastName";
    private final static String EMAIL = "test@test.com";
    private final static String AGE = "29";
    private final static String SALARY = "1200";
    private final static String DEPARTMENT = "AQA";
    private final static String DEPARTMENT_MODIFIED = "AQAModified";

    @Test
    @Description("Checking positive case for adding and editing")
    public void editAddedRecordTest() {
        TableFormPage select = new TableFormPage(driver);
        select.clickAddBtn();
        select.fillInRegistrationForm(FIRST_NAME, LAST_NAME, EMAIL, AGE, SALARY, DEPARTMENT);
        select.editRegistrationForm(DEPARTMENT_MODIFIED);
        select.getModifiedElement();
        String modifiedDepartment = select.getModifiedElement();
        System.out.println(modifiedDepartment);
    }
}

