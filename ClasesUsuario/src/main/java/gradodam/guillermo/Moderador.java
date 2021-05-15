package gradodam.guillermo;

public class Moderador extends Usuario
{
    protected int numDeMensajesEnviadosALaPapelera;

    public int getNumDeMensajesEnviadosALaPapelera()
    {
        return this.numDeMensajesEnviadosALaPapelera;
    }

    public void setNumDeMensajesEnviadosALaPapelera(int numMsgs)
    {
        this.numDeMensajesEnviadosALaPapelera = numMsgs;
    }

    public void enviarMensajeALaPapelera()
    {
        int msgBan = getNumDeMensajesEnviadosALaPapelera();
        msgBan++;
        setNumDeMensajesEnviadosALaPapelera(msgBan);
    }

    public Moderador()
    {
        super();
        this.correoElectronico = "";
        this.nickName = "";
        this.numeroMensajes = 0;
    }

    // Método sobrecargado para inicializar

    public Moderador(String _correoE, String _nickName)
    {
        super();
        this.correoElectronico = _correoE;
        this.nickName = _nickName;
        this.numeroMensajes = 0;
    }
    
}


