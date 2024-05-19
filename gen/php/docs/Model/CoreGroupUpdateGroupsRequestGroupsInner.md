# # CoreGroupUpdateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customfields** | [**\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional]
**description** | **string** | group description text | [optional]
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**enrolmentkey** | **string** | group enrol secret phrase | [optional]
**id** | **int** | ID of the group | [optional] [default to null]
**idnumber** | **string** | id number | [optional]
**name** | **string** | multilang compatible name, course unique | [optional]
**participation** | **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility | [optional] [default to null]
**visibility** | **string** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
