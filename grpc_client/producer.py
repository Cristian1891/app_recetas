from kafka import KafkaProducer
from json import dumps
import time

producer = KafkaProducer(bootstrap_servers=['localhost:9092'],
                         value_serializer=lambda x: 
                         dumps(x).encode('utf-8'))

data = {'usuarioComentario, recetaComentada, comentario':"ok"}
producer.send('Comentarios', value=data)
time.sleep(1)
# producer.flush()