package gradodam.guillermo;

interface Usuarios
{
    // Dado que todos los usuarios tienen en común estos tres métodos, he creído mejor que utilizasen
    // una interfaz para definirlos en vez de heredarlos, ya que así podemos lograr una mayor abstracción.
    void incrementarContadorMensajes();
    void decrementarContadorMensajes();
    void modificarCorreoElectronico(String nuevoCorreoElectronico);
}