import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NuevasModalidadesTest {
    private ClienteDeCorreo cliente;
    private Carpeta c1, c2;
    private Email e1, e2, e3;

    @BeforeEach
    void setUp() throws Exception{
        cliente = new ClienteDeCorreo();
        c1 = new Carpeta("Carpeta 1");
        c2 = new Carpeta("Carpeta 2");
        e1 = new Email("e1","aa");
        e2 = new Email("e2", "aa");
        e3= new Email("e3","aa");
    }

    @Test
    void cantMailCarpeta(){
        c1.agregarMail(e1);
        assertEquals(1,c1.cantEmailsCarpeta());
    }

    @Test
    void cantMailClienteTest(){
        cliente.addCarpeta(c1); cliente.addCarpeta(c2);
        c1.agregarMail(e1);c2.agregarMail(e2);c2.agregarMail(e3);
        assertEquals(3,cliente.cantidadEmailsCliente());
    }

    @Test
    void cantMailCategoriaTest(){
        c2.agregarMail(e2);c2.agregarMail(e3);
        BagImpl<String> bolsa = c2.emailsPorTamaño();
        assertEquals(2,bolsa.occurrencesOf("Pequeño"));
    }
}
