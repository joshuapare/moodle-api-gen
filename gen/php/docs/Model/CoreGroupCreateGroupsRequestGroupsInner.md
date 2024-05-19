# # CoreGroupCreateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of course | [optional]
**customfields** | [**\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner[]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional]
**description** | **string** | group description text | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**enrolmentkey** | **string** | group enrol secret phrase | [optional] [default to 'null']
**idnumber** | **string** | id number | [optional]
**name** | **string** | multilang compatible name, course unique | [optional]
**participation** | **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true. | [optional] [default to true]
**visibility** | **int** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0 | [optional] [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
