package g1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
//        Browser browser = BrowserFactory.launch(BrowserType.INTERNET_EXPLORER);

        browser.navigate("http://advantageonlineshopping.com/");
//        browser.navigate("http://nimbusserver:8000/#/");
        Link tABLETSLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("TABLETS")
                .tagName("SPAN").build());
        tABLETSLink.click();

        WebElement hPEliteX21011G1TabletWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP Elite x2 1011 G1 Tablet")
                .tagName("A").build());
        hPEliteX21011G1TabletWebElement.click();

        EditField quantityEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("quantity")
                .tagName("INPUT")
                .type("text").build());
        quantityEditField.setValue("2");

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        Link link = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("2 ")
                .role("link")
                .tagName("A")
                .index(1).build());
 //       link.click();
        AOS_AM appModel = new AOS_AM(browser);
        appModel.aMenuCartWebElement().click(); // this is more reliable than link above - because of the
                                                //.innerText("2 ") above - numberof items currently in cart

        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("removeProduct iconCss iconX")
                .innerText("")
                .tagName("DIV")
                .index(0).build());
 //       webElement.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
 //       hOMELink.click();

        appModel.aCheckOutBtnButton().click();
        appModel.aUsernameInOrderPaymentEditField().setValue("BillyBob");
        appModel.aPasswordInOrderPaymentEditField().setSecure("5c4a40ac437beef4e44f5ff04c5c6084df6dd51fb7f8519503a0e31b36ed459b");
        appModel.aSHOPPINGCARTLink().click();
        appModel.aREMOVEWebElement().click();
        hOMELink.click();
//        browser.close();

    }

}