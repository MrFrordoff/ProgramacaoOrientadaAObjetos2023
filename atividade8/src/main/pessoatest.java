// PessoaTest.java
package com;

public class pessoatest {

    @Test
    public void testDizerOla() {
        pessoa pessoa = new pessoa();
        String resultado = pessoa.dizerOla();
        assertEquals("Olá, eu sou uma pessoa!", resultado);
    }

    private void assertEquals(String expected, String resultado) {
    }
}
