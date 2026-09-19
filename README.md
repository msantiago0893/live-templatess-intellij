# IntelliJ IDEA — Live Templates

Repositorio personal para respaldar y versionar mis **Live Templates de IntelliJ IDEA**.

Los templates se almacenan como archivos `.xml` dentro del directorio de configuración de IntelliJ IDEA.

## Estructura

```text
intellij-live-templates/
│
├── README.md
│
└── templates/
    ├── Java.xml
    ├── Spring.xml
    └── ...
```

---

## 1. Ubicación de los Live Templates

En Windows, IntelliJ IDEA almacena los Live Templates en:

```text
%APPDATA%\JetBrains\IntelliJIdea<version>\templates\
```

Ejemplo:

```text
%APPDATA%\JetBrains\IntelliJIdea2026.2\templates\
```

La ubicación exacta depende de la versión instalada de IntelliJ IDEA.

Los archivos `.xml` representan los grupos de Live Templates.

Por ejemplo:

```text
templates/
├── Java.xml
├── Spring.xml
└── MyTemplates.xml
```

---

# 2. Respaldar los Live Templates en Git

## Paso 1 — Abrir la carpeta de templates

En Windows puedes abrir directamente:

```text
%APPDATA%\JetBrains\IntelliJIdea<version>\templates\
```

También puedes pegar esta ruta en la barra de direcciones del Explorador de Windows.

---

## Paso 2 — Copiar los archivos XML

Copia los archivos `.xml` que quieras respaldar.

Por ejemplo:

```text
Java.xml
Spring.xml
MyTemplates.xml
```

y colócalos dentro de:

```text
templates/
```

del repositorio.

Resultado:

```text
intellij-live-templates/
│
├── README.md
│
└── templates/
    ├── Java.xml
    ├── Spring.xml
    └── MyTemplates.xml
```

---

## Paso 3 — Guardar los cambios en Git

Desde la raíz del repositorio:

```bash
git add templates/
git commit -m "Update IntelliJ live templates"
git push
```

Cada vez que agregues o modifiques un template:

```bash
git add templates/
git commit -m "Update live templates"
git push
```

---

# 3. Recuperar los Live Templates en otra computadora

## Paso 1 — Clonar el repositorio

En la nueva computadora:

```bash
git clone <REPOSITORY_URL>
```

Ejemplo:

```bash
git clone https://github.com/<usuario>/intellij-live-templates.git
```

---

## Paso 2 — Localizar la carpeta de IntelliJ

Abre:

```text
%APPDATA%\JetBrains\
```

Busca la carpeta correspondiente a tu versión de IntelliJ IDEA.

Por ejemplo:

```text
%APPDATA%\JetBrains\IntelliJIdea2026.2\
```

Dentro debe existir:

```text
templates\
```

Si no existe, créala:

```text
%APPDATA%\JetBrains\IntelliJIdea2026.2\templates\
```

---

## Paso 3 — Copiar los XML

Desde el repositorio:

```text
intellij-live-templates\templates\
```

copia los archivos `.xml`.

Pégalos en:

```text
%APPDATA%\JetBrains\IntelliJIdea<version>\templates\
```

Por ejemplo:

```text
%APPDATA%\JetBrains\IntelliJIdea2026.2\templates\
```

La estructura final debería quedar así:

```text
%APPDATA%\JetBrains\IntelliJIdea2026.2\templates\
│
├── Java.xml
├── Spring.xml
└── MyTemplates.xml
```

---

# 4. Reiniciar IntelliJ IDEA

Después de copiar los XML:

1. Cierra IntelliJ IDEA.
2. Vuelve a abrir IntelliJ IDEA.
3. Ve a:

```text
Settings
→ Editor
→ Live Templates
```

Los grupos y templates deberían aparecer allí.

JetBrains documenta precisamente este método para compartir los archivos XML de los grupos de Live Templates entre instalaciones de IntelliJ IDEA.

---

# 5. Verificar los templates

En:

```text
Settings
→ Editor
→ Live Templates
```

verifica que aparezcan tus grupos.

Por ejemplo:

```text
Java
 ├── record
 ├── test
 ├── givenwhen
 ├── mock
 └── verify

Spring
 ├── entity
 ├── service
 ├── repository
 ├── restcontroller
 ├── get
 ├── post
 ├── put
 ├── delete
 └── h2
```

También puedes probar directamente una abreviatura en el editor.

Por ejemplo:

```text
entity + Tab
```

o:

```text
restcontroller + Tab
```

---

# 6. Actualizar los templates desde Git

Si ya tienes el repositorio configurado en otra computadora:

```bash
git pull
```

Después copia los XML actualizados desde:

```text
intellij-live-templates\templates\
```

hacia:

```text
%APPDATA%\JetBrains\IntelliJIdea<version>\templates\
```

Finalmente reinicia IntelliJ IDEA.

---

# 7. Importación mediante Settings

También existe una alternativa oficial para importar/exportar los Live Templates mediante un archivo de configuración.

### Exportar

En IntelliJ:

```text
File
→ Manage IDE Settings
→ Export Settings
```

Selecciona:

```text
Live templates (schemes)
```

y guarda el archivo generado.

### Importar

En la nueva instalación:

```text
File
→ Manage IDE Settings
→ Import Settings
```

Selecciona el archivo exportado y marca:

```text
Live templates
```

Después de reiniciar IntelliJ IDEA, los templates estarán disponibles.

---

# 8. Recomendación

Para este repositorio se recomienda versionar directamente los archivos:

```text
templates/*.xml
```

porque permite:

* Mantener historial de cambios.
* Comparar modificaciones mediante Git.
* Recuperar una versión anterior.
* Tener los templates disponibles en varias computadoras.
* Mantener separados los Live Templates del resto de la configuración de IntelliJ.

No es necesario versionar todo el directorio de configuración de IntelliJ IDEA.

---

## Flujo recomendado

```text
                 GitHub
                    │
                    │ git clone / git pull
                    ▼
          intellij-live-templates
                    │
                    ▼
                templates/
                    │
              ┌─────┴─────┐
              ▼           ▼
           Java.xml    Spring.xml
              │           │
              └─────┬─────┘
                    ▼
%APPDATA%\JetBrains\IntelliJIdea<version>\templates\
                    │
                    ▼
              IntelliJ IDEA
                    │
                    ▼
        Settings → Live Templates
```


