package config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import model.Comentario;
import model.Receta;
import dao.ComentarioDAO;
import model.Usuario;

@Component
@Slf4j
public class KafkaConsumerConfig {

    @KafkaListener(topics = "${kafka.topic.name}")
  public void listener(@Payload String message) {
    log.debug("Message received {} ", message);

    ComentarioDAO nuevo = new ComentarioDAO();
    Usuario user= new Usuario();
    Receta receta=new Receta();
    Comentario comentario =new Comentario(1,message,user,receta);
    try {
      nuevo.agregarComentario(comentario);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
