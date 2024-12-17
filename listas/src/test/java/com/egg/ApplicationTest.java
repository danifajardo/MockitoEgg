package com.egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void createMockObject(){
        //creo el objeto mediante el metodo mock
        List<String> listaStrings = mock(List.class);

        // verify(listaStrings).size();
        when(listaStrings.size()).thenReturn(3);
        Integer tamanio = listaStrings.size();
        assertTrue(tamanio.equals(3));
    }

    @Test
    public void configureMockObject2(){
            //Devolver un tamaño de lista predeterminado diferente
        List<String> listaStrings = mock(List.class);
        //manualemnte lo agrego   
        listaStrings.add("Hoy es 16 de diciembre");
        when(listaStrings.size()).thenReturn(16);

        Integer tamanio = listaStrings.size();
        assertTrue(tamanio.equals(0));
    }

    @Test
    public void verificarMetodo() {
        List<String> listaStrings = mock(List.class);
        listaStrings.add("Hoy es 16 de diciembre");

        verify(listaStrings).add("Hoy es 16 de diciembre");
    }
}
