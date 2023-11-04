package application.controller;

import application.modelDto.Occupation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OccupationRegistrationController {

    @PostMapping("/submit_occupation")
    public ResponseEntity<String> collectOccupationForm(Occupation occupationForm) {

        if (!isOccupationDataValid(occupationForm)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Provided data incorrect");
        }
        System.out.println("Employee name " + occupationForm.getEmployeeName());
        System.out.println("Start Date " + occupationForm.getStartDate());
        System.out.println("end Date " + occupationForm.getEndDate());
        System.out.println("Gross salary " + occupationForm.getGrossSalary());
        System.out.println("Net salary " + occupationForm.getNetSalary());

        return ResponseEntity.status(HttpStatus.OK).body("Data saved successully");
    }

    private boolean isOccupationDataValid(Occupation occupationForm) {
        return true;
    }
}
