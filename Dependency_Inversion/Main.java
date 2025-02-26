package Dependency_Inversion;

public class Main {
    public static void main(String[] args) {
        CanalNotificacion sms = new SMS();
        CanalNotificacion whatsapp = new WhatsApp();

        Notificador notificadorSMS = new Notificador(sms);
        Notificador notificadorWhatsApp = new Notificador(whatsapp);

        notificadorSMS.notificar("Hola, como estas?");
        notificadorWhatsApp.notificar("Hola, como estas?");
    }
}
