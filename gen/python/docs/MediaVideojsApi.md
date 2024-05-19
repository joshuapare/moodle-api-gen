# openapi_client.MediaVideojsApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**media_videojs_get_language**](MediaVideojsApi.md#media_videojs_get_language) | **POST** /media_videojs_get_language | get language.


# **media_videojs_get_language**
> object media_videojs_get_language(media_videojs_get_language_request)

get language.

get language.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.media_videojs_get_language_request import MediaVideojsGetLanguageRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/rest/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/rest/server.php"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MediaVideojsApi(api_client)
    media_videojs_get_language_request = openapi_client.MediaVideojsGetLanguageRequest() # MediaVideojsGetLanguageRequest | 

    try:
        # get language.
        api_response = api_instance.media_videojs_get_language(media_videojs_get_language_request)
        print("The response of MediaVideojsApi->media_videojs_get_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaVideojsApi->media_videojs_get_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media_videojs_get_language_request** | [**MediaVideojsGetLanguageRequest**](MediaVideojsGetLanguageRequest.md)|  | 

### Return type

**object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | language pack json |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

