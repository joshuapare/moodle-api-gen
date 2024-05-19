<br>

<div align="center">
  <img src="https://moodle.com/wp-content/uploads/2024/02/Moodlelogo.svg" alt="Moodle" width="300">
  <h1 align="center" style="padding-top: 20px;">
    Moodle API Gen
  </h1>
</div>

<br>

<div align="center">
  <img alt="GitHub Release" src="https://img.shields.io/github/v/release/joshuapare/moodle-api-gen?include_prereleases&style=flat-square&color=f98012">
  <img alt="GitHub License" src="https://img.shields.io/github/license/joshuapare/moodle-api-gen?style=flat-square">
  <img alt="Built with Go" src="https://img.shields.io/badge/built_with-Go-007D9C.svg?style=flat-square">
</div>

<br>

<p align="center">
  <img alt="Go" src="https://img.shields.io/badge/Go-00ADD8?style=for-the-badge&logo=go&logoColor=white" />
  <img alt="C#" src="https://img.shields.io/badge/C%23-239120?style=for-the-badge&logo=csharp&logoColor=white" />
  <img alt="Javascript" src="https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E" />
  <img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-B125EA?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img alt="NestJS" src="https://img.shields.io/badge/nestjs-E0234E?style=for-the-badge&logo=nestjs&logoColor=white" />
  <img alt="Node.js" src="https://img.shields.io/badge/Node%20js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white" />
  <img alt="PHP" src="https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white" />
  <img alt="Python" src="https://img.shields.io/badge/Python-FFD43B?style=for-the-badge&logo=python&logoColor=blue" />
  <img alt="Rust" src="https://img.shields.io/badge/Rust-FFF?style=for-the-badge&logo=rust&logoColor=black" />
  <img alt="Typescript" src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white" />
</p>

<p align="center">
  <img alt="Swagger" src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=Swagger&logoColor=white" />
  <img alt="Static Badge" src="https://img.shields.io/badge/GRPC-42949a?style=for-the-badge&logo=grpc&logoColor=white">
</p>
 
<br>

<h2>What is `moodle-api-gen`?</h2>

`moodle-api-gen` is a project that aims to provide a consistent and up-to-date interface for interacting with Moodle's web services by parsing the webservices documentation output into OpenAPI specs, then using those specs to generate language-specific clients, documentation, and definitions.

## Core Components

- **OpenAPI specs**: Available for each version of the Moodle API.
- **Language Clients**: Clients available for Go, PHP, NestJS, TypeScript, Python, Kotlin, Rust, C#, and more.
- **CLI tool**: Generate OpenAPI specs (and soon, clients) from your own Moodle site.

## Features

- **Generated from installation**: Ensures consistency and up-to-date interfaces with Moodle's API.
- **Versioned for Moodle releases**: Tagged to match the Moodle version they support.

### Available Clients

| Client                  | Link                                                                                        | Latest Version       |
|-------------------------|---------------------------------------------------------------------------------------------|----------------------|
| Go                      | [Go](https://pkg.go.dev/github.com/joshuapare/moodle-client-go)                             | 4.3.4                |
| C#                      | [C#](https://www.nuget.org/packages/MoodleClient)                                           | 4.3.4 (Unreleased)   |
| JavaScript              | [JavaScript](https://www.npmjs.com/package/joshuapare/moodle-client-js)                     | 4.3.4 (Unreleased)   |
| Kotlin                  | [Kotlin](https://search.maven.org/artifact/com.joshuapare/moodle-client)                    | 4.3.4 (Unreleased)   |
| NestJS                  | [NestJS](https://www.npmjs.com/package/joshuapare/moodle-client-nestjs)                     | 4.3.4 (Unreleased)   |
| Node.js                 | [Node.js](https://www.npmjs.com/package/joshuapare/moodle-client-node)                      | 4.3.4 (Unreleased)   |
| PHP                     | [PHP](https://packagist.org/packages/joshuapare/moodle-client)                              | 4.3.4 (Unreleased)   |
| Python                  | [Python](https://pypi.org/project/moodle-client)                                            | 4.3.4 (Unreleased)   |
| Rust                    | [Rust](https://crates.io/crates/moodle-client)                                              | 4.3.4 (Unreleased)   |
| TypeScript (Fetch)      | [TypeScript (Fetch)](https://www.npmjs.com/package/joshuapare/moodle-client-ts)             | 4.3.4 (Unreleased)   |

### Available Documentation

| Documentation           | Link                                                                                        | Latest Version |
|-------------------------|---------------------------------------------------------------------------------------------|---------|
| Swagger                 | [Swagger](https://github.com/joshuapare/moodle-api-gen/tree/main/gen/swagger)               | 4.3.4   |

### Available Definitions

| Definition              | Link                                                                                        | Latest Version |
|-------------------------|---------------------------------------------------------------------------------------------|---------|
| Protocol Buffers        | [Protocol Buffers](https://github.com/joshuapare/moodle-api-gen/tree/main/gen/proto)        | 4.3.4   |

In addition to the clients, OpenAPI specs are available for each version of the Moodle API, which can be used to generate clients in other languages or to create custom clients (instructions coming soon).

Due to the nature of the native webservice rest protocol, this requires the [Moodle Webservice API](https://docs.moodle.org/dev/Web_service_API) to be enabled on your Moodle site, as well as the [Catalyst RESTful Webservice Plugin](https://github.com/catalyst/moodle-webservice_restful) installed.

> Note: This project is not affiliated with or endorsed by Moodle Pty Ltd.

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

#### Go Package (Recommended)

```bash
go install github.com/joshuapare/moodle-api-gen@latest
```

### Clients

<img alt="Go" src="https://img.shields.io/badge/Go-00ADD8?style=for-the-badge&logo=go&logoColor=white" />

```bash
go get github.com/joshuapare/moodle-client-go
```

<img alt="PHP" src="https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white" />

```bash
composer require joshuapare/moodle-client
```

<img alt="NestJS" src="https://img.shields.io/badge/nestjs-E0234E?style=for-the-badge&logo=nestjs&logoColor=white" />

```bash
npm install joshuapare/moodle-client-nestjs
```

<img alt="Node.js" src="https://img.shields.io/badge/Node%20js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white" />

```bash
npm install joshuapare/moodle-client-node
```

<img alt="Typescript" src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white" />

```bash
npm install joshuapare/moodle-client-ts
```

<img alt="Python" src="https://img.shields.io/badge/Python-FFD43B?style=for-the-badge&logo=python&logoColor=blue" />

```bash
pip install moodle-client
```

<img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-B125EA?style=for-the-badge&logo=kotlin&logoColor=white" />

```xml
<dependency>
  <groupId>com.joshuapare</groupId>
  <artifactId>moodle-client</artifactId>
  <version>4.3.4</version>
</dependency>
```

<img alt="Rust" src="https://img.shields.io/badge/Rust-FFF?style=for-the-badge&logo=rust&logoColor=black" />

```toml
[dependencies]
moodle-client = "4.3.4"
```

<img alt="C#" src="https://img.shields.io/badge/C%23-239120?style=for-the-badge&logo=csharp&logoColor=white" />

```csharp
Install-Package MoodleClient -Version 4.3.4
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
