# \ToolLpApi

All URIs are relative to *https://localhost/webservice/rest/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_lp_data_for_competencies_manage_page**](ToolLpApi.md#tool_lp_data_for_competencies_manage_page) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template
[**tool_lp_data_for_competency_frameworks_manage_page**](ToolLpApi.md#tool_lp_data_for_competency_frameworks_manage_page) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template
[**tool_lp_data_for_competency_summary**](ToolLpApi.md#tool_lp_data_for_competency_summary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template.
[**tool_lp_data_for_course_competencies_page**](ToolLpApi.md#tool_lp_data_for_course_competencies_page) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template.
[**tool_lp_data_for_plan_page**](ToolLpApi.md#tool_lp_data_for_plan_page) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template.
[**tool_lp_data_for_plans_page**](ToolLpApi.md#tool_lp_data_for_plans_page) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template
[**tool_lp_data_for_related_competencies_section**](ToolLpApi.md#tool_lp_data_for_related_competencies_section) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template.
[**tool_lp_data_for_template_competencies_page**](ToolLpApi.md#tool_lp_data_for_template_competencies_page) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template.
[**tool_lp_data_for_templates_manage_page**](ToolLpApi.md#tool_lp_data_for_templates_manage_page) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template
[**tool_lp_data_for_user_competency_summary**](ToolLpApi.md#tool_lp_data_for_user_competency_summary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency.
[**tool_lp_data_for_user_competency_summary_in_course**](ToolLpApi.md#tool_lp_data_for_user_competency_summary_in_course) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency.
[**tool_lp_data_for_user_competency_summary_in_plan**](ToolLpApi.md#tool_lp_data_for_user_competency_summary_in_plan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency.
[**tool_lp_data_for_user_evidence_list_page**](ToolLpApi.md#tool_lp_data_for_user_evidence_list_page) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template
[**tool_lp_data_for_user_evidence_page**](ToolLpApi.md#tool_lp_data_for_user_evidence_page) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template
[**tool_lp_list_courses_using_competency**](ToolLpApi.md#tool_lp_list_courses_using_competency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency
[**tool_lp_search_cohorts**](ToolLpApi.md#tool_lp_search_cohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead
[**tool_lp_search_users**](ToolLpApi.md#tool_lp_search_users) | **POST** /tool_lp_search_users | Search for users.



## tool_lp_data_for_competencies_manage_page

> models::ToolLpDataForCompetenciesManagePage200Response tool_lp_data_for_competencies_manage_page(tool_lp_data_for_competencies_manage_page_request)
Load the data for the competencies manage page template

Load the data for the competencies manage page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_competencies_manage_page_request** | [**ToolLpDataForCompetenciesManagePageRequest**](ToolLpDataForCompetenciesManagePageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForCompetenciesManagePage200Response**](tool_lp_data_for_competencies_manage_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_competency_frameworks_manage_page

> models::ToolLpDataForCompetencyFrameworksManagePage200Response tool_lp_data_for_competency_frameworks_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)
Load the data for the competency frameworks manage page template

Load the data for the competency frameworks manage page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_competency_frameworks_manage_page_request** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForCompetencyFrameworksManagePage200Response**](tool_lp_data_for_competency_frameworks_manage_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_competency_summary

> models::ToolLpDataForCompetencySummary200Response tool_lp_data_for_competency_summary(tool_lp_data_for_competency_summary_request)
Load competency data for summary template.

Load competency data for summary template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_competency_summary_request** | [**ToolLpDataForCompetencySummaryRequest**](ToolLpDataForCompetencySummaryRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForCompetencySummary200Response**](tool_lp_data_for_competency_summary_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_course_competencies_page

> models::ToolLpDataForCourseCompetenciesPage200Response tool_lp_data_for_course_competencies_page(tool_lp_data_for_course_competencies_page_request)
Load the data for the course competencies page template.

Load the data for the course competencies page template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_course_competencies_page_request** | [**ToolLpDataForCourseCompetenciesPageRequest**](ToolLpDataForCourseCompetenciesPageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForCourseCompetenciesPage200Response**](tool_lp_data_for_course_competencies_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_plan_page

> models::ToolLpDataForPlanPage200Response tool_lp_data_for_plan_page(core_competency_complete_plan_request)
Load the data for the plan page template.

Load the data for the plan page template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_complete_plan_request** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForPlanPage200Response**](tool_lp_data_for_plan_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_plans_page

> models::ToolLpDataForPlansPage200Response tool_lp_data_for_plans_page(tool_lp_data_for_plans_page_request)
Load the data for the plans page template

Load the data for the plans page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_plans_page_request** | [**ToolLpDataForPlansPageRequest**](ToolLpDataForPlansPageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForPlansPage200Response**](tool_lp_data_for_plans_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_related_competencies_section

> models::ToolLpDataForRelatedCompetenciesSection200Response tool_lp_data_for_related_competencies_section(tool_lp_data_for_related_competencies_section_request)
Load the data for the related competencies template.

Load the data for the related competencies template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_related_competencies_section_request** | [**ToolLpDataForRelatedCompetenciesSectionRequest**](ToolLpDataForRelatedCompetenciesSectionRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForRelatedCompetenciesSection200Response**](tool_lp_data_for_related_competencies_section_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_template_competencies_page

> models::ToolLpDataForTemplateCompetenciesPage200Response tool_lp_data_for_template_competencies_page(tool_lp_data_for_template_competencies_page_request)
Load the data for the template competencies page template.

Load the data for the template competencies page template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_template_competencies_page_request** | [**ToolLpDataForTemplateCompetenciesPageRequest**](ToolLpDataForTemplateCompetenciesPageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForTemplateCompetenciesPage200Response**](tool_lp_data_for_template_competencies_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_templates_manage_page

> models::ToolLpDataForTemplatesManagePage200Response tool_lp_data_for_templates_manage_page(tool_lp_data_for_competency_frameworks_manage_page_request)
Load the data for the learning plan templates manage page template

Load the data for the learning plan templates manage page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_competency_frameworks_manage_page_request** | [**ToolLpDataForCompetencyFrameworksManagePageRequest**](ToolLpDataForCompetencyFrameworksManagePageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForTemplatesManagePage200Response**](tool_lp_data_for_templates_manage_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_user_competency_summary

> models::ToolLpDataForUserCompetencySummary200Response tool_lp_data_for_user_competency_summary(tool_lp_data_for_user_competency_summary_request)
Load a summary of a user competency.

Load a summary of a user competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_user_competency_summary_request** | [**ToolLpDataForUserCompetencySummaryRequest**](ToolLpDataForUserCompetencySummaryRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForUserCompetencySummary200Response**](tool_lp_data_for_user_competency_summary_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_user_competency_summary_in_course

> models::ToolLpDataForUserCompetencySummaryInCourse200Response tool_lp_data_for_user_competency_summary_in_course(tool_lp_data_for_user_competency_summary_in_course_request)
Load a summary of a user competency.

Load a summary of a user competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_user_competency_summary_in_course_request** | [**ToolLpDataForUserCompetencySummaryInCourseRequest**](ToolLpDataForUserCompetencySummaryInCourseRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForUserCompetencySummaryInCourse200Response**](tool_lp_data_for_user_competency_summary_in_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_user_competency_summary_in_plan

> models::ToolLpDataForUserCompetencySummaryInPlan200Response tool_lp_data_for_user_competency_summary_in_plan(tool_lp_data_for_user_competency_summary_in_plan_request)
Load a summary of a user competency.

Load a summary of a user competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_user_competency_summary_in_plan_request** | [**ToolLpDataForUserCompetencySummaryInPlanRequest**](ToolLpDataForUserCompetencySummaryInPlanRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForUserCompetencySummaryInPlan200Response**](tool_lp_data_for_user_competency_summary_in_plan_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_user_evidence_list_page

> models::ToolLpDataForUserEvidenceListPage200Response tool_lp_data_for_user_evidence_list_page(tool_lp_data_for_user_evidence_list_page_request)
Load the data for the user evidence list page template

Load the data for the user evidence list page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_user_evidence_list_page_request** | [**ToolLpDataForUserEvidenceListPageRequest**](ToolLpDataForUserEvidenceListPageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForUserEvidenceListPage200Response**](tool_lp_data_for_user_evidence_list_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_data_for_user_evidence_page

> models::ToolLpDataForUserEvidencePage200Response tool_lp_data_for_user_evidence_page(tool_lp_data_for_user_evidence_page_request)
Load the data for the user evidence page template

Load the data for the user evidence page template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_data_for_user_evidence_page_request** | [**ToolLpDataForUserEvidencePageRequest**](ToolLpDataForUserEvidencePageRequest.md) |  | [required] |

### Return type

[**models::ToolLpDataForUserEvidencePage200Response**](tool_lp_data_for_user_evidence_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_list_courses_using_competency

> serde_json::Value tool_lp_list_courses_using_competency(core_competency_competency_viewed_request)
List the courses using a competency

List the courses using a competency

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_search_cohorts

> models::ToolLpSearchCohorts200Response tool_lp_search_cohorts(tool_lp_search_cohorts_request)
Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

Search for cohorts. This method is deprecated, please call 'core_cohort_search_cohorts' instead

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_search_cohorts_request** | [**ToolLpSearchCohortsRequest**](ToolLpSearchCohortsRequest.md) |  | [required] |

### Return type

[**models::ToolLpSearchCohorts200Response**](tool_lp_search_cohorts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## tool_lp_search_users

> models::ToolLpSearchUsers200Response tool_lp_search_users(tool_lp_search_users_request)
Search for users.

Search for users.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**tool_lp_search_users_request** | [**ToolLpSearchUsersRequest**](ToolLpSearchUsersRequest.md) |  | [required] |

### Return type

[**models::ToolLpSearchUsers200Response**](tool_lp_search_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

