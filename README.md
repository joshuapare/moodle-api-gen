<br>

<h3 align="center">Moodle API Client</h3>

<br>

<p align="center">
  <img alt="GitHub License" src="https://img.shields.io/github/license/joshuapare/moodle-api-gen">
  <img src="https://img.shields.io/badge/Go-00ADD8?style=for-the-badge&logo=go&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E" />
  <img src="https://img.shields.io/badge/Kotlin-B125EA?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/nestjs-E0234E?style=for-the-badge&logo=nestjs&logoColor=white" />
  <img src="https://img.shields.io/badge/Node--Red-8F0000?style=for-the-badge&logo=nodered&logoColor=white" />
</p>
 
<br>

<p align="center">
  <img src="https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white" />
  <img src="https://img.shields.io/badge/Python-FFD43B?style=for-the-badge&logo=python&logoColor=blue" />
  <img src="https://img.shields.io/badge/Rust-FFF?style=for-the-badge&logo=rust&logoColor=black" />
  <img src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white" />
</p>

Autogenerated clients and documentation for the Moodle Webservice API in multiple languages, as well as OpenAPI specs for each version. This project aims to provide a consistent and up-to-date interface for interacting with Moodle's web services by parsing the webservices documentation output into OpenAPI specs and generating clients from them.

The following clients are available:
- [Go](https://pkg.go.dev/github.com/joshuapare/moodle-client-go)
- [PHP](https://packagist.org/packages/joshuapare/moodle-client-php)
- [NestJS](https://www.npmjs.com/package/joshuapare/moodle-client-nestjs)
- [TypeScript (Fetch)](https://www.npmjs.com/package/joshuapare/moodle-client-ts)
- [Python](https://pypi.org/project/moodle-client-python)
- [Java](https://search.maven.org/artifact/com.joshuapare/moodle-client-java)
- [Rust](https://crates.io/crates/moodle-client-rust)
- [C#](https://www.nuget.org/packages/MoodleClientCsharp)

The following documentation is available:
- [Swagger](https://github.com/joshuapare/moodle-api-gen/tree/main/gen/swagger)

The following definitions are available:
- [Protocol Buffers](https://github.com/joshuapare/moodle-api-gen/tree/main/gen/proto)

In addition to the clients, OpenAPI specs are available for each version of the Moodle API, which can be used to generate clients in other languages or to create custom clients (instructions coming soon).

Due to the nature of the native webservice rest protocol, this requires the [Moodle Webservice API](https://docs.moodle.org/dev/Web_service_API) to be enabled on your Moodle site, as well as the [Catalyst RESTful Webservice Plugin](https://github.com/catalyst/moodle-webservice_restful) installed.

## Features

- **Multi-language support**: Clients available for Go, PHP, NestJS, TypeScript, Python, Java, Rust, C#, and more.
- **Generated from OpenAPI specs**: Ensures consistency and up-to-date interfaces with Moodle's API.
- **Versioned for Moodle releases**: Tagged to match the Moodle version they support.
- **CLI tool**: Generate OpenAPI specs (and clients, coming soon) from your own Moodle site.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Creating Moodle Webservice API Tokens](#creating-moodle-webservice-api-tokens)
- [Contributing](#contributing)
- [License](#license)

## Installation

### CLI
```bash
go install github.com/joshuapare/moodle-api-gen@latest
```

### Go

```bash
go get github.com/joshuapare/moodle-client-go
```

### PHP

```bash
composer require joshuapare/moodle-client-php
```

### TypeScript (NestJS)

```bash
npm install joshuapare/moodle-client-nestjs
```

### TypeScript (Fetch)

```bash
npm install joshuapare/moodle-client-ts
```

### Python

```bash
pip install moodle-client-python
```

### Java

```xml
<dependency>
  <groupId>com.joshuapare</groupId>
  <artifactId>moodle-client-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

### Rust

```toml
[dependencies]
moodle-client-rust = "0.1.0"
```

### C#

```csharp
Install-Package MoodleClientCsharp -Version 0.1.0
```

## CLI Usage

See the [CLI documentation](docs/cli/moodle-api-gen.md) for more information on how to use the CLI tool.

## Client Usage

```go
import "github.com/joshuapare/moodle-client-go/moodleclient"

// Example usage in Go
client := moodleclient.NewAPIClient(moodleclient.NewConfiguration())
auth := context.WithValue(context.Background(), moodleclient.ContextAPIKey, moodleclient.APIKey{
    Key: "YOUR_API_KEY",
})
courses, _, err := client.CourseApi.CoreCourseGetCourses(auth, []int32{})
if err != nil {
    log.Fatal(err)
}
fmt.Println(courses)
```

Refer to the [documentation](docs) for examples in other languages.

## Creating Moodle Webservice API Tokens

1. Log in to your Moodle site as an admin.
2. Navigate to `Site administration` > `Plugins` > `Web services` > `Manage tokens`.
3. Click `Add` and select a user.
4. Choose the service for which you want to create a token.
5. Click `Save changes` and copy the generated token.

Use this token in your API client to authenticate requests.

## Contributing

We welcome contributions from the community! Here are some ways you can help:

- Report bugs and suggest features.
- Submit pull requests to improve the client.
- Update documentation and examples.

Please read our [contributing guidelines](CONTRIBUTING.md) before you start.

## License

This project is licensed under the GNU General Public License v3.0. See the [LICENSE](LICENSE) file for more details.

---

Thank you for using the Moodle API Client! If you have any questions or need support, feel free to open an issue or contact the maintainers. Let's build something great together!
