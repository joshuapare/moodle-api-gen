# \ModGlossaryAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModGlossaryAddEntry**](ModGlossaryAPI.md#ModGlossaryAddEntry) | **Post** /mod_glossary_add_entry | Add a new entry to a given glossary
[**ModGlossaryDeleteEntry**](ModGlossaryAPI.md#ModGlossaryDeleteEntry) | **Post** /mod_glossary_delete_entry | Delete the given entry from the glossary.
[**ModGlossaryGetAuthors**](ModGlossaryAPI.md#ModGlossaryGetAuthors) | **Post** /mod_glossary_get_authors | Get the authors.
[**ModGlossaryGetCategories**](ModGlossaryAPI.md#ModGlossaryGetCategories) | **Post** /mod_glossary_get_categories | Get the categories.
[**ModGlossaryGetEntriesByAuthor**](ModGlossaryAPI.md#ModGlossaryGetEntriesByAuthor) | **Post** /mod_glossary_get_entries_by_author | Browse entries by author.
[**ModGlossaryGetEntriesByAuthorId**](ModGlossaryAPI.md#ModGlossaryGetEntriesByAuthorId) | **Post** /mod_glossary_get_entries_by_author_id | Browse entries by author ID.
[**ModGlossaryGetEntriesByCategory**](ModGlossaryAPI.md#ModGlossaryGetEntriesByCategory) | **Post** /mod_glossary_get_entries_by_category | Browse entries by category.
[**ModGlossaryGetEntriesByDate**](ModGlossaryAPI.md#ModGlossaryGetEntriesByDate) | **Post** /mod_glossary_get_entries_by_date | Browse entries by date.
[**ModGlossaryGetEntriesByLetter**](ModGlossaryAPI.md#ModGlossaryGetEntriesByLetter) | **Post** /mod_glossary_get_entries_by_letter | Browse entries by letter.
[**ModGlossaryGetEntriesBySearch**](ModGlossaryAPI.md#ModGlossaryGetEntriesBySearch) | **Post** /mod_glossary_get_entries_by_search | Browse entries by search query.
[**ModGlossaryGetEntriesByTerm**](ModGlossaryAPI.md#ModGlossaryGetEntriesByTerm) | **Post** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias).
[**ModGlossaryGetEntriesToApprove**](ModGlossaryAPI.md#ModGlossaryGetEntriesToApprove) | **Post** /mod_glossary_get_entries_to_approve | Browse entries to be approved.
[**ModGlossaryGetEntryById**](ModGlossaryAPI.md#ModGlossaryGetEntryById) | **Post** /mod_glossary_get_entry_by_id | Get an entry by ID
[**ModGlossaryGetGlossariesByCourses**](ModGlossaryAPI.md#ModGlossaryGetGlossariesByCourses) | **Post** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses.
[**ModGlossaryPrepareEntryForEdition**](ModGlossaryAPI.md#ModGlossaryPrepareEntryForEdition) | **Post** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information.
[**ModGlossaryUpdateEntry**](ModGlossaryAPI.md#ModGlossaryUpdateEntry) | **Post** /mod_glossary_update_entry | Updates the given glossary entry.
[**ModGlossaryViewEntry**](ModGlossaryAPI.md#ModGlossaryViewEntry) | **Post** /mod_glossary_view_entry | Notify a glossary entry as being viewed.
[**ModGlossaryViewGlossary**](ModGlossaryAPI.md#ModGlossaryViewGlossary) | **Post** /mod_glossary_view_glossary | Notify the glossary as being viewed.



## ModGlossaryAddEntry

> ModGlossaryAddEntry200Response ModGlossaryAddEntry(ctx).ModGlossaryAddEntryRequest(modGlossaryAddEntryRequest).Execute()

Add a new entry to a given glossary



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryAddEntryRequest := *openapiclient.NewModGlossaryAddEntryRequest("Concept_example", "Definition_example", int32(123), int32(123)) // ModGlossaryAddEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryAddEntry(context.Background()).ModGlossaryAddEntryRequest(modGlossaryAddEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryAddEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryAddEntry`: ModGlossaryAddEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryAddEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryAddEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryAddEntryRequest** | [**ModGlossaryAddEntryRequest**](ModGlossaryAddEntryRequest.md) |  | 

### Return type

[**ModGlossaryAddEntry200Response**](ModGlossaryAddEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryDeleteEntry

> CoreContentbankRenameContent200Response ModGlossaryDeleteEntry(ctx).ModGlossaryDeleteEntryRequest(modGlossaryDeleteEntryRequest).Execute()

Delete the given entry from the glossary.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryDeleteEntryRequest := *openapiclient.NewModGlossaryDeleteEntryRequest(int32(123)) // ModGlossaryDeleteEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryDeleteEntry(context.Background()).ModGlossaryDeleteEntryRequest(modGlossaryDeleteEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryDeleteEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryDeleteEntry`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryDeleteEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryDeleteEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryDeleteEntryRequest** | [**ModGlossaryDeleteEntryRequest**](ModGlossaryDeleteEntryRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetAuthors

> ModGlossaryGetAuthors200Response ModGlossaryGetAuthors(ctx).ModGlossaryGetAuthorsRequest(modGlossaryGetAuthorsRequest).Execute()

Get the authors.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetAuthorsRequest := *openapiclient.NewModGlossaryGetAuthorsRequest(int32(123)) // ModGlossaryGetAuthorsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetAuthors(context.Background()).ModGlossaryGetAuthorsRequest(modGlossaryGetAuthorsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetAuthors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetAuthors`: ModGlossaryGetAuthors200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetAuthors`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetAuthorsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetAuthorsRequest** | [**ModGlossaryGetAuthorsRequest**](ModGlossaryGetAuthorsRequest.md) |  | 

### Return type

[**ModGlossaryGetAuthors200Response**](ModGlossaryGetAuthors200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetCategories

> ModGlossaryGetCategories200Response ModGlossaryGetCategories(ctx).ModGlossaryGetCategoriesRequest(modGlossaryGetCategoriesRequest).Execute()

Get the categories.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetCategoriesRequest := *openapiclient.NewModGlossaryGetCategoriesRequest(int32(123)) // ModGlossaryGetCategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetCategories(context.Background()).ModGlossaryGetCategoriesRequest(modGlossaryGetCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetCategories`: ModGlossaryGetCategories200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetCategoriesRequest** | [**ModGlossaryGetCategoriesRequest**](ModGlossaryGetCategoriesRequest.md) |  | 

### Return type

[**ModGlossaryGetCategories200Response**](ModGlossaryGetCategories200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByAuthor

> ModGlossaryGetEntriesByAuthor200Response ModGlossaryGetEntriesByAuthor(ctx).ModGlossaryGetEntriesByAuthorRequest(modGlossaryGetEntriesByAuthorRequest).Execute()

Browse entries by author.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByAuthorRequest := *openapiclient.NewModGlossaryGetEntriesByAuthorRequest(int32(123), "Letter_example") // ModGlossaryGetEntriesByAuthorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByAuthor(context.Background()).ModGlossaryGetEntriesByAuthorRequest(modGlossaryGetEntriesByAuthorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByAuthor``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByAuthor`: ModGlossaryGetEntriesByAuthor200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByAuthor`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByAuthorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByAuthorRequest** | [**ModGlossaryGetEntriesByAuthorRequest**](ModGlossaryGetEntriesByAuthorRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthor200Response**](ModGlossaryGetEntriesByAuthor200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByAuthorId

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByAuthorId(ctx).ModGlossaryGetEntriesByAuthorIdRequest(modGlossaryGetEntriesByAuthorIdRequest).Execute()

Browse entries by author ID.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByAuthorIdRequest := *openapiclient.NewModGlossaryGetEntriesByAuthorIdRequest(int32(123), int32(123)) // ModGlossaryGetEntriesByAuthorIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByAuthorId(context.Background()).ModGlossaryGetEntriesByAuthorIdRequest(modGlossaryGetEntriesByAuthorIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByAuthorId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByAuthorId`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByAuthorId`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByAuthorIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByAuthorIdRequest** | [**ModGlossaryGetEntriesByAuthorIdRequest**](ModGlossaryGetEntriesByAuthorIdRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByCategory

> ModGlossaryGetEntriesByCategory200Response ModGlossaryGetEntriesByCategory(ctx).ModGlossaryGetEntriesByCategoryRequest(modGlossaryGetEntriesByCategoryRequest).Execute()

Browse entries by category.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByCategoryRequest := *openapiclient.NewModGlossaryGetEntriesByCategoryRequest(int32(123), int32(123)) // ModGlossaryGetEntriesByCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByCategory(context.Background()).ModGlossaryGetEntriesByCategoryRequest(modGlossaryGetEntriesByCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByCategory`: ModGlossaryGetEntriesByCategory200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByCategoryRequest** | [**ModGlossaryGetEntriesByCategoryRequest**](ModGlossaryGetEntriesByCategoryRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByCategory200Response**](ModGlossaryGetEntriesByCategory200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByDate

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByDate(ctx).ModGlossaryGetEntriesByDateRequest(modGlossaryGetEntriesByDateRequest).Execute()

Browse entries by date.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByDateRequest := *openapiclient.NewModGlossaryGetEntriesByDateRequest(int32(123)) // ModGlossaryGetEntriesByDateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByDate(context.Background()).ModGlossaryGetEntriesByDateRequest(modGlossaryGetEntriesByDateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByDate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByDate`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByDate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByDateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByDateRequest** | [**ModGlossaryGetEntriesByDateRequest**](ModGlossaryGetEntriesByDateRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByLetter

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByLetter(ctx).ModGlossaryGetEntriesByLetterRequest(modGlossaryGetEntriesByLetterRequest).Execute()

Browse entries by letter.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByLetterRequest := *openapiclient.NewModGlossaryGetEntriesByLetterRequest(int32(123), "Letter_example") // ModGlossaryGetEntriesByLetterRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByLetter(context.Background()).ModGlossaryGetEntriesByLetterRequest(modGlossaryGetEntriesByLetterRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByLetter``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByLetter`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByLetter`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByLetterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByLetterRequest** | [**ModGlossaryGetEntriesByLetterRequest**](ModGlossaryGetEntriesByLetterRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesBySearch

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesBySearch(ctx).ModGlossaryGetEntriesBySearchRequest(modGlossaryGetEntriesBySearchRequest).Execute()

Browse entries by search query.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesBySearchRequest := *openapiclient.NewModGlossaryGetEntriesBySearchRequest(int32(123), "Query_example") // ModGlossaryGetEntriesBySearchRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesBySearch(context.Background()).ModGlossaryGetEntriesBySearchRequest(modGlossaryGetEntriesBySearchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesBySearch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesBySearch`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesBySearch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesBySearchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesBySearchRequest** | [**ModGlossaryGetEntriesBySearchRequest**](ModGlossaryGetEntriesBySearchRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesByTerm

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesByTerm(ctx).ModGlossaryGetEntriesByTermRequest(modGlossaryGetEntriesByTermRequest).Execute()

Browse entries by term (concept or alias).



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesByTermRequest := *openapiclient.NewModGlossaryGetEntriesByTermRequest(int32(123), "Term_example") // ModGlossaryGetEntriesByTermRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesByTerm(context.Background()).ModGlossaryGetEntriesByTermRequest(modGlossaryGetEntriesByTermRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesByTerm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesByTerm`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesByTerm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesByTermRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesByTermRequest** | [**ModGlossaryGetEntriesByTermRequest**](ModGlossaryGetEntriesByTermRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntriesToApprove

> ModGlossaryGetEntriesByAuthorId200Response ModGlossaryGetEntriesToApprove(ctx).ModGlossaryGetEntriesToApproveRequest(modGlossaryGetEntriesToApproveRequest).Execute()

Browse entries to be approved.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntriesToApproveRequest := *openapiclient.NewModGlossaryGetEntriesToApproveRequest(int32(123), "Letter_example") // ModGlossaryGetEntriesToApproveRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntriesToApprove(context.Background()).ModGlossaryGetEntriesToApproveRequest(modGlossaryGetEntriesToApproveRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntriesToApprove``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntriesToApprove`: ModGlossaryGetEntriesByAuthorId200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntriesToApprove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntriesToApproveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntriesToApproveRequest** | [**ModGlossaryGetEntriesToApproveRequest**](ModGlossaryGetEntriesToApproveRequest.md) |  | 

### Return type

[**ModGlossaryGetEntriesByAuthorId200Response**](ModGlossaryGetEntriesByAuthorId200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetEntryById

> ModGlossaryGetEntryById200Response ModGlossaryGetEntryById(ctx).ModGlossaryGetEntryByIdRequest(modGlossaryGetEntryByIdRequest).Execute()

Get an entry by ID



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntryByIdRequest := *openapiclient.NewModGlossaryGetEntryByIdRequest(int32(123)) // ModGlossaryGetEntryByIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetEntryById(context.Background()).ModGlossaryGetEntryByIdRequest(modGlossaryGetEntryByIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetEntryById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetEntryById`: ModGlossaryGetEntryById200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetEntryById`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetEntryByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  | 

### Return type

[**ModGlossaryGetEntryById200Response**](ModGlossaryGetEntryById200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryGetGlossariesByCourses

> ModGlossaryGetGlossariesByCourses200Response ModGlossaryGetGlossariesByCourses(ctx).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()

Retrieve a list of glossaries from several courses.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modChatGetChatsByCoursesRequest := *openapiclient.NewModChatGetChatsByCoursesRequest() // ModChatGetChatsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryGetGlossariesByCourses(context.Background()).ModChatGetChatsByCoursesRequest(modChatGetChatsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryGetGlossariesByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryGetGlossariesByCourses`: ModGlossaryGetGlossariesByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryGetGlossariesByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryGetGlossariesByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modChatGetChatsByCoursesRequest** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | 

### Return type

[**ModGlossaryGetGlossariesByCourses200Response**](ModGlossaryGetGlossariesByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryPrepareEntryForEdition

> ModGlossaryPrepareEntryForEdition200Response ModGlossaryPrepareEntryForEdition(ctx).ModGlossaryPrepareEntryForEditionRequest(modGlossaryPrepareEntryForEditionRequest).Execute()

Prepares the given entry for edition returning draft item areas and file areas information.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryPrepareEntryForEditionRequest := *openapiclient.NewModGlossaryPrepareEntryForEditionRequest(int32(123)) // ModGlossaryPrepareEntryForEditionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryPrepareEntryForEdition(context.Background()).ModGlossaryPrepareEntryForEditionRequest(modGlossaryPrepareEntryForEditionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryPrepareEntryForEdition``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryPrepareEntryForEdition`: ModGlossaryPrepareEntryForEdition200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryPrepareEntryForEdition`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryPrepareEntryForEditionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryPrepareEntryForEditionRequest** | [**ModGlossaryPrepareEntryForEditionRequest**](ModGlossaryPrepareEntryForEditionRequest.md) |  | 

### Return type

[**ModGlossaryPrepareEntryForEdition200Response**](ModGlossaryPrepareEntryForEdition200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryUpdateEntry

> ModGlossaryUpdateEntry200Response ModGlossaryUpdateEntry(ctx).ModGlossaryUpdateEntryRequest(modGlossaryUpdateEntryRequest).Execute()

Updates the given glossary entry.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryUpdateEntryRequest := *openapiclient.NewModGlossaryUpdateEntryRequest("Concept_example", "Definition_example", int32(123), int32(123)) // ModGlossaryUpdateEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryUpdateEntry(context.Background()).ModGlossaryUpdateEntryRequest(modGlossaryUpdateEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryUpdateEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryUpdateEntry`: ModGlossaryUpdateEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryUpdateEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryUpdateEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryUpdateEntryRequest** | [**ModGlossaryUpdateEntryRequest**](ModGlossaryUpdateEntryRequest.md) |  | 

### Return type

[**ModGlossaryUpdateEntry200Response**](ModGlossaryUpdateEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryViewEntry

> ModGlossaryViewEntry200Response ModGlossaryViewEntry(ctx).ModGlossaryGetEntryByIdRequest(modGlossaryGetEntryByIdRequest).Execute()

Notify a glossary entry as being viewed.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryGetEntryByIdRequest := *openapiclient.NewModGlossaryGetEntryByIdRequest(int32(123)) // ModGlossaryGetEntryByIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryViewEntry(context.Background()).ModGlossaryGetEntryByIdRequest(modGlossaryGetEntryByIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryViewEntry``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryViewEntry`: ModGlossaryViewEntry200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryViewEntry`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryViewEntryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryGetEntryByIdRequest** | [**ModGlossaryGetEntryByIdRequest**](ModGlossaryGetEntryByIdRequest.md) |  | 

### Return type

[**ModGlossaryViewEntry200Response**](ModGlossaryViewEntry200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModGlossaryViewGlossary

> ModGlossaryViewGlossary200Response ModGlossaryViewGlossary(ctx).ModGlossaryViewGlossaryRequest(modGlossaryViewGlossaryRequest).Execute()

Notify the glossary as being viewed.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	modGlossaryViewGlossaryRequest := *openapiclient.NewModGlossaryViewGlossaryRequest(int32(123), "Mode_example") // ModGlossaryViewGlossaryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModGlossaryAPI.ModGlossaryViewGlossary(context.Background()).ModGlossaryViewGlossaryRequest(modGlossaryViewGlossaryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModGlossaryAPI.ModGlossaryViewGlossary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModGlossaryViewGlossary`: ModGlossaryViewGlossary200Response
	fmt.Fprintf(os.Stdout, "Response from `ModGlossaryAPI.ModGlossaryViewGlossary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModGlossaryViewGlossaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modGlossaryViewGlossaryRequest** | [**ModGlossaryViewGlossaryRequest**](ModGlossaryViewGlossaryRequest.md) |  | 

### Return type

[**ModGlossaryViewGlossary200Response**](ModGlossaryViewGlossary200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

