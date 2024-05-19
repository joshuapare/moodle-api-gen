# \ModLtiApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_lti_create_tool_proxy**](ModLtiApi.md#mod_lti_create_tool_proxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy
[**mod_lti_create_tool_type**](ModLtiApi.md#mod_lti_create_tool_type) | **POST** /mod_lti_create_tool_type | Create a tool type
[**mod_lti_delete_course_tool_type**](ModLtiApi.md#mod_lti_delete_course_tool_type) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type
[**mod_lti_delete_tool_proxy**](ModLtiApi.md#mod_lti_delete_tool_proxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy
[**mod_lti_delete_tool_type**](ModLtiApi.md#mod_lti_delete_tool_type) | **POST** /mod_lti_delete_tool_type | Delete a tool type
[**mod_lti_get_ltis_by_courses**](ModLtiApi.md#mod_lti_get_ltis_by_courses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
[**mod_lti_get_tool_launch_data**](ModLtiApi.md#mod_lti_get_tool_launch_data) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool.
[**mod_lti_get_tool_proxies**](ModLtiApi.md#mod_lti_get_tool_proxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies
[**mod_lti_get_tool_proxy_registration_request**](ModLtiApi.md#mod_lti_get_tool_proxy_registration_request) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy
[**mod_lti_get_tool_types**](ModLtiApi.md#mod_lti_get_tool_types) | **POST** /mod_lti_get_tool_types | Get a list of the tool types
[**mod_lti_get_tool_types_and_proxies**](ModLtiApi.md#mod_lti_get_tool_types_and_proxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies
[**mod_lti_get_tool_types_and_proxies_count**](ModLtiApi.md#mod_lti_get_tool_types_and_proxies_count) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies
[**mod_lti_is_cartridge**](ModLtiApi.md#mod_lti_is_cartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge
[**mod_lti_toggle_showinactivitychooser**](ModLtiApi.md#mod_lti_toggle_showinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course
[**mod_lti_update_tool_type**](ModLtiApi.md#mod_lti_update_tool_type) | **POST** /mod_lti_update_tool_type | Update a tool type
[**mod_lti_view_lti**](ModLtiApi.md#mod_lti_view_lti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status.



## mod_lti_create_tool_proxy

> models::ModLtiCreateToolProxy200Response mod_lti_create_tool_proxy(mod_lti_create_tool_proxy_request)
Create a tool proxy

Create a tool proxy

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_create_tool_proxy_request** | [**ModLtiCreateToolProxyRequest**](ModLtiCreateToolProxyRequest.md) |  | [required] |

### Return type

[**models::ModLtiCreateToolProxy200Response**](mod_lti_create_tool_proxy_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_create_tool_type

> models::ModLtiCreateToolType200Response mod_lti_create_tool_type(mod_lti_create_tool_type_request)
Create a tool type

Create a tool type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_create_tool_type_request** | [**ModLtiCreateToolTypeRequest**](ModLtiCreateToolTypeRequest.md) |  | [required] |

### Return type

[**models::ModLtiCreateToolType200Response**](mod_lti_create_tool_type_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_delete_course_tool_type

> serde_json::Value mod_lti_delete_course_tool_type(mod_lti_delete_course_tool_type_request)
Delete a course tool type

Delete a course tool type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_delete_course_tool_type_request** | [**ModLtiDeleteCourseToolTypeRequest**](ModLtiDeleteCourseToolTypeRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_delete_tool_proxy

> models::ModLtiDeleteToolProxy200Response mod_lti_delete_tool_proxy(mod_lti_delete_tool_proxy_request)
Delete a tool proxy

Delete a tool proxy

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_delete_tool_proxy_request** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  | [required] |

### Return type

[**models::ModLtiDeleteToolProxy200Response**](mod_lti_delete_tool_proxy_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_delete_tool_type

> models::ModLtiDeleteToolTypeRequest mod_lti_delete_tool_type(mod_lti_delete_tool_type_request)
Delete a tool type

Delete a tool type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_delete_tool_type_request** | [**ModLtiDeleteToolTypeRequest**](ModLtiDeleteToolTypeRequest.md) |  | [required] |

### Return type

[**models::ModLtiDeleteToolTypeRequest**](mod_lti_delete_tool_type_request.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_ltis_by_courses

> models::ModLtiGetLtisByCourses200Response mod_lti_get_ltis_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModLtiGetLtisByCourses200Response**](mod_lti_get_ltis_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_launch_data

> models::ModLtiGetToolLaunchData200Response mod_lti_get_tool_launch_data(mod_lti_get_tool_launch_data_request)
Return the launch data for a given external tool.

Return the launch data for a given external tool.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_get_tool_launch_data_request** | [**ModLtiGetToolLaunchDataRequest**](ModLtiGetToolLaunchDataRequest.md) |  | [required] |

### Return type

[**models::ModLtiGetToolLaunchData200Response**](mod_lti_get_tool_launch_data_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_proxies

> serde_json::Value mod_lti_get_tool_proxies(mod_lti_get_tool_proxies_request)
Get a list of the tool proxies

Get a list of the tool proxies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_get_tool_proxies_request** | [**ModLtiGetToolProxiesRequest**](ModLtiGetToolProxiesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_proxy_registration_request

> models::ModLtiGetToolProxyRegistrationRequest200Response mod_lti_get_tool_proxy_registration_request(mod_lti_delete_tool_proxy_request)
Get a registration request for a tool proxy

Get a registration request for a tool proxy

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_delete_tool_proxy_request** | [**ModLtiDeleteToolProxyRequest**](ModLtiDeleteToolProxyRequest.md) |  | [required] |

### Return type

[**models::ModLtiGetToolProxyRegistrationRequest200Response**](mod_lti_get_tool_proxy_registration_request_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_types

> serde_json::Value mod_lti_get_tool_types(mod_lti_get_tool_types_request)
Get a list of the tool types

Get a list of the tool types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_get_tool_types_request** | [**ModLtiGetToolTypesRequest**](ModLtiGetToolTypesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_types_and_proxies

> models::ModLtiGetToolTypesAndProxies200Response mod_lti_get_tool_types_and_proxies(mod_lti_get_tool_types_and_proxies_request)
Get a list of the tool types and tool proxies

Get a list of the tool types and tool proxies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_get_tool_types_and_proxies_request** | [**ModLtiGetToolTypesAndProxiesRequest**](ModLtiGetToolTypesAndProxiesRequest.md) |  | [required] |

### Return type

[**models::ModLtiGetToolTypesAndProxies200Response**](mod_lti_get_tool_types_and_proxies_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_get_tool_types_and_proxies_count

> models::ModLtiGetToolTypesAndProxiesCount200Response mod_lti_get_tool_types_and_proxies_count(mod_lti_get_tool_types_and_proxies_count_request)
Get total number of the tool types and tool proxies

Get total number of the tool types and tool proxies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_get_tool_types_and_proxies_count_request** | [**ModLtiGetToolTypesAndProxiesCountRequest**](ModLtiGetToolTypesAndProxiesCountRequest.md) |  | [required] |

### Return type

[**models::ModLtiGetToolTypesAndProxiesCount200Response**](mod_lti_get_tool_types_and_proxies_count_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_is_cartridge

> models::ModLtiIsCartridge200Response mod_lti_is_cartridge(mod_lti_is_cartridge_request)
Determine if the given url is for a cartridge

Determine if the given url is for a cartridge

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_is_cartridge_request** | [**ModLtiIsCartridgeRequest**](ModLtiIsCartridgeRequest.md) |  | [required] |

### Return type

[**models::ModLtiIsCartridge200Response**](mod_lti_is_cartridge_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_toggle_showinactivitychooser

> serde_json::Value mod_lti_toggle_showinactivitychooser(mod_lti_toggle_showinactivitychooser_request)
Toggle showinactivitychooser for a tool type in a course

Toggle showinactivitychooser for a tool type in a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_toggle_showinactivitychooser_request** | [**ModLtiToggleShowinactivitychooserRequest**](ModLtiToggleShowinactivitychooserRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_update_tool_type

> models::ModLtiUpdateToolType200Response mod_lti_update_tool_type(mod_lti_update_tool_type_request)
Update a tool type

Update a tool type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_update_tool_type_request** | [**ModLtiUpdateToolTypeRequest**](ModLtiUpdateToolTypeRequest.md) |  | [required] |

### Return type

[**models::ModLtiUpdateToolType200Response**](mod_lti_update_tool_type_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lti_view_lti

> models::CoreCalendarDeleteSubscription200Response mod_lti_view_lti(mod_lti_view_lti_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lti_view_lti_request** | [**ModLtiViewLtiRequest**](ModLtiViewLtiRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

