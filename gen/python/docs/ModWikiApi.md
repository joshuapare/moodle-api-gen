# openapi_client.ModWikiApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_wiki_edit_page**](ModWikiApi.md#mod_wiki_edit_page) | **POST** /mod_wiki_edit_page | Save the contents of a page.
[**mod_wiki_get_page_contents**](ModWikiApi.md#mod_wiki_get_page_contents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page.
[**mod_wiki_get_page_for_editing**](ModWikiApi.md#mod_wiki_get_page_for_editing) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited.
[**mod_wiki_get_subwiki_files**](ModWikiApi.md#mod_wiki_get_subwiki_files) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki.
[**mod_wiki_get_subwiki_pages**](ModWikiApi.md#mod_wiki_get_subwiki_pages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki.
[**mod_wiki_get_subwikis**](ModWikiApi.md#mod_wiki_get_subwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki.
[**mod_wiki_get_wikis_by_courses**](ModWikiApi.md#mod_wiki_get_wikis_by_courses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
[**mod_wiki_new_page**](ModWikiApi.md#mod_wiki_new_page) | **POST** /mod_wiki_new_page | Create a new page in a subwiki.
[**mod_wiki_view_page**](ModWikiApi.md#mod_wiki_view_page) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status.
[**mod_wiki_view_wiki**](ModWikiApi.md#mod_wiki_view_wiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status.


# **mod_wiki_edit_page**
> ModWikiEditPage200Response mod_wiki_edit_page(mod_wiki_edit_page_request)

Save the contents of a page.

Save the contents of a page.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_edit_page200_response import ModWikiEditPage200Response
from openapi_client.models.mod_wiki_edit_page_request import ModWikiEditPageRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_edit_page_request = openapi_client.ModWikiEditPageRequest() # ModWikiEditPageRequest | 

    try:
        # Save the contents of a page.
        api_response = api_instance.mod_wiki_edit_page(mod_wiki_edit_page_request)
        print("The response of ModWikiApi->mod_wiki_edit_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_edit_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_edit_page_request** | [**ModWikiEditPageRequest**](ModWikiEditPageRequest.md)|  | 

### Return type

[**ModWikiEditPage200Response**](ModWikiEditPage200Response.md)

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

# **mod_wiki_get_page_contents**
> ModWikiGetPageContents200Response mod_wiki_get_page_contents(mod_wiki_get_page_contents_request)

Returns the contents of a page.

Returns the contents of a page.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_page_contents200_response import ModWikiGetPageContents200Response
from openapi_client.models.mod_wiki_get_page_contents_request import ModWikiGetPageContentsRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_page_contents_request = openapi_client.ModWikiGetPageContentsRequest() # ModWikiGetPageContentsRequest | 

    try:
        # Returns the contents of a page.
        api_response = api_instance.mod_wiki_get_page_contents(mod_wiki_get_page_contents_request)
        print("The response of ModWikiApi->mod_wiki_get_page_contents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_page_contents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_page_contents_request** | [**ModWikiGetPageContentsRequest**](ModWikiGetPageContentsRequest.md)|  | 

### Return type

[**ModWikiGetPageContents200Response**](ModWikiGetPageContents200Response.md)

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

# **mod_wiki_get_page_for_editing**
> ModWikiGetPageForEditing200Response mod_wiki_get_page_for_editing(mod_wiki_get_page_for_editing_request)

Locks and retrieves info of page-section to be edited.

Locks and retrieves info of page-section to be edited.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_page_for_editing200_response import ModWikiGetPageForEditing200Response
from openapi_client.models.mod_wiki_get_page_for_editing_request import ModWikiGetPageForEditingRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_page_for_editing_request = openapi_client.ModWikiGetPageForEditingRequest() # ModWikiGetPageForEditingRequest | 

    try:
        # Locks and retrieves info of page-section to be edited.
        api_response = api_instance.mod_wiki_get_page_for_editing(mod_wiki_get_page_for_editing_request)
        print("The response of ModWikiApi->mod_wiki_get_page_for_editing:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_page_for_editing: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_page_for_editing_request** | [**ModWikiGetPageForEditingRequest**](ModWikiGetPageForEditingRequest.md)|  | 

### Return type

[**ModWikiGetPageForEditing200Response**](ModWikiGetPageForEditing200Response.md)

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

# **mod_wiki_get_subwiki_files**
> CoreH5pGetTrustedH5pFile200Response mod_wiki_get_subwiki_files(mod_wiki_get_subwiki_files_request)

Returns the list of files for a specific subwiki.

Returns the list of files for a specific subwiki.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_h5p_get_trusted_h5p_file200_response import CoreH5pGetTrustedH5pFile200Response
from openapi_client.models.mod_wiki_get_subwiki_files_request import ModWikiGetSubwikiFilesRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_subwiki_files_request = openapi_client.ModWikiGetSubwikiFilesRequest() # ModWikiGetSubwikiFilesRequest | 

    try:
        # Returns the list of files for a specific subwiki.
        api_response = api_instance.mod_wiki_get_subwiki_files(mod_wiki_get_subwiki_files_request)
        print("The response of ModWikiApi->mod_wiki_get_subwiki_files:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_subwiki_files: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_subwiki_files_request** | [**ModWikiGetSubwikiFilesRequest**](ModWikiGetSubwikiFilesRequest.md)|  | 

### Return type

[**CoreH5pGetTrustedH5pFile200Response**](CoreH5pGetTrustedH5pFile200Response.md)

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

# **mod_wiki_get_subwiki_pages**
> ModWikiGetSubwikiPages200Response mod_wiki_get_subwiki_pages(mod_wiki_get_subwiki_pages_request)

Returns the list of pages for a specific subwiki.

Returns the list of pages for a specific subwiki.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_subwiki_pages200_response import ModWikiGetSubwikiPages200Response
from openapi_client.models.mod_wiki_get_subwiki_pages_request import ModWikiGetSubwikiPagesRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_subwiki_pages_request = openapi_client.ModWikiGetSubwikiPagesRequest() # ModWikiGetSubwikiPagesRequest | 

    try:
        # Returns the list of pages for a specific subwiki.
        api_response = api_instance.mod_wiki_get_subwiki_pages(mod_wiki_get_subwiki_pages_request)
        print("The response of ModWikiApi->mod_wiki_get_subwiki_pages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_subwiki_pages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_subwiki_pages_request** | [**ModWikiGetSubwikiPagesRequest**](ModWikiGetSubwikiPagesRequest.md)|  | 

### Return type

[**ModWikiGetSubwikiPages200Response**](ModWikiGetSubwikiPages200Response.md)

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

# **mod_wiki_get_subwikis**
> ModWikiGetSubwikis200Response mod_wiki_get_subwikis(mod_wiki_get_subwikis_request)

Returns the list of subwikis the user can see in a specific wiki.

Returns the list of subwikis the user can see in a specific wiki.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_subwikis200_response import ModWikiGetSubwikis200Response
from openapi_client.models.mod_wiki_get_subwikis_request import ModWikiGetSubwikisRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_subwikis_request = openapi_client.ModWikiGetSubwikisRequest() # ModWikiGetSubwikisRequest | 

    try:
        # Returns the list of subwikis the user can see in a specific wiki.
        api_response = api_instance.mod_wiki_get_subwikis(mod_wiki_get_subwikis_request)
        print("The response of ModWikiApi->mod_wiki_get_subwikis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_subwikis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_subwikis_request** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md)|  | 

### Return type

[**ModWikiGetSubwikis200Response**](ModWikiGetSubwikis200Response.md)

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

# **mod_wiki_get_wikis_by_courses**
> ModWikiGetWikisByCourses200Response mod_wiki_get_wikis_by_courses(mod_wiki_get_wikis_by_courses_request)

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_wikis_by_courses200_response import ModWikiGetWikisByCourses200Response
from openapi_client.models.mod_wiki_get_wikis_by_courses_request import ModWikiGetWikisByCoursesRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_wikis_by_courses_request = openapi_client.ModWikiGetWikisByCoursesRequest() # ModWikiGetWikisByCoursesRequest | 

    try:
        # Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
        api_response = api_instance.mod_wiki_get_wikis_by_courses(mod_wiki_get_wikis_by_courses_request)
        print("The response of ModWikiApi->mod_wiki_get_wikis_by_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_get_wikis_by_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_wikis_by_courses_request** | [**ModWikiGetWikisByCoursesRequest**](ModWikiGetWikisByCoursesRequest.md)|  | 

### Return type

[**ModWikiGetWikisByCourses200Response**](ModWikiGetWikisByCourses200Response.md)

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

# **mod_wiki_new_page**
> ModWikiNewPage200Response mod_wiki_new_page(mod_wiki_new_page_request)

Create a new page in a subwiki.

Create a new page in a subwiki.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_new_page200_response import ModWikiNewPage200Response
from openapi_client.models.mod_wiki_new_page_request import ModWikiNewPageRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_new_page_request = openapi_client.ModWikiNewPageRequest() # ModWikiNewPageRequest | 

    try:
        # Create a new page in a subwiki.
        api_response = api_instance.mod_wiki_new_page(mod_wiki_new_page_request)
        print("The response of ModWikiApi->mod_wiki_new_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_new_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_new_page_request** | [**ModWikiNewPageRequest**](ModWikiNewPageRequest.md)|  | 

### Return type

[**ModWikiNewPage200Response**](ModWikiNewPage200Response.md)

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

# **mod_wiki_view_page**
> ModWikiViewPage200Response mod_wiki_view_page(mod_wiki_view_page_request)

Trigger the page viewed event and update the module completion status.

Trigger the page viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_view_page200_response import ModWikiViewPage200Response
from openapi_client.models.mod_wiki_view_page_request import ModWikiViewPageRequest
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_view_page_request = openapi_client.ModWikiViewPageRequest() # ModWikiViewPageRequest | 

    try:
        # Trigger the page viewed event and update the module completion status.
        api_response = api_instance.mod_wiki_view_page(mod_wiki_view_page_request)
        print("The response of ModWikiApi->mod_wiki_view_page:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_view_page: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_view_page_request** | [**ModWikiViewPageRequest**](ModWikiViewPageRequest.md)|  | 

### Return type

[**ModWikiViewPage200Response**](ModWikiViewPage200Response.md)

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

# **mod_wiki_view_wiki**
> ModWikiViewWiki200Response mod_wiki_view_wiki(mod_wiki_get_subwikis_request)

Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.mod_wiki_get_subwikis_request import ModWikiGetSubwikisRequest
from openapi_client.models.mod_wiki_view_wiki200_response import ModWikiViewWiki200Response
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
    api_instance = openapi_client.ModWikiApi(api_client)
    mod_wiki_get_subwikis_request = openapi_client.ModWikiGetSubwikisRequest() # ModWikiGetSubwikisRequest | 

    try:
        # Trigger the course module viewed event and update the module completion status.
        api_response = api_instance.mod_wiki_view_wiki(mod_wiki_get_subwikis_request)
        print("The response of ModWikiApi->mod_wiki_view_wiki:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ModWikiApi->mod_wiki_view_wiki: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_wiki_get_subwikis_request** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md)|  | 

### Return type

[**ModWikiViewWiki200Response**](ModWikiViewWiki200Response.md)

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

