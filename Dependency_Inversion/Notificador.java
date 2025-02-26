package Dependency_Inversion;

class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void notificar(String mensaje) {
        canal.enviarMensaje(mensaje);
    }
}
