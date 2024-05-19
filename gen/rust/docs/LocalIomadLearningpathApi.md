# \LocalIomadLearningpathApi

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



## local_iomad_learningpath_activate

> serde_json::Value local_iomad_learningpath_activate(local_iomad_learningpath_activate_request)
Activates / deactivates learning path

Activates / deactivates learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_activate_request** | [**LocalIomadLearningpathActivateRequest**](LocalIomadLearningpathActivateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_addcourses

> serde_json::Value local_iomad_learningpath_addcourses(local_iomad_learningpath_addcourses_request)
Add courses to learning path

Add courses to learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_addcourses_request** | [**LocalIomadLearningpathAddcoursesRequest**](LocalIomadLearningpathAddcoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_addusers

> serde_json::Value local_iomad_learningpath_addusers(local_iomad_learningpath_addusers_request)
Add users to learning path

Add users to learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_addusers_request** | [**LocalIomadLearningpathAddusersRequest**](LocalIomadLearningpathAddusersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_copypath

> serde_json::Value local_iomad_learningpath_copypath(local_iomad_learningpath_copypath_request)
Copy a learning path

Copy a learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_copypath_request** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_deletepath

> serde_json::Value local_iomad_learningpath_deletepath(local_iomad_learningpath_copypath_request)
Completely delete a learning path

Completely delete a learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_copypath_request** | [**LocalIomadLearningpathCopypathRequest**](LocalIomadLearningpathCopypathRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_getcourses

> serde_json::Value local_iomad_learningpath_getcourses(local_iomad_learningpath_getcourses_request)
Read list of courses for given learning

Read list of courses for given learning

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_getcourses_request** | [**LocalIomadLearningpathGetcoursesRequest**](LocalIomadLearningpathGetcoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_getprospectivecourses

> serde_json::Value local_iomad_learningpath_getprospectivecourses(local_iomad_learningpath_getprospectivecourses_request)
Read set of filtered courses for given company

Read set of filtered courses for given company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_getprospectivecourses_request** | [**LocalIomadLearningpathGetprospectivecoursesRequest**](LocalIomadLearningpathGetprospectivecoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_getprospectiveusers

> serde_json::Value local_iomad_learningpath_getprospectiveusers(local_iomad_learningpath_getprospectiveusers_request)
Get set of filtered users for given company

Get set of filtered users for given company

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_getprospectiveusers_request** | [**LocalIomadLearningpathGetprospectiveusersRequest**](LocalIomadLearningpathGetprospectiveusersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_getusers

> serde_json::Value local_iomad_learningpath_getusers(local_iomad_learningpath_getusers_request)
Get users assigned to path

Get users assigned to path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_getusers_request** | [**LocalIomadLearningpathGetusersRequest**](LocalIomadLearningpathGetusersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_ordercourses

> serde_json::Value local_iomad_learningpath_ordercourses(local_iomad_learningpath_ordercourses_request)
Set sequence of courses in learning path

Set sequence of courses in learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_ordercourses_request** | [**LocalIomadLearningpathOrdercoursesRequest**](LocalIomadLearningpathOrdercoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_removecourses

> serde_json::Value local_iomad_learningpath_removecourses(local_iomad_learningpath_removecourses_request)
Remove courses from learning path

Remove courses from learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_removecourses_request** | [**LocalIomadLearningpathRemovecoursesRequest**](LocalIomadLearningpathRemovecoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## local_iomad_learningpath_removeusers

> serde_json::Value local_iomad_learningpath_removeusers(local_iomad_learningpath_removeusers_request)
Remove users from learning path

Remove users from learning path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**local_iomad_learningpath_removeusers_request** | [**LocalIomadLearningpathRemoveusersRequest**](LocalIomadLearningpathRemoveusersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

