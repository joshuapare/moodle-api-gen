# \BlockIomadCompanyAdminApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

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



## block_iomad_company_admin_allocate_licenses

> serde_json::Value block_iomad_company_admin_allocate_licenses(block_iomad_company_admin_allocate_licenses_request)
Allocate course licenses to a user

Allocate course licenses to a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_allocate_licenses_request** | [**BlockIomadCompanyAdminAllocateLicensesRequest**](BlockIomadCompanyAdminAllocateLicensesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_assign_courses

> serde_json::Value block_iomad_company_admin_assign_courses(block_iomad_company_admin_assign_courses_request)
Assign a course to a company

Assign a course to a company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_assign_courses_request** | [**BlockIomadCompanyAdminAssignCoursesRequest**](BlockIomadCompanyAdminAssignCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_assign_users

> models::BlockIomadCompanyAdminAssignUsers200Response block_iomad_company_admin_assign_users(block_iomad_company_admin_assign_users_request)
Assign users to a company

Assign users to a company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_assign_users_request** | [**BlockIomadCompanyAdminAssignUsersRequest**](BlockIomadCompanyAdminAssignUsersRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminAssignUsers200Response**](block_iomad_company_admin_assign_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_capability_delete_template

> serde_json::Value block_iomad_company_admin_capability_delete_template(block_iomad_company_admin_capability_delete_template_request)
Delete Iomad capabilities template

Delete Iomad capabilities template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_capability_delete_template_request** | [**BlockIomadCompanyAdminCapabilityDeleteTemplateRequest**](BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_check_token

> models::BlockIomadCompanyAdminCheckToken200Response block_iomad_company_admin_check_token(block_iomad_company_admin_check_token_request)
Check SSO token

Check SSO token

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_check_token_request** | [**BlockIomadCompanyAdminCheckTokenRequest**](BlockIomadCompanyAdminCheckTokenRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminCheckToken200Response**](block_iomad_company_admin_check_token_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_create_companies

> serde_json::Value block_iomad_company_admin_create_companies(block_iomad_company_admin_create_companies_request)
Create new Iomad companies

Create new Iomad companies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_create_companies_request** | [**BlockIomadCompanyAdminCreateCompaniesRequest**](BlockIomadCompanyAdminCreateCompaniesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_create_licenses

> serde_json::Value block_iomad_company_admin_create_licenses(block_iomad_company_admin_create_licenses_request)
Create company licenses

Create company licenses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_create_licenses_request** | [**BlockIomadCompanyAdminCreateLicensesRequest**](BlockIomadCompanyAdminCreateLicensesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_delete_licenses

> serde_json::Value block_iomad_company_admin_delete_licenses(block_iomad_company_admin_delete_licenses_request)
Delete company licenses

Delete company licenses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_delete_licenses_request** | [**BlockIomadCompanyAdminDeleteLicensesRequest**](BlockIomadCompanyAdminDeleteLicensesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_edit_companies

> serde_json::Value block_iomad_company_admin_edit_companies(block_iomad_company_admin_edit_companies_request)
Edit Iomad companies

Edit Iomad companies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_edit_companies_request** | [**BlockIomadCompanyAdminEditCompaniesRequest**](BlockIomadCompanyAdminEditCompaniesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_edit_licenses

> serde_json::Value block_iomad_company_admin_edit_licenses(block_iomad_company_admin_edit_licenses_request)
Edit company license settings

Edit company license settings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_edit_licenses_request** | [**BlockIomadCompanyAdminEditLicensesRequest**](BlockIomadCompanyAdminEditLicensesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_enrol_users

> serde_json::Value block_iomad_company_admin_enrol_users(block_iomad_company_admin_enrol_users_request)
Assign users onto courses

Assign users onto courses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_enrol_users_request** | [**BlockIomadCompanyAdminEnrolUsersRequest**](BlockIomadCompanyAdminEnrolUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_companies

> models::BlockIomadCompanyAdminGetCompanies200Response block_iomad_company_admin_get_companies(block_iomad_company_admin_get_companies_request)
Get all Iomad companies

Get all Iomad companies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_companies_request** | [**BlockIomadCompanyAdminGetCompaniesRequest**](BlockIomadCompanyAdminGetCompaniesRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetCompanies200Response**](block_iomad_company_admin_get_companies_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_company_courses

> models::BlockIomadCompanyAdminGetCompanyCourses200Response block_iomad_company_admin_get_company_courses(block_iomad_company_admin_get_company_courses_request)
Get Iomad company course allocations

Get Iomad company course allocations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_company_courses_request** | [**BlockIomadCompanyAdminGetCompanyCoursesRequest**](BlockIomadCompanyAdminGetCompanyCoursesRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetCompanyCourses200Response**](block_iomad_company_admin_get_company_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_course_info

> serde_json::Value block_iomad_company_admin_get_course_info(block_iomad_company_admin_get_course_info_request)
Get Iomad course settings

Get Iomad course settings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_course_info_request** | [**BlockIomadCompanyAdminGetCourseInfoRequest**](BlockIomadCompanyAdminGetCourseInfoRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_department_users

> models::BlockIomadCompanyAdminGetDepartmentUsers200Response block_iomad_company_admin_get_department_users(block_iomad_company_admin_get_department_users_request)
Get users within a department

Get users within a department

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_department_users_request** | [**BlockIomadCompanyAdminGetDepartmentUsersRequest**](BlockIomadCompanyAdminGetDepartmentUsersRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetDepartmentUsers200Response**](block_iomad_company_admin_get_department_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_departments

> models::BlockIomadCompanyAdminGetDepartments200Response block_iomad_company_admin_get_departments(block_iomad_company_admin_get_departments_request)
Get all company departments

Get all company departments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_departments_request** | [**BlockIomadCompanyAdminGetDepartmentsRequest**](BlockIomadCompanyAdminGetDepartmentsRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetDepartments200Response**](block_iomad_company_admin_get_departments_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_license_from_id

> models::BlockIomadCompanyAdminGetLicenseFromId200Response block_iomad_company_admin_get_license_from_id(block_iomad_company_admin_get_license_from_id_request)
Get licence data give the ID

Get licence data give the ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_license_from_id_request** | [**BlockIomadCompanyAdminGetLicenseFromIdRequest**](BlockIomadCompanyAdminGetLicenseFromIdRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetLicenseFromId200Response**](block_iomad_company_admin_get_license_from_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_get_license_info

> models::BlockIomadCompanyAdminGetLicenseInfo200Response block_iomad_company_admin_get_license_info(block_iomad_company_admin_get_license_info_request)
Get company license information

Get company license information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_get_license_info_request** | [**BlockIomadCompanyAdminGetLicenseInfoRequest**](BlockIomadCompanyAdminGetLicenseInfoRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminGetLicenseInfo200Response**](block_iomad_company_admin_get_license_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_move_users

> serde_json::Value block_iomad_company_admin_move_users(block_iomad_company_admin_move_users_request)
Move users between departments

Move users between departments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_move_users_request** | [**BlockIomadCompanyAdminMoveUsersRequest**](BlockIomadCompanyAdminMoveUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_restrict_capability

> serde_json::Value block_iomad_company_admin_restrict_capability(block_iomad_company_admin_restrict_capability_request)
set/reset Iomad capability

set/reset Iomad capability

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_restrict_capability_request** | [**BlockIomadCompanyAdminRestrictCapabilityRequest**](BlockIomadCompanyAdminRestrictCapabilityRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_sync_users

> models::BlockIomadCompanyAdminSyncUsers200Response block_iomad_company_admin_sync_users(block_iomad_company_admin_sync_users_request)
Call update users to sync to external system

Call update users to sync to external system

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_sync_users_request** | [**BlockIomadCompanyAdminSyncUsersRequest**](BlockIomadCompanyAdminSyncUsersRequest.md) |  | [required] |

### Return type

[**models::BlockIomadCompanyAdminSyncUsers200Response**](block_iomad_company_admin_sync_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_unallocate_licenses

> serde_json::Value block_iomad_company_admin_unallocate_licenses(block_iomad_company_admin_unallocate_licenses_request)
Remove course licenses from users

Remove course licenses from users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_unallocate_licenses_request** | [**BlockIomadCompanyAdminUnallocateLicensesRequest**](BlockIomadCompanyAdminUnallocateLicensesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_unassign_courses

> serde_json::Value block_iomad_company_admin_unassign_courses(block_iomad_company_admin_unassign_courses_request)
Unassign a course from a company

Unassign a course from a company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_unassign_courses_request** | [**BlockIomadCompanyAdminUnassignCoursesRequest**](BlockIomadCompanyAdminUnassignCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_unassign_users

> serde_json::Value block_iomad_company_admin_unassign_users(block_iomad_company_admin_unassign_users_request)
Unassign users from a company

Unassign users from a company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_unassign_users_request** | [**BlockIomadCompanyAdminUnassignUsersRequest**](BlockIomadCompanyAdminUnassignUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## block_iomad_company_admin_update_courses

> serde_json::Value block_iomad_company_admin_update_courses(block_iomad_company_admin_update_courses_request)
Update Iomad course settings

Update Iomad course settings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**block_iomad_company_admin_update_courses_request** | [**BlockIomadCompanyAdminUpdateCoursesRequest**](BlockIomadCompanyAdminUpdateCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

