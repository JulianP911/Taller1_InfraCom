# Creacion de threads en Python utilizando referencias a objetos invocables

import logging
import threading
import time

# Logger Config
format = "%(asctime)s: %(message)s"
logging.basicConfig(format=format, level=logging.INFO, datefmt="%H:%M:%S")

# Funcion a ejecutar
def process(msg: str):
    logging.info(msg)
    time.sleep(3)

thread = threading.Thread(target=process, args=("Un saludo con un poco de espera",))
thread.start()