# Tarea Git 5
## 1. Preparación de Código

- **Primero crearemos un archivo .java en GitHub:**

![1](https://github.com/user-attachments/assets/5d8a023c-4dac-4ff8-82d5-f7ed4687cce2)

## Crear el Primer Issue (Línea de Código)**

Ve a la pestaña Issues en el repositorio. Haz clic en New issue.

![2](https://github.com/user-attachments/assets/e9b1108f-2e19-4c40-a96d-3bcb9fd58e41)

- **Configura el issue:**

![3](https://github.com/user-attachments/assets/1d43b69e-6328-4110-a620-990f845aceda)

- **Título:** Por ejemplo, "Error en la salida de HolaMundo.java".
- **Descripción:** Referencia una línea específica, por ejemplo, "En la línea 3 de HolaMundo.java, debería imprimir 'Hola, GitHub!' en lugar de 'Hola, Mundo!'".

![4](https://github.com/user-attachments/assets/9eb40d19-9e87-4a9f-a18c-dd7575f6916a)

**Envía el issue. Anota su número (por ejemplo, #1).**

![5](https://github.com/user-attachments/assets/fadc66c0-a21b-45c6-a2d3-49d84bf41734)

## Crear el Segundo Issue (Documentación)

- **Crea otro issue:**

- **Título:** Por ejemplo, "Añadir documentación a HolaMundo.java".
- **Descripción:** "Por favor, añade comentarios Javadoc a la clase HolaMundo y al método main."

![6](https://github.com/user-attachments/assets/e69a2cea-f893-4675-821e-522f3f708c18)

**Envía el issue. Anota su número (por ejemplo, #2).**

![7](https://github.com/user-attachments/assets/2e66db96-48af-4d9b-aeac-7bd724bc55b6)

## Paso 3: Resolver y Cerrar los Issues

- **Ahora nos toca a nosotros (FACUNDO) resolver desde la línea de comandos usando mensajes de commit.**
- **Verificar los Issues**

Vamos a la pestaña Issues en GitHub para confirmar los números de los issues (por ejemplo, #1 para el bug y #2 para la documentación).
No hay que olvidarse de que tenemos que revisar las descripciones para entender qué cambios necesitas hacer.

![8](https://github.com/user-attachments/assets/817f135a-26ca-44cf-a880-737336ae0e40)

**Resolver el Primer Issue (Línea de Código)**

Supongamos que el issue #1 pide cambiar la salida de HolaMundo.java. Editamos el archivo o bien por code utilizando una IDE o Notepad, o bien por Github:

![9](https://github.com/user-attachments/assets/a567b00a-d6fe-493d-ac14-f6505d563b1a)

ó

![10](https://github.com/user-attachments/assets/2a0cf499-ec0f-45ef-af9a-0ce832344edd)

Modificamos y hacemos commit, incluyendo la palabra clave (#1)para cerrar el issue: 

![11](https://github.com/user-attachments/assets/88e1b0ca-8a3d-476f-83c3-4e8250b1d7f7)

![12](https://github.com/user-attachments/assets/46551fad-6ce2-4da4-9fa4-03bb681b6791)

**Resolver el Segundo Issue (Documentación)**

Añade comentarios Javadoc a HolaMundo.java:

![13](https://github.com/user-attachments/assets/79e66823-31ad-4b15-b00f-29a02da4e90a)

Añade y haz commit:

![14](https://github.com/user-attachments/assets/ba5ef31f-79ac-4e71-b335-a37e9da7ce8d)

**(No nos podemos olvidar de la palabra clave #2 al hacer commit)**

![15](https://github.com/user-attachments/assets/c0d4fc98-8ade-4473-8afb-90498d62142d)

**Subir los Commits**

- GitHub cerrará automáticamente los issues #1 y #2 al detectar las palabras clave (Closes #1, Resolves #2) en los mensajes de commit, siempre que los commits estén en la rama predeterminada (main).

**Verificar que los Issues Están Cerrados**

Regresa a la pestaña Issues en GitHub.

![16](https://github.com/user-attachments/assets/36384ae6-9831-4127-ba71-e22ea41281b8)

Confirma que los issues #1 y #2 están cerrados. Cada issue debería tener un comentario automático indicando que fue cerrado por un commit.

![17](https://github.com/user-attachments/assets/7615491a-fa69-4f9c-9d7f-d5790c919671)

![18](https://github.com/user-attachments/assets/e4e304f9-e638-4a42-adbf-6996b8bb6bb0)
