# openapi_client.ModGlossaryApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_glossary_add_entry**](ModGlossaryApi.md#mod_glossary_add_entry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary
[**mod_glossary_delete_entry**](ModGlossaryApi.md#mod_glossary_delete_entry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary.
[**mod_glossary_get_authors**](ModGlossaryApi.md#mod_glossary_get_authors) | **POST** /mod_glossary_get_authors | Get the authors.
[**mod_glossary_get_categories**](ModGlossaryApi.md#mod_glossary_get_categories) | **POST** /mod_glossary_get_categories | Get the categories.
[**mod_glossary_get_entries_by_author**](ModGlossaryApi.md#mod_glossary_get_entries_by_author) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author.
[**mod_glossary_get_entries_by_author_id**](ModGlossaryApi.md#mod_glossary_get_entries_by_author_id) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID.
[**mod_glossary_get_entries_by_category**](ModGlossaryApi.md#mod_glossary_get_entries_by_category) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category.
[**mod_glossary_get_entries_by_date**](ModGlossaryApi.md#mod_glossary_get_entries_by_date) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date.
[**mod_glossary_get_entries_by_letter**](ModGlossaryApi.md#mod_glossary_get_entries_by_letter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter.
[**mod_glossary_get_entries_by_search**](ModGlossaryApi.md#mod_glossary_get_entries_by_search) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query.
[**mod_glossary_get_entries_by_term**](ModGlossaryApi.md#mod_glossary_get_entries_by_term) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias).
[**mod_glossary_get_entries_to_approve**](ModGlossaryApi.md#mod_glossary_get_entries_to_approve) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved.
[**mod_glossary_get_entry_by_id**](ModGlossaryApi.md#mod_glossary_get_entry_by_id) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID
[**mod_glossary_get_glossaries_by_courses**](ModGlossaryApi.md#mod_glossary_get_glossaries_by_courses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses.
[**mod_glossary_prepare_entry_for_edition**](ModGlossaryApi.md#mod_glossary_prepare_entry_for_edition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information.
[**mod_glossary_update_entry**](ModGlossaryApi.md#mod_glossary_update_entry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry.
[**mod_glossary_view_entry**](ModGlossaryApi.md#mod_glossary_view_entry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed.
[**mod_glossary_view_glossary**](ModGlossaryApi.md#mod_glossary_view_glossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed.


# **mod_glossary_add_entry**
> ModGlossaryAddEntry200Response mod_glossary_add_entry(mod_glossary_add_entry_request)

Add a new entry to a given glossary

Add a new entry to a given glossary

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_add_entry200_response import ModGlossaryAddEntry200Response
from openapi_client.models.mod_glossary_add_entry_request import ModGlossaryAddEntryRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_add_entry_request = openapi_client.ModGlossaryAddEntryRequest() # ModGlossaryAddEntryRequest | 

    try:
        # Add a new entry to a given glossary
        api_response = api_instance.mod_glossary_add_entry(mod_glossary_add_entry_request)
        print("The response of ModGlossaryApi->mod_glossary_add_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_add_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_add_entry_request** | [**ModGlossaryAddEntryRequest**](ModGlossaryAddEntryRequest.md)|  | 

### Return type

[**ModGlossaryAddEntry200Response**](ModGlossaryAddEntry200Response.md)

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

# **mod_glossary_delete_entry**
> CoreContentbankRenameContent200Response mod_glossary_delete_entry(mod_glossary_delete_entry_request)

Delete the given entry from the glossary.

Delete the given entry from the glossary.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.mod_glossary_delete_entry_request import ModGlossaryDeleteEntryRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_delete_entry_request = openapi_client.ModGlossaryDeleteEntryRequest() # ModGlossaryDeleteEntryRequest | 

    try:
        # Delete the given entry from the glossary.
        api_response = api_instance.mod_glossary_delete_entry(mod_glossary_delete_entry_request)
        print("The response of ModGlossaryApi->mod_glossary_delete_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_delete_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_delete_entry_request** | [**ModGlossaryDeleteEntryRequest**](ModGlossaryDeleteEntryRequest.md)|  | 

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

# **mod_glossary_get_authors**
> ModGlossaryGetAuthors200Response mod_glossary_get_authors(mod_glossary_get_authors_request)

Get the authors.

Get the authors.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_authors200_response import ModGlossaryGetAuthors200Response
from openapi_client.models.mod_glossary_get_authors_request import ModGlossaryGetAuthorsRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_authors_request = openapi_client.ModGlossaryGetAuthorsRequest() # ModGlossaryGetAuthorsRequest | 

    try:
        # Get the authors.
        api_response = api_instance.mod_glossary_get_authors(mod_glossary_get_authors_request)
        print("The response of ModGlossaryApi->mod_glossary_get_authors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_authors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_authors_request** | [**ModGlossaryGetAuthorsRequest**](ModGlossaryGetAuthorsRequest.md)|  | 

### Return type

[**ModGlossaryGetAuthors200Response**](ModGlossaryGetAuthors200Response.md)

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

# **mod_glossary_get_categories**
> ModGlossaryGetCategories200Response mod_glossary_get_categories(mod_glossary_get_categories_request)

Get the categories.

Get the categories.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_categories200_response import ModGlossaryGetCategories200Response
from openapi_client.models.mod_glossary_get_categories_request import ModGlossaryGetCategoriesRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_categories_request = openapi_client.ModGlossaryGetCategoriesRequest() # ModGlossaryGetCategoriesRequest | 

    try:
        # Get the categories.
        api_response = api_instance.mod_glossary_get_categories(mod_glossary_get_categories_request)
        print("The response of ModGlossaryApi->mod_glossary_get_categories:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_categories: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_categories_request** | [**ModGlossaryGetCategoriesRequest**](ModGlossaryGetCategoriesRequest.md)|  | 

### Return type

[**ModGlossaryGetCategories200Response**](ModGlossaryGetCategories200Response.md)

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

# **mod_glossary_get_entries_by_author**
> ModGlossaryGetEntriesByAuthor200Response mod_glossary_get_entries_by_author(mod_glossary_get_entries_by_author_request)

Browse entries by author.

Browse entries by author.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author200_response import ModGlossaryGetEntriesByAuthor200Response
from openapi_client.models.mod_glossary_get_entries_by_author_request import ModGlossaryGetEntriesByAuthorRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_author_request = openapi_client.ModGlossaryGetEntriesByAuthorRequest() # ModGlossaryGetEntriesByAuthorRequest | 

    try:
        # Browse entries by author.
        api_response = api_instance.mod_glossary_get_entries_by_author(mod_glossary_get_entries_by_author_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_author:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_author: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_author_request** | [**ModGlossaryGetEntriesByAuthorRequest**](ModGlossaryGetEntriesByAuthorRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthor200Response**](ModGlossaryGetEntriesByAuthor200Response.md)

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

# **mod_glossary_get_entries_by_author_id**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_author_id(mod_glossary_get_entries_by_author_id_request)

Browse entries by author ID.

Browse entries by author ID.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_by_author_id_request import ModGlossaryGetEntriesByAuthorIdRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_author_id_request = openapi_client.ModGlossaryGetEntriesByAuthorIdRequest() # ModGlossaryGetEntriesByAuthorIdRequest | 

    try:
        # Browse entries by author ID.
        api_response = api_instance.mod_glossary_get_entries_by_author_id(mod_glossary_get_entries_by_author_id_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_author_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_author_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_author_id_request** | [**ModGlossaryGetEntriesByAuthorIdRequest**](ModGlossaryGetEntriesByAuthorIdRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entries_by_category**
> ModGlossaryGetEntriesByCategory200Response mod_glossary_get_entries_by_category(mod_glossary_get_entries_by_category_request)

Browse entries by category.

Browse entries by category.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_category200_response import ModGlossaryGetEntriesByCategory200Response
from openapi_client.models.mod_glossary_get_entries_by_category_request import ModGlossaryGetEntriesByCategoryRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_category_request = openapi_client.ModGlossaryGetEntriesByCategoryRequest() # ModGlossaryGetEntriesByCategoryRequest | 

    try:
        # Browse entries by category.
        api_response = api_instance.mod_glossary_get_entries_by_category(mod_glossary_get_entries_by_category_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_category_request** | [**ModGlossaryGetEntriesByCategoryRequest**](ModGlossaryGetEntriesByCategoryRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByCategory200Response**](ModGlossaryGetEntriesByCategory200Response.md)

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

# **mod_glossary_get_entries_by_date**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_date(mod_glossary_get_entries_by_date_request)

Browse entries by date.

Browse entries by date.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_by_date_request import ModGlossaryGetEntriesByDateRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_date_request = openapi_client.ModGlossaryGetEntriesByDateRequest() # ModGlossaryGetEntriesByDateRequest | 

    try:
        # Browse entries by date.
        api_response = api_instance.mod_glossary_get_entries_by_date(mod_glossary_get_entries_by_date_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_date:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_date: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_date_request** | [**ModGlossaryGetEntriesByDateRequest**](ModGlossaryGetEntriesByDateRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entries_by_letter**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_letter(mod_glossary_get_entries_by_letter_request)

Browse entries by letter.

Browse entries by letter.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_by_letter_request import ModGlossaryGetEntriesByLetterRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_letter_request = openapi_client.ModGlossaryGetEntriesByLetterRequest() # ModGlossaryGetEntriesByLetterRequest | 

    try:
        # Browse entries by letter.
        api_response = api_instance.mod_glossary_get_entries_by_letter(mod_glossary_get_entries_by_letter_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_letter:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_letter: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_letter_request** | [**ModGlossaryGetEntriesByLetterRequest**](ModGlossaryGetEntriesByLetterRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entries_by_search**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_search(mod_glossary_get_entries_by_search_request)

Browse entries by search query.

Browse entries by search query.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_by_search_request import ModGlossaryGetEntriesBySearchRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_search_request = openapi_client.ModGlossaryGetEntriesBySearchRequest() # ModGlossaryGetEntriesBySearchRequest | 

    try:
        # Browse entries by search query.
        api_response = api_instance.mod_glossary_get_entries_by_search(mod_glossary_get_entries_by_search_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_search:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_search: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_search_request** | [**ModGlossaryGetEntriesBySearchRequest**](ModGlossaryGetEntriesBySearchRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entries_by_term**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_term(mod_glossary_get_entries_by_term_request)

Browse entries by term (concept or alias).

Browse entries by term (concept or alias).

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_by_term_request import ModGlossaryGetEntriesByTermRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_by_term_request = openapi_client.ModGlossaryGetEntriesByTermRequest() # ModGlossaryGetEntriesByTermRequest | 

    try:
        # Browse entries by term (concept or alias).
        api_response = api_instance.mod_glossary_get_entries_by_term(mod_glossary_get_entries_by_term_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_by_term:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_by_term: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_by_term_request** | [**ModGlossaryGetEntriesByTermRequest**](ModGlossaryGetEntriesByTermRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entries_to_approve**
> ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_to_approve(mod_glossary_get_entries_to_approve_request)

Browse entries to be approved.

Browse entries to be approved.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entries_by_author_id200_response import ModGlossaryGetEntriesByAuthorId200Response
from openapi_client.models.mod_glossary_get_entries_to_approve_request import ModGlossaryGetEntriesToApproveRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entries_to_approve_request = openapi_client.ModGlossaryGetEntriesToApproveRequest() # ModGlossaryGetEntriesToApproveRequest | 

    try:
        # Browse entries to be approved.
        api_response = api_instance.mod_glossary_get_entries_to_approve(mod_glossary_get_entries_to_approve_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entries_to_approve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entries_to_approve: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entries_to_approve_request** | [**ModGlossaryGetEntriesToApproveRequest**](ModGlossaryGetEntriesToApproveRequest.md)|  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

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

# **mod_glossary_get_entry_by_id**
> ModGlossaryGetEntryById200Response mod_glossary_get_entry_by_id(mod_glossary_get_entry_by_id_request)

Get an entry by ID

Get an entry by ID

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entry_by_id200_response import ModGlossaryGetEntryById200Response
from openapi_client.models.mod_glossary_get_entry_by_id_request import ModGlossaryGetEntryByIdRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entry_by_id_request = openapi_client.ModGlossaryGetEntryByIdRequest() # ModGlossaryGetEntryByIdRequest | 

    try:
        # Get an entry by ID
        api_response = api_instance.mod_glossary_get_entry_by_id(mod_glossary_get_entry_by_id_request)
        print("The response of ModGlossaryApi->mod_glossary_get_entry_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_entry_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entry_by_id_request** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md)|  | 

### Return type

[**ModGlossaryGetEntryById200Response**](ModGlossaryGetEntryById200Response.md)

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

# **mod_glossary_get_glossaries_by_courses**
> ModGlossaryGetGlossariesByCourses200Response mod_glossary_get_glossaries_by_courses(mod_chat_get_chats_by_courses_request)

Retrieve a list of glossaries from several courses.

Retrieve a list of glossaries from several courses.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_chat_get_chats_by_courses_request import ModChatGetChatsByCoursesRequest
from openapi_client.models.mod_glossary_get_glossaries_by_courses200_response import ModGlossaryGetGlossariesByCourses200Response
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_chat_get_chats_by_courses_request = openapi_client.ModChatGetChatsByCoursesRequest() # ModChatGetChatsByCoursesRequest | 

    try:
        # Retrieve a list of glossaries from several courses.
        api_response = api_instance.mod_glossary_get_glossaries_by_courses(mod_chat_get_chats_by_courses_request)
        print("The response of ModGlossaryApi->mod_glossary_get_glossaries_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_get_glossaries_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md)|  | 

### Return type

[**ModGlossaryGetGlossariesByCourses200Response**](ModGlossaryGetGlossariesByCourses200Response.md)

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

# **mod_glossary_prepare_entry_for_edition**
> ModGlossaryPrepareEntryForEdition200Response mod_glossary_prepare_entry_for_edition(mod_glossary_prepare_entry_for_edition_request)

Prepares the given entry for edition returning draft item areas and file areas information.

Prepares the given entry for edition returning draft item areas and file areas information.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_prepare_entry_for_edition200_response import ModGlossaryPrepareEntryForEdition200Response
from openapi_client.models.mod_glossary_prepare_entry_for_edition_request import ModGlossaryPrepareEntryForEditionRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_prepare_entry_for_edition_request = openapi_client.ModGlossaryPrepareEntryForEditionRequest() # ModGlossaryPrepareEntryForEditionRequest | 

    try:
        # Prepares the given entry for edition returning draft item areas and file areas information.
        api_response = api_instance.mod_glossary_prepare_entry_for_edition(mod_glossary_prepare_entry_for_edition_request)
        print("The response of ModGlossaryApi->mod_glossary_prepare_entry_for_edition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_prepare_entry_for_edition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_prepare_entry_for_edition_request** | [**ModGlossaryPrepareEntryForEditionRequest**](ModGlossaryPrepareEntryForEditionRequest.md)|  | 

### Return type

[**ModGlossaryPrepareEntryForEdition200Response**](ModGlossaryPrepareEntryForEdition200Response.md)

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

# **mod_glossary_update_entry**
> ModGlossaryUpdateEntry200Response mod_glossary_update_entry(mod_glossary_update_entry_request)

Updates the given glossary entry.

Updates the given glossary entry.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_update_entry200_response import ModGlossaryUpdateEntry200Response
from openapi_client.models.mod_glossary_update_entry_request import ModGlossaryUpdateEntryRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_update_entry_request = openapi_client.ModGlossaryUpdateEntryRequest() # ModGlossaryUpdateEntryRequest | 

    try:
        # Updates the given glossary entry.
        api_response = api_instance.mod_glossary_update_entry(mod_glossary_update_entry_request)
        print("The response of ModGlossaryApi->mod_glossary_update_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_update_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_update_entry_request** | [**ModGlossaryUpdateEntryRequest**](ModGlossaryUpdateEntryRequest.md)|  | 

### Return type

[**ModGlossaryUpdateEntry200Response**](ModGlossaryUpdateEntry200Response.md)

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

# **mod_glossary_view_entry**
> ModGlossaryViewEntry200Response mod_glossary_view_entry(mod_glossary_get_entry_by_id_request)

Notify a glossary entry as being viewed.

Notify a glossary entry as being viewed.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_get_entry_by_id_request import ModGlossaryGetEntryByIdRequest
from openapi_client.models.mod_glossary_view_entry200_response import ModGlossaryViewEntry200Response
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_get_entry_by_id_request = openapi_client.ModGlossaryGetEntryByIdRequest() # ModGlossaryGetEntryByIdRequest | 

    try:
        # Notify a glossary entry as being viewed.
        api_response = api_instance.mod_glossary_view_entry(mod_glossary_get_entry_by_id_request)
        print("The response of ModGlossaryApi->mod_glossary_view_entry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_view_entry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_get_entry_by_id_request** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md)|  | 

### Return type

[**ModGlossaryViewEntry200Response**](ModGlossaryViewEntry200Response.md)

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

# **mod_glossary_view_glossary**
> ModGlossaryViewGlossary200Response mod_glossary_view_glossary(mod_glossary_view_glossary_request)

Notify the glossary as being viewed.

Notify the glossary as being viewed.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_glossary_view_glossary200_response import ModGlossaryViewGlossary200Response
from openapi_client.models.mod_glossary_view_glossary_request import ModGlossaryViewGlossaryRequest
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
    api_instance = openapi_client.ModGlossaryApi(api_client)
    mod_glossary_view_glossary_request = openapi_client.ModGlossaryViewGlossaryRequest() # ModGlossaryViewGlossaryRequest | 

    try:
        # Notify the glossary as being viewed.
        api_response = api_instance.mod_glossary_view_glossary(mod_glossary_view_glossary_request)
        print("The response of ModGlossaryApi->mod_glossary_view_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModGlossaryApi->mod_glossary_view_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_glossary_view_glossary_request** | [**ModGlossaryViewGlossaryRequest**](ModGlossaryViewGlossaryRequest.md)|  | 

### Return type

[**ModGlossaryViewGlossary200Response**](ModGlossaryViewGlossary200Response.md)

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

