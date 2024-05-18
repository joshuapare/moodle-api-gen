package internal

import (
	"errors"
	"fmt"
	"os"
	"regexp"
	"strconv"
)

type MoodleInstallation struct {
	Path     string
	Release  string
	Branch   string
	Maturity string
	Version  float64
}

// OptionalString returns a pointer to a string if the input string is not empty
func OptionalString(s string) *string {
	if s == "" {
		return nil
	}
	return &s
}

// OptionalBool returns a pointer to a bool if the input bool is false
func OptionalBool(b bool) *bool {
	if !b {
		return nil
	}
	return &b
}

// PrettyPrintMoodleInstallation prints the details of the given Moodle installation
func PrettyPrintMoodleInstallation(installation *MoodleInstallation) {
	fmt.Printf("Found moodle installation at %s\n\n", installation.Path)
	fmt.Printf("Version: %.1f\n", installation.Version)
	fmt.Printf("Release: %s\n", installation.Release)
	fmt.Printf("Branch: %s\n", installation.Branch)
	fmt.Printf("Maturity: %s\n\n", installation.Maturity)
}

// GetMoodleInstallation returns details about the Moodle installation
// at the given path.
func GetMoodleInstallation(path string) (*MoodleInstallation, error) {
	content, err := os.ReadFile(path + "/version.php")
	if err != nil {
		return nil, err
	}

	versionRegex := regexp.MustCompile(`\$version\s*=\s*([\d\.]+);`)
	releaseRegex := regexp.MustCompile(`\$release\s*=\s*'([^']+)';`)
	branchRegex := regexp.MustCompile(`\$branch\s*=\s*'([^']+)';`)
	maturityRegex := regexp.MustCompile(`\$maturity\s*=\s*([A-Z_]+);`)

	versionMatch := versionRegex.FindSubmatch(content)
	releaseMatch := releaseRegex.FindSubmatch(content)
	branchMatch := branchRegex.FindSubmatch(content)
	maturityMatch := maturityRegex.FindSubmatch(content)

	if versionMatch == nil || releaseMatch == nil || branchMatch == nil || maturityMatch == nil {
		return nil, errors.New("failed to parse moodle installation information")
	}

	version, err := strconv.ParseFloat(string(versionMatch[1]), 64)
	if err != nil {
		return nil, err
	}

	return &MoodleInstallation{
		Path:     path,
		Version:  version,
		Release:  string(releaseMatch[1]),
		Branch:   string(branchMatch[1]),
		Maturity: string(maturityMatch[1]),
	}, nil
}
