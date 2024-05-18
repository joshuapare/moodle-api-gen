.PHONY: gen

prepare:
	pnpm install @openapitools/openapi-generator-cli -g

gen:
	go run .
	JAVA_HOME=/Library/Java/JavaVirtualMachines/openjdk.jdk/Contents/Home \
		_JAVA_OPTIONS=-DmaxYamlCodePoints=99999999 \
		openapi-generator-cli generate
