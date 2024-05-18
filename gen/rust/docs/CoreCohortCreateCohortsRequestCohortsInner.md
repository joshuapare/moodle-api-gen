# CoreCohortCreateCohortsRequestCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorytype** | Option<[**models::CoreCohortCreateCohortsRequestCohortsInnerCategorytype**](core_cohort_create_cohorts_request_cohorts_inner_categorytype.md)> |  | [optional]
**customfields** | Option<[**Vec<models::CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_create_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**description** | Option<**String**> | cohort description | [optional][default to null]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**idnumber** | Option<**String**> | cohort idnumber | [optional][default to null]
**name** | Option<**String**> | cohort name | [optional][default to null]
**theme** | Option<**String**> | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional][default to null]
**visible** | Option<**bool**> | cohort visible | [optional][default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


