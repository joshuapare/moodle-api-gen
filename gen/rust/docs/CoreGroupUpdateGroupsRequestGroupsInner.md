# CoreGroupUpdateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**description** | Option<**String**> | group description text | [optional]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**enrolmentkey** | Option<**String**> | group enrol secret phrase | [optional]
**id** | Option<**i32**> | ID of the group | [optional][default to null]
**idnumber** | Option<**String**> | id number | [optional]
**name** | Option<**String**> | multilang compatible name, course unique | [optional]
**participation** | Option<**bool**> | activity participation enabled? Only for \"all\" and \"members\" visibility | [optional][default to null]
**visibility** | Option<**String**> | group visibility mode. 0 = Visible to all. 1 = Visible to members. 2 = See own membership. 3 = Membership is hidden. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


