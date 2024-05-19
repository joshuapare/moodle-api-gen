# \ModWikiAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModWikiEditPage**](ModWikiAPI.md#ModWikiEditPage) | **Post** /mod_wiki_edit_page | Save the contents of a page.
[**ModWikiGetPageContents**](ModWikiAPI.md#ModWikiGetPageContents) | **Post** /mod_wiki_get_page_contents | Returns the contents of a page.
[**ModWikiGetPageForEditing**](ModWikiAPI.md#ModWikiGetPageForEditing) | **Post** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited.
[**ModWikiGetSubwikiFiles**](ModWikiAPI.md#ModWikiGetSubwikiFiles) | **Post** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki.
[**ModWikiGetSubwikiPages**](ModWikiAPI.md#ModWikiGetSubwikiPages) | **Post** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki.
[**ModWikiGetSubwikis**](ModWikiAPI.md#ModWikiGetSubwikis) | **Post** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki.
[**ModWikiGetWikisByCourses**](ModWikiAPI.md#ModWikiGetWikisByCourses) | **Post** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
[**ModWikiNewPage**](ModWikiAPI.md#ModWikiNewPage) | **Post** /mod_wiki_new_page | Create a new page in a subwiki.
[**ModWikiViewPage**](ModWikiAPI.md#ModWikiViewPage) | **Post** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status.
[**ModWikiViewWiki**](ModWikiAPI.md#ModWikiViewWiki) | **Post** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status.



## ModWikiEditPage

> ModWikiEditPage200Response ModWikiEditPage(ctx).ModWikiEditPageRequest(modWikiEditPageRequest).Execute()

Save the contents of a page.



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
	modWikiEditPageRequest := *openapiclient.NewModWikiEditPageRequest("Content_example", int32(123)) // ModWikiEditPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiEditPage(context.Background()).ModWikiEditPageRequest(modWikiEditPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiEditPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiEditPage`: ModWikiEditPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiEditPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiEditPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiEditPageRequest** | [**ModWikiEditPageRequest**](ModWikiEditPageRequest.md) |  | 

### Return type

[**ModWikiEditPage200Response**](ModWikiEditPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetPageContents

> ModWikiGetPageContents200Response ModWikiGetPageContents(ctx).ModWikiGetPageContentsRequest(modWikiGetPageContentsRequest).Execute()

Returns the contents of a page.



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
	modWikiGetPageContentsRequest := *openapiclient.NewModWikiGetPageContentsRequest(int32(123)) // ModWikiGetPageContentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetPageContents(context.Background()).ModWikiGetPageContentsRequest(modWikiGetPageContentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetPageContents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetPageContents`: ModWikiGetPageContents200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetPageContents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetPageContentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetPageContentsRequest** | [**ModWikiGetPageContentsRequest**](ModWikiGetPageContentsRequest.md) |  | 

### Return type

[**ModWikiGetPageContents200Response**](ModWikiGetPageContents200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetPageForEditing

> ModWikiGetPageForEditing200Response ModWikiGetPageForEditing(ctx).ModWikiGetPageForEditingRequest(modWikiGetPageForEditingRequest).Execute()

Locks and retrieves info of page-section to be edited.



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
	modWikiGetPageForEditingRequest := *openapiclient.NewModWikiGetPageForEditingRequest(int32(123)) // ModWikiGetPageForEditingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetPageForEditing(context.Background()).ModWikiGetPageForEditingRequest(modWikiGetPageForEditingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetPageForEditing``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetPageForEditing`: ModWikiGetPageForEditing200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetPageForEditing`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetPageForEditingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetPageForEditingRequest** | [**ModWikiGetPageForEditingRequest**](ModWikiGetPageForEditingRequest.md) |  | 

### Return type

[**ModWikiGetPageForEditing200Response**](ModWikiGetPageForEditing200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetSubwikiFiles

> CoreH5pGetTrustedH5pFile200Response ModWikiGetSubwikiFiles(ctx).ModWikiGetSubwikiFilesRequest(modWikiGetSubwikiFilesRequest).Execute()

Returns the list of files for a specific subwiki.



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
	modWikiGetSubwikiFilesRequest := *openapiclient.NewModWikiGetSubwikiFilesRequest(int32(123)) // ModWikiGetSubwikiFilesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetSubwikiFiles(context.Background()).ModWikiGetSubwikiFilesRequest(modWikiGetSubwikiFilesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetSubwikiFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetSubwikiFiles`: CoreH5pGetTrustedH5pFile200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetSubwikiFiles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetSubwikiFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetSubwikiFilesRequest** | [**ModWikiGetSubwikiFilesRequest**](ModWikiGetSubwikiFilesRequest.md) |  | 

### Return type

[**CoreH5pGetTrustedH5pFile200Response**](CoreH5pGetTrustedH5pFile200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetSubwikiPages

> ModWikiGetSubwikiPages200Response ModWikiGetSubwikiPages(ctx).ModWikiGetSubwikiPagesRequest(modWikiGetSubwikiPagesRequest).Execute()

Returns the list of pages for a specific subwiki.



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
	modWikiGetSubwikiPagesRequest := *openapiclient.NewModWikiGetSubwikiPagesRequest(int32(123)) // ModWikiGetSubwikiPagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetSubwikiPages(context.Background()).ModWikiGetSubwikiPagesRequest(modWikiGetSubwikiPagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetSubwikiPages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetSubwikiPages`: ModWikiGetSubwikiPages200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetSubwikiPages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetSubwikiPagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetSubwikiPagesRequest** | [**ModWikiGetSubwikiPagesRequest**](ModWikiGetSubwikiPagesRequest.md) |  | 

### Return type

[**ModWikiGetSubwikiPages200Response**](ModWikiGetSubwikiPages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetSubwikis

> ModWikiGetSubwikis200Response ModWikiGetSubwikis(ctx).ModWikiGetSubwikisRequest(modWikiGetSubwikisRequest).Execute()

Returns the list of subwikis the user can see in a specific wiki.



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
	modWikiGetSubwikisRequest := *openapiclient.NewModWikiGetSubwikisRequest(int32(123)) // ModWikiGetSubwikisRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetSubwikis(context.Background()).ModWikiGetSubwikisRequest(modWikiGetSubwikisRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetSubwikis``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetSubwikis`: ModWikiGetSubwikis200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetSubwikis`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetSubwikisRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  | 

### Return type

[**ModWikiGetSubwikis200Response**](ModWikiGetSubwikis200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiGetWikisByCourses

> ModWikiGetWikisByCourses200Response ModWikiGetWikisByCourses(ctx).ModWikiGetWikisByCoursesRequest(modWikiGetWikisByCoursesRequest).Execute()

Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.



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
	modWikiGetWikisByCoursesRequest := *openapiclient.NewModWikiGetWikisByCoursesRequest() // ModWikiGetWikisByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiGetWikisByCourses(context.Background()).ModWikiGetWikisByCoursesRequest(modWikiGetWikisByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiGetWikisByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiGetWikisByCourses`: ModWikiGetWikisByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiGetWikisByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiGetWikisByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetWikisByCoursesRequest** | [**ModWikiGetWikisByCoursesRequest**](ModWikiGetWikisByCoursesRequest.md) |  | 

### Return type

[**ModWikiGetWikisByCourses200Response**](ModWikiGetWikisByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiNewPage

> ModWikiNewPage200Response ModWikiNewPage(ctx).ModWikiNewPageRequest(modWikiNewPageRequest).Execute()

Create a new page in a subwiki.



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
	modWikiNewPageRequest := *openapiclient.NewModWikiNewPageRequest("Content_example", "Title_example") // ModWikiNewPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiNewPage(context.Background()).ModWikiNewPageRequest(modWikiNewPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiNewPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiNewPage`: ModWikiNewPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiNewPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiNewPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiNewPageRequest** | [**ModWikiNewPageRequest**](ModWikiNewPageRequest.md) |  | 

### Return type

[**ModWikiNewPage200Response**](ModWikiNewPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiViewPage

> ModWikiViewPage200Response ModWikiViewPage(ctx).ModWikiViewPageRequest(modWikiViewPageRequest).Execute()

Trigger the page viewed event and update the module completion status.



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
	modWikiViewPageRequest := *openapiclient.NewModWikiViewPageRequest(int32(123)) // ModWikiViewPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiViewPage(context.Background()).ModWikiViewPageRequest(modWikiViewPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiViewPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiViewPage`: ModWikiViewPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiViewPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiViewPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiViewPageRequest** | [**ModWikiViewPageRequest**](ModWikiViewPageRequest.md) |  | 

### Return type

[**ModWikiViewPage200Response**](ModWikiViewPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModWikiViewWiki

> ModWikiViewWiki200Response ModWikiViewWiki(ctx).ModWikiGetSubwikisRequest(modWikiGetSubwikisRequest).Execute()

Trigger the course module viewed event and update the module completion status.



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
	modWikiGetSubwikisRequest := *openapiclient.NewModWikiGetSubwikisRequest(int32(123)) // ModWikiGetSubwikisRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModWikiAPI.ModWikiViewWiki(context.Background()).ModWikiGetSubwikisRequest(modWikiGetSubwikisRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModWikiAPI.ModWikiViewWiki``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModWikiViewWiki`: ModWikiViewWiki200Response
	fmt.Fprintf(os.Stdout, "Response from `ModWikiAPI.ModWikiViewWiki`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiModWikiViewWikiRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modWikiGetSubwikisRequest** | [**ModWikiGetSubwikisRequest**](ModWikiGetSubwikisRequest.md) |  | 

### Return type

[**ModWikiViewWiki200Response**](ModWikiViewWiki200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

