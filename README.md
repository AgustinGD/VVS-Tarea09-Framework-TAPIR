# VVS-Tarea09-Framework-TAPIR
Definiendo expresiones regulares con Framework TAPIR sobre un proyecto anterior de TdP

La expresion regular definida modela como es el ciclo de partidas en el juego.
Los archivos del Framework TAPIR se encuentra en el paquete **src.tapir**

# Expresion regular definida para el funcionamiento de la clase Juego
## c((m|d)\*(p|g)r)\*
### significado de cada simbolo
- c -> crear el juego
- m -> movimiento del jugador
- d -> disparo de un jugador o un infectado
- p -> perder el juego
- g -> ganar el juego
- r -> reiniciar el juego

Esta expresion representa perfectamente el ciclo infinito que se tiene durante el juego.

Primero se debe crear el juego,
luego uno puede moverse o disparar,
eventualmente se puede ganar o perder,
Finalmente se puede elegir reiniciar el juego y empezar un nuevo ciclo.

Por ejemplo, algunas situaciones que no corresponden a un funcionamiento normal serian:
- si uno pierde o gana no deberia poder moverse o disparar.
- No se puede reiniciar el juego si todavia no se gano ni perdio.

# Run
hacer run al siguiente archivo: **src.gui.ventana_principal.java**

# Versiones utilizadas
- Java: **jdk-11.0.6**
- Eclipse: **2020-06**

# Repositorio
https://github.com/AgustinGD/VVS-Tarea09-Framework-TAPIR.git
