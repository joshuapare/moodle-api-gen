/*
Moodle Webservice API

Testing TinyAutosaveAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package moodleclient

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func Test_moodleclient_TinyAutosaveAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test TinyAutosaveAPIService TinyAutosaveResetSession", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TinyAutosaveAPI.TinyAutosaveResetSession(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TinyAutosaveAPIService TinyAutosaveResumeSession", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TinyAutosaveAPI.TinyAutosaveResumeSession(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test TinyAutosaveAPIService TinyAutosaveUpdateSession", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.TinyAutosaveAPI.TinyAutosaveUpdateSession(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
