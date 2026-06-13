import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(value = Parameterized.class)
public class ParameterCIUTest {

    private String email;
    private boolean resultadoEsperado;
    private String casoPrueba;

    public ParameterCIUTest(String email, boolean resultadoEsperado, String casoPrueba) {
        this.email = email;
        this.resultadoEsperado = resultadoEsperado;
        this.casoPrueba = casoPrueba;
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {"juan@mail.com", true, "Email Correcto"},
            {"juan.mail.com", false, "Sin Arroba"},
            {"juan@mail", false, "Sin Dominio"},
            {"juan@mail.com.ar", true, "Dominio Compuesto"}
        });
    }

    public static boolean ValidarMail(String email) {
        // chequeo tradicional
        boolean arroba = false;
        boolean punto = false;
        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                arroba = true;
            } else if (email.charAt(i) == '.') {
                punto = true;
            }
        }
        return (arroba == true && punto == true);

        // check con regex
        /*
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
        */
    }

    @Test
    public void testValidarEmail() {
        System.out.println("Ejecutando caso: " + casoPrueba);
        assertEquals(resultadoEsperado, ValidarMail(this.email));
    }
}