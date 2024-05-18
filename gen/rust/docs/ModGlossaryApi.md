# \ModGlossaryApi

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



## mod_glossary_add_entry

> models::ModGlossaryAddEntry200Response mod_glossary_add_entry(mod_glossary_add_entry_request)
Add a new entry to a given glossary

Add a new entry to a given glossary

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_add_entry_request** | [**ModGlossaryAddEntryRequest**](ModGlossaryAddEntryRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryAddEntry200Response**](mod_glossary_add_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_delete_entry

> models::CoreContentbankRenameContent200Response mod_glossary_delete_entry(mod_glossary_delete_entry_request)
Delete the given entry from the glossary.

Delete the given entry from the glossary.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_delete_entry_request** | [**ModGlossaryDeleteEntryRequest**](ModGlossaryDeleteEntryRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_authors

> models::ModGlossaryGetAuthors200Response mod_glossary_get_authors(mod_glossary_get_authors_request)
Get the authors.

Get the authors.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_authors_request** | [**ModGlossaryGetAuthorsRequest**](ModGlossaryGetAuthorsRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetAuthors200Response**](mod_glossary_get_authors_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_categories

> models::ModGlossaryGetCategories200Response mod_glossary_get_categories(mod_glossary_get_categories_request)
Get the categories.

Get the categories.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_categories_request** | [**ModGlossaryGetCategoriesRequest**](ModGlossaryGetCategoriesRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetCategories200Response**](mod_glossary_get_categories_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_author

> models::ModGlossaryGetEntriesByAuthor200Response mod_glossary_get_entries_by_author(mod_glossary_get_entries_by_author_request)
Browse entries by author.

Browse entries by author.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_author_request** | [**ModGlossaryGetEntriesByAuthorRequest**](ModGlossaryGetEntriesByAuthorRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthor200Response**](mod_glossary_get_entries_by_author_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_author_id

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_author_id(mod_glossary_get_entries_by_author_id_request)
Browse entries by author ID.

Browse entries by author ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_author_id_request** | [**ModGlossaryGetEntriesByAuthorIdRequest**](ModGlossaryGetEntriesByAuthorIdRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_category

> models::ModGlossaryGetEntriesByCategory200Response mod_glossary_get_entries_by_category(mod_glossary_get_entries_by_category_request)
Browse entries by category.

Browse entries by category.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_category_request** | [**ModGlossaryGetEntriesByCategoryRequest**](ModGlossaryGetEntriesByCategoryRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByCategory200Response**](mod_glossary_get_entries_by_category_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_date

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_date(mod_glossary_get_entries_by_date_request)
Browse entries by date.

Browse entries by date.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_date_request** | [**ModGlossaryGetEntriesByDateRequest**](ModGlossaryGetEntriesByDateRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_letter

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_letter(mod_glossary_get_entries_by_letter_request)
Browse entries by letter.

Browse entries by letter.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_letter_request** | [**ModGlossaryGetEntriesByLetterRequest**](ModGlossaryGetEntriesByLetterRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_search

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_search(mod_glossary_get_entries_by_search_request)
Browse entries by search query.

Browse entries by search query.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_search_request** | [**ModGlossaryGetEntriesBySearchRequest**](ModGlossaryGetEntriesBySearchRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_by_term

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_by_term(mod_glossary_get_entries_by_term_request)
Browse entries by term (concept or alias).

Browse entries by term (concept or alias).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_by_term_request** | [**ModGlossaryGetEntriesByTermRequest**](ModGlossaryGetEntriesByTermRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entries_to_approve

> models::ModGlossaryGetEntriesByAuthorId200Response mod_glossary_get_entries_to_approve(mod_glossary_get_entries_to_approve_request)
Browse entries to be approved.

Browse entries to be approved.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entries_to_approve_request** | [**ModGlossaryGetEntriesToApproveRequest**](ModGlossaryGetEntriesToApproveRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntriesByAuthorId200Response**](mod_glossary_get_entries_by_author_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_entry_by_id

> models::ModGlossaryGetEntryById200Response mod_glossary_get_entry_by_id(mod_glossary_get_entry_by_id_request)
Get an entry by ID

Get an entry by ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entry_by_id_request** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetEntryById200Response**](mod_glossary_get_entry_by_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_get_glossaries_by_courses

> models::ModGlossaryGetGlossariesByCourses200Response mod_glossary_get_glossaries_by_courses(mod_chat_get_chats_by_courses_request)
Retrieve a list of glossaries from several courses.

Retrieve a list of glossaries from several courses.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryGetGlossariesByCourses200Response**](mod_glossary_get_glossaries_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_prepare_entry_for_edition

> models::ModGlossaryPrepareEntryForEdition200Response mod_glossary_prepare_entry_for_edition(mod_glossary_prepare_entry_for_edition_request)
Prepares the given entry for edition returning draft item areas and file areas information.

Prepares the given entry for edition returning draft item areas and file areas information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_prepare_entry_for_edition_request** | [**ModGlossaryPrepareEntryForEditionRequest**](ModGlossaryPrepareEntryForEditionRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryPrepareEntryForEdition200Response**](mod_glossary_prepare_entry_for_edition_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_update_entry

> models::ModGlossaryUpdateEntry200Response mod_glossary_update_entry(mod_glossary_update_entry_request)
Updates the given glossary entry.

Updates the given glossary entry.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_update_entry_request** | [**ModGlossaryUpdateEntryRequest**](ModGlossaryUpdateEntryRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryUpdateEntry200Response**](mod_glossary_update_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_view_entry

> models::ModGlossaryViewEntry200Response mod_glossary_view_entry(mod_glossary_get_entry_by_id_request)
Notify a glossary entry as being viewed.

Notify a glossary entry as being viewed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_get_entry_by_id_request** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryViewEntry200Response**](mod_glossary_view_entry_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_glossary_view_glossary

> models::ModGlossaryViewGlossary200Response mod_glossary_view_glossary(mod_glossary_view_glossary_request)
Notify the glossary as being viewed.

Notify the glossary as being viewed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_glossary_view_glossary_request** | [**ModGlossaryViewGlossaryRequest**](ModGlossaryViewGlossaryRequest.md) |  | [required] |

### Return type

[**models::ModGlossaryViewGlossary200Response**](mod_glossary_view_glossary_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

