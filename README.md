# 🎓 Sistema de Gestión de Estudiantes y Vehículos

## 📚 Descripción
Este proyecto contiene dos sistemas: un sistema de gestión de estudiantes y un sistema de gestión de vehículos. El sistema de estudiantes maneja calificaciones y promedios, mientras que el sistema de vehículos implementa una jerarquía de clases para diferentes tipos de vehículos.

### ✨ Características
- 👤 Creación de estudiantes con nombre y edad
- 📊 Cálculo de promedios de notas
- ✅ Verificación automática de aprobación (nota mínima: 3.0)
- 📝 Visualización de información del estudiante
- 🚗 Sistema de vehículos con herencia
- 🔄 Comparación de vehículos mediante equals()

## 🛠️ Estructura del Proyecto
- `src/`: Código fuente
  - `Student.java`: Clase que maneja la lógica del estudiante
  - `App.java`: Clase principal con ejemplos de uso
  - `Class_02/`: Sistema de vehículos
    - `vehicle.java`: Clase base para vehículos
    - `car.java`: Clase específica para automóviles
    - `motorcycle.java`: Clase específica para motocicletas
    - `App.java`: Ejemplos de uso del sistema de vehículos

## 🚀 Ejemplos de Uso

### Sistema de Estudiantes
```java
Student estudiante = new Student("Juan", 20);
estudiante.calculatePromedio(new double[]{5.0, 4.0, 3.0, 5.0, 1.0});
```

### Sistema de Vehículos
```java
vehicle vehicleOne = new vehicle("Honda", "CBR", 200);
motorcycle motorcycleOne = new motorcycle("Honda", "CBR", 200, true);
System.out.println(vehicleOne.equals(motorcycleOne)); // Compara vehículos
```

## 📋 Requisitos
- Java Development Kit (JDK)
- IDE compatible con Java (como Visual Studio Code)

## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si tienes alguna sugerencia o mejora, no dudes en proponerla.
