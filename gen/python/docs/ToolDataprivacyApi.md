# openapi_client.ToolDataprivacyApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_dataprivacy_approve_data_request**](ToolDataprivacyApi.md#tool_dataprivacy_approve_data_request) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request
[**tool_dataprivacy_bulk_approve_data_requests**](ToolDataprivacyApi.md#tool_dataprivacy_bulk_approve_data_requests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests
[**tool_dataprivacy_bulk_deny_data_requests**](ToolDataprivacyApi.md#tool_dataprivacy_bulk_deny_data_requests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests
[**tool_dataprivacy_cancel_data_request**](ToolDataprivacyApi.md#tool_dataprivacy_cancel_data_request) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user
[**tool_dataprivacy_confirm_contexts_for_deletion**](ToolDataprivacyApi.md#tool_dataprivacy_confirm_contexts_for_deletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion
[**tool_dataprivacy_contact_dpo**](ToolDataprivacyApi.md#tool_dataprivacy_contact_dpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s)
[**tool_dataprivacy_create_category_form**](ToolDataprivacyApi.md#tool_dataprivacy_create_category_form) | **POST** /tool_dataprivacy_create_category_form | Adds a data category
[**tool_dataprivacy_create_purpose_form**](ToolDataprivacyApi.md#tool_dataprivacy_create_purpose_form) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose
[**tool_dataprivacy_delete_category**](ToolDataprivacyApi.md#tool_dataprivacy_delete_category) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category
[**tool_dataprivacy_delete_purpose**](ToolDataprivacyApi.md#tool_dataprivacy_delete_purpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose
[**tool_dataprivacy_deny_data_request**](ToolDataprivacyApi.md#tool_dataprivacy_deny_data_request) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request
[**tool_dataprivacy_get_activity_options**](ToolDataprivacyApi.md#tool_dataprivacy_get_activity_options) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options
[**tool_dataprivacy_get_category_options**](ToolDataprivacyApi.md#tool_dataprivacy_get_category_options) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options
[**tool_dataprivacy_get_data_request**](ToolDataprivacyApi.md#tool_dataprivacy_get_data_request) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request
[**tool_dataprivacy_get_purpose_options**](ToolDataprivacyApi.md#tool_dataprivacy_get_purpose_options) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options
[**tool_dataprivacy_get_users**](ToolDataprivacyApi.md#tool_dataprivacy_get_users) | **POST** /tool_dataprivacy_get_users | Fetches a list of users
[**tool_dataprivacy_mark_complete**](ToolDataprivacyApi.md#tool_dataprivacy_mark_complete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete
[**tool_dataprivacy_set_context_defaults**](ToolDataprivacyApi.md#tool_dataprivacy_set_context_defaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin)
[**tool_dataprivacy_set_context_form**](ToolDataprivacyApi.md#tool_dataprivacy_set_context_form) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context
[**tool_dataprivacy_set_contextlevel_form**](ToolDataprivacyApi.md#tool_dataprivacy_set_contextlevel_form) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level
[**tool_dataprivacy_submit_selected_courses_form**](ToolDataprivacyApi.md#tool_dataprivacy_submit_selected_courses_form) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export
[**tool_dataprivacy_tree_extra_branches**](ToolDataprivacyApi.md#tool_dataprivacy_tree_extra_branches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree


# **tool_dataprivacy_approve_data_request**
> CoreContentbankRenameContent200Response tool_dataprivacy_approve_data_request(tool_dataprivacy_approve_data_request_request)

Approve a data request

Approve a data request

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_approve_data_request_request import ToolDataprivacyApproveDataRequestRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_approve_data_request_request = openapi_client.ToolDataprivacyApproveDataRequestRequest() # ToolDataprivacyApproveDataRequestRequest | 

    try:
        # Approve a data request
        api_response = api_instance.tool_dataprivacy_approve_data_request(tool_dataprivacy_approve_data_request_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_approve_data_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_approve_data_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_approve_data_request_request** | [**ToolDataprivacyApproveDataRequestRequest**](ToolDataprivacyApproveDataRequestRequest.md)|  | 

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

# **tool_dataprivacy_bulk_approve_data_requests**
> CoreContentbankRenameContent200Response tool_dataprivacy_bulk_approve_data_requests(tool_dataprivacy_bulk_approve_data_requests_request)

Bulk approve data requests

Bulk approve data requests

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_bulk_approve_data_requests_request import ToolDataprivacyBulkApproveDataRequestsRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_bulk_approve_data_requests_request = openapi_client.ToolDataprivacyBulkApproveDataRequestsRequest() # ToolDataprivacyBulkApproveDataRequestsRequest | 

    try:
        # Bulk approve data requests
        api_response = api_instance.tool_dataprivacy_bulk_approve_data_requests(tool_dataprivacy_bulk_approve_data_requests_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_bulk_approve_data_requests:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_bulk_approve_data_requests: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_bulk_approve_data_requests_request** | [**ToolDataprivacyBulkApproveDataRequestsRequest**](ToolDataprivacyBulkApproveDataRequestsRequest.md)|  | 

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

# **tool_dataprivacy_bulk_deny_data_requests**
> CoreContentbankRenameContent200Response tool_dataprivacy_bulk_deny_data_requests(tool_dataprivacy_bulk_deny_data_requests_request)

Bulk deny data requests

Bulk deny data requests

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_bulk_deny_data_requests_request import ToolDataprivacyBulkDenyDataRequestsRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_bulk_deny_data_requests_request = openapi_client.ToolDataprivacyBulkDenyDataRequestsRequest() # ToolDataprivacyBulkDenyDataRequestsRequest | 

    try:
        # Bulk deny data requests
        api_response = api_instance.tool_dataprivacy_bulk_deny_data_requests(tool_dataprivacy_bulk_deny_data_requests_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_bulk_deny_data_requests:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_bulk_deny_data_requests: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_bulk_deny_data_requests_request** | [**ToolDataprivacyBulkDenyDataRequestsRequest**](ToolDataprivacyBulkDenyDataRequestsRequest.md)|  | 

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

# **tool_dataprivacy_cancel_data_request**
> CoreContentbankRenameContent200Response tool_dataprivacy_cancel_data_request(tool_dataprivacy_cancel_data_request_request)

Cancel the data request made by the user

Cancel the data request made by the user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_cancel_data_request_request import ToolDataprivacyCancelDataRequestRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_cancel_data_request_request = openapi_client.ToolDataprivacyCancelDataRequestRequest() # ToolDataprivacyCancelDataRequestRequest | 

    try:
        # Cancel the data request made by the user
        api_response = api_instance.tool_dataprivacy_cancel_data_request(tool_dataprivacy_cancel_data_request_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_cancel_data_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_cancel_data_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | 

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

# **tool_dataprivacy_confirm_contexts_for_deletion**
> ToolDataprivacyConfirmContextsForDeletion200Response tool_dataprivacy_confirm_contexts_for_deletion(tool_dataprivacy_confirm_contexts_for_deletion_request)

Mark the selected expired contexts as confirmed for deletion

Mark the selected expired contexts as confirmed for deletion

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_confirm_contexts_for_deletion200_response import ToolDataprivacyConfirmContextsForDeletion200Response
from openapi_client.models.tool_dataprivacy_confirm_contexts_for_deletion_request import ToolDataprivacyConfirmContextsForDeletionRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_confirm_contexts_for_deletion_request = openapi_client.ToolDataprivacyConfirmContextsForDeletionRequest() # ToolDataprivacyConfirmContextsForDeletionRequest | 

    try:
        # Mark the selected expired contexts as confirmed for deletion
        api_response = api_instance.tool_dataprivacy_confirm_contexts_for_deletion(tool_dataprivacy_confirm_contexts_for_deletion_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_confirm_contexts_for_deletion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_confirm_contexts_for_deletion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_confirm_contexts_for_deletion_request** | [**ToolDataprivacyConfirmContextsForDeletionRequest**](ToolDataprivacyConfirmContextsForDeletionRequest.md)|  | 

### Return type

[**ToolDataprivacyConfirmContextsForDeletion200Response**](ToolDataprivacyConfirmContextsForDeletion200Response.md)

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

# **tool_dataprivacy_contact_dpo**
> CoreContentbankRenameContent200Response tool_dataprivacy_contact_dpo(tool_dataprivacy_contact_dpo_request)

Contact the site Data Protection Officer(s)

Contact the site Data Protection Officer(s)

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_contact_dpo_request import ToolDataprivacyContactDpoRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_contact_dpo_request = openapi_client.ToolDataprivacyContactDpoRequest() # ToolDataprivacyContactDpoRequest | 

    try:
        # Contact the site Data Protection Officer(s)
        api_response = api_instance.tool_dataprivacy_contact_dpo(tool_dataprivacy_contact_dpo_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_contact_dpo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_contact_dpo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_contact_dpo_request** | [**ToolDataprivacyContactDpoRequest**](ToolDataprivacyContactDpoRequest.md)|  | 

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

# **tool_dataprivacy_create_category_form**
> ToolDataprivacyCreateCategoryForm200Response tool_dataprivacy_create_category_form(tool_dataprivacy_create_category_form_request)

Adds a data category

Adds a data category

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_create_category_form200_response import ToolDataprivacyCreateCategoryForm200Response
from openapi_client.models.tool_dataprivacy_create_category_form_request import ToolDataprivacyCreateCategoryFormRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_create_category_form_request = openapi_client.ToolDataprivacyCreateCategoryFormRequest() # ToolDataprivacyCreateCategoryFormRequest | 

    try:
        # Adds a data category
        api_response = api_instance.tool_dataprivacy_create_category_form(tool_dataprivacy_create_category_form_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_create_category_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_create_category_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_create_category_form_request** | [**ToolDataprivacyCreateCategoryFormRequest**](ToolDataprivacyCreateCategoryFormRequest.md)|  | 

### Return type

[**ToolDataprivacyCreateCategoryForm200Response**](ToolDataprivacyCreateCategoryForm200Response.md)

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

# **tool_dataprivacy_create_purpose_form**
> ToolDataprivacyCreatePurposeForm200Response tool_dataprivacy_create_purpose_form(tool_dataprivacy_create_purpose_form_request)

Adds a data purpose

Adds a data purpose

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_create_purpose_form200_response import ToolDataprivacyCreatePurposeForm200Response
from openapi_client.models.tool_dataprivacy_create_purpose_form_request import ToolDataprivacyCreatePurposeFormRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_create_purpose_form_request = openapi_client.ToolDataprivacyCreatePurposeFormRequest() # ToolDataprivacyCreatePurposeFormRequest | 

    try:
        # Adds a data purpose
        api_response = api_instance.tool_dataprivacy_create_purpose_form(tool_dataprivacy_create_purpose_form_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_create_purpose_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_create_purpose_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_create_purpose_form_request** | [**ToolDataprivacyCreatePurposeFormRequest**](ToolDataprivacyCreatePurposeFormRequest.md)|  | 

### Return type

[**ToolDataprivacyCreatePurposeForm200Response**](ToolDataprivacyCreatePurposeForm200Response.md)

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

# **tool_dataprivacy_delete_category**
> CoreContentbankRenameContent200Response tool_dataprivacy_delete_category(tool_dataprivacy_delete_category_request)

Deletes an existing data category

Deletes an existing data category

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_delete_category_request import ToolDataprivacyDeleteCategoryRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_delete_category_request = openapi_client.ToolDataprivacyDeleteCategoryRequest() # ToolDataprivacyDeleteCategoryRequest | 

    try:
        # Deletes an existing data category
        api_response = api_instance.tool_dataprivacy_delete_category(tool_dataprivacy_delete_category_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_delete_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_delete_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_delete_category_request** | [**ToolDataprivacyDeleteCategoryRequest**](ToolDataprivacyDeleteCategoryRequest.md)|  | 

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

# **tool_dataprivacy_delete_purpose**
> CoreContentbankRenameContent200Response tool_dataprivacy_delete_purpose(tool_dataprivacy_delete_purpose_request)

Deletes an existing data purpose

Deletes an existing data purpose

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_delete_purpose_request import ToolDataprivacyDeletePurposeRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_delete_purpose_request = openapi_client.ToolDataprivacyDeletePurposeRequest() # ToolDataprivacyDeletePurposeRequest | 

    try:
        # Deletes an existing data purpose
        api_response = api_instance.tool_dataprivacy_delete_purpose(tool_dataprivacy_delete_purpose_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_delete_purpose:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_delete_purpose: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_delete_purpose_request** | [**ToolDataprivacyDeletePurposeRequest**](ToolDataprivacyDeletePurposeRequest.md)|  | 

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

# **tool_dataprivacy_deny_data_request**
> CoreContentbankRenameContent200Response tool_dataprivacy_deny_data_request(tool_dataprivacy_cancel_data_request_request)

Deny a data request

Deny a data request

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_cancel_data_request_request import ToolDataprivacyCancelDataRequestRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_cancel_data_request_request = openapi_client.ToolDataprivacyCancelDataRequestRequest() # ToolDataprivacyCancelDataRequestRequest | 

    try:
        # Deny a data request
        api_response = api_instance.tool_dataprivacy_deny_data_request(tool_dataprivacy_cancel_data_request_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_deny_data_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_deny_data_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | 

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

# **tool_dataprivacy_get_activity_options**
> ToolDataprivacyGetActivityOptions200Response tool_dataprivacy_get_activity_options(tool_dataprivacy_get_activity_options_request)

Fetches a list of activity options

Fetches a list of activity options

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_get_activity_options200_response import ToolDataprivacyGetActivityOptions200Response
from openapi_client.models.tool_dataprivacy_get_activity_options_request import ToolDataprivacyGetActivityOptionsRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_get_activity_options_request = openapi_client.ToolDataprivacyGetActivityOptionsRequest() # ToolDataprivacyGetActivityOptionsRequest | 

    try:
        # Fetches a list of activity options
        api_response = api_instance.tool_dataprivacy_get_activity_options(tool_dataprivacy_get_activity_options_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_get_activity_options:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_get_activity_options: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_get_activity_options_request** | [**ToolDataprivacyGetActivityOptionsRequest**](ToolDataprivacyGetActivityOptionsRequest.md)|  | 

### Return type

[**ToolDataprivacyGetActivityOptions200Response**](ToolDataprivacyGetActivityOptions200Response.md)

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

# **tool_dataprivacy_get_category_options**
> ToolDataprivacyGetCategoryOptions200Response tool_dataprivacy_get_category_options(tool_dataprivacy_get_category_options_request)

Fetches a list of data category options

Fetches a list of data category options

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_get_category_options200_response import ToolDataprivacyGetCategoryOptions200Response
from openapi_client.models.tool_dataprivacy_get_category_options_request import ToolDataprivacyGetCategoryOptionsRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_get_category_options_request = openapi_client.ToolDataprivacyGetCategoryOptionsRequest() # ToolDataprivacyGetCategoryOptionsRequest | 

    try:
        # Fetches a list of data category options
        api_response = api_instance.tool_dataprivacy_get_category_options(tool_dataprivacy_get_category_options_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_get_category_options:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_get_category_options: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_get_category_options_request** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md)|  | 

### Return type

[**ToolDataprivacyGetCategoryOptions200Response**](ToolDataprivacyGetCategoryOptions200Response.md)

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

# **tool_dataprivacy_get_data_request**
> ToolDataprivacyGetDataRequest200Response tool_dataprivacy_get_data_request(tool_dataprivacy_cancel_data_request_request)

Fetch the details of a user's data request

Fetch the details of a user's data request

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_cancel_data_request_request import ToolDataprivacyCancelDataRequestRequest
from openapi_client.models.tool_dataprivacy_get_data_request200_response import ToolDataprivacyGetDataRequest200Response
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_cancel_data_request_request = openapi_client.ToolDataprivacyCancelDataRequestRequest() # ToolDataprivacyCancelDataRequestRequest | 

    try:
        # Fetch the details of a user's data request
        api_response = api_instance.tool_dataprivacy_get_data_request(tool_dataprivacy_cancel_data_request_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_get_data_request:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_get_data_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | 

### Return type

[**ToolDataprivacyGetDataRequest200Response**](ToolDataprivacyGetDataRequest200Response.md)

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

# **tool_dataprivacy_get_purpose_options**
> ToolDataprivacyGetPurposeOptions200Response tool_dataprivacy_get_purpose_options(tool_dataprivacy_get_category_options_request)

Fetches a list of data storage purpose options

Fetches a list of data storage purpose options

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_get_category_options_request import ToolDataprivacyGetCategoryOptionsRequest
from openapi_client.models.tool_dataprivacy_get_purpose_options200_response import ToolDataprivacyGetPurposeOptions200Response
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_get_category_options_request = openapi_client.ToolDataprivacyGetCategoryOptionsRequest() # ToolDataprivacyGetCategoryOptionsRequest | 

    try:
        # Fetches a list of data storage purpose options
        api_response = api_instance.tool_dataprivacy_get_purpose_options(tool_dataprivacy_get_category_options_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_get_purpose_options:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_get_purpose_options: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_get_category_options_request** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md)|  | 

### Return type

[**ToolDataprivacyGetPurposeOptions200Response**](ToolDataprivacyGetPurposeOptions200Response.md)

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

# **tool_dataprivacy_get_users**
> object tool_dataprivacy_get_users(tool_dataprivacy_get_users_request)

Fetches a list of users

Fetches a list of users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_get_users_request import ToolDataprivacyGetUsersRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_get_users_request = openapi_client.ToolDataprivacyGetUsersRequest() # ToolDataprivacyGetUsersRequest | 

    try:
        # Fetches a list of users
        api_response = api_instance.tool_dataprivacy_get_users(tool_dataprivacy_get_users_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_get_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_get_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_get_users_request** | [**ToolDataprivacyGetUsersRequest**](ToolDataprivacyGetUsersRequest.md)|  | 

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

# **tool_dataprivacy_mark_complete**
> CoreContentbankRenameContent200Response tool_dataprivacy_mark_complete(tool_dataprivacy_cancel_data_request_request)

Mark a user's general enquiry as complete

Mark a user's general enquiry as complete

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_cancel_data_request_request import ToolDataprivacyCancelDataRequestRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_cancel_data_request_request = openapi_client.ToolDataprivacyCancelDataRequestRequest() # ToolDataprivacyCancelDataRequestRequest | 

    try:
        # Mark a user's general enquiry as complete
        api_response = api_instance.tool_dataprivacy_mark_complete(tool_dataprivacy_cancel_data_request_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_mark_complete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_mark_complete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md)|  | 

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

# **tool_dataprivacy_set_context_defaults**
> ToolDataprivacySetContextDefaults200Response tool_dataprivacy_set_context_defaults(tool_dataprivacy_set_context_defaults_request)

Updates the default category and purpose for a given context level (and optionally, a plugin)

Updates the default category and purpose for a given context level (and optionally, a plugin)

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_set_context_defaults200_response import ToolDataprivacySetContextDefaults200Response
from openapi_client.models.tool_dataprivacy_set_context_defaults_request import ToolDataprivacySetContextDefaultsRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_set_context_defaults_request = openapi_client.ToolDataprivacySetContextDefaultsRequest() # ToolDataprivacySetContextDefaultsRequest | 

    try:
        # Updates the default category and purpose for a given context level (and optionally, a plugin)
        api_response = api_instance.tool_dataprivacy_set_context_defaults(tool_dataprivacy_set_context_defaults_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_set_context_defaults:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_set_context_defaults: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_set_context_defaults_request** | [**ToolDataprivacySetContextDefaultsRequest**](ToolDataprivacySetContextDefaultsRequest.md)|  | 

### Return type

[**ToolDataprivacySetContextDefaults200Response**](ToolDataprivacySetContextDefaults200Response.md)

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

# **tool_dataprivacy_set_context_form**
> ToolDataprivacySetContextForm200Response tool_dataprivacy_set_context_form(tool_dataprivacy_set_context_form_request)

Sets purpose and category for a specific context

Sets purpose and category for a specific context

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_set_context_form200_response import ToolDataprivacySetContextForm200Response
from openapi_client.models.tool_dataprivacy_set_context_form_request import ToolDataprivacySetContextFormRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_set_context_form_request = openapi_client.ToolDataprivacySetContextFormRequest() # ToolDataprivacySetContextFormRequest | 

    try:
        # Sets purpose and category for a specific context
        api_response = api_instance.tool_dataprivacy_set_context_form(tool_dataprivacy_set_context_form_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_set_context_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_set_context_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_set_context_form_request** | [**ToolDataprivacySetContextFormRequest**](ToolDataprivacySetContextFormRequest.md)|  | 

### Return type

[**ToolDataprivacySetContextForm200Response**](ToolDataprivacySetContextForm200Response.md)

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

# **tool_dataprivacy_set_contextlevel_form**
> ToolDataprivacySetContextlevelForm200Response tool_dataprivacy_set_contextlevel_form(tool_dataprivacy_set_contextlevel_form_request)

Sets purpose and category across a context level

Sets purpose and category across a context level

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_set_contextlevel_form200_response import ToolDataprivacySetContextlevelForm200Response
from openapi_client.models.tool_dataprivacy_set_contextlevel_form_request import ToolDataprivacySetContextlevelFormRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_set_contextlevel_form_request = openapi_client.ToolDataprivacySetContextlevelFormRequest() # ToolDataprivacySetContextlevelFormRequest | 

    try:
        # Sets purpose and category across a context level
        api_response = api_instance.tool_dataprivacy_set_contextlevel_form(tool_dataprivacy_set_contextlevel_form_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_set_contextlevel_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_set_contextlevel_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_set_contextlevel_form_request** | [**ToolDataprivacySetContextlevelFormRequest**](ToolDataprivacySetContextlevelFormRequest.md)|  | 

### Return type

[**ToolDataprivacySetContextlevelForm200Response**](ToolDataprivacySetContextlevelForm200Response.md)

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

# **tool_dataprivacy_submit_selected_courses_form**
> CoreContentbankRenameContent200Response tool_dataprivacy_submit_selected_courses_form(tool_dataprivacy_submit_selected_courses_form_request)

Save list of selected courses for export

Save list of selected courses for export

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.core_contentbank_rename_content200_response import CoreContentbankRenameContent200Response
from openapi_client.models.tool_dataprivacy_submit_selected_courses_form_request import ToolDataprivacySubmitSelectedCoursesFormRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_submit_selected_courses_form_request = openapi_client.ToolDataprivacySubmitSelectedCoursesFormRequest() # ToolDataprivacySubmitSelectedCoursesFormRequest | 

    try:
        # Save list of selected courses for export
        api_response = api_instance.tool_dataprivacy_submit_selected_courses_form(tool_dataprivacy_submit_selected_courses_form_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_submit_selected_courses_form:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_submit_selected_courses_form: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_submit_selected_courses_form_request** | [**ToolDataprivacySubmitSelectedCoursesFormRequest**](ToolDataprivacySubmitSelectedCoursesFormRequest.md)|  | 

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

# **tool_dataprivacy_tree_extra_branches**
> ToolDataprivacyTreeExtraBranches200Response tool_dataprivacy_tree_extra_branches(tool_dataprivacy_tree_extra_branches_request)

Return branches for the context tree

Return branches for the context tree

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.tool_dataprivacy_tree_extra_branches200_response import ToolDataprivacyTreeExtraBranches200Response
from openapi_client.models.tool_dataprivacy_tree_extra_branches_request import ToolDataprivacyTreeExtraBranchesRequest
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
    api_instance = openapi_client.ToolDataprivacyApi(api_client)
    tool_dataprivacy_tree_extra_branches_request = openapi_client.ToolDataprivacyTreeExtraBranchesRequest() # ToolDataprivacyTreeExtraBranchesRequest | 

    try:
        # Return branches for the context tree
        api_response = api_instance.tool_dataprivacy_tree_extra_branches(tool_dataprivacy_tree_extra_branches_request)
        print("The response of ToolDataprivacyApi->tool_dataprivacy_tree_extra_branches:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ToolDataprivacyApi->tool_dataprivacy_tree_extra_branches: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tool_dataprivacy_tree_extra_branches_request** | [**ToolDataprivacyTreeExtraBranchesRequest**](ToolDataprivacyTreeExtraBranchesRequest.md)|  | 

### Return type

[**ToolDataprivacyTreeExtraBranches200Response**](ToolDataprivacyTreeExtraBranches200Response.md)

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

