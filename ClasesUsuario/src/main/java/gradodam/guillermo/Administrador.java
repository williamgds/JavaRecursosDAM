package gradodam.guillermo;

public class Administrador extends Moderador
{
    protected int numDeUsuariosBaneados;

    public void setNumDeUsuariosBaneados(int usrBan)
    {
        this.numDeUsuariosBaneados = usrBan;
    }

    public int getNumDeUsuariosBaneados()
    {
        return this.numDeUsuariosBaneados;
    }

    private void setNickName(String nickN)
    {
        this.nickName = nickN;
    }

    public void aumentarContadorDeBaneos()
    {
        int numUsrBan = getNumDeMensajesEnviadosALaPapelera();
        numUsrBan++;
        setNumDeUsuariosBaneados(numUsrBan);
    }

    public void cambiarNombreDeUsuario(String nuevoNombreDeUsuario)
    {
        setNickName(nuevoNombreDeUsuario);
        System.out.println("El nombre de usuario del administrador ha sido modificado exitosamente");
    }

    public Administrador()
    {
        super();
        this.correoElectronico = "";
        this.nickName = "";
        this.numeroMensajes = 0;
    }

    // Método sobrecargado para inicializar

    public Administrador(String _correoE, String _nickName)
    {
        super();
        this.correoElectronico = _correoE;
        this.nickName = _nickName;
        this.numeroMensajes = 0;
    }
    
}


