# \ToolDataprivacyApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

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
[**tool_dataprivacy_get_data_request**](ToolDataprivacyApi.md#tool_dataprivacy_get_data_request) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user's data request
[**tool_dataprivacy_get_purpose_options**](ToolDataprivacyApi.md#tool_dataprivacy_get_purpose_options) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options
[**tool_dataprivacy_get_users**](ToolDataprivacyApi.md#tool_dataprivacy_get_users) | **POST** /tool_dataprivacy_get_users | Fetches a list of users
[**tool_dataprivacy_mark_complete**](ToolDataprivacyApi.md#tool_dataprivacy_mark_complete) | **POST** /tool_dataprivacy_mark_complete | Mark a user's general enquiry as complete
[**tool_dataprivacy_set_context_defaults**](ToolDataprivacyApi.md#tool_dataprivacy_set_context_defaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin)
[**tool_dataprivacy_set_context_form**](ToolDataprivacyApi.md#tool_dataprivacy_set_context_form) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context
[**tool_dataprivacy_set_contextlevel_form**](ToolDataprivacyApi.md#tool_dataprivacy_set_contextlevel_form) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level
[**tool_dataprivacy_submit_selected_courses_form**](ToolDataprivacyApi.md#tool_dataprivacy_submit_selected_courses_form) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export
[**tool_dataprivacy_tree_extra_branches**](ToolDataprivacyApi.md#tool_dataprivacy_tree_extra_branches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree



## tool_dataprivacy_approve_data_request

> models::CoreContentbankRenameContent200Response tool_dataprivacy_approve_data_request(tool_dataprivacy_approve_data_request_request)
Approve a data request

Approve a data request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_approve_data_request_request** | [**ToolDataprivacyApproveDataRequestRequest**](ToolDataprivacyApproveDataRequestRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_bulk_approve_data_requests

> models::CoreContentbankRenameContent200Response tool_dataprivacy_bulk_approve_data_requests(tool_dataprivacy_bulk_approve_data_requests_request)
Bulk approve data requests

Bulk approve data requests

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_bulk_approve_data_requests_request** | [**ToolDataprivacyBulkApproveDataRequestsRequest**](ToolDataprivacyBulkApproveDataRequestsRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_bulk_deny_data_requests

> models::CoreContentbankRenameContent200Response tool_dataprivacy_bulk_deny_data_requests(tool_dataprivacy_bulk_deny_data_requests_request)
Bulk deny data requests

Bulk deny data requests

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_bulk_deny_data_requests_request** | [**ToolDataprivacyBulkDenyDataRequestsRequest**](ToolDataprivacyBulkDenyDataRequestsRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_cancel_data_request

> models::CoreContentbankRenameContent200Response tool_dataprivacy_cancel_data_request(tool_dataprivacy_cancel_data_request_request)
Cancel the data request made by the user

Cancel the data request made by the user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_confirm_contexts_for_deletion

> models::ToolDataprivacyConfirmContextsForDeletion200Response tool_dataprivacy_confirm_contexts_for_deletion(tool_dataprivacy_confirm_contexts_for_deletion_request)
Mark the selected expired contexts as confirmed for deletion

Mark the selected expired contexts as confirmed for deletion

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_confirm_contexts_for_deletion_request** | [**ToolDataprivacyConfirmContextsForDeletionRequest**](ToolDataprivacyConfirmContextsForDeletionRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyConfirmContextsForDeletion200Response**](tool_dataprivacy_confirm_contexts_for_deletion_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_contact_dpo

> models::CoreContentbankRenameContent200Response tool_dataprivacy_contact_dpo(tool_dataprivacy_contact_dpo_request)
Contact the site Data Protection Officer(s)

Contact the site Data Protection Officer(s)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_contact_dpo_request** | [**ToolDataprivacyContactDpoRequest**](ToolDataprivacyContactDpoRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_create_category_form

> models::ToolDataprivacyCreateCategoryForm200Response tool_dataprivacy_create_category_form(tool_dataprivacy_create_category_form_request)
Adds a data category

Adds a data category

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_create_category_form_request** | [**ToolDataprivacyCreateCategoryFormRequest**](ToolDataprivacyCreateCategoryFormRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyCreateCategoryForm200Response**](tool_dataprivacy_create_category_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_create_purpose_form

> models::ToolDataprivacyCreatePurposeForm200Response tool_dataprivacy_create_purpose_form(tool_dataprivacy_create_purpose_form_request)
Adds a data purpose

Adds a data purpose

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_create_purpose_form_request** | [**ToolDataprivacyCreatePurposeFormRequest**](ToolDataprivacyCreatePurposeFormRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyCreatePurposeForm200Response**](tool_dataprivacy_create_purpose_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_delete_category

> models::CoreContentbankRenameContent200Response tool_dataprivacy_delete_category(tool_dataprivacy_delete_category_request)
Deletes an existing data category

Deletes an existing data category

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_delete_category_request** | [**ToolDataprivacyDeleteCategoryRequest**](ToolDataprivacyDeleteCategoryRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_delete_purpose

> models::CoreContentbankRenameContent200Response tool_dataprivacy_delete_purpose(tool_dataprivacy_delete_purpose_request)
Deletes an existing data purpose

Deletes an existing data purpose

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_delete_purpose_request** | [**ToolDataprivacyDeletePurposeRequest**](ToolDataprivacyDeletePurposeRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_deny_data_request

> models::CoreContentbankRenameContent200Response tool_dataprivacy_deny_data_request(tool_dataprivacy_cancel_data_request_request)
Deny a data request

Deny a data request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_get_activity_options

> models::ToolDataprivacyGetActivityOptions200Response tool_dataprivacy_get_activity_options(tool_dataprivacy_get_activity_options_request)
Fetches a list of activity options

Fetches a list of activity options

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_get_activity_options_request** | [**ToolDataprivacyGetActivityOptionsRequest**](ToolDataprivacyGetActivityOptionsRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyGetActivityOptions200Response**](tool_dataprivacy_get_activity_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_get_category_options

> models::ToolDataprivacyGetCategoryOptions200Response tool_dataprivacy_get_category_options(tool_dataprivacy_get_category_options_request)
Fetches a list of data category options

Fetches a list of data category options

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_get_category_options_request** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyGetCategoryOptions200Response**](tool_dataprivacy_get_category_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_get_data_request

> models::ToolDataprivacyGetDataRequest200Response tool_dataprivacy_get_data_request(tool_dataprivacy_cancel_data_request_request)
Fetch the details of a user's data request

Fetch the details of a user's data request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyGetDataRequest200Response**](tool_dataprivacy_get_data_request_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_get_purpose_options

> models::ToolDataprivacyGetPurposeOptions200Response tool_dataprivacy_get_purpose_options(tool_dataprivacy_get_category_options_request)
Fetches a list of data storage purpose options

Fetches a list of data storage purpose options

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_get_category_options_request** | [**ToolDataprivacyGetCategoryOptionsRequest**](ToolDataprivacyGetCategoryOptionsRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyGetPurposeOptions200Response**](tool_dataprivacy_get_purpose_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_get_users

> serde_json::Value tool_dataprivacy_get_users(tool_dataprivacy_get_users_request)
Fetches a list of users

Fetches a list of users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_get_users_request** | [**ToolDataprivacyGetUsersRequest**](ToolDataprivacyGetUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_mark_complete

> models::CoreContentbankRenameContent200Response tool_dataprivacy_mark_complete(tool_dataprivacy_cancel_data_request_request)
Mark a user's general enquiry as complete

Mark a user's general enquiry as complete

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_cancel_data_request_request** | [**ToolDataprivacyCancelDataRequestRequest**](ToolDataprivacyCancelDataRequestRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_set_context_defaults

> models::ToolDataprivacySetContextDefaults200Response tool_dataprivacy_set_context_defaults(tool_dataprivacy_set_context_defaults_request)
Updates the default category and purpose for a given context level (and optionally, a plugin)

Updates the default category and purpose for a given context level (and optionally, a plugin)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_set_context_defaults_request** | [**ToolDataprivacySetContextDefaultsRequest**](ToolDataprivacySetContextDefaultsRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacySetContextDefaults200Response**](tool_dataprivacy_set_context_defaults_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_set_context_form

> models::ToolDataprivacySetContextForm200Response tool_dataprivacy_set_context_form(tool_dataprivacy_set_context_form_request)
Sets purpose and category for a specific context

Sets purpose and category for a specific context

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_set_context_form_request** | [**ToolDataprivacySetContextFormRequest**](ToolDataprivacySetContextFormRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacySetContextForm200Response**](tool_dataprivacy_set_context_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_set_contextlevel_form

> models::ToolDataprivacySetContextlevelForm200Response tool_dataprivacy_set_contextlevel_form(tool_dataprivacy_set_contextlevel_form_request)
Sets purpose and category across a context level

Sets purpose and category across a context level

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_set_contextlevel_form_request** | [**ToolDataprivacySetContextlevelFormRequest**](ToolDataprivacySetContextlevelFormRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacySetContextlevelForm200Response**](tool_dataprivacy_set_contextlevel_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_submit_selected_courses_form

> models::CoreContentbankRenameContent200Response tool_dataprivacy_submit_selected_courses_form(tool_dataprivacy_submit_selected_courses_form_request)
Save list of selected courses for export

Save list of selected courses for export

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_submit_selected_courses_form_request** | [**ToolDataprivacySubmitSelectedCoursesFormRequest**](ToolDataprivacySubmitSelectedCoursesFormRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_dataprivacy_tree_extra_branches

> models::ToolDataprivacyTreeExtraBranches200Response tool_dataprivacy_tree_extra_branches(tool_dataprivacy_tree_extra_branches_request)
Return branches for the context tree

Return branches for the context tree

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_dataprivacy_tree_extra_branches_request** | [**ToolDataprivacyTreeExtraBranchesRequest**](ToolDataprivacyTreeExtraBranchesRequest.md) |  | [required] |

### Return type

[**models::ToolDataprivacyTreeExtraBranches200Response**](tool_dataprivacy_tree_extra_branches_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

