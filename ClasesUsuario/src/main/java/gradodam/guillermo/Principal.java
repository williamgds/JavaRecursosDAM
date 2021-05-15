package gradodam.guillermo;

/**
 * Herencia múltiple de usuario a moderador y administrador
 *
 */
public class Principal 
{
    public static void main( String[] args )
    {
        Usuario usuarioBasico = new Usuario("guillermo@usuario.com", "willy1992");
        Administrador miAadmin = new Administrador("guillermo@administrador.com", "willyAdministrador");
        Moderador miModerador = new Moderador("guillermo@moderador.com", "willyModerador");
        
        System.out.println("Usuario básico: ");
        System.out.println(usuarioBasico.getCorreoElectronico());
        System.out.println(usuarioBasico.getNickName());
        usuarioBasico.incrementarContadorMensajes();
        usuarioBasico.incrementarContadorMensajes();
        usuarioBasico.decrementarContadorMensajes();
        System.out.println(usuarioBasico.getNumeroMensajes());
        usuarioBasico.modificarCorreoElectronico("nuevomailusuario@ufv.es");
        System.out.println("El nuevo correo es "+ usuarioBasico.getCorreoElectronico() + ".");

        System.out.println("Moderador: ");
        System.out.println(miModerador.getCorreoElectronico());
        System.out.println(miModerador.getNickName());
        miModerador.incrementarContadorMensajes();
        miModerador.incrementarContadorMensajes();
        miModerador.decrementarContadorMensajes();
        miModerador.modificarCorreoElectronico("nuevomailmoderador@ufv.es");
        System.out.println(miModerador.getNumeroMensajes());
        miModerador.enviarMensajeALaPapelera();
        miModerador.enviarMensajeALaPapelera();
        System.out.println("El nuevo correo es "+ miModerador.getCorreoElectronico() + ".");
        System.out.println("Mensajes enviados a la papelera: " + miModerador.getNumDeMensajesEnviadosALaPapelera());

        System.out.println("Administrador: ");
        System.out.println(miAadmin.getCorreoElectronico());
        System.out.println(miAadmin.getNickName());
        miAadmin.incrementarContadorMensajes();
        miAadmin.incrementarContadorMensajes();
        miAadmin.decrementarContadorMensajes();
        miAadmin.modificarCorreoElectronico("nuevomailadmin@ufv.es");
        System.out.println(miAadmin.getNumeroMensajes());
        miAadmin.enviarMensajeALaPapelera();
        miAadmin.cambiarNombreDeUsuario("SuperAdmin");
        System.out.println("El nuevo correo es "+ miAadmin.getCorreoElectronico() + ".");
        System.out.println("El nuevo nombre del admin es "+ miAadmin.getNickName() + ".");
    }
}
