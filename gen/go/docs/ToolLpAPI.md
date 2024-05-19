# \ToolLpAPI

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ToolLpDataForCompetenciesManagePage**](ToolLpAPI.md#ToolLpDataForCompetenciesManagePage) | **Post** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template
[**ToolLpDataForCompetencyFrameworksManagePage**](ToolLpAPI.md#ToolLpDataForCompetencyFrameworksManagePage) | **Post** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template
[**ToolLpDataForCompetencySummary**](ToolLpAPI.md#ToolLpDataForCompetencySummary) | **Post** /tool_lp_data_for_competency_summary | Load competency data for summary template.
[**ToolLpDataForCourseCompetenciesPage**](ToolLpAPI.md#ToolLpDataForCourseCompetenciesPage) | **Post** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template.
[**ToolLpDataForPlanPage**](ToolLpAPI.md#ToolLpDataForPlanPage) | **Post** /tool_lp_data_for_plan_page | Load the data for the plan page template.
[**ToolLpDataForPlansPage**](ToolLpAPI.md#ToolLpDataForPlansPage) | **Post** /tool_lp_data_for_plans_page | Load the data for the plans page template
[**ToolLpDataForRelatedCompetenciesSection**](ToolLpAPI.md#ToolLpDataForRelatedCompetenciesSection) | **Post** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template.
[**ToolLpDataForTemplateCompetenciesPage**](ToolLpAPI.md#ToolLpDataForTemplateCompetenciesPage) | **Post** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template.
[**ToolLpDataForTemplatesManagePage**](ToolLpAPI.md#ToolLpDataForTemplatesManagePage) | **Post** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template
[**ToolLpDataForUserCompetencySummary**](ToolLpAPI.md#ToolLpDataForUserCompetencySummary) | **Post** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency.
[**ToolLpDataForUserCompetencySummaryInCourse**](ToolLpAPI.md#ToolLpDataForUserCompetencySummaryInCourse) | **Post** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency.
[**ToolLpDataForUserCompetencySummaryInPlan**](ToolLpAPI.md#ToolLpDataForUserCompetencySummaryInPlan) | **Post** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency.
[**ToolLpDataForUserEvidenceListPage**](ToolLpAPI.md#ToolLpDataForUserEvidenceListPage) | **Post** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template
[**ToolLpDataForUserEvidencePage**](ToolLpAPI.md#ToolLpDataForUserEvidencePage) | **Post** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template
[**ToolLpListCoursesUsingCompetency**](ToolLpAPI.md#ToolLpListCoursesUsingCompetency) | **Post** /tool_lp_list_courses_using_competency | List the courses using a competency
[**ToolLpSearchCohorts**](ToolLpAPI.md#ToolLpSearchCohorts) | **Post** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
[**ToolLpSearchUsers**](ToolLpAPI.md#ToolLpSearchUsers) | **Post** /tool_lp_search_users | Search for users.



## ToolLpDataForCompetenciesManagePage

> ToolLpDataForCompetenciesManagePage200Response ToolLpDataForCompetenciesManagePage(ctx).ToolLpDataForCompetenciesManagePageRequest(toolLpDataForCompetenciesManagePageRequest).Execute()

Load the data for the competencies manage page template



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
	toolLpDataForCompetenciesManagePageRequest := *openapiclient.NewToolLpDataForCompetenciesManagePageRequest(int32(123)) // ToolLpDataForCompetenciesManagePageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForCompetenciesManagePage(context.Background()).ToolLpDataForCompetenciesManagePageRequest(toolLpDataForCompetenciesManagePageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForCompetenciesManagePage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForCompetenciesManagePage`: ToolLpDataForCompetenciesManagePage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForCompetenciesManagePage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForCompetenciesManagePageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForCompetenciesManagePageRequest** | [**ToolLpDataForCompetenciesManagePageRequest**](ToolLpDataForCompetenciesManagePageRequest.md) |  | 

### Return type

[**ToolLpDataForCompetenciesManagePage200Response**](ToolLpDataForCompetenciesManagePage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForCompetencyFrameworksManagePage

> ToolLpDataForCompetencyFrameworksManagePage200Response ToolLpDataForCompetencyFrameworksManagePage(ctx).ToolLpDataForCompetencyFrameworksManagePageRequest(toolLpDataForCompetencyFrameworksManagePageRequest).Execute()

Load the data for the competency frameworks manage page template



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
	toolLpDataForCompetencyFrameworksManagePageRequest := *openapiclient.NewToolLpDataForCompetencyFrameworksManagePageRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // ToolLpDataForCompetencyFrameworksManagePageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForCompetencyFrameworksManagePage(context.Background()).ToolLpDataForCompetencyFrameworksManagePageRequest(toolLpDataForCompetencyFrameworksManagePageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForCompetencyFrameworksManagePage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForCompetencyFrameworksManagePage`: ToolLpDataForCompetencyFrameworksManagePage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForCompetencyFrameworksManagePage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForCompetencyFrameworksManagePageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  | 

### Return type

[**ToolLpDataForCompetencyFrameworksManagePage200Response**](ToolLpDataForCompetencyFrameworksManagePage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForCompetencySummary

> ToolLpDataForCompetencySummary200Response ToolLpDataForCompetencySummary(ctx).ToolLpDataForCompetencySummaryRequest(toolLpDataForCompetencySummaryRequest).Execute()

Load competency data for summary template.



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
	toolLpDataForCompetencySummaryRequest := *openapiclient.NewToolLpDataForCompetencySummaryRequest(int32(123)) // ToolLpDataForCompetencySummaryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForCompetencySummary(context.Background()).ToolLpDataForCompetencySummaryRequest(toolLpDataForCompetencySummaryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForCompetencySummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForCompetencySummary`: ToolLpDataForCompetencySummary200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForCompetencySummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForCompetencySummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForCompetencySummaryRequest** | [**ToolLpDataForCompetencySummaryRequest**](ToolLpDataForCompetencySummaryRequest.md) |  | 

### Return type

[**ToolLpDataForCompetencySummary200Response**](ToolLpDataForCompetencySummary200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForCourseCompetenciesPage

> ToolLpDataForCourseCompetenciesPage200Response ToolLpDataForCourseCompetenciesPage(ctx).ToolLpDataForCourseCompetenciesPageRequest(toolLpDataForCourseCompetenciesPageRequest).Execute()

Load the data for the course competencies page template.



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
	toolLpDataForCourseCompetenciesPageRequest := *openapiclient.NewToolLpDataForCourseCompetenciesPageRequest(int32(123)) // ToolLpDataForCourseCompetenciesPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForCourseCompetenciesPage(context.Background()).ToolLpDataForCourseCompetenciesPageRequest(toolLpDataForCourseCompetenciesPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForCourseCompetenciesPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForCourseCompetenciesPage`: ToolLpDataForCourseCompetenciesPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForCourseCompetenciesPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForCourseCompetenciesPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForCourseCompetenciesPageRequest** | [**ToolLpDataForCourseCompetenciesPageRequest**](ToolLpDataForCourseCompetenciesPageRequest.md) |  | 

### Return type

[**ToolLpDataForCourseCompetenciesPage200Response**](ToolLpDataForCourseCompetenciesPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForPlanPage

> ToolLpDataForPlanPage200Response ToolLpDataForPlanPage(ctx).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()

Load the data for the plan page template.



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
	coreCompetencyCompletePlanRequest := *openapiclient.NewCoreCompetencyCompletePlanRequest(int32(123)) // CoreCompetencyCompletePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForPlanPage(context.Background()).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForPlanPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForPlanPage`: ToolLpDataForPlanPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForPlanPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForPlanPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompletePlanRequest** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | 

### Return type

[**ToolLpDataForPlanPage200Response**](ToolLpDataForPlanPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForPlansPage

> ToolLpDataForPlansPage200Response ToolLpDataForPlansPage(ctx).ToolLpDataForPlansPageRequest(toolLpDataForPlansPageRequest).Execute()

Load the data for the plans page template



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
	toolLpDataForPlansPageRequest := *openapiclient.NewToolLpDataForPlansPageRequest(int32(123)) // ToolLpDataForPlansPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForPlansPage(context.Background()).ToolLpDataForPlansPageRequest(toolLpDataForPlansPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForPlansPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForPlansPage`: ToolLpDataForPlansPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForPlansPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForPlansPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForPlansPageRequest** | [**ToolLpDataForPlansPageRequest**](ToolLpDataForPlansPageRequest.md) |  | 

### Return type

[**ToolLpDataForPlansPage200Response**](ToolLpDataForPlansPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForRelatedCompetenciesSection

> ToolLpDataForRelatedCompetenciesSection200Response ToolLpDataForRelatedCompetenciesSection(ctx).ToolLpDataForRelatedCompetenciesSectionRequest(toolLpDataForRelatedCompetenciesSectionRequest).Execute()

Load the data for the related competencies template.



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
	toolLpDataForRelatedCompetenciesSectionRequest := *openapiclient.NewToolLpDataForRelatedCompetenciesSectionRequest(int32(123)) // ToolLpDataForRelatedCompetenciesSectionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForRelatedCompetenciesSection(context.Background()).ToolLpDataForRelatedCompetenciesSectionRequest(toolLpDataForRelatedCompetenciesSectionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForRelatedCompetenciesSection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForRelatedCompetenciesSection`: ToolLpDataForRelatedCompetenciesSection200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForRelatedCompetenciesSection`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForRelatedCompetenciesSectionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForRelatedCompetenciesSectionRequest** | [**ToolLpDataForRelatedCompetenciesSectionRequest**](ToolLpDataForRelatedCompetenciesSectionRequest.md) |  | 

### Return type

[**ToolLpDataForRelatedCompetenciesSection200Response**](ToolLpDataForRelatedCompetenciesSection200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForTemplateCompetenciesPage

> ToolLpDataForTemplateCompetenciesPage200Response ToolLpDataForTemplateCompetenciesPage(ctx).ToolLpDataForTemplateCompetenciesPageRequest(toolLpDataForTemplateCompetenciesPageRequest).Execute()

Load the data for the template competencies page template.



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
	toolLpDataForTemplateCompetenciesPageRequest := *openapiclient.NewToolLpDataForTemplateCompetenciesPageRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext(), int32(123)) // ToolLpDataForTemplateCompetenciesPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForTemplateCompetenciesPage(context.Background()).ToolLpDataForTemplateCompetenciesPageRequest(toolLpDataForTemplateCompetenciesPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForTemplateCompetenciesPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForTemplateCompetenciesPage`: ToolLpDataForTemplateCompetenciesPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForTemplateCompetenciesPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForTemplateCompetenciesPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForTemplateCompetenciesPageRequest** | [**ToolLpDataForTemplateCompetenciesPageRequest**](ToolLpDataForTemplateCompetenciesPageRequest.md) |  | 

### Return type

[**ToolLpDataForTemplateCompetenciesPage200Response**](ToolLpDataForTemplateCompetenciesPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForTemplatesManagePage

> ToolLpDataForTemplatesManagePage200Response ToolLpDataForTemplatesManagePage(ctx).ToolLpDataForCompetencyFrameworksManagePageRequest(toolLpDataForCompetencyFrameworksManagePageRequest).Execute()

Load the data for the learning plan templates manage page template



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
	toolLpDataForCompetencyFrameworksManagePageRequest := *openapiclient.NewToolLpDataForCompetencyFrameworksManagePageRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // ToolLpDataForCompetencyFrameworksManagePageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForTemplatesManagePage(context.Background()).ToolLpDataForCompetencyFrameworksManagePageRequest(toolLpDataForCompetencyFrameworksManagePageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForTemplatesManagePage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForTemplatesManagePage`: ToolLpDataForTemplatesManagePage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForTemplatesManagePage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForTemplatesManagePageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForCompetencyFrameworksManagePageRequest** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  | 

### Return type

[**ToolLpDataForTemplatesManagePage200Response**](ToolLpDataForTemplatesManagePage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForUserCompetencySummary

> ToolLpDataForUserCompetencySummary200Response ToolLpDataForUserCompetencySummary(ctx).ToolLpDataForUserCompetencySummaryRequest(toolLpDataForUserCompetencySummaryRequest).Execute()

Load a summary of a user competency.



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
	toolLpDataForUserCompetencySummaryRequest := *openapiclient.NewToolLpDataForUserCompetencySummaryRequest(int32(123), int32(123)) // ToolLpDataForUserCompetencySummaryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForUserCompetencySummary(context.Background()).ToolLpDataForUserCompetencySummaryRequest(toolLpDataForUserCompetencySummaryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForUserCompetencySummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForUserCompetencySummary`: ToolLpDataForUserCompetencySummary200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForUserCompetencySummary`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForUserCompetencySummaryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForUserCompetencySummaryRequest** | [**ToolLpDataForUserCompetencySummaryRequest**](ToolLpDataForUserCompetencySummaryRequest.md) |  | 

### Return type

[**ToolLpDataForUserCompetencySummary200Response**](ToolLpDataForUserCompetencySummary200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForUserCompetencySummaryInCourse

> ToolLpDataForUserCompetencySummaryInCourse200Response ToolLpDataForUserCompetencySummaryInCourse(ctx).ToolLpDataForUserCompetencySummaryInCourseRequest(toolLpDataForUserCompetencySummaryInCourseRequest).Execute()

Load a summary of a user competency.



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
	toolLpDataForUserCompetencySummaryInCourseRequest := *openapiclient.NewToolLpDataForUserCompetencySummaryInCourseRequest(int32(123), int32(123), int32(123)) // ToolLpDataForUserCompetencySummaryInCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForUserCompetencySummaryInCourse(context.Background()).ToolLpDataForUserCompetencySummaryInCourseRequest(toolLpDataForUserCompetencySummaryInCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForUserCompetencySummaryInCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForUserCompetencySummaryInCourse`: ToolLpDataForUserCompetencySummaryInCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForUserCompetencySummaryInCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForUserCompetencySummaryInCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForUserCompetencySummaryInCourseRequest** | [**ToolLpDataForUserCompetencySummaryInCourseRequest**](ToolLpDataForUserCompetencySummaryInCourseRequest.md) |  | 

### Return type

[**ToolLpDataForUserCompetencySummaryInCourse200Response**](ToolLpDataForUserCompetencySummaryInCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForUserCompetencySummaryInPlan

> ToolLpDataForUserCompetencySummaryInPlan200Response ToolLpDataForUserCompetencySummaryInPlan(ctx).ToolLpDataForUserCompetencySummaryInPlanRequest(toolLpDataForUserCompetencySummaryInPlanRequest).Execute()

Load a summary of a user competency.



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
	toolLpDataForUserCompetencySummaryInPlanRequest := *openapiclient.NewToolLpDataForUserCompetencySummaryInPlanRequest(int32(123), int32(123)) // ToolLpDataForUserCompetencySummaryInPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForUserCompetencySummaryInPlan(context.Background()).ToolLpDataForUserCompetencySummaryInPlanRequest(toolLpDataForUserCompetencySummaryInPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForUserCompetencySummaryInPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForUserCompetencySummaryInPlan`: ToolLpDataForUserCompetencySummaryInPlan200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForUserCompetencySummaryInPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForUserCompetencySummaryInPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForUserCompetencySummaryInPlanRequest** | [**ToolLpDataForUserCompetencySummaryInPlanRequest**](ToolLpDataForUserCompetencySummaryInPlanRequest.md) |  | 

### Return type

[**ToolLpDataForUserCompetencySummaryInPlan200Response**](ToolLpDataForUserCompetencySummaryInPlan200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForUserEvidenceListPage

> ToolLpDataForUserEvidenceListPage200Response ToolLpDataForUserEvidenceListPage(ctx).ToolLpDataForUserEvidenceListPageRequest(toolLpDataForUserEvidenceListPageRequest).Execute()

Load the data for the user evidence list page template



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
	toolLpDataForUserEvidenceListPageRequest := *openapiclient.NewToolLpDataForUserEvidenceListPageRequest(int32(123)) // ToolLpDataForUserEvidenceListPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForUserEvidenceListPage(context.Background()).ToolLpDataForUserEvidenceListPageRequest(toolLpDataForUserEvidenceListPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForUserEvidenceListPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForUserEvidenceListPage`: ToolLpDataForUserEvidenceListPage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForUserEvidenceListPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForUserEvidenceListPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForUserEvidenceListPageRequest** | [**ToolLpDataForUserEvidenceListPageRequest**](ToolLpDataForUserEvidenceListPageRequest.md) |  | 

### Return type

[**ToolLpDataForUserEvidenceListPage200Response**](ToolLpDataForUserEvidenceListPage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpDataForUserEvidencePage

> ToolLpDataForUserEvidencePage200Response ToolLpDataForUserEvidencePage(ctx).ToolLpDataForUserEvidencePageRequest(toolLpDataForUserEvidencePageRequest).Execute()

Load the data for the user evidence page template



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
	toolLpDataForUserEvidencePageRequest := *openapiclient.NewToolLpDataForUserEvidencePageRequest(int32(123)) // ToolLpDataForUserEvidencePageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpDataForUserEvidencePage(context.Background()).ToolLpDataForUserEvidencePageRequest(toolLpDataForUserEvidencePageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpDataForUserEvidencePage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpDataForUserEvidencePage`: ToolLpDataForUserEvidencePage200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpDataForUserEvidencePage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpDataForUserEvidencePageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpDataForUserEvidencePageRequest** | [**ToolLpDataForUserEvidencePageRequest**](ToolLpDataForUserEvidencePageRequest.md) |  | 

### Return type

[**ToolLpDataForUserEvidencePage200Response**](ToolLpDataForUserEvidencePage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpListCoursesUsingCompetency

> map[string]interface{} ToolLpListCoursesUsingCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

List the courses using a competency



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
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpListCoursesUsingCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpListCoursesUsingCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpListCoursesUsingCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpListCoursesUsingCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpListCoursesUsingCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpSearchCohorts

> ToolLpSearchCohorts200Response ToolLpSearchCohorts(ctx).ToolLpSearchCohortsRequest(toolLpSearchCohortsRequest).Execute()

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead



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
	toolLpSearchCohortsRequest := *openapiclient.NewToolLpSearchCohortsRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext(), "Query_example") // ToolLpSearchCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpSearchCohorts(context.Background()).ToolLpSearchCohortsRequest(toolLpSearchCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpSearchCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpSearchCohorts`: ToolLpSearchCohorts200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpSearchCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpSearchCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpSearchCohortsRequest** | [**ToolLpSearchCohortsRequest**](ToolLpSearchCohortsRequest.md) |  | 

### Return type

[**ToolLpSearchCohorts200Response**](ToolLpSearchCohorts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ToolLpSearchUsers

> ToolLpSearchUsers200Response ToolLpSearchUsers(ctx).ToolLpSearchUsersRequest(toolLpSearchUsersRequest).Execute()

Search for users.



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
	toolLpSearchUsersRequest := *openapiclient.NewToolLpSearchUsersRequest("Capability_example", "Query_example") // ToolLpSearchUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ToolLpAPI.ToolLpSearchUsers(context.Background()).ToolLpSearchUsersRequest(toolLpSearchUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ToolLpAPI.ToolLpSearchUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ToolLpSearchUsers`: ToolLpSearchUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `ToolLpAPI.ToolLpSearchUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiToolLpSearchUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toolLpSearchUsersRequest** | [**ToolLpSearchUsersRequest**](ToolLpSearchUsersRequest.md) |  | 

### Return type

[**ToolLpSearchUsers200Response**](ToolLpSearchUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

