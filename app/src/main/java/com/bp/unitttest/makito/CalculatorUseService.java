package com.bp.unitttest.makito;

public class CalculatorUseService {

    CalculatorService service;

    public CalculatorUseService(CalculatorService service) {
        this.service = service;
    }

    public int perform(int i, int j){  // 2, 3 -> (i+j)*i

       return service.add(i,j)*i;

    }
}
