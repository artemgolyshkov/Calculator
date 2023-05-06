package pro.sky.calculatorskypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HalloCalculator {
    private final calculatorServiceOne calculatorServise;
    public HalloCalculator(calculatorServiceOne calculatorServiceOne){
        this.calculatorServise = calculatorServiceOne;
    }
    @GetMapping( )
    public String greating(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result = calculatorServise.plus(a,b);
        return String.format("%s + %s = %s",a, b, result);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result = calculatorServise.minus(a,b);
        return String.format("%s - %s = %s",a, b, result);
    }
    @GetMapping("/multip")
    public String multip(@RequestParam("num1") int a,@RequestParam("num2") int b){
        int result = calculatorServise.multip(a,b);
        return String.format("%s * %s = %s",a, b, result);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a,@RequestParam("num2") int b){
        if (b == 0){
            return "на ноль делить нельзя";
        }
        int result = calculatorServise.divide(a,b);
        return String.format("%s / %s = %s",a, b, result);
    }
}
