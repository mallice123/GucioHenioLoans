package application.controller;


import application.modelDto.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressRegistrationController {

    @PostMapping("/submit_address")
    public ResponseEntity<String> collectAddressForm(Address addressForm) {

        if(!isAddressFormDataValid(addressForm)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Provided address data is incorrect");
        }
        System.out.println("Address form data ");
        System.out.println("Post code " + addressForm.getPostalCode());
        System.out.println("Town form " + addressForm.getTown());
        System.out.println("Street name " + addressForm.getStreetName());
        System.out.println("Email form " + addressForm.getEmail());
        return ResponseEntity.status(HttpStatus.OK).body("Address data saved successfully");
    }

    private boolean isAddressFormDataValid(Address addressForm) {
        return true;
    }
}
