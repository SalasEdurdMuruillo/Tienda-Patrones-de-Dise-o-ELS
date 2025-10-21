# 🏪 Proyecto: Sistema de Administración de Tienda

## 📋 Descripción

Este proyecto corresponde al curso **Programación II (ITI-321)** de la carrera de Ingeniería en Tecnologías de Información de la **Universidad Técnica Nacional (UTN)**.

El sistema implementa una **aplicación de escritorio en Java** orientada a objetos para administrar una tienda que gestiona:
- 🗂️ **Categorías de productos**
- 📦 **Productos vinculados a sus categorías**
- 👤 **Clientes y sus métodos de pago**
- 🧾 **Facturas y sus ítems**
- 📢 **Notificaciones por diferentes canales** (correo, SMS, WhatsApp o pantalla)

El diseño sigue principios de **buenas prácticas**, **encapsulamiento**, **separación por capas** y aplicación progresiva de **patrones de diseño**.

---

## 🧠 Objetivos de aprendizaje

1. Aplicar conceptos de **Programación Orientada a Objetos (POO)** en Java.
2. Implementar **patrones de diseño y arquitectura** para mejorar mantenibilidad y extensibilidad.
3. Desarrollar software modular y escalable con separación entre lógica de negocio y persistencia.
4. Comprender la importancia del diseño limpio y la codificación segura.

---

## ⚙️ Estructura del proyecto
📦 src/
├── App.java # Clase principal
│
├── 🗂️ Catálogo
│ ├── Categoria.java
│ ├── Producto.java
│ ├── RepositorioCategorias.java
│ ├── RepositorioProductos.java
│ └── ServicioCatalogo.java
│
├── 👤 Clientes
│ ├── Cliente.java
│ ├── MetodoPago.java
│ ├── TipoMetodoPago.java
│ ├── RepositorioClientes.java
│ └── ServicioClientes.java
│
├── 🧾 Facturación
│ ├── Factura.java
│ ├── ItemFactura.java
│ ├── EstadoFactura.java
│ ├── RepositorioFacturas.java
│ └── ServicioFacturacion.java
│
├── 📢 Notificaciones
│ ├── CanalNotificacion.java
│ ├── EstadoNotificacion.java
│ ├── Notificacion.java
│ └── ServicioNotificaciones.java
│
└── README.md

## 🧩 Patrones de diseño aplicados
Builder:
Dónde se aplicó: ProductoBuilder en el módulo de Catálogo
Justificación: Facilita la creación de objetos Producto con múltiples atributos 
(código, nombre, precio, stock, categoría) de manera legible y segura, evitando constructores largos 
y errores por el orden de parámetros. Permite inicializar solo los atributos necesarios y se integra con el 
RepositorioProductos Singleton para mantener consistencia de datos.

Singleton:
Dónde se aplicó: RepositorioCategorias, RepositorioProductos, RepositorioClientes, RepositorioFacturas
Justificación: Garantiza que solo exista una instancia de cada repositorio, centralizando los datos en memoria
y asegurando que todos los módulos trabajen sobre la misma fuente, evitando duplicación o desincronización.

Prototype:
Dónde se aplicó: Clase Producto
Justificación: Permite duplicar productos existentes mediante clone(), facilitando crear variantes o 
reutilizar productos como plantilla sin usar constructores largos, mejorando la legibilidad y eficiencia.

State:
Dónde se aplicó: Notificacion y estados (PendienteState, EnviadaState, FallidaState)
Justificación: Cada estado encapsula su comportamiento, eliminando condicionales complejos. 
Facilita agregar o modificar estados sin alterar la clase principal y mejora la cohesión respetando los principios SRP y OCP.