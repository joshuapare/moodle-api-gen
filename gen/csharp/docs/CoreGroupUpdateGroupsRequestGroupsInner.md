# Org.OpenAPITools.Model.CoreGroupUpdateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Customfields** | [**List&lt;CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner&gt;**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | **string** | group description text | [optional] 
**Descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Enrolmentkey** | **string** | group enrol secret phrase | [optional] 
**Id** | **int** | ID of the group | [optional] [default to null]
**Idnumber** | **string** | id number | [optional] 
**Name** | **string** | multilang compatible name, course unique | [optional] 
**Participation** | **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility | [optional] [default to null]
**Visibility** | **string** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

