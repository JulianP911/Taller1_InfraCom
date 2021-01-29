# Creacion de threads en Python utilizando clases

import logging
import threading
import time
import random

# Logger Config
format = "%(asctime)s: %(message)s"
logging.basicConfig(format=format, level=logging.INFO, datefmt="%H:%M:%S")

# Clase
class Exmple_Thread(threading.Thread):
    #Constructor
    def __init__(self, id_thread: int, delay_time: float, msg:str):
        super().__init__()
        self.id_thread = id_thread
        self.delay_time = delay_time
        self.msg = msg

    # Metodo
    def message(self):
        time.sleep(self.delay_time)
        print(f"ID Thread: {self.id_thread} - Message: {self.msg}")

    # Run()
    def run(self):
        self.message()

threads = []
delay_time = random.uniform(2.5, 4.5)
print(f"Estimado usuario por favor esper {delay_time} segundos")
thread = Exmple_Thread(id_thread = 0, delay_time = delay_time, msg = "Un saludo con un poco de espera")
thread.start()