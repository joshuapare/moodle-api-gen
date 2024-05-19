# \ModWikiApi

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



## mod_wiki_edit_page

> models::ModWikiEditPage200Response mod_wiki_edit_page(mod_wiki_edit_page_request)
Save the contents of a page.

Save the contents of a page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_edit_page_request** | [**ModWikiEditPageRequest**](ModWikiEditPageRequest.md) |  | [required] |

### Return type

[**models::ModWikiEditPage200Response**](mod_wiki_edit_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_page_contents

> models::ModWikiGetPageContents200Response mod_wiki_get_page_contents(mod_wiki_get_page_contents_request)
Returns the contents of a page.

Returns the contents of a page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_page_contents_request** | [**ModWikiGetPageContentsRequest**](ModWikiGetPageContentsRequest.md) |  | [required] |

### Return type

[**models::ModWikiGetPageContents200Response**](mod_wiki_get_page_contents_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_page_for_editing

> models::ModWikiGetPageForEditing200Response mod_wiki_get_page_for_editing(mod_wiki_get_page_for_editing_request)
Locks and retrieves info of page-section to be edited.

Locks and retrieves info of page-section to be edited.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_page_for_editing_request** | [**ModWikiGetPageForEditingRequest**](ModWikiGetPageForEditingRequest.md) |  | [required] |

### Return type

[**models::ModWikiGetPageForEditing200Response**](mod_wiki_get_page_for_editing_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_subwiki_files

> models::CoreH5pGetTrustedH5pFile200Response mod_wiki_get_subwiki_files(mod_wiki_get_subwiki_files_request)
Returns the list of files for a specific subwiki.

Returns the list of files for a specific subwiki.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_subwiki_files_request** | [**ModWikiGetSubwikiFilesRequest**](ModWikiGetSubwikiFilesRequest.md) |  | [required] |

### Return type

[**models::CoreH5pGetTrustedH5pFile200Response**](core_h5p_get_trusted_h5p_file_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_subwiki_pages

> models::ModWikiGetSubwikiPages200Response mod_wiki_get_subwiki_pages(mod_wiki_get_subwiki_pages_request)
Returns the list of pages for a specific subwiki.

Returns the list of pages for a specific subwiki.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_subwiki_pages_request** | [**ModWikiGetSubwikiPagesRequest**](ModWikiGetSubwikiPagesRequest.md) |  | [required] |

### Return type

[**models::ModWikiGetSubwikiPages200Response**](mod_wiki_get_subwiki_pages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_subwikis

> models::ModWikiGetSubwikis200Response mod_wiki_get_subwikis(mod_wiki_get_subwikis_request)
Returns the list of subwikis the user can see in a specific wiki.

Returns the list of subwikis the user can see in a specific wiki.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_subwikis_request** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  | [required] |

### Return type

[**models::ModWikiGetSubwikis200Response**](mod_wiki_get_subwikis_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_get_wikis_by_courses

> models::ModWikiGetWikisByCourses200Response mod_wiki_get_wikis_by_courses(mod_wiki_get_wikis_by_courses_request)
Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_wikis_by_courses_request** | [**ModWikiGetWikisByCoursesRequest**](ModWikiGetWikisByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModWikiGetWikisByCourses200Response**](mod_wiki_get_wikis_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_new_page

> models::ModWikiNewPage200Response mod_wiki_new_page(mod_wiki_new_page_request)
Create a new page in a subwiki.

Create a new page in a subwiki.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_new_page_request** | [**ModWikiNewPageRequest**](ModWikiNewPageRequest.md) |  | [required] |

### Return type

[**models::ModWikiNewPage200Response**](mod_wiki_new_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_view_page

> models::ModWikiViewPage200Response mod_wiki_view_page(mod_wiki_view_page_request)
Trigger the page viewed event and update the module completion status.

Trigger the page viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_view_page_request** | [**ModWikiViewPageRequest**](ModWikiViewPageRequest.md) |  | [required] |

### Return type

[**models::ModWikiViewPage200Response**](mod_wiki_view_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_wiki_view_wiki

> models::ModWikiViewWiki200Response mod_wiki_view_wiki(mod_wiki_get_subwikis_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_wiki_get_subwikis_request** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  | [required] |

### Return type

[**models::ModWikiViewWiki200Response**](mod_wiki_view_wiki_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

