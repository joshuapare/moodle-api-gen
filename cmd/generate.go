/*
Copyright © 2024 Joshua Pare <joshuabpare@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package cmd

import (
	"github.com/joshuapare/moodle-api-gen/internal"
	"github.com/spf13/cobra"
)

var (
	definitionsPath string
	outputPath      string
	includeSpec     bool
	includeGo       bool
	includePython   bool
	includeJava     bool
	includeRuby     bool
	includePhp      bool
	includeJs       bool
	includeTs       bool
	includeNestJs   bool
)

// generateCmd represents the generate command
var generateCmd = &cobra.Command{
	Use:   "generate",
	Short: "Generate an OpenAPI spec and clients for a Moodle installation",
	Run: func(cmd *cobra.Command, args []string) {
		installation, err := internal.GetMoodleInstallation(installPath)
		if err != nil {
			panic(err)
		}

		opts := internal.OpenApiGeneratorOptions{
			MoodleInstallation: installation,
			WebservicesPath:    definitionsPath,
			OutputPath:         "openapi.yaml",
		}
		if outputPath != "" {
			opts.OutputPath = outputPath
		}
		if err := internal.RunGenerate(opts); err != nil {
			panic(err)
		}
	},
}

func init() {
	rootCmd.AddCommand(generateCmd)

	generateCmd.Flags().
		StringVarP(&definitionsPath, "definitions", "d", "", "Path to generated definitions file (default \"\")")
	generateCmd.Flags().
		StringVarP(&outputPath, "output", "o", "", "Path to write the OpenAPI spec (default \"openapi.yaml\")")
	generateCmd.Flags().BoolVar(&includeSpec, "spec", true, "Include OpenAPI spec (default true)")
	generateCmd.Flags().BoolVar(&includeGo, "go", false, "Include Go client (default false)")
	generateCmd.Flags().
		BoolVar(&includePython, "python", false, "Include Python client (default false)")
	generateCmd.Flags().BoolVar(&includeJava, "java", false, "Include Java client (default false)")
	generateCmd.Flags().BoolVar(&includeRuby, "ruby", false, "Include Ruby client (default false)")
	generateCmd.Flags().BoolVar(&includePhp, "php", false, "Include PHP client (default false)")
	generateCmd.Flags().
		BoolVar(&includeJs, "js", false, "Include JavaScript client (default false)")
	generateCmd.Flags().
		BoolVar(&includeTs, "ts", false, "Include TypeScript client (default false)")
	generateCmd.Flags().
		BoolVar(&includeNestJs, "nestjs", false, "Include NestJS client (default false)")
}
