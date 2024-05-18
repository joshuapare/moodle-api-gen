# Org.OpenAPITools.Model.CoreGroupCreateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int** | id of course | [optional] 
**Customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | **string** | group description text | [optional] [default to "null"]
**Descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Enrolmentkey** | **string** | group enrol secret phrase | [optional] [default to "null"]
**Idnumber** | **string** | id number | [optional] 
**Name** | **string** | multilang compatible name, course unique | [optional] 
**Participation** | **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true. | [optional] [default to true]
**Visibility** | **int** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0 | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

