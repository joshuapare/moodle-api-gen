# CoreCohortUpdateCohortsRequestCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorytype** | Option<[**models::CoreCohortUpdateCohortsRequestCohortsInnerCategorytype**](core_cohort_update_cohorts_request_cohorts_inner_categorytype.md)> |  | [optional]
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**description** | Option<**String**> | cohort description | [optional]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**id** | Option<**i32**> | ID of the cohort | [optional]
**idnumber** | Option<**String**> | cohort idnumber | [optional]
**name** | Option<**String**> | cohort name | [optional]
**theme** | Option<**String**> | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional]
**visible** | Option<**bool**> | cohort visible | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


