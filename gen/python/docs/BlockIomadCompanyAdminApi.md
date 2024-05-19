# openapi_client.BlockIomadCompanyAdminApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block_iomad_company_admin_allocate_licenses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_allocate_licenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user
[**block_iomad_company_admin_assign_courses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_assign_courses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company
[**block_iomad_company_admin_assign_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_assign_users) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company
[**block_iomad_company_admin_capability_delete_template**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_capability_delete_template) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template
[**block_iomad_company_admin_check_token**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_check_token) | **POST** /block_iomad_company_admin_check_token | Check SSO token
[**block_iomad_company_admin_create_companies**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_create_companies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies
[**block_iomad_company_admin_create_licenses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_create_licenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses
[**block_iomad_company_admin_delete_licenses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_delete_licenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses
[**block_iomad_company_admin_edit_companies**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_edit_companies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies
[**block_iomad_company_admin_edit_licenses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_edit_licenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings
[**block_iomad_company_admin_enrol_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_enrol_users) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses
[**block_iomad_company_admin_get_companies**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_companies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies
[**block_iomad_company_admin_get_company_courses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_company_courses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations
[**block_iomad_company_admin_get_course_info**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_course_info) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings
[**block_iomad_company_admin_get_department_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_department_users) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department
[**block_iomad_company_admin_get_departments**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_departments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments
[**block_iomad_company_admin_get_license_from_id**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_license_from_id) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID
[**block_iomad_company_admin_get_license_info**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_get_license_info) | **POST** /block_iomad_company_admin_get_license_info | Get company license information
[**block_iomad_company_admin_move_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_move_users) | **POST** /block_iomad_company_admin_move_users | Move users between departments
[**block_iomad_company_admin_restrict_capability**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_restrict_capability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability
[**block_iomad_company_admin_sync_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_sync_users) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system
[**block_iomad_company_admin_unallocate_licenses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_unallocate_licenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users
[**block_iomad_company_admin_unassign_courses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_unassign_courses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company
[**block_iomad_company_admin_unassign_users**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_unassign_users) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company
[**block_iomad_company_admin_update_courses**](BlockIomadCompanyAdminApi.md#block_iomad_company_admin_update_courses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings


# **block_iomad_company_admin_allocate_licenses**
> object block_iomad_company_admin_allocate_licenses(block_iomad_company_admin_allocate_licenses_request)

Allocate course licenses to a user

Allocate course licenses to a user

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_allocate_licenses_request import BlockIomadCompanyAdminAllocateLicensesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_allocate_licenses_request = openapi_client.BlockIomadCompanyAdminAllocateLicensesRequest() # BlockIomadCompanyAdminAllocateLicensesRequest | 

    try:
        # Allocate course licenses to a user
        api_response = api_instance.block_iomad_company_admin_allocate_licenses(block_iomad_company_admin_allocate_licenses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_allocate_licenses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_allocate_licenses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_allocate_licenses_request** | [**BlockIomadCompanyAdminAllocateLicensesRequest**](BlockIomadCompanyAdminAllocateLicensesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_assign_courses**
> object block_iomad_company_admin_assign_courses(block_iomad_company_admin_assign_courses_request)

Assign a course to a company

Assign a course to a company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_assign_courses_request import BlockIomadCompanyAdminAssignCoursesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_assign_courses_request = openapi_client.BlockIomadCompanyAdminAssignCoursesRequest() # BlockIomadCompanyAdminAssignCoursesRequest | 

    try:
        # Assign a course to a company
        api_response = api_instance.block_iomad_company_admin_assign_courses(block_iomad_company_admin_assign_courses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_assign_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_assign_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_assign_courses_request** | [**BlockIomadCompanyAdminAssignCoursesRequest**](BlockIomadCompanyAdminAssignCoursesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_assign_users**
> BlockIomadCompanyAdminAssignUsers200Response block_iomad_company_admin_assign_users(block_iomad_company_admin_assign_users_request)

Assign users to a company

Assign users to a company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_assign_users200_response import BlockIomadCompanyAdminAssignUsers200Response
from openapi_client.models.block_iomad_company_admin_assign_users_request import BlockIomadCompanyAdminAssignUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_assign_users_request = openapi_client.BlockIomadCompanyAdminAssignUsersRequest() # BlockIomadCompanyAdminAssignUsersRequest | 

    try:
        # Assign users to a company
        api_response = api_instance.block_iomad_company_admin_assign_users(block_iomad_company_admin_assign_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_assign_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_assign_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_assign_users_request** | [**BlockIomadCompanyAdminAssignUsersRequest**](BlockIomadCompanyAdminAssignUsersRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminAssignUsers200Response**](BlockIomadCompanyAdminAssignUsers200Response.md)

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

# **block_iomad_company_admin_capability_delete_template**
> object block_iomad_company_admin_capability_delete_template(block_iomad_company_admin_capability_delete_template_request)

Delete Iomad capabilities template

Delete Iomad capabilities template

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_capability_delete_template_request import BlockIomadCompanyAdminCapabilityDeleteTemplateRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_capability_delete_template_request = openapi_client.BlockIomadCompanyAdminCapabilityDeleteTemplateRequest() # BlockIomadCompanyAdminCapabilityDeleteTemplateRequest | 

    try:
        # Delete Iomad capabilities template
        api_response = api_instance.block_iomad_company_admin_capability_delete_template(block_iomad_company_admin_capability_delete_template_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_capability_delete_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_capability_delete_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_capability_delete_template_request** | [**BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md)|  | 

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
**200** | True capability update succeeds |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_check_token**
> BlockIomadCompanyAdminCheckToken200Response block_iomad_company_admin_check_token(block_iomad_company_admin_check_token_request)

Check SSO token

Check SSO token

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_check_token200_response import BlockIomadCompanyAdminCheckToken200Response
from openapi_client.models.block_iomad_company_admin_check_token_request import BlockIomadCompanyAdminCheckTokenRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_check_token_request = openapi_client.BlockIomadCompanyAdminCheckTokenRequest() # BlockIomadCompanyAdminCheckTokenRequest | 

    try:
        # Check SSO token
        api_response = api_instance.block_iomad_company_admin_check_token(block_iomad_company_admin_check_token_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_check_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_check_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_check_token_request** | [**BlockIomadCompanyAdminCheckTokenRequest**](BlockIomadCompanyAdminCheckTokenRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminCheckToken200Response**](BlockIomadCompanyAdminCheckToken200Response.md)

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

# **block_iomad_company_admin_create_companies**
> object block_iomad_company_admin_create_companies(block_iomad_company_admin_create_companies_request)

Create new Iomad companies

Create new Iomad companies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_create_companies_request import BlockIomadCompanyAdminCreateCompaniesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_create_companies_request = openapi_client.BlockIomadCompanyAdminCreateCompaniesRequest() # BlockIomadCompanyAdminCreateCompaniesRequest | 

    try:
        # Create new Iomad companies
        api_response = api_instance.block_iomad_company_admin_create_companies(block_iomad_company_admin_create_companies_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_create_companies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_create_companies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_create_companies_request** | [**BlockIomadCompanyAdminCreateCompaniesRequest**](BlockIomadCompanyAdminCreateCompaniesRequest.md)|  | 

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

# **block_iomad_company_admin_create_licenses**
> object block_iomad_company_admin_create_licenses(block_iomad_company_admin_create_licenses_request)

Create company licenses

Create company licenses

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_create_licenses_request import BlockIomadCompanyAdminCreateLicensesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_create_licenses_request = openapi_client.BlockIomadCompanyAdminCreateLicensesRequest() # BlockIomadCompanyAdminCreateLicensesRequest | 

    try:
        # Create company licenses
        api_response = api_instance.block_iomad_company_admin_create_licenses(block_iomad_company_admin_create_licenses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_create_licenses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_create_licenses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_create_licenses_request** | [**BlockIomadCompanyAdminCreateLicensesRequest**](BlockIomadCompanyAdminCreateLicensesRequest.md)|  | 

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

# **block_iomad_company_admin_delete_licenses**
> object block_iomad_company_admin_delete_licenses(block_iomad_company_admin_delete_licenses_request)

Delete company licenses

Delete company licenses

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_delete_licenses_request import BlockIomadCompanyAdminDeleteLicensesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_delete_licenses_request = openapi_client.BlockIomadCompanyAdminDeleteLicensesRequest() # BlockIomadCompanyAdminDeleteLicensesRequest | 

    try:
        # Delete company licenses
        api_response = api_instance.block_iomad_company_admin_delete_licenses(block_iomad_company_admin_delete_licenses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_delete_licenses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_delete_licenses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_delete_licenses_request** | [**BlockIomadCompanyAdminDeleteLicensesRequest**](BlockIomadCompanyAdminDeleteLicensesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_edit_companies**
> object block_iomad_company_admin_edit_companies(block_iomad_company_admin_edit_companies_request)

Edit Iomad companies

Edit Iomad companies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_edit_companies_request import BlockIomadCompanyAdminEditCompaniesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_edit_companies_request = openapi_client.BlockIomadCompanyAdminEditCompaniesRequest() # BlockIomadCompanyAdminEditCompaniesRequest | 

    try:
        # Edit Iomad companies
        api_response = api_instance.block_iomad_company_admin_edit_companies(block_iomad_company_admin_edit_companies_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_edit_companies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_edit_companies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_edit_companies_request** | [**BlockIomadCompanyAdminEditCompaniesRequest**](BlockIomadCompanyAdminEditCompaniesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_edit_licenses**
> object block_iomad_company_admin_edit_licenses(block_iomad_company_admin_edit_licenses_request)

Edit company license settings

Edit company license settings

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_edit_licenses_request import BlockIomadCompanyAdminEditLicensesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_edit_licenses_request = openapi_client.BlockIomadCompanyAdminEditLicensesRequest() # BlockIomadCompanyAdminEditLicensesRequest | 

    try:
        # Edit company license settings
        api_response = api_instance.block_iomad_company_admin_edit_licenses(block_iomad_company_admin_edit_licenses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_edit_licenses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_edit_licenses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_edit_licenses_request** | [**BlockIomadCompanyAdminEditLicensesRequest**](BlockIomadCompanyAdminEditLicensesRequest.md)|  | 

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

# **block_iomad_company_admin_enrol_users**
> object block_iomad_company_admin_enrol_users(block_iomad_company_admin_enrol_users_request)

Assign users onto courses

Assign users onto courses

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_enrol_users_request import BlockIomadCompanyAdminEnrolUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_enrol_users_request = openapi_client.BlockIomadCompanyAdminEnrolUsersRequest() # BlockIomadCompanyAdminEnrolUsersRequest | 

    try:
        # Assign users onto courses
        api_response = api_instance.block_iomad_company_admin_enrol_users(block_iomad_company_admin_enrol_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_enrol_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_enrol_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_enrol_users_request** | [**BlockIomadCompanyAdminEnrolUsersRequest**](BlockIomadCompanyAdminEnrolUsersRequest.md)|  | 

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
**200** | True user enrolments succeeds |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_get_companies**
> BlockIomadCompanyAdminGetCompanies200Response block_iomad_company_admin_get_companies(block_iomad_company_admin_get_companies_request)

Get all Iomad companies

Get all Iomad companies

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_companies200_response import BlockIomadCompanyAdminGetCompanies200Response
from openapi_client.models.block_iomad_company_admin_get_companies_request import BlockIomadCompanyAdminGetCompaniesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_companies_request = openapi_client.BlockIomadCompanyAdminGetCompaniesRequest() # BlockIomadCompanyAdminGetCompaniesRequest | 

    try:
        # Get all Iomad companies
        api_response = api_instance.block_iomad_company_admin_get_companies(block_iomad_company_admin_get_companies_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_companies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_companies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_companies_request** | [**BlockIomadCompanyAdminGetCompaniesRequest**](BlockIomadCompanyAdminGetCompaniesRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetCompanies200Response**](BlockIomadCompanyAdminGetCompanies200Response.md)

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

# **block_iomad_company_admin_get_company_courses**
> BlockIomadCompanyAdminGetCompanyCourses200Response block_iomad_company_admin_get_company_courses(block_iomad_company_admin_get_company_courses_request)

Get Iomad company course allocations

Get Iomad company course allocations

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_company_courses200_response import BlockIomadCompanyAdminGetCompanyCourses200Response
from openapi_client.models.block_iomad_company_admin_get_company_courses_request import BlockIomadCompanyAdminGetCompanyCoursesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_company_courses_request = openapi_client.BlockIomadCompanyAdminGetCompanyCoursesRequest() # BlockIomadCompanyAdminGetCompanyCoursesRequest | 

    try:
        # Get Iomad company course allocations
        api_response = api_instance.block_iomad_company_admin_get_company_courses(block_iomad_company_admin_get_company_courses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_company_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_company_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_company_courses_request** | [**BlockIomadCompanyAdminGetCompanyCoursesRequest**](BlockIomadCompanyAdminGetCompanyCoursesRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetCompanyCourses200Response**](BlockIomadCompanyAdminGetCompanyCourses200Response.md)

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

# **block_iomad_company_admin_get_course_info**
> object block_iomad_company_admin_get_course_info(block_iomad_company_admin_get_course_info_request)

Get Iomad course settings

Get Iomad course settings

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_course_info_request import BlockIomadCompanyAdminGetCourseInfoRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_course_info_request = openapi_client.BlockIomadCompanyAdminGetCourseInfoRequest() # BlockIomadCompanyAdminGetCourseInfoRequest | 

    try:
        # Get Iomad course settings
        api_response = api_instance.block_iomad_company_admin_get_course_info(block_iomad_company_admin_get_course_info_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_course_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_course_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_course_info_request** | [**BlockIomadCompanyAdminGetCourseInfoRequest**](BlockIomadCompanyAdminGetCourseInfoRequest.md)|  | 

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

# **block_iomad_company_admin_get_department_users**
> BlockIomadCompanyAdminGetDepartmentUsers200Response block_iomad_company_admin_get_department_users(block_iomad_company_admin_get_department_users_request)

Get users within a department

Get users within a department

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_department_users200_response import BlockIomadCompanyAdminGetDepartmentUsers200Response
from openapi_client.models.block_iomad_company_admin_get_department_users_request import BlockIomadCompanyAdminGetDepartmentUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_department_users_request = openapi_client.BlockIomadCompanyAdminGetDepartmentUsersRequest() # BlockIomadCompanyAdminGetDepartmentUsersRequest | 

    try:
        # Get users within a department
        api_response = api_instance.block_iomad_company_admin_get_department_users(block_iomad_company_admin_get_department_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_department_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_department_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_department_users_request** | [**BlockIomadCompanyAdminGetDepartmentUsersRequest**](BlockIomadCompanyAdminGetDepartmentUsersRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetDepartmentUsers200Response**](BlockIomadCompanyAdminGetDepartmentUsers200Response.md)

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

# **block_iomad_company_admin_get_departments**
> BlockIomadCompanyAdminGetDepartments200Response block_iomad_company_admin_get_departments(block_iomad_company_admin_get_departments_request)

Get all company departments

Get all company departments

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_departments200_response import BlockIomadCompanyAdminGetDepartments200Response
from openapi_client.models.block_iomad_company_admin_get_departments_request import BlockIomadCompanyAdminGetDepartmentsRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_departments_request = openapi_client.BlockIomadCompanyAdminGetDepartmentsRequest() # BlockIomadCompanyAdminGetDepartmentsRequest | 

    try:
        # Get all company departments
        api_response = api_instance.block_iomad_company_admin_get_departments(block_iomad_company_admin_get_departments_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_departments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_departments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_departments_request** | [**BlockIomadCompanyAdminGetDepartmentsRequest**](BlockIomadCompanyAdminGetDepartmentsRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetDepartments200Response**](BlockIomadCompanyAdminGetDepartments200Response.md)

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

# **block_iomad_company_admin_get_license_from_id**
> BlockIomadCompanyAdminGetLicenseFromId200Response block_iomad_company_admin_get_license_from_id(block_iomad_company_admin_get_license_from_id_request)

Get licence data give the ID

Get licence data give the ID

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_license_from_id200_response import BlockIomadCompanyAdminGetLicenseFromId200Response
from openapi_client.models.block_iomad_company_admin_get_license_from_id_request import BlockIomadCompanyAdminGetLicenseFromIdRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_license_from_id_request = openapi_client.BlockIomadCompanyAdminGetLicenseFromIdRequest() # BlockIomadCompanyAdminGetLicenseFromIdRequest | 

    try:
        # Get licence data give the ID
        api_response = api_instance.block_iomad_company_admin_get_license_from_id(block_iomad_company_admin_get_license_from_id_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_license_from_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_license_from_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_license_from_id_request** | [**BlockIomadCompanyAdminGetLicenseFromIdRequest**](BlockIomadCompanyAdminGetLicenseFromIdRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetLicenseFromId200Response**](BlockIomadCompanyAdminGetLicenseFromId200Response.md)

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

# **block_iomad_company_admin_get_license_info**
> BlockIomadCompanyAdminGetLicenseInfo200Response block_iomad_company_admin_get_license_info(block_iomad_company_admin_get_license_info_request)

Get company license information

Get company license information

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_get_license_info200_response import BlockIomadCompanyAdminGetLicenseInfo200Response
from openapi_client.models.block_iomad_company_admin_get_license_info_request import BlockIomadCompanyAdminGetLicenseInfoRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_get_license_info_request = openapi_client.BlockIomadCompanyAdminGetLicenseInfoRequest() # BlockIomadCompanyAdminGetLicenseInfoRequest | 

    try:
        # Get company license information
        api_response = api_instance.block_iomad_company_admin_get_license_info(block_iomad_company_admin_get_license_info_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_get_license_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_get_license_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_get_license_info_request** | [**BlockIomadCompanyAdminGetLicenseInfoRequest**](BlockIomadCompanyAdminGetLicenseInfoRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminGetLicenseInfo200Response**](BlockIomadCompanyAdminGetLicenseInfo200Response.md)

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

# **block_iomad_company_admin_move_users**
> object block_iomad_company_admin_move_users(block_iomad_company_admin_move_users_request)

Move users between departments

Move users between departments

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_move_users_request import BlockIomadCompanyAdminMoveUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_move_users_request = openapi_client.BlockIomadCompanyAdminMoveUsersRequest() # BlockIomadCompanyAdminMoveUsersRequest | 

    try:
        # Move users between departments
        api_response = api_instance.block_iomad_company_admin_move_users(block_iomad_company_admin_move_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_move_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_move_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_move_users_request** | [**BlockIomadCompanyAdminMoveUsersRequest**](BlockIomadCompanyAdminMoveUsersRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_restrict_capability**
> object block_iomad_company_admin_restrict_capability(block_iomad_company_admin_restrict_capability_request)

set/reset Iomad capability

set/reset Iomad capability

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_restrict_capability_request import BlockIomadCompanyAdminRestrictCapabilityRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_restrict_capability_request = openapi_client.BlockIomadCompanyAdminRestrictCapabilityRequest() # BlockIomadCompanyAdminRestrictCapabilityRequest | 

    try:
        # set/reset Iomad capability
        api_response = api_instance.block_iomad_company_admin_restrict_capability(block_iomad_company_admin_restrict_capability_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_restrict_capability:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_restrict_capability: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_restrict_capability_request** | [**BlockIomadCompanyAdminRestrictCapabilityRequest**](BlockIomadCompanyAdminRestrictCapabilityRequest.md)|  | 

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
**200** | True capability update succeeds |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_sync_users**
> BlockIomadCompanyAdminSyncUsers200Response block_iomad_company_admin_sync_users(block_iomad_company_admin_sync_users_request)

Call update users to sync to external system

Call update users to sync to external system

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_sync_users200_response import BlockIomadCompanyAdminSyncUsers200Response
from openapi_client.models.block_iomad_company_admin_sync_users_request import BlockIomadCompanyAdminSyncUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_sync_users_request = openapi_client.BlockIomadCompanyAdminSyncUsersRequest() # BlockIomadCompanyAdminSyncUsersRequest | 

    try:
        # Call update users to sync to external system
        api_response = api_instance.block_iomad_company_admin_sync_users(block_iomad_company_admin_sync_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_sync_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_sync_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_sync_users_request** | [**BlockIomadCompanyAdminSyncUsersRequest**](BlockIomadCompanyAdminSyncUsersRequest.md)|  | 

### Return type

[**BlockIomadCompanyAdminSyncUsers200Response**](BlockIomadCompanyAdminSyncUsers200Response.md)

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

# **block_iomad_company_admin_unallocate_licenses**
> object block_iomad_company_admin_unallocate_licenses(block_iomad_company_admin_unallocate_licenses_request)

Remove course licenses from users

Remove course licenses from users

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_unallocate_licenses_request import BlockIomadCompanyAdminUnallocateLicensesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_unallocate_licenses_request = openapi_client.BlockIomadCompanyAdminUnallocateLicensesRequest() # BlockIomadCompanyAdminUnallocateLicensesRequest | 

    try:
        # Remove course licenses from users
        api_response = api_instance.block_iomad_company_admin_unallocate_licenses(block_iomad_company_admin_unallocate_licenses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_unallocate_licenses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_unallocate_licenses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_unallocate_licenses_request** | [**BlockIomadCompanyAdminUnallocateLicensesRequest**](BlockIomadCompanyAdminUnallocateLicensesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_unassign_courses**
> object block_iomad_company_admin_unassign_courses(block_iomad_company_admin_unassign_courses_request)

Unassign a course from a company

Unassign a course from a company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_unassign_courses_request import BlockIomadCompanyAdminUnassignCoursesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_unassign_courses_request = openapi_client.BlockIomadCompanyAdminUnassignCoursesRequest() # BlockIomadCompanyAdminUnassignCoursesRequest | 

    try:
        # Unassign a course from a company
        api_response = api_instance.block_iomad_company_admin_unassign_courses(block_iomad_company_admin_unassign_courses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_unassign_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_unassign_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_unassign_courses_request** | [**BlockIomadCompanyAdminUnassignCoursesRequest**](BlockIomadCompanyAdminUnassignCoursesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_unassign_users**
> object block_iomad_company_admin_unassign_users(block_iomad_company_admin_unassign_users_request)

Unassign users from a company

Unassign users from a company

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_unassign_users_request import BlockIomadCompanyAdminUnassignUsersRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_unassign_users_request = openapi_client.BlockIomadCompanyAdminUnassignUsersRequest() # BlockIomadCompanyAdminUnassignUsersRequest | 

    try:
        # Unassign users from a company
        api_response = api_instance.block_iomad_company_admin_unassign_users(block_iomad_company_admin_unassign_users_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_unassign_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_unassign_users: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_unassign_users_request** | [**BlockIomadCompanyAdminUnassignUsersRequest**](BlockIomadCompanyAdminUnassignUsersRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **block_iomad_company_admin_update_courses**
> object block_iomad_company_admin_update_courses(block_iomad_company_admin_update_courses_request)

Update Iomad course settings

Update Iomad course settings

### Example

* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.block_iomad_company_admin_update_courses_request import BlockIomadCompanyAdminUpdateCoursesRequest
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
    api_instance = openapi_client.BlockIomadCompanyAdminApi(api_client)
    block_iomad_company_admin_update_courses_request = openapi_client.BlockIomadCompanyAdminUpdateCoursesRequest() # BlockIomadCompanyAdminUpdateCoursesRequest | 

    try:
        # Update Iomad course settings
        api_response = api_instance.block_iomad_company_admin_update_courses(block_iomad_company_admin_update_courses_request)
        print("The response of BlockIomadCompanyAdminApi->block_iomad_company_admin_update_courses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BlockIomadCompanyAdminApi->block_iomad_company_admin_update_courses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_iomad_company_admin_update_courses_request** | [**BlockIomadCompanyAdminUpdateCoursesRequest**](BlockIomadCompanyAdminUpdateCoursesRequest.md)|  | 

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
**200** | Success or failure |  -  |
**400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

