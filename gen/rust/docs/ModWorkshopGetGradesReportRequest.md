# ModWorkshopGetGradesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupid** | Option<**i32**> | Group id, 0 means that the function will determine the user group. | [optional][default to 0]
**page** | Option<**i32**> | The page of records to return. | [optional][default to 0]
**perpage** | Option<**i32**> | The number of records to return per page. | [optional][default to 0]
**sortby** | Option<**String**> | sort by this element: lastname, firstname, submissiontitle,                     submissionmodified, submissiongrade, gradinggrade. | [optional][default to lastname]
**sortdirection** | Option<**String**> | sort direction: ASC or DESC | [optional][default to ASC]
**workshopid** | **i32** | Workshop instance id. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


