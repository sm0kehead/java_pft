package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class NewAddressCreation extends TestBase {
    
    @Test
    public void testNewAddressCreation() {

        app.newAddressPage();
        app.fillAddressDataForm(new ContactData("Artur", "Wójtowicz", "awojtowicz@test.pl"));
        app.saveAddressFormChanges();
    }
}
