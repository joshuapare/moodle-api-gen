# CoreGroupCreateGroupingsRequestGroupingsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | Option<**i32**> | id of course | [optional]
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**description** | Option<**String**> | grouping description text | [optional][default to null]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**idnumber** | Option<**String**> | id number | [optional]
**name** | Option<**String**> | multilang compatible name, course unique | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


