package gradodam.guillermo;

public class Usuario implements Usuarios
{
    protected int numeroMensajes;
    protected String correoElectronico;
    protected String nickName;

    // Getters y setters

    private void setNumeroMensajes(int numMsg)
    {
        this.numeroMensajes = numMsg;
    }
    
    public int getNumeroMensajes()
    {
        return this.numeroMensajes;
    }

    public String getNickName()
    {
        return this.nickName;
    }
    
    public String getCorreoElectronico()
    {
        return this.correoElectronico;
    }

    private void setCorreoElectronico(String correoE)
    {
        this.correoElectronico = correoE;
    }

    @Override
    public void incrementarContadorMensajes() {
        int numMensajes;
        numMensajes = getNumeroMensajes();
        numMensajes++;
        setNumeroMensajes(numMensajes);
    }

    @Override
    public void decrementarContadorMensajes() {
        int numMensajes;
        numMensajes = getNumeroMensajes();
        
        if(numMensajes == 0){
            System.out.println("No se puede decrementar el número de mensajes: el num de mensajes es 0");
        } else {
            numMensajes--;
            setNumeroMensajes(numMensajes);
        }
        
    }

    @Override
    public void modificarCorreoElectronico(String nuevoCorreoElectronico) 
    {
        setCorreoElectronico(nuevoCorreoElectronico);
        System.out.println("Correo modificado con éxito");
    }


    // Método por defecto
    public Usuario()
    {
        this.correoElectronico = "";
        this.nickName = "";
        this.numeroMensajes = 0;
    }

    // Método sobrecargado para inicializar

    public Usuario(String _correoE, String _nickName)
    {
        this.correoElectronico = _correoE;
        this.nickName = _nickName;
        this.numeroMensajes = 0;
    }

}