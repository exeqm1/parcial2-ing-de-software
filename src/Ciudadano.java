public class Ciudadano {
    private String nombre;
    private String mail;
    private int password;

    public Ciudadano() {}

    public Ciudadano(String nombre, String mail, int password) {
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
    }

    public String getMail() { return mail; }
    public int getPassword() { return password; }

    public boolean validarIngreso(int psw) {
        return this.password == psw;
    }

    public void cambioPassword(String newPass) {
        this.password = Integer.parseInt(newPass);
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        if (c2 == null) return true;
        return !this.equals(c2); 
    }
}