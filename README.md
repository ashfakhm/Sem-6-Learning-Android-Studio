<div align="center">

# Android Development Lab Programs

### BSc Computer Science • Semester 6 • Farook College

[![Android](https://img.shields.io/badge/Platform-Android-green.svg?style=flat-square&logo=android)](https://developer.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg?style=flat-square&logo=java)](https://www.java.com/)
[![Gradle](https://img.shields.io/badge/Build-Gradle-blue.svg?style=flat-square&logo=gradle)](https://gradle.org/)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green.svg?style=flat-square&logo=android-studio)](https://developer.android.com/studio)

_A curated collection of 10 hands-on Android applications exploring core framework components and UI patterns_

**Lab Partner:** [@MNK-21](https://github.com/MNK-21/)

</div>

---

## 📖 Overview

This repository documents my journey through Android application development during the 6th semester Android Java Development Lab at Farook College. Each program is a self-contained Android Studio project designed to demonstrate specific framework capabilities, from basic UI components to complex user interaction patterns.

These programs represent both practical lab exercises and theoretical coursework, providing a comprehensive foundation in native Android development using Java.

---

## 🎯 Program Index

<table>
<tr>
<td width="50%">

**Foundation & UI Components**

1. [Toast Notifications](#1-toast-notifications)
2. [Addition of Two Numbers](#2-addition-of-two-numbers)
3. [Activity Navigation](#3-activity-navigation)
4. [Copy TextView Content](#4-copy-textview-content)
5. [Static Background Color](#5-static-background-color)

</td>
<td width="50%">

**Visual & Input Controls**

6. [Static Background Image](#6-static-background-image)
7. [Date & Time Pickers](#7-date--time-pickers)
8. [CheckBox Controls](#8-checkbox-controls)
9. [RadioButton Groups](#9-radiobutton-groups)
10. [Passing Data Between Activities](#10-passing-data-between-activities)

</td>
</tr>
</table>

---

## 📱 Program Details

### 1. Toast Notifications

**Objective:** Implement lightweight, non-intrusive user feedback  
**Key Concepts:** `Toast` API, message duration, positioning  
**Use Case:** Displaying transient status messages without disrupting user flow

### 2. Addition of Two Numbers

**Objective:** Build a simple calculator for adding two numbers  
**Key Concepts:** Event handling, input validation, arithmetic operations  
**Components:** `EditText`, `Button`, `TextView`, number parsing, error handling

### 3. Activity Navigation

**Objective:** Master inter-activity communication  
**Key Concepts:** `Intent`, activity lifecycle, back stack management  
**Skills:** Activity transitions, navigation patterns, starting new activities

### 4. Copy TextView Content

**Objective:** Programmatic text manipulation between view components  
**Key Concepts:** View references, text getters/setters, `EditText` to `TextView` copying  
**Pattern:** Basic UI synchronization and text transfer

### 5. Static Background Color

**Objective:** Apply background colors using XML resources  
**Key Concepts:** `android:background` attribute, color resources (colors.xml)  
**Application:** Declaring UI styles via layout attributes

### 6. Static Background Image

**Objective:** Apply background images using Drawable resources  
**Key Concepts:** `android:background` attribute, drawable resources, `ImageView` vs Background  
**Technique:** declarative UI styling using XML assets

### 7. Date & Time Pickers

**Objective:** Inline date and time selection widgets  
**Key Concepts:** `DatePicker`, `TimePicker`, `OnDateChangedListener`, `OnTimeChangedListener`  
**Components:** Month/day/year selectors, hour/minute controls, event handling

### 8. CheckBox Controls

**Objective:** Multi-select input mechanism (Qualification Selector)  
**Key Concepts:** `CheckBox`, state management, conditional logic  
**Pattern:** Independent boolean selections, aggregating multiple user choices

### 9. RadioButton Groups

**Objective:** Mutually exclusive option selection (Gender Selector)  
**Key Concepts:** `RadioButton`, `RadioGroup`, `OnCheckedChangeListener`  
**Pattern:** Form inputs requiring exactly one choice

### 10. Passing Data Between Activities

**Objective:** Transfer data between different activities  
**Key Concepts:** `Intent` extras, `putExtra()`, `getIntent()`, data serialization  
**Skills:** Inter-activity communication, passing user input (e.g., name) to a second screen

---

## 🛠️ Technology Stack

| Component           | Technology                  |
| ------------------- | --------------------------- |
| **Language**        | Java                        |
| **Framework**       | Android SDK                 |
| **IDE**             | Android Studio (Kotlin DSL) |
| **Build System**    | Gradle 8.x                  |
| **Version Control** | Git                         |
| **UI Toolkit**      | Android Views & Widgets     |

---

## 🏗️ Architecture

Each project follows standard Android application structure:

```
ProjectName/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/projectname/
│   │   │   │   └── MainActivity.java
│   │   │   ├── res/
│   │   │   │   ├── layout/activity_main.xml
│   │   │   │   ├── values/strings.xml
│   │   │   │   ├── values/colors.xml
│   │   │   │   └── drawable/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
│   └── wrapper/
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

---

## 🚀 Quick Start

### Prerequisites

```
✓ Android Studio Hedgehog | 2023.1.1+
✓ JDK 11 or JDK 17
✓ Android SDK Platform 33+
✓ Gradle 8.0+
```

### Setup Instructions

```bash
# Clone the repository
git clone <repository-url>
cd Sem-6-Android_Studio_Programs

# Open individual project in Android Studio
# File → Open → Select project directory (e.g., "01-Implement Toast")

# Sync Gradle
# Android Studio will automatically trigger Gradle sync

# Run on emulator or physical device
# Click Run ▶️ or press Shift+F10
```

### Device Requirements

- **Minimum SDK:** API 21 (Android 5.0 Lollipop)
- **Target SDK:** API 33 (Android 13)
- **Recommended:** API 30+ for best compatibility

---

## 📚 Learning Outcomes

Upon completing these programs, you will have mastered:

#### Core Android Concepts

- Activity lifecycle and task management
- Intent-based navigation and data passing
- Resource management (layouts, strings, drawables)
- Event-driven programming model

#### UI/UX Development

- XML layout design and view hierarchy
- Material Design component implementation
- Responsive layouts and constraint systems
- User input handling and validation

#### Architecture Patterns

- Model-View-Controller (MVC) fundamentals
- Adapter pattern for data binding
- Observer pattern for state management
- Component lifecycle awareness

#### Best Practices

- Code organization and separation of concerns
- Null safety and defensive programming
- Resource optimization and memory management
- Debugging and testing strategies

---

## 📂 Project Organization

Projects are numbered sequentially following the lab syllabus. Each is fully independent with its own:

- Complete Android Studio project structure
- Self-contained resources and assets
- Dedicated `build.gradle.kts` configuration
- Standalone execution capability

**No dependencies exist between projects** — run any program individually without prerequisite setup.

---

## 🔍 Code Quality

All programs adhere to:

- ✅ Android development guidelines
- ✅ Java naming conventions (camelCase for methods, PascalCase for classes)
- ✅ Inline documentation and comments
- ✅ Logical code organization
- ✅ Error handling and edge case management

---

## 🤝 Collaboration

**Lab Partner:** [@MNK-21](https://github.com/MNK-21/)  
These programs were developed collaboratively as part of our academic lab coursework.

---

## 📄 Academic Context

**Institution:** Farook College  
**Program:** Bachelor of Science in Computer Science  
**Semester:** 6  
**Course:** Android Java Development Lab  
**Academic Year:** 2025-2026

This repository serves as both coursework submission and a portfolio of Android development fundamentals.

---

## 🙏 Acknowledgments

- Farook College Computer Science Department
- Android Developer Documentation Team
- Lab instructors and mentors
- [@MNK-21](https://github.com/MNK-21/) for collaborative development

---

## 📞 Support

For questions, discussions, or collaboration opportunities:

- 🐛 **Issues:** Use the GitHub issue tracker
- 💬 **Discussions:** Open a discussion thread
- 🔀 **Pull Requests:** Improvements and suggestions welcome

---

<div align="center">

**Built with ❤️ for learning Android development**

![Android](https://img.shields.io/badge/Made%20for-Android%20Developers-3DDC84?style=for-the-badge&logo=android&logoColor=white)

</div>
