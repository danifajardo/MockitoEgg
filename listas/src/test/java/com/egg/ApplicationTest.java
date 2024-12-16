package com.egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
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
        when(listaStrings.size()).thenReturn(0);
        Integer tamanio = listaStrings.size();
        assertTrue(tamanio.equals(0));
    }
}
