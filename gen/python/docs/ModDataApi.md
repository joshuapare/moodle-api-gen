# openapi_client.ModDataApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_data_add_entry**](ModDataApi.md#mod_data_add_entry) | **POST** /mod_data_add_entry | Adds a new entry.
[**mod_data_approve_entry**](ModDataApi.md#mod_data_approve_entry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry.
[**mod_data_delete_entry**](ModDataApi.md#mod_data_delete_entry) | **POST** /mod_data_delete_entry | Deletes an entry.
[**mod_data_delete_saved_preset**](ModDataApi.md#mod_data_delete_saved_preset) | **POST** /mod_data_delete_saved_preset | Delete site user preset.
[**mod_data_get_data_access_information**](ModDataApi.md#mod_data_get_data_access_information) | **POST** /mod_data_get_data_access_information | Return access information for a given database.
[**mod_data_get_databases_by_courses**](ModDataApi.md#mod_data_get_databases_by_courses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
[**mod_data_get_entries**](ModDataApi.md#mod_data_get_entries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database.
[**mod_data_get_entry**](ModDataApi.md#mod_data_get_entry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally.
[**mod_data_get_fields**](ModDataApi.md#mod_data_get_fields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database.
[**mod_data_get_mapping_information**](ModDataApi.md#mod_data_get_mapping_information) | **POST** /mod_data_get_mapping_information | Get importing information
[**mod_data_search_entries**](ModDataApi.md#mod_data_search_entries) | **POST** /mod_data_search_entries | Search for entries in the given database.
[**mod_data_update_entry**](ModDataApi.md#mod_data_update_entry) | **POST** /mod_data_update_entry | Updates an existing entry.
[**mod_data_view_database**](ModDataApi.md#mod_data_view_database) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc...


# **mod_data_add_entry**
> ModDataAddEntry200Response mod_data_add_entry(mod_data_add_entry_request)

Adds a new entry.

Adds a new entry.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_add_entry200_response import ModDataAddEntry200Response
from openapi_client.models.mod_data_add_entry_request import ModDataAddEntryRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_add_entry_request = openapi_client.ModDataAddEntryRequest() # ModDataAddEntryRequest | 

    try:
        # Adds a new entry.
        api_response = api_instance.mod_data_add_entry(mod_data_add_entry_request)
        print("The response of ModDataApi->mod_data_add_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_add_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_add_entry_request** | [**ModDataAddEntryRequest**](ModDataAddEntryRequest.md)|  | 

### Return type

[**ModDataAddEntry200Response**](ModDataAddEntry200Response.md)

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

# **mod_data_approve_entry**
> CoreCalendarDeleteSubscription200Response mod_data_approve_entry(mod_data_approve_entry_request)

Approves or unapproves an entry.

Approves or unapproves an entry.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_data_approve_entry_request import ModDataApproveEntryRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_approve_entry_request = openapi_client.ModDataApproveEntryRequest() # ModDataApproveEntryRequest | 

    try:
        # Approves or unapproves an entry.
        api_response = api_instance.mod_data_approve_entry(mod_data_approve_entry_request)
        print("The response of ModDataApi->mod_data_approve_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_approve_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_approve_entry_request** | [**ModDataApproveEntryRequest**](ModDataApproveEntryRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

# **mod_data_delete_entry**
> ModDataDeleteEntry200Response mod_data_delete_entry(mod_data_delete_entry_request)

Deletes an entry.

Deletes an entry.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_delete_entry200_response import ModDataDeleteEntry200Response
from openapi_client.models.mod_data_delete_entry_request import ModDataDeleteEntryRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_delete_entry_request = openapi_client.ModDataDeleteEntryRequest() # ModDataDeleteEntryRequest | 

    try:
        # Deletes an entry.
        api_response = api_instance.mod_data_delete_entry(mod_data_delete_entry_request)
        print("The response of ModDataApi->mod_data_delete_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_delete_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_delete_entry_request** | [**ModDataDeleteEntryRequest**](ModDataDeleteEntryRequest.md)|  | 

### Return type

[**ModDataDeleteEntry200Response**](ModDataDeleteEntry200Response.md)

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

# **mod_data_delete_saved_preset**
> CoreContentbankRenameContent200Response mod_data_delete_saved_preset(mod_data_delete_saved_preset_request)

Delete site user preset.

Delete site user preset.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.mod_data_delete_saved_preset_request import ModDataDeleteSavedPresetRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_delete_saved_preset_request = openapi_client.ModDataDeleteSavedPresetRequest() # ModDataDeleteSavedPresetRequest | 

    try:
        # Delete site user preset.
        api_response = api_instance.mod_data_delete_saved_preset(mod_data_delete_saved_preset_request)
        print("The response of ModDataApi->mod_data_delete_saved_preset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_delete_saved_preset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_delete_saved_preset_request** | [**ModDataDeleteSavedPresetRequest**](ModDataDeleteSavedPresetRequest.md)|  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

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

# **mod_data_get_data_access_information**
> ModDataGetDataAccessInformation200Response mod_data_get_data_access_information(mod_data_get_data_access_information_request)

Return access information for a given database.

Return access information for a given database.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_get_data_access_information200_response import ModDataGetDataAccessInformation200Response
from openapi_client.models.mod_data_get_data_access_information_request import ModDataGetDataAccessInformationRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_get_data_access_information_request = openapi_client.ModDataGetDataAccessInformationRequest() # ModDataGetDataAccessInformationRequest | 

    try:
        # Return access information for a given database.
        api_response = api_instance.mod_data_get_data_access_information(mod_data_get_data_access_information_request)
        print("The response of ModDataApi->mod_data_get_data_access_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_data_access_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_get_data_access_information_request** | [**ModDataGetDataAccessInformationRequest**](ModDataGetDataAccessInformationRequest.md)|  | 

### Return type

[**ModDataGetDataAccessInformation200Response**](ModDataGetDataAccessInformation200Response.md)

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

# **mod_data_get_databases_by_courses**
> ModDataGetDatabasesByCourses200Response mod_data_get_databases_by_courses(mod_chat_get_chats_by_courses_request)

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_data_get_databases_by_courses200_response import ModDataGetDatabasesByCourses200Response
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
        api_response = api_instance.mod_data_get_databases_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModDataApi->mod_data_get_databases_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_databases_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModDataGetDatabasesByCourses200Response**](ModDataGetDatabasesByCourses200Response.md)

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

# **mod_data_get_entries**
> ModDataGetEntries200Response mod_data_get_entries(mod_data_get_entries_request)

Return the complete list of entries of the given database.

Return the complete list of entries of the given database.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_get_entries200_response import ModDataGetEntries200Response
from openapi_client.models.mod_data_get_entries_request import ModDataGetEntriesRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_get_entries_request = openapi_client.ModDataGetEntriesRequest() # ModDataGetEntriesRequest | 

    try:
        # Return the complete list of entries of the given database.
        api_response = api_instance.mod_data_get_entries(mod_data_get_entries_request)
        print("The response of ModDataApi->mod_data_get_entries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_entries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_get_entries_request** | [**ModDataGetEntriesRequest**](ModDataGetEntriesRequest.md)|  | 

### Return type

[**ModDataGetEntries200Response**](ModDataGetEntries200Response.md)

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

# **mod_data_get_entry**
> ModDataGetEntry200Response mod_data_get_entry(mod_data_get_entry_request)

Return one entry record from the database, including contents optionally.

Return one entry record from the database, including contents optionally.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_get_entry200_response import ModDataGetEntry200Response
from openapi_client.models.mod_data_get_entry_request import ModDataGetEntryRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_get_entry_request = openapi_client.ModDataGetEntryRequest() # ModDataGetEntryRequest | 

    try:
        # Return one entry record from the database, including contents optionally.
        api_response = api_instance.mod_data_get_entry(mod_data_get_entry_request)
        print("The response of ModDataApi->mod_data_get_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_get_entry_request** | [**ModDataGetEntryRequest**](ModDataGetEntryRequest.md)|  | 

### Return type

[**ModDataGetEntry200Response**](ModDataGetEntry200Response.md)

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

# **mod_data_get_fields**
> ModDataGetFields200Response mod_data_get_fields(mod_data_get_fields_request)

Return the list of configured fields for the given database.

Return the list of configured fields for the given database.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_get_fields200_response import ModDataGetFields200Response
from openapi_client.models.mod_data_get_fields_request import ModDataGetFieldsRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_get_fields_request = openapi_client.ModDataGetFieldsRequest() # ModDataGetFieldsRequest | 

    try:
        # Return the list of configured fields for the given database.
        api_response = api_instance.mod_data_get_fields(mod_data_get_fields_request)
        print("The response of ModDataApi->mod_data_get_fields:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_fields: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_get_fields_request** | [**ModDataGetFieldsRequest**](ModDataGetFieldsRequest.md)|  | 

### Return type

[**ModDataGetFields200Response**](ModDataGetFields200Response.md)

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

# **mod_data_get_mapping_information**
> ModDataGetMappingInformation200Response mod_data_get_mapping_information(mod_data_get_mapping_information_request)

Get importing information

Get importing information

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_get_mapping_information200_response import ModDataGetMappingInformation200Response
from openapi_client.models.mod_data_get_mapping_information_request import ModDataGetMappingInformationRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_get_mapping_information_request = openapi_client.ModDataGetMappingInformationRequest() # ModDataGetMappingInformationRequest | 

    try:
        # Get importing information
        api_response = api_instance.mod_data_get_mapping_information(mod_data_get_mapping_information_request)
        print("The response of ModDataApi->mod_data_get_mapping_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_get_mapping_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_get_mapping_information_request** | [**ModDataGetMappingInformationRequest**](ModDataGetMappingInformationRequest.md)|  | 

### Return type

[**ModDataGetMappingInformation200Response**](ModDataGetMappingInformation200Response.md)

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

# **mod_data_search_entries**
> ModDataSearchEntries200Response mod_data_search_entries(mod_data_search_entries_request)

Search for entries in the given database.

Search for entries in the given database.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_search_entries200_response import ModDataSearchEntries200Response
from openapi_client.models.mod_data_search_entries_request import ModDataSearchEntriesRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_search_entries_request = openapi_client.ModDataSearchEntriesRequest() # ModDataSearchEntriesRequest | 

    try:
        # Search for entries in the given database.
        api_response = api_instance.mod_data_search_entries(mod_data_search_entries_request)
        print("The response of ModDataApi->mod_data_search_entries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_search_entries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_search_entries_request** | [**ModDataSearchEntriesRequest**](ModDataSearchEntriesRequest.md)|  | 

### Return type

[**ModDataSearchEntries200Response**](ModDataSearchEntries200Response.md)

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

# **mod_data_update_entry**
> ModDataUpdateEntry200Response mod_data_update_entry(mod_data_update_entry_request)

Updates an existing entry.

Updates an existing entry.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_data_update_entry200_response import ModDataUpdateEntry200Response
from openapi_client.models.mod_data_update_entry_request import ModDataUpdateEntryRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_update_entry_request = openapi_client.ModDataUpdateEntryRequest() # ModDataUpdateEntryRequest | 

    try:
        # Updates an existing entry.
        api_response = api_instance.mod_data_update_entry(mod_data_update_entry_request)
        print("The response of ModDataApi->mod_data_update_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_update_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_update_entry_request** | [**ModDataUpdateEntryRequest**](ModDataUpdateEntryRequest.md)|  | 

### Return type

[**ModDataUpdateEntry200Response**](ModDataUpdateEntry200Response.md)

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

# **mod_data_view_database**
> CoreCalendarDeleteSubscription200Response mod_data_view_database(mod_data_view_database_request)

Simulate the view.php web interface data: trigger events, completion, etc...

Simulate the view.php web interface data: trigger events, completion, etc...

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_calendar_delete_subscription200_response import CoreCalendarDeleteSubscription200Response
from openapi_client.models.mod_data_view_database_request import ModDataViewDatabaseRequest
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
    api_instance = openapi_client.ModDataApi(api_client)
    mod_data_view_database_request = openapi_client.ModDataViewDatabaseRequest() # ModDataViewDatabaseRequest | 

    try:
        # Simulate the view.php web interface data: trigger events, completion, etc...
        api_response = api_instance.mod_data_view_database(mod_data_view_database_request)
        print("The response of ModDataApi->mod_data_view_database:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModDataApi->mod_data_view_database: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_data_view_database_request** | [**ModDataViewDatabaseRequest**](ModDataViewDatabaseRequest.md)|  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

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

