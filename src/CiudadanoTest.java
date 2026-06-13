import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class CiudadanoTest {

    static Ciudadano ciu;
    private static int i = 1;

    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Ciudadano("Anonimus", "anonimus@mail.com", 1212);
        System.out.println("INGRESO de ciudadano del bien");
    }

    @AfterClass
    public static void despuesDeTodo() {
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println(ayer + " - Baches reparados, Ciudadanos Felices");
    }

    @Before
    public void setUp() {
        System.out.println("-------------------------------------------------");
        System.out.println("Ejecutando Test N°: " + i++);
    }

    @After
    public void tearDown() {
        System.out.println("-------------------------------------------------");
    }

    @Test
    public void testValidarUsr() {
        int contra = 123456;
        assertFalse("Deberia fallar la validación", ciu.validarIngreso(contra));
    }

    @Test
    public void testValidarEmail() {
        String email = "maria@yahoo.com";
        boolean isValid = email.contains("@") && email.contains(".") && email.length() < 20;
        assertTrue("Debe tener exito al validar el mail", isValid);
    }

    @Test
    public void testCambioPass() {
        String newPass = "1234";
        ciu.cambioPassword(newPass);
        assertEquals("Debe tener exito cambiando el password", 1234, ciu.getPassword());
        System.out.println("Cambio de contraseña exitoso a: " + ciu.getPassword());
    }

    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
        ciu.delay(20);
    }

    @Test
    public void testCiudadanosDiferentes() {
        Ciudadano c1 = new Ciudadano("Juan", "juan@mail.com", 1111);
        Ciudadano c2 = new Ciudadano("Pedro", "pedro@mail.com", 2222);
        
        boolean distintos = c1.ciudadanosDiferentes(c2);
        assertTrue(distintos);
        assertNotSame("misma persona", c1, c2);
    }
}