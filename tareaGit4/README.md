# Tarea Git 4
## 1. Preparación de Código

1) Cada integrante debe crear un archivo `.java` en su propio repositorio.

![1](https://github.com/user-attachments/assets/837f2821-dd60-46c1-b34b-9e621301c675)

- Hacer público el repositorio.
- Compartir la URL del repositorio con el compañero.
- Aceptar la invitación mutua.

![2](https://github.com/user-attachments/assets/a9366b2f-8a42-42c8-846e-ff9784f98835)
![3](https://github.com/user-attachments/assets/9544ac55-221f-43c3-9b2b-7ab7cacb84a6)

## Fork, Clone y Modificaciones

1. Tu compañero forkea tu repositorio desde GitHub usando el botón **Fork**.
   
![4](https://github.com/user-attachments/assets/bbb05865-3053-45e3-b522-715d17153a38)
![5](https://github.com/user-attachments/assets/986dd91f-713d-419f-aa22-c2b3ac922f39)

2. Luego clona el fork a su máquina local usando:

![6](https://github.com/user-attachments/assets/e3d0c5d6-04e6-45f5-a395-de30e2c1a2f2)

Por ejemplo, si la URL es `https://github.com/tucompañero/turepo.git`, ejecuta `git clone https://github.com/tucompañero/turepo.git`.

![7](https://github.com/user-attachments/assets/045ae890-c0fd-40d0-a1a9-28f54b404401)
![8](https://github.com/user-attachments/assets/d9de2356-6336-4bab-8c6e-445cb846d66d)

*Verifica el Estado del Repositorio Clonado*

Si has clonado sin especificar el tag, entra al directorio clonado:

![9](https://github.com/user-attachments/assets/fe96031b-2316-44ee-b88f-5c17d70b00e9)

- Crea una nueva rama para tus cambios con `git checkout -b nombre-de-la-rama`, por ejemplo, `git checkout -b mi_modificacion`.

![10](https://github.com/user-attachments/assets/c2ac0763-62fb-45f2-a8db-248e4fe638a4)

- Realiza un cambio simple en el código Java, como añadir un comentario. Por ejemplo, en `calculadora.java`, podrías añadir `//Comentario añadido por mí`.

![11](https://github.com/user-attachments/assets/dafeae85-ed18-422f-96d5-299a27a3cd86)

- Añade los cambios con `git add .`, haz commit con `git commit -m "Añadiendo comentario al código"` y súbelos con `git push origin mi_modificacion`.

![12](https://github.com/user-attachments/assets/595ae3ba-6980-41d0-af2c-d29508181b6b)

![13](https://github.com/user-attachments/assets/2f08c90f-e42e-4a21-a04a-600411102c07)

- Ahora subiremos la rama al repositorio remoto.

![14](https://github.com/user-attachments/assets/a49e3d00-fb12-4c9f-a7fc-9c4d9e76797c)

## Nota: Error "Author identity unknown"
Si Git lanza el error indicando que no puede identificar al autor, configurar nombre y correo:

![15](https://github.com/user-attachments/assets/ca33e4bb-2c4b-46f1-b5de-7f4a31e7af7a)

`git config --global user.name "Tu Nombre"`
`git config --global user.email "tuemail@example.com"`

![16](https://github.com/user-attachments/assets/3670e1d2-c5ae-4b20-96dd-98e5c0c16efd)

## 2. Crear un Pull Request (Parte en Parejas)

Vamos a GitHub, al repositorio del compañero. Seleccionamos la rama mi_modificacion y creamos un pull request hacia la rama principal del repositorio del compañero (por ejemplo, main).

![17](https://github.com/user-attachments/assets/58341dc9-0975-46b5-814d-4c5773818b78)

**Configurar el Pull Request:**

**Título:** GitHub sugerirá un título basado en el mensaje de tu commit (por ejemplo, "Añadiendo comentario al código Java"). Puedes dejarlo o escribir algo más descriptivo, como "Añadido comentario en calculadora.java".

![18](https://github.com/user-attachments/assets/9364d611-e5c0-44e1-9452-f25c137c5fc5)

**Descripción:** Añade una descripción clara del cambio. Por ejemplo:

![19](https://github.com/user-attachments/assets/328bee0c-9039-4b1e-97b6-cf26d245d368)

Hacer clic en Create pull request para enviarlo. El compañero podrá revisarlo, aceptarlo o denegarlo.

![22](https://github.com/user-attachments/assets/58c66fc5-edfe-44a9-b702-d086b7506da5)

![20](https://github.com/user-attachments/assets/5a29076c-d9cf-4f43-a169-2aade5a12d1b)

![21](https://github.com/user-attachments/assets/f3454be2-8ced-4d2b-b130-f2a0ddd20182)

## Parte Individual

**1. Acceder a Tu Repositorio Local**

Nos aseguramos de estar en el directorio de tu propio repositorio local (no el fork o clon del repositorio de tu compañero).

![23](https://github.com/user-attachments/assets/ab3a6f0b-51fe-4b5e-bc63-6fe36b8f576f)

**2. Hacer un Commit Adicional**

Realizamos un cambio simple en tu repositorio, como modificar un archivo Java existente o añadir uno nuevo. Por ejemplo, si tienes un archivo calculadora.java, añade un comentario o una línea:

![24](https://github.com/user-attachments/assets/eebc658e-b3ab-452c-a96a-01fdea011339)

Añade los cambios al área de preparación

![25](https://github.com/user-attachments/assets/ef8bea3f-d157-444f-8039-7ed406e191c5)

Haz un commit con un mensaje descriptivo:

![26](https://github.com/user-attachments/assets/5861dea2-73ac-4c31-a36d-33d1cbfa114d)

Sube el commit al repositorio remoto:

![27](https://github.com/user-attachments/assets/97ab61bf-a0be-4763-adb0-a9d9b2443dff)

**3. Crear un Tag Anotado v1.0**

Crea un tag anotado (en lugar de un tag ligero) para la versión v1.0. Los tags anotados incluyen metadatos como el autor y un mensaje, lo cual es útil para versiones oficiales:

![28](https://github.com/user-attachments/assets/621ab117-afa4-467c-8485-0812019eac01)

- -a indica un tag anotado.
- -m "Versión 1.0" añade un mensaje descriptivo.

Verifica que se ha creado el tag:

![29](https://github.com/user-attachments/assets/e7501225-9c03-4546-98e7-57678d9c9a02)

Sube el tag al repositorio remoto:

![30](https://github.com/user-attachments/assets/a44d1536-a7cd-4d8c-bcfb-3495904b07ef)

**4. Clonar el Repositorio desde el Tag v1.0**

- El ejercicio pide clonar el repositorio desde el tag v1.0 usando un clonado superficial (--depth 1), lo que descarga solo el commit asociado al tag, ahorrando espacio y simulando un despliegue en producción.

Sal del directorio actual para clonar en una nueva ubicación:

![31](https://github.com/user-attachments/assets/0091db06-5ddd-4e66-9680-5d9a03606d0a)

Clona el repositorio desde el tag v1.0:

![32](https://github.com/user-attachments/assets/e39416b3-500d-4e7c-9cd9-dbab00bbec37)

- --branch v1.0: Especifica que quieres clonar el tag v1.0.
- --depth 1: Crea un clon superficial, descargando solo el commit del tag.
- https://github.com/<tu_usuario>/<tu_repositorio>.git: Reemplaza con la URL de tu repositorio (por ejemplo, https://github.com/MartCordero/mi_repositorio.git).
- v1.0_clone: Es el nombre del directorio donde se clonará (puedes cambiarlo, por ejemplo, produccion_v1.0).

Entra al directorio clonado:

![33](https://github.com/user-attachments/assets/a8b1bff3-59da-4dbc-a5e6-82dfd64eff4c)

Verifica el contenido:

![34](https://github.com/user-attachments/assets/0f23e9af-8014-439e-bfb5-07c1e363a050)

**5. Confirmar el Resultado**

Verifica que estás en el tag correcto:

![35](https://github.com/user-attachments/assets/1f14878c-f148-4a10-a2ed-a93e4c9f21e8)

O verifica el log (será breve debido a --depth 1):

![36](https://github.com/user-attachments/assets/5c1eaf95-e8c9-4c57-b7c3-7d3bd0b96eb3)

Se debería ver solo el commit etiquetado como v1.0.
