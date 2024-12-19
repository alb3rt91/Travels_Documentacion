
# Travels - Android App

## Descripción

**Travels** es una aplicación Android que permite a los usuarios ver y seleccionar imágenes de una lista en un `RecyclerView` horizontal, y al hacer clic en una imagen, esta se muestra a pantalla completa en un `ImageSwitcher`. Esta aplicación fue desarrollada como parte de un proyecto de ejemplo utilizando Kotlin y el framework Android.

## Características

- **Visualización de imágenes**: Se muestran una lista de imágenes en un `RecyclerView` horizontal.
- **Interacción con el usuario**: El usuario puede hacer clic en las imágenes para verlas a pantalla completa utilizando un `ImageSwitcher`.
- **Diseño adaptable**: La interfaz se adapta a diferentes tamaños de pantalla y se centra en la usabilidad.

## Requisitos

Para ejecutar esta aplicación, necesitas:

- **Android Studio** con los siguientes requisitos:
  - **SDK de Android**: mínimo `SDK 24` (Android 7.0 Nougat).
  - **JDK**: Java 8 o superior.
- Conexión a Internet (para descargar dependencias de Gradle).

## Instalación

1. Clona el repositorio a tu máquina local:

   ```bash
   git clone https://github.com/tu-usuario/travels.git
   ```

2. Abre el proyecto en **Android Studio**.

3. Asegúrate de tener configurado el SDK de Android y el JDK.

4. Sincroniza el proyecto con los archivos de Gradle:

   En Android Studio, selecciona **File > Sync Project with Gradle Files**.

5. Conecta un dispositivo Android o utiliza el emulador.

6. Ejecuta el proyecto haciendo clic en el botón **Run** (o presionando `Shift + F10`).

## Uso

- **Pantalla principal**: Al abrir la aplicación, se muestra un `RecyclerView` con una lista de imágenes.
- **Selección de imágenes**: Haz clic en cualquier imagen del `RecyclerView` y esta se mostrará a pantalla completa en el `ImageSwitcher`.
- **Interfaz**: La aplicación está diseñada para ser fácil de usar con una interfaz sencilla y limpia.

## Guía de referencia

### `ImageAdapter`

Es el adaptador encargado de manejar y mostrar las imágenes en el `RecyclerView`.

- **Propiedades**:
  - `imageList`: Lista de identificadores de recursos de imágenes.
  - `onItemClick`: Función lambda que se ejecuta cuando el usuario hace clic en una imagen.
  
- **Métodos**:
  - `onCreateViewHolder`: Infla el diseño de cada elemento en el `RecyclerView`.
  - `onBindViewHolder`: Asocia las imágenes con sus vistas y configura el evento de clic.
  - `getItemCount`: Devuelve el número total de elementos en la lista.

### `MainActivity`

Es la actividad principal que contiene el `RecyclerView` y el `ImageSwitcher`.

- **Métodos**:
  - `onCreate`: Inicializa el `RecyclerView`, `ImageSwitcher` y configura la lista de imágenes.
  
- **Interacción**:
  - Cuando un usuario hace clic en una imagen, se actualiza el `ImageSwitcher` con la imagen seleccionada.

## Manual de usuario

La aplicación **Travels** es sencilla de usar:

1. Al abrir la aplicación, verás un `RecyclerView` que contiene una lista de imágenes.
2. Puedes deslizar horizontalmente para navegar por las imágenes.
3. Al hacer clic en una imagen, esta se mostrará en la parte superior de la pantalla en pantalla completa.

## Guía de instalación, configuración y administración

### Instalación

1. **Clonación del repositorio**: Clona el proyecto usando Git o descarga el archivo ZIP desde GitHub.
2. **Configuración de Android Studio**: Asegúrate de tener Android Studio instalado y actualizado.
3. **Dependencias**: Android Studio descargará todas las dependencias necesarias al sincronizar el proyecto.
4. **Ejecución**: Conecta tu dispositivo Android o utiliza un emulador, y ejecuta la aplicación desde Android Studio.

### Configuración

- Puedes agregar más imágenes a la lista en el archivo `MainActivity` modificando la lista `imageList` con los nuevos identificadores de recursos de imágenes en la carpeta `res/drawable`.
- Si deseas cambiar el diseño de la interfaz, puedes modificar los archivos XML correspondientes en la carpeta `res/layout`.

### Administración

- La aplicación no requiere configuración especial para su administración, ya que su funcionalidad se centra en mostrar imágenes.
- Para realizar cambios en el comportamiento de la aplicación, puedes editar el código en `MainActivity` o en el `ImageAdapter`.

## Tutorial

### Cómo agregar nuevas imágenes a la lista

1. Coloca las imágenes que deseas agregar en la carpeta `res/drawable` de tu proyecto.
2. Abre `MainActivity.kt` y agrega los identificadores de recursos de las nuevas imágenes en la lista `imageList`:
   
   ```kotlin
   val imageList = listOf(
       R.drawable.image1,
       R.drawable.image2,
       R.drawable.image3,
       // Agrega tus nuevas imágenes aquí
   )
   ```

3. Sincroniza y ejecuta la aplicación. Las nuevas imágenes aparecerán en el `RecyclerView`.

## Contribuciones

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una rama nueva (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz un commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Crea un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## Contacto

Para más información, puedes contactar al autor del proyecto en [tu-email@dominio.com].
