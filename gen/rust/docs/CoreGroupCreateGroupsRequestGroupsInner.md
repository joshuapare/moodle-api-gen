# CoreGroupCreateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | Option<**i32**> | id of course | [optional]
**customfields** | Option<[**Vec<models::CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>**](core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.md)> |  | [optional]
**description** | Option<**String**> | group description text | [optional][default to null]
**descriptionformat** | Option<**i32**> | description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**enrolmentkey** | Option<**String**> | group enrol secret phrase | [optional][default to null]
**idnumber** | Option<**String**> | id number | [optional]
**name** | Option<**String**> | multilang compatible name, course unique | [optional]
**participation** | Option<**bool**> | activity participation enabled? Only for \"all\" and \"members\" visibility. Default true. | [optional][default to true]
**visibility** | Option<**i32**> | group visibility mode. 0 = Visible to all. 1 = Visible to members. 2 = See own membership. 3 = Membership is hidden. default: 0 | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


