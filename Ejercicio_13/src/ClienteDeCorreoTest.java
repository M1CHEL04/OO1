import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteDeCorreoTest {
    private ClienteDeCorreo cliente;
    private Carpeta c1,c2;
    private Email e1,e2,e3,e4;

    @BeforeEach
    void setUp() throws Exception{
        cliente = new ClienteDeCorreo();
        c1 = new Carpeta("Carpeta1");
        c2 = new Carpeta("Carpeta2");
        e1 = new Email("Titulo1","Cuerpo1");
        e2 = new Email("Titulo2","Cuerpo2");
        e3 = new Email("Titulo3","Cuerpo3");
        e4 = new Email("Titulo4","Cuerpo4");
    }

    @Test
    void TestAddCarpeta(){
        cliente.addCarpeta(c1);
        assertEquals(2,cliente.getCarpetas().size());
    }

    @Test
    void TestRecibir(){
        cliente.recibir(e1);
        assertEquals(1,cliente.getCarpetas().getFirst().getEmails().size());
    }

    @Test
    void TestBuscar(){
        c1.agregarMail(e1); c1.agregarMail(e2);c2.agregarMail(e3);c2.agregarMail(e4);
        cliente.addCarpeta(c1);
        cliente.addCarpeta(c2);
        assertEquals(e3,cliente.buscar("Titulo3"));
    }

    @Test
    void TestEspacioOcupado(){
        c1.agregarMail(e1); c1.agregarMail(e2);c2.agregarMail(e3);c2.agregarMail(e4);
        cliente.addCarpeta(c1);
        cliente.addCarpeta(c2);
        assertEquals(56,cliente.espacioOcupado());
    }
}
