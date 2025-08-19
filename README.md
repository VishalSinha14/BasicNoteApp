# Basic Note App

A simple desktop note-taking application built with Java Swing, featuring user authentication and basic note management capabilities.

![GitHub stars](https://img.shields.io/github/stars/VishalSinha14/BasicNoteApp?style=social) ![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)

## Table of Contents

*   [Key Features](#key-features)

*   [Architecture Overview](#architecture-overview)

*   [Tech Stack](#tech-stack)

*   [Getting Started](#getting-started)

    *   [Prerequisites](#prerequisites)

    *   [Installation](#installation)

*   [Configuration](#configuration)

*   [Usage](#usage)

*   [Project Structure](#project-structure)

*   [Roadmap](#roadmap)

*   [Contributing](#contributing)

*   [Testing](#testing)

*   [License](#license)

*   [Acknowledgements](#acknowledgements)

## Key Features

*   **User Authentication**: Secure login system using a MySQL database.

*   **Note Management**: Create, save, load, and delete notes from the local file system.

*   **Template Support**: Ability to save and load reusable note templates.

*   **Intuitive GUI**: Simple and easy-to-use graphical interface built with Java Swing.

## Architecture Overview

The Basic Note App is a standalone desktop application developed using Java Swing for its graphical user interface. It operates as a client-side application that connects to a MySQL database for user authentication via JDBC. The core application logic is divided into three main components: `Login.java` handles user authentication, `NotesApp.java` provides the main note-taking interface and manages file-based note operations, and `Conn.java` establishes and maintains the database connection.

Currently, notes are stored and retrieved directly from the local file system, not the database. The database is exclusively used for verifying user credentials during the login process.

## Tech Stack

| Area | Tool | Version |
|---|---|---|
|---|---|---|
| Language | Java | JDK 8+ |
| GUI Framework | Swing (AWT) | N/A (part of JDK) |
|---|---|---|
| Database | MySQL | 5.7+ |
| Database Connectivity | JDBC | N/A (part of JDK) |
|---|---|---|



## Getting Started

To get a local copy of the project up and running, follow these simple steps.

### Prerequisites

*   Java Development Kit (JDK) 8 or higher

*   MySQL Server installed and running

*   MySQL JDBC Driver (e.g., `mysql-connector-java-8.0
