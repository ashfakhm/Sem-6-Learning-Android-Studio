<div align="center">

# Android Development Lab Programs

### BSc Computer Science • Semester 6 • Farook College

[![Android](https://img.shields.io/badge/Platform-Android-green.svg?style=flat-square&logo=android)](https://developer.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg?style=flat-square&logo=java)](https://www.java.com/)
[![Gradle](https://img.shields.io/badge/Build-Gradle-blue.svg?style=flat-square&logo=gradle)](https://gradle.org/)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-green.svg?style=flat-square&logo=android-studio)](https://developer.android.com/studio)

_A curated collection of 20 hands-on Android applications exploring core framework components and UI patterns_

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
2. [Calculator Application](#2-calculator-application)
3. [TextView ↔ EditText Operations](#3-textview--edittext-operations)
4. [Activity Navigation](#4-activity-navigation)
5. [ImageView Implementation](#5-imageview-implementation)

**List & Selection Components** 6. [Spinner Widget](#6-spinner-widget) 7. [ListView](#7-listview) 8. [Custom Adapters](#8-custom-adapters) 9. [GridView Layout](#9-gridview-layout) 10. [Menu Systems](#10-menu-systems)

</td>
<td width="50%">

**Input & Selection Controls** 11. [CheckBox Controls](#11-checkbox-controls) 12. [RadioButton Groups](#12-radiobutton-groups) 13. [Date & Time Pickers](#13-date--time-pickers) 15. [Picker Dialogs](#15-picker-dialogs)

**Advanced Features** 14. [Alert Dialogs](#14-alert-dialogs) 16. [Chronometer Widget](#16-chronometer-widget) 17. [Dynamic Content Generation](#17-dynamic-content-generation) 18. [Dynamic Background Images](#18-dynamic-background-images) 19. [Dynamic Background Colors](#19-dynamic-background-colors) 20. [Login System](#20-login-system)

</td>
</tr>
</table>

---

## 📱 Program Details

### 1. Toast Notifications

**Objective:** Implement lightweight, non-intrusive user feedback  
**Key Concepts:** `Toast` API, message duration, positioning  
**Use Case:** Displaying transient status messages without disrupting user flow

### 2. Calculator Application

**Objective:** Build a functional arithmetic calculator  
**Key Concepts:** Event handling, state management, input validation  
**Components:** `Button`, `TextView`, mathematical operations, error handling

### 3. TextView ↔ EditText Operations

**Objective:** Programmatic text manipulation between view components  
**Key Concepts:** View references, text getters/setters, UI synchronization  
**Pattern:** Bidirectional data binding fundamentals

### 4. Activity Navigation

**Objective:** Master inter-activity communication  
**Key Concepts:** `Intent`, activity lifecycle, back stack management  
**Skills:** Activity transitions, data passing, navigation patterns

### 5. ImageView Implementation

**Objective:** Display and manipulate bitmap images  
**Key Concepts:** `ImageView`, drawable resources, scaling modes  
**Topics:** Image loading, memory management, aspect ratios

### 6. Spinner Widget

**Objective:** Create dropdown selection menus  
**Key Concepts:** `Spinner`, `ArrayAdapter`, selection listeners  
**Pattern:** User-driven single-choice selection from predefined options

### 7. ListView

**Objective:** Render scrollable vertical lists  
**Key Concepts:** `ListView`, view recycling, list item layouts  
**Performance:** Efficient rendering of large datasets

### 8. Custom Adapters

**Objective:** Bridge data sources to `AdapterView` components  
**Key Concepts:** `BaseAdapter`, view holder pattern, data binding  
**Architecture:** MVC pattern in Android UI layer

### 9. GridView Layout

**Objective:** Display items in multi-column grid format  
**Key Concepts:** `GridView`, column configuration, item spacing  
**Use Case:** Photo galleries, icon dashboards, tile-based navigation

### 10. Menu Systems

**Objective:** Implement application menus  
**Key Concepts:** Options menu, context menu, menu inflation  
**Resources:** XML menu definitions, menu item handling

### 11. CheckBox Controls

**Objective:** Multi-select input mechanism  
**Key Concepts:** `CheckBox`, state management, compound buttons  
**Pattern:** Independent boolean selections

### 12. RadioButton Groups

**Objective:** Mutually exclusive option selection  
**Key Concepts:** `RadioButton`, `RadioGroup`, single selection enforcement  
**Pattern:** Form inputs requiring exactly one choice

### 13. Date & Time Pickers

**Objective:** Inline date and time selection widgets  
**Key Concepts:** `DatePicker`, `TimePicker`, calendar integration  
**Components:** Month/day/year selectors, hour/minute controls

### 14. Alert Dialogs

**Objective:** Modal user prompts and confirmations  
**Key Concepts:** `AlertDialog`, positive/negative/neutral buttons  
**Use Case:** Critical decisions, confirmations, informational alerts

### 15. Picker Dialogs

**Objective:** Dialog-based date and time selection  
**Key Concepts:** `DatePickerDialog`, `TimePickerDialog`, callbacks  
**UX:** Space-efficient alternative to inline pickers

### 16. Chronometer Widget

**Objective:** Implement timer and stopwatch functionality  
**Key Concepts:** `Chronometer`, elapsed time tracking, start/stop controls  
**Features:** Real-time time display, format customization

### 17. Dynamic Content Generation

**Objective:** Programmatically generate multiplication tables  
**Key Concepts:** Dynamic view creation, loops, string formatting  
**Pattern:** Algorithm-driven UI generation

### 18. Dynamic Background Images

**Objective:** Runtime background image manipulation  
**Key Concepts:** `Drawable` resources, background setters, resource management  
**Technique:** Programmatic theme customization

### 19. Dynamic Background Colors

**Objective:** Programmatic color scheme modification  
**Key Concepts:** Color resources, `setBackgroundColor()`, hex/ARGB values  
**Application:** Theme switching, user preferences

### 20. Login System

**Objective:** Complete authentication interface  
**Key Concepts:** Input validation, credential handling, session management  
**Security:** Basic authentication patterns, input sanitization

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
# File → Open → Select project directory (e.g., "1-Implement Toast")

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
