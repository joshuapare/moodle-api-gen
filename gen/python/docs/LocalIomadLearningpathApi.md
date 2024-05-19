# openapi_client.LocalIomadLearningpathApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**local_iomad_learningpath_activate**](LocalIomadLearningpathApi.md#local_iomad_learningpath_activate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path
[**local_iomad_learningpath_addcourses**](LocalIomadLearningpathApi.md#local_iomad_learningpath_addcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path
[**local_iomad_learningpath_addusers**](LocalIomadLearningpathApi.md#local_iomad_learningpath_addusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path
[**local_iomad_learningpath_copypath**](LocalIomadLearningpathApi.md#local_iomad_learningpath_copypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path
[**local_iomad_learningpath_deletepath**](LocalIomadLearningpathApi.md#local_iomad_learningpath_deletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path
[**local_iomad_learningpath_getcourses**](LocalIomadLearningpathApi.md#local_iomad_learningpath_getcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning
[**local_iomad_learningpath_getprospectivecourses**](LocalIomadLearningpathApi.md#local_iomad_learningpath_getprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company
[**local_iomad_learningpath_getprospectiveusers**](LocalIomadLearningpathApi.md#local_iomad_learningpath_getprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company
[**local_iomad_learningpath_getusers**](LocalIomadLearningpathApi.md#local_iomad_learningpath_getusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path
[**local_iomad_learningpath_ordercourses**](LocalIomadLearningpathApi.md#local_iomad_learningpath_ordercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path
[**local_iomad_learningpath_removecourses**](LocalIomadLearningpathApi.md#local_iomad_learningpath_removecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path
[**local_iomad_learningpath_removeusers**](LocalIomadLearningpathApi.md#local_iomad_learningpath_removeusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path


# **local_iomad_learningpath_activate**
> object local_iomad_learningpath_activate(local_iomad_learningpath_activate_request)

Activates / deactivates learning path

Activates / deactivates learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_activate_request import LocalIomadLearningpathActivateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_activate_request = openapi_client.LocalIomadLearningpathActivateRequest() # LocalIomadLearningpathActivateRequest | 

    try:
        # Activates / deactivates learning path
        api_response = api_instance.local_iomad_learningpath_activate(local_iomad_learningpath_activate_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_activate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_activate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_activate_request** | [**LocalIomadLearningpathActivateRequest**](LocalIomadLearningpathActivateRequest.md)|  | 

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
**200** | True if active state set correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_addcourses**
> object local_iomad_learningpath_addcourses(local_iomad_learningpath_addcourses_request)

Add courses to learning path

Add courses to learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_addcourses_request import LocalIomadLearningpathAddcoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_addcourses_request = openapi_client.LocalIomadLearningpathAddcoursesRequest() # LocalIomadLearningpathAddcoursesRequest | 

    try:
        # Add courses to learning path
        api_response = api_instance.local_iomad_learningpath_addcourses(local_iomad_learningpath_addcourses_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_addcourses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_addcourses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_addcourses_request** | [**LocalIomadLearningpathAddcoursesRequest**](LocalIomadLearningpathAddcoursesRequest.md)|  | 

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
**200** | True if courses added correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_addusers**
> object local_iomad_learningpath_addusers(local_iomad_learningpath_addusers_request)

Add users to learning path

Add users to learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_addusers_request import LocalIomadLearningpathAddusersRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_addusers_request = openapi_client.LocalIomadLearningpathAddusersRequest() # LocalIomadLearningpathAddusersRequest | 

    try:
        # Add users to learning path
        api_response = api_instance.local_iomad_learningpath_addusers(local_iomad_learningpath_addusers_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_addusers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_addusers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_addusers_request** | [**LocalIomadLearningpathAddusersRequest**](LocalIomadLearningpathAddusersRequest.md)|  | 

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
**200** | True if users added correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_copypath**
> object local_iomad_learningpath_copypath(local_iomad_learningpath_copypath_request)

Copy a learning path

Copy a learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_copypath_request import LocalIomadLearningpathCopypathRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_copypath_request = openapi_client.LocalIomadLearningpathCopypathRequest() # LocalIomadLearningpathCopypathRequest | 

    try:
        # Copy a learning path
        api_response = api_instance.local_iomad_learningpath_copypath(local_iomad_learningpath_copypath_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_copypath:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_copypath: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_copypath_request** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md)|  | 

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
**200** | True if path copied correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_deletepath**
> object local_iomad_learningpath_deletepath(local_iomad_learningpath_copypath_request)

Completely delete a learning path

Completely delete a learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_copypath_request import LocalIomadLearningpathCopypathRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_copypath_request = openapi_client.LocalIomadLearningpathCopypathRequest() # LocalIomadLearningpathCopypathRequest | 

    try:
        # Completely delete a learning path
        api_response = api_instance.local_iomad_learningpath_deletepath(local_iomad_learningpath_copypath_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_deletepath:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_deletepath: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_copypath_request** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md)|  | 

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
**200** | True if courses added correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_getcourses**
> object local_iomad_learningpath_getcourses(local_iomad_learningpath_getcourses_request)

Read list of courses for given learning

Read list of courses for given learning

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_getcourses_request import LocalIomadLearningpathGetcoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_getcourses_request = openapi_client.LocalIomadLearningpathGetcoursesRequest() # LocalIomadLearningpathGetcoursesRequest | 

    try:
        # Read list of courses for given learning
        api_response = api_instance.local_iomad_learningpath_getcourses(local_iomad_learningpath_getcourses_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_getcourses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_getcourses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_getcourses_request** | [**LocalIomadLearningpathGetcoursesRequest**](LocalIomadLearningpathGetcoursesRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_getprospectivecourses**
> object local_iomad_learningpath_getprospectivecourses(local_iomad_learningpath_getprospectivecourses_request)

Read set of filtered courses for given company

Read set of filtered courses for given company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_getprospectivecourses_request import LocalIomadLearningpathGetprospectivecoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_getprospectivecourses_request = openapi_client.LocalIomadLearningpathGetprospectivecoursesRequest() # LocalIomadLearningpathGetprospectivecoursesRequest | 

    try:
        # Read set of filtered courses for given company
        api_response = api_instance.local_iomad_learningpath_getprospectivecourses(local_iomad_learningpath_getprospectivecourses_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_getprospectivecourses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_getprospectivecourses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_getprospectivecourses_request** | [**LocalIomadLearningpathGetprospectivecoursesRequest**](LocalIomadLearningpathGetprospectivecoursesRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_getprospectiveusers**
> object local_iomad_learningpath_getprospectiveusers(local_iomad_learningpath_getprospectiveusers_request)

Get set of filtered users for given company

Get set of filtered users for given company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_getprospectiveusers_request import LocalIomadLearningpathGetprospectiveusersRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_getprospectiveusers_request = openapi_client.LocalIomadLearningpathGetprospectiveusersRequest() # LocalIomadLearningpathGetprospectiveusersRequest | 

    try:
        # Get set of filtered users for given company
        api_response = api_instance.local_iomad_learningpath_getprospectiveusers(local_iomad_learningpath_getprospectiveusers_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_getprospectiveusers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_getprospectiveusers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_getprospectiveusers_request** | [**LocalIomadLearningpathGetprospectiveusersRequest**](LocalIomadLearningpathGetprospectiveusersRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_getusers**
> object local_iomad_learningpath_getusers(local_iomad_learningpath_getusers_request)

Get users assigned to path

Get users assigned to path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_getusers_request import LocalIomadLearningpathGetusersRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_getusers_request = openapi_client.LocalIomadLearningpathGetusersRequest() # LocalIomadLearningpathGetusersRequest | 

    try:
        # Get users assigned to path
        api_response = api_instance.local_iomad_learningpath_getusers(local_iomad_learningpath_getusers_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_getusers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_getusers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_getusers_request** | [**LocalIomadLearningpathGetusersRequest**](LocalIomadLearningpathGetusersRequest.md)|  | 

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
**200** | Successful response |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_ordercourses**
> object local_iomad_learningpath_ordercourses(local_iomad_learningpath_ordercourses_request)

Set sequence of courses in learning path

Set sequence of courses in learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_ordercourses_request import LocalIomadLearningpathOrdercoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_ordercourses_request = openapi_client.LocalIomadLearningpathOrdercoursesRequest() # LocalIomadLearningpathOrdercoursesRequest | 

    try:
        # Set sequence of courses in learning path
        api_response = api_instance.local_iomad_learningpath_ordercourses(local_iomad_learningpath_ordercourses_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_ordercourses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_ordercourses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_ordercourses_request** | [**LocalIomadLearningpathOrdercoursesRequest**](LocalIomadLearningpathOrdercoursesRequest.md)|  | 

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
**200** | True if courses ordered correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_removecourses**
> object local_iomad_learningpath_removecourses(local_iomad_learningpath_removecourses_request)

Remove courses from learning path

Remove courses from learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_removecourses_request import LocalIomadLearningpathRemovecoursesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_removecourses_request = openapi_client.LocalIomadLearningpathRemovecoursesRequest() # LocalIomadLearningpathRemovecoursesRequest | 

    try:
        # Remove courses from learning path
        api_response = api_instance.local_iomad_learningpath_removecourses(local_iomad_learningpath_removecourses_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_removecourses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_removecourses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_removecourses_request** | [**LocalIomadLearningpathRemovecoursesRequest**](LocalIomadLearningpathRemovecoursesRequest.md)|  | 

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
**200** | True if courses removed correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **local_iomad_learningpath_removeusers**
> object local_iomad_learningpath_removeusers(local_iomad_learningpath_removeusers_request)

Remove users from learning path

Remove users from learning path

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.local_iomad_learningpath_removeusers_request import LocalIomadLearningpathRemoveusersRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://localhost/webservice/restful/server.php
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://localhost/webservice/restful/server.php"
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
    api_instance = openapi_client.LocalIomadLearningpathApi(api_client)
    local_iomad_learningpath_removeusers_request = openapi_client.LocalIomadLearningpathRemoveusersRequest() # LocalIomadLearningpathRemoveusersRequest | 

    try:
        # Remove users from learning path
        api_response = api_instance.local_iomad_learningpath_removeusers(local_iomad_learningpath_removeusers_request)
        print("The response of LocalIomadLearningpathApi->local_iomad_learningpath_removeusers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocalIomadLearningpathApi->local_iomad_learningpath_removeusers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local_iomad_learningpath_removeusers_request** | [**LocalIomadLearningpathRemoveusersRequest**](LocalIomadLearningpathRemoveusersRequest.md)|  | 

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
**200** | True if users removed correctly |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

