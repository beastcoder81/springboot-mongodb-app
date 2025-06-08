package com.example.myprograms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyArithmeticController {

    @Autowired
    private FullNameRepository fullNameRepository;

    @Autowired
    private CalculationRepository calculationRepository;

    @PostMapping("/fullname")
    public String saveFullName(@RequestBody FullNameRequest request) {
        String fullName = request.getFirstName() + " " + request.getMiddleName() + " " + request.getLastName();

        FullNameResult result = new FullNameResult();
        result.setFirstName(request.getFirstName());
        result.setMiddleName(request.getMiddleName());
        result.setLastName(request.getLastName());
        result.setFullName(fullName);

        fullNameRepository.save(result);

        return "Saved in DB → Full name: " + fullName;
    }

    @PostMapping("/calculate")
    public String calculate(@RequestBody CalculationRequest request) {
        int a = request.getNumber1();
        int b = request.getNumber2();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (b != 0) ? (double) a / b : 0;

        CalculationResult result = new CalculationResult();
        result.setNumber1(a);
        result.setNumber2(b);
        result.setAddition(add);
        result.setSubtraction(sub);
        result.setMultiplication(mul);
        result.setDivision(div);

        calculationRepository.save(result);

        return "Saved in DB → Addition: " + add +
                ", Subtraction: " + sub +
                ", Multiplication: " + mul +
                ", Division: " + String.format("%.2f", div);
    }
}
