package pro.sky.calculatorskypro;

import org.springframework.stereotype.Service;

@Service
public class calculatorServiceOne {
    public int plus(int a, int b){
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }

    public int multip(int a, int b) {
    return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
}

