package internal

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
