<br>
<div align="center">
  <img src="https://moodle.com/wp-content/uploads/2024/02/Moodlelogo.svg" alt="Moodle" width="300">
  <h1 align="center" style="padding-top: 20px;">
    Moodle | Protobuf Definitions
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
  <img alt="NestJS" src="https://img.shields.io/badge/nestjs-E0234E?style=for-the-badge&logo=nestjs&logoColor=white" />
</p>
 

Protobuf Definitions for Moodle, generated from the relevant OpenAPI spec from the [moodle-api-gen](https://www.github.com/joshuapare/moodle-api-gen) project.

## Usage

Below are some usage examples for Go and Ruby. For other languages, please refer to https://grpc.io/docs/quickstart/.

### Go
```
# assuming `protoc-gen-go` has been installed with `go get -u github.com/golang/protobuf/protoc-gen-go`
mkdir /var/tmp/go/moodle
protoc --go_out=/var/tmp/go/moodle services/*
protoc --go_out=/var/tmp/go/moodle models/*
```

### Ruby
```
# assuming `grpc_tools_ruby_protoc` has been installed via `gem install grpc-tools`
RUBY_OUTPUT_DIR="/var/tmp/ruby/moodle"
mkdir $RUBY_OUTPUT_DIR
grpc_tools_ruby_protoc --ruby_out=$RUBY_OUTPUT_DIR --grpc_out=$RUBY_OUTPUT_DIR/lib services/*
grpc_tools_ruby_protoc --ruby_out=$RUBY_OUTPUT_DIR --grpc_out=$RUBY_OUTPUT_DIR/lib models/*
```
