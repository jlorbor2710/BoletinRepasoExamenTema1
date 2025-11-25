Aquí tienes **el contenido adaptado y formateado en Markdown** para que puedas pegarlo directamente en un **README.md**.
He mantenido los emojis y la estructura, pero ahora está optimizado para GitHub.

---

# 📘 Boletín de Repaso – Optativa Android Studio (2º DAM)

Este documento recoge una serie de ejercicios diseñados para practicar conceptos clave de desarrollo Android: Activities, navegación, internacionalización, multimedia, persistencia con SharedPreferences, vistas, eventos y más.

---

## 🧩 Ejercicio 1 – App **“Mi asistente personal”**

**Repasa:** Activities, vistas, eventos, Toasts, SharedPreferences.

**Objetivo:** Crear un asistente que salude al usuario según su nombre y la hora del día.

**Requisitos:**

1. **Activity 1:** formulario con EditText + botón *“Guardar nombre”*.

   * Guarda el nombre en SharedPreferences.
   * Al guardar, abre la Activity 2.
2. **Activity 2:** muestra un saludo dinámico según hora (mañana/tarde/noche) usando el nombre guardado.
3. Botón **“Volver”** que regresa a la Activity inicial.

---

## 🌍 Ejercicio 2 – App **“Conversor viajero”**

**Repasa:** internacionalización, formatos regionales, Activities.

**Objetivo:** Practicar idiomas y formatos locales.

**Requisitos:**

1. EditText para introducir euros + botón *“Convertir”*.
2. Segunda Activity que muestre:

   * Cantidad convertida a dólares.
   * Formato monetario local (`NumberFormat`).
   * Fecha actual formateada.
3. Traducción completa al inglés.
4. Comprobación de adaptación automática a idioma del dispositivo.

---

## 🎧 Ejercicio 3 – App **“Centro de relajación”**

**Repasa:** audio, vídeo, persistencia, Activities.

**Objetivo:** Practicar reproducción multimedia.

**Requisitos:**

1. Activity de menú con: *Modo Sonido* y *Modo Vídeo*.
2. Activity 2:

   * Modo sonido → reproducción/pausa/stop con MediaPlayer
   * Modo vídeo → VideoView
3. Guardar en SharedPreferences el último modo usado.
4. Al abrir la app, mostrar Toast indicando el último modo relajante.

---

## 💬 Ejercicio 4 – App **“Traductor exprés”**

**Repasa:** intents, actividades, i18n, eventos.

**Objetivo:** Traducir palabras entre español e inglés.

**Requisitos:**

1. EditText + botón *“Traducir”*.
2. Segunda Activity con la traducción desde un diccionario Java.
3. Si no existe → Toast.
4. Interfaz traducida al inglés (strings.xml).

---

## 🎄 Ejercicio 5 – App **“Villancicos Interactivos”**

**Repasa:** imágenes, sonido, navegación, SharedPreferences.

**Objetivo:** App navideña con villancicos.

**Requisitos:**

1. Tres imágenes/botones (árbol, reno, campana).
2. Al pulsar:

   * Abrir segunda Activity con villancico correspondiente.
   * Mostrar Toast con el nombre.
3. Botón *“Guardar favorito”*.
4. Al iniciar la app, mostrar: “🎅 Tu villancico favorito es: X 🎶”.

---

## 🧮 Ejercicio 6 – App **“Calculadora Pro”**

**Repasa:** paso de datos, operaciones, SharedPreferences, i18n.

**Objetivo:** Crear una calculadora con dos Activities.

**Requisitos:**

1. **MainActivity**

   * Dos EditText (num1, num2).
   * Botones: ➕ ➖ ✖️ ➗
   * Enviar datos + operación a ResultadoActivity.
2. **ResultadoActivity**

   * Realiza la operación.
   * Muestra resultado.
   * Botón **Guardar resultado**.
   * Botón **Mostrar último resultado**.
   * Si no hay guardado → Toast.
3. Traducción al inglés.

---

## 💃 Ejercicio 7 – App **“Vive el Flamenco”**

**Repasa:** multimedia, layouts, i18n.

**Objetivo:** App para mostrar palos del flamenco.

**Requisitos:**

1. Tres botones con estilos flamencos (Sevillanas, Bulerías, Fandangos…).
2. Segunda Activity con:

   * Imagen del palo.
   * Audio propio del estilo.
   * Descripción en español e inglés.
3. Botón **Volver**.
4. Traducción al inglés.

---

## 🎨 Ejercicio 8 – App **“Personaliza tu tema”**

**Repasa:** interfaz dinámica, temas, SharedPreferences.

**Objetivo:** Elegir tema claro/oscuro y aplicarlo persistentemente.

**Requisitos:**

1. Switch o RadioGroup para tema claro/oscuro.
2. Botón *“Guardar tema”*.
3. Aplicar el tema guardado al iniciar la app.
4. Toast indicando el modo activado.

---

## 🗺️ Ejercicio 9 – App **“Guía Turística Interactiva”**

**Repasa:** Activities, multimedia, i18n.

**Objetivo:** Mostrar información turística de varias ciudades.

**Requisitos:**

1. Tres botones con ciudades (ej. Sevilla, Granada, Córdoba).
2. Activity con:

   * Imagen
   * Descripción
   * Audio explicativo
3. Traducción al inglés.
4. Botón *“Inicio”*.

---

## 🧠 Ejercicio 10 – App **“Quiz Interactivo”**

**Repasa:** navegación, manejo de datos, lógica.

**Objetivo:** Quiz de 3 preguntas con puntuación final.

**Requisitos:**

1. Pantalla inicial → *Comenzar Quiz*.
2. Una Activity por pregunta (3 total).
3. Cada respuesta envía si es correcta con `Intent.putExtra()`.
4. Activity final con la puntuación y botón *“Volver a jugar”*.
