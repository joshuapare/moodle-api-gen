# \ModDataApi

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



## mod_data_add_entry

> models::ModDataAddEntry200Response mod_data_add_entry(mod_data_add_entry_request)
Adds a new entry.

Adds a new entry.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_add_entry_request** | [**ModDataAddEntryRequest**](ModDataAddEntryRequest.md) |  | [required] |

### Return type

[**models::ModDataAddEntry200Response**](mod_data_add_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_approve_entry

> models::CoreCalendarDeleteSubscription200Response mod_data_approve_entry(mod_data_approve_entry_request)
Approves or unapproves an entry.

Approves or unapproves an entry.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_approve_entry_request** | [**ModDataApproveEntryRequest**](ModDataApproveEntryRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_delete_entry

> models::ModDataDeleteEntry200Response mod_data_delete_entry(mod_data_delete_entry_request)
Deletes an entry.

Deletes an entry.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_delete_entry_request** | [**ModDataDeleteEntryRequest**](ModDataDeleteEntryRequest.md) |  | [required] |

### Return type

[**models::ModDataDeleteEntry200Response**](mod_data_delete_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_delete_saved_preset

> models::CoreContentbankRenameContent200Response mod_data_delete_saved_preset(mod_data_delete_saved_preset_request)
Delete site user preset.

Delete site user preset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_delete_saved_preset_request** | [**ModDataDeleteSavedPresetRequest**](ModDataDeleteSavedPresetRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_data_access_information

> models::ModDataGetDataAccessInformation200Response mod_data_get_data_access_information(mod_data_get_data_access_information_request)
Return access information for a given database.

Return access information for a given database.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_get_data_access_information_request** | [**ModDataGetDataAccessInformationRequest**](ModDataGetDataAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModDataGetDataAccessInformation200Response**](mod_data_get_data_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_databases_by_courses

> models::ModDataGetDatabasesByCourses200Response mod_data_get_databases_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModDataGetDatabasesByCourses200Response**](mod_data_get_databases_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_entries

> models::ModDataGetEntries200Response mod_data_get_entries(mod_data_get_entries_request)
Return the complete list of entries of the given database.

Return the complete list of entries of the given database.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_get_entries_request** | [**ModDataGetEntriesRequest**](ModDataGetEntriesRequest.md) |  | [required] |

### Return type

[**models::ModDataGetEntries200Response**](mod_data_get_entries_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_entry

> models::ModDataGetEntry200Response mod_data_get_entry(mod_data_get_entry_request)
Return one entry record from the database, including contents optionally.

Return one entry record from the database, including contents optionally.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_get_entry_request** | [**ModDataGetEntryRequest**](ModDataGetEntryRequest.md) |  | [required] |

### Return type

[**models::ModDataGetEntry200Response**](mod_data_get_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_fields

> models::ModDataGetFields200Response mod_data_get_fields(mod_data_get_fields_request)
Return the list of configured fields for the given database.

Return the list of configured fields for the given database.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_get_fields_request** | [**ModDataGetFieldsRequest**](ModDataGetFieldsRequest.md) |  | [required] |

### Return type

[**models::ModDataGetFields200Response**](mod_data_get_fields_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_get_mapping_information

> models::ModDataGetMappingInformation200Response mod_data_get_mapping_information(mod_data_get_mapping_information_request)
Get importing information

Get importing information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_get_mapping_information_request** | [**ModDataGetMappingInformationRequest**](ModDataGetMappingInformationRequest.md) |  | [required] |

### Return type

[**models::ModDataGetMappingInformation200Response**](mod_data_get_mapping_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_search_entries

> models::ModDataSearchEntries200Response mod_data_search_entries(mod_data_search_entries_request)
Search for entries in the given database.

Search for entries in the given database.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_search_entries_request** | [**ModDataSearchEntriesRequest**](ModDataSearchEntriesRequest.md) |  | [required] |

### Return type

[**models::ModDataSearchEntries200Response**](mod_data_search_entries_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_update_entry

> models::ModDataUpdateEntry200Response mod_data_update_entry(mod_data_update_entry_request)
Updates an existing entry.

Updates an existing entry.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_update_entry_request** | [**ModDataUpdateEntryRequest**](ModDataUpdateEntryRequest.md) |  | [required] |

### Return type

[**models::ModDataUpdateEntry200Response**](mod_data_update_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_data_view_database

> models::CoreCalendarDeleteSubscription200Response mod_data_view_database(mod_data_view_database_request)
Simulate the view.php web interface data: trigger events, completion, etc...

Simulate the view.php web interface data: trigger events, completion, etc...

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_data_view_database_request** | [**ModDataViewDatabaseRequest**](ModDataViewDatabaseRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

