package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {
        boolean resultado = UserUtils.isPasswordEqual("contraseña" , "contraseña");
           assertTrue(resultado);


    }

}
