# Interpreter-ST0250-2018-2

En este repositorio se encontrará el ejemplo de cómo se implementa el patrón de diseño interpreter para interpretar los números romanos y convertirlos a decimal.

Integrantes:
Kevyn Santiago Gomez Patiño
Kevin Arley Parra Henao
Agustín Nieto García


Lo que se desea es interpretar el lenguaje de los números romanos y pasarlos a una escala decimal, al ser un lenguaje con reglas simples podemos hacer uso del patrón de diseño interpreter que de una manera muy sencilla nos permite interpretar los números romanos. Es de recalcar que este patrón necesita que el lenguaje que se va a interpretar tenga reglas sencillas para que pueda ser implementado correctamente.

El lenguaje que se utilizó para la implementación fue Java.

Es un ejemplo muy sencillo donde tenemos la clase Context que tiene el input(la entrada en números romanos) y el output(el número en decimal), ya luego sabiendo el patrón de los números por ejemplo de 1 a 3 es el mismo signo I (ocupa 1 espacio por vez), el 4 es una combinación del 5 con el 1 (IV ocupan dos lugares), el 5 es V (ocupa 1 lugar) y el próximo signo que hace combinación es el 9 (IX) que utiliza un signo de una escala mayor. Luego de esto hacemos la implementaciones que queramos de la clase abstracta Expression. Para este ejemplo hicimos de 1,10,100 y 1000, que serian las clases OneExpression, TenExpression, HundredExpression y ThousandExpression respectivamente, luego de interpretar correctamente se puede aplicar como queramos.
